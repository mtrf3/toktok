package com.ss.android.ugc.aweme.video.simcommon;

import X.C03880Dg;
import X.C16880lQ;
import X.C39201Fa1;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C78857UxB;
import X.EF7;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import java.util.List;

/* loaded from: classes7.dex */
public class SimAppConfig implements IAppConfig {
    public static Sensor com_ss_android_ugc_aweme_video_simcommon_SimAppConfig_android_hardware_SensorManager_getDefaultSensor(SensorManager sensorManager, int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "6511405212914553460");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String defaultHost() {
        return "tiktokv.com";
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public /* bridge */ /* synthetic */ float getDeviceScore() {
        return -1.0f;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public boolean isDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getAppName() {
        return EF7.LIZ();
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getAppVersion() {
        return EF7.LJII();
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public int getAppID() {
        return EF7.LJIIIZ;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getChannel() {
        return EF7.LJIILIIL;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public List<String> redirectHosts() {
        return C39201Fa1.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public Sensor createBpeaLightSensor(SensorManager sensorManager) {
        if (sensorManager == null) {
            return null;
        }
        return com_ss_android_ugc_aweme_video_simcommon_SimAppConfig_android_hardware_SensorManager_getDefaultSensor(sensorManager, 5);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public Cert getLightSensorCert(boolean z) {
        if (z) {
            return C78857UxB.LJJIIJ(1476415494, "bpea-player_light_register_sensor");
        }
        return C78857UxB.LJJIIJ(1476415494, "bpea-player_light_unregister_sensor");
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getNetworkTypeDetail(Context context) {
        return C16880lQ.LLJJ(EF7.LIZIZ());
    }
}
