package X;

import com.bef.effectsdk.EffectSensorCallback;

/* renamed from: X.HVi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44174HVi implements EffectSensorCallback.GetSensorInfo {
    @Override // com.bef.effectsdk.EffectSensorCallback.GetSensorInfo
    public final boolean onUnregister(int i) {
        return C44172HVg.LJFF("ASensorEventQueue_disableSensor");
    }

    @Override // com.bef.effectsdk.EffectSensorCallback.GetSensorInfo
    public final boolean onRegister(int i, int i2) {
        return C44172HVg.LJFF("ASensorEventQueue_enableSensor");
    }

    @Override // com.bef.effectsdk.EffectSensorCallback.GetSensorInfo
    public final boolean onSetRate(int i, int i2) {
        return C44172HVg.LJFF("ASensorEventQueue_setEventRate");
    }
}
