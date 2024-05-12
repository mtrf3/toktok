package com.ss.android.ugc.playerkit.simapicommon;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.bytedance.bpea.basics.Cert;
import java.util.List;

/* loaded from: classes9.dex */
public interface IAppConfig {
    Sensor createBpeaLightSensor(SensorManager sensorManager);

    String defaultHost();

    int getAppID();

    String getAppName();

    String getAppVersion();

    String getChannel();

    float getDeviceScore();

    Cert getLightSensorCert(boolean z);

    String getNetworkTypeDetail(Context context);

    boolean isDebug();

    List<String> redirectHosts();
}
