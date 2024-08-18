package cn.trecent.bluetooth;

import java.util.Map;


/**
 * Created by imtiyazs on 2024/08/18.
 */
public interface BluetoothServiceStateObserver {
    void onBluetoothServiceStateChanged(int state, Map<String,Object> boundle);
}
