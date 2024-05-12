package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w implements SensorEventListener {
    public long AFInAppEventParameterName;
    public double AFKeystoreWrapper;
    public final Executor AFVersionDeclaration;
    public final int AppsFlyer2dXConversionCallback;
    public final String getLevel;
    public final String init;
    public final int valueOf;
    public final float[][] AFInAppEventType = new float[2];
    public final long[] values = new long[2];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    private Map<String, Object> AFInAppEventParameterName() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.valueOf));
        concurrentHashMap.put("sN", this.init);
        concurrentHashMap.put("sV", this.getLevel);
        float[] fArr = this.AFInAppEventType[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", valueOf(fArr));
        }
        float[] fArr2 = this.AFInAppEventType[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", valueOf(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean AFKeystoreWrapper() {
        if (this.AFInAppEventType[0] == null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.AppsFlyer2dXConversionCallback;
    }

    public static List<Float> valueOf(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return AFKeystoreWrapper(wVar.valueOf, wVar.init, wVar.getLevel);
        }
        return false;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        final long j = sensorEvent.timestamp;
        final float[] fArr = sensorEvent.values;
        this.AFVersionDeclaration.execute(new Runnable() { // from class: com.appsflyer.internal.w.4
            @Override // java.lang.Runnable
            public final void run() {
                com_appsflyer_internal_w$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_appsflyer_internal_w$4__run$___twin___() {
                long currentTimeMillis = System.currentTimeMillis();
                w wVar = w.this;
                float[][] fArr2 = wVar.AFInAppEventType;
                float[] fArr3 = fArr2[0];
                if (fArr3 == null) {
                    float[] fArr4 = fArr;
                    fArr2[0] = Arrays.copyOf(fArr4, fArr4.length);
                    w.this.values[0] = currentTimeMillis;
                    return;
                }
                float[] fArr5 = fArr2[1];
                if (fArr5 == null) {
                    float[] fArr6 = fArr;
                    float[] copyOf = Arrays.copyOf(fArr6, fArr6.length);
                    w wVar2 = w.this;
                    wVar2.AFInAppEventType[1] = copyOf;
                    wVar2.values[1] = currentTimeMillis;
                    wVar2.AFKeystoreWrapper = w.values(fArr3, copyOf);
                    return;
                }
                long j2 = j;
                if (50000000 <= j2 - wVar.AFInAppEventParameterName) {
                    wVar.AFInAppEventParameterName = j2;
                    if (Arrays.equals(fArr5, fArr)) {
                        w.this.values[1] = currentTimeMillis;
                        return;
                    }
                    double values = w.values(fArr3, fArr);
                    w wVar3 = w.this;
                    if (values > wVar3.AFKeystoreWrapper) {
                        float[][] fArr7 = wVar3.AFInAppEventType;
                        float[] fArr8 = fArr;
                        fArr7[1] = Arrays.copyOf(fArr8, fArr8.length);
                        w wVar4 = w.this;
                        wVar4.values[1] = currentTimeMillis;
                        wVar4.AFKeystoreWrapper = values;
                    }
                }
            }

            public static void com_appsflyer_internal_w$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_appsflyer_internal_w$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public w(Sensor sensor, Executor executor) {
        this.AFVersionDeclaration = executor;
        int type = sensor.getType();
        this.valueOf = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.init = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getLevel = str;
        this.AppsFlyer2dXConversionCallback = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
    }

    public final void values(Map<w, Map<String, Object>> map, boolean z) {
        if (AFKeystoreWrapper()) {
            map.put(this, AFInAppEventParameterName());
            if (z) {
                int length = this.AFInAppEventType.length;
                for (int i = 0; i < length; i++) {
                    this.AFInAppEventType[i] = null;
                }
                int length2 = this.values.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.values[i2] = 0;
                }
                this.AFKeystoreWrapper = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                this.AFInAppEventParameterName = 0L;
                return;
            }
            return;
        }
        if (!map.containsKey(this)) {
            map.put(this, AFInAppEventParameterName());
        }
    }

    public static /* synthetic */ double values(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    private boolean AFKeystoreWrapper(int i, String str, String str2) {
        if (this.valueOf == i && this.init.equals(str) && this.getLevel.equals(str2)) {
            return true;
        }
        return false;
    }
}
