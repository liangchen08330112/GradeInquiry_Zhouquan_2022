package com.example.gradeinquiry.User;

import android.Manifest;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

public class BlueToothController {
    private BluetoothAdapter adapter;
    public BlueToothController() {
        adapter = BluetoothAdapter.getDefaultAdapter();
    }
    /**
     * 查看设备是否支持蓝牙
     * true为支持，false为不支持
     */
    public boolean isSupportBluetooth() {
        if(adapter!=null){
            return true;
        }else{
            return false;
        }
    }
    /**
     * 判断蓝牙打开状态：
     * true为打开，false为关闭
     */
    public boolean getBluetoothStatus() {
        return adapter.isEnabled();
    }
    //开启蓝牙
    public void turnOnBluetooth(Activity activity, int requestCode) {
        Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        if(ActivityCompat.checkSelfPermission(activity, Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            // 添加权限，蓝牙连接
            activity.startActivityForResult(intent,requestCode);
        }
    }
    //关闭蓝牙
    public void turnOffBluetooth(Activity activity) {
        if(ActivityCompat.checkSelfPermission(activity,Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            adapter.disable();
        }
    }
}
