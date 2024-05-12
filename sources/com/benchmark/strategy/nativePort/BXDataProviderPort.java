package com.benchmark.strategy.nativePort;

import X.C05060Hu;
import X.C05110Hz;
import X.C09580Ze;
import X.C32771Qj;
import android.os.Bundle;
import com.benchmark.ByteBenchBundle;

/* loaded from: classes.dex */
public class BXDataProviderPort {
    private native int native_getDeviceFeature(int i, long j);

    private boolean ifEnableNativeEnvironment() {
        return C32771Qj.LIZIZ;
    }

    public void clearRepo(int i) {
        ifEnableNativeEnvironment();
    }

    public void closeRepo(int i) {
        ifEnableNativeEnvironment();
    }

    public Boolean deleteRepo(int i) {
        if (!ifEnableNativeEnvironment()) {
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    public void dumpRepo(int i) {
        ifEnableNativeEnvironment();
    }

    public int init(String str) {
        if (!ifEnableNativeEnvironment()) {
            return -1;
        }
        return 0;
    }

    public void isOpenRuntimeDecision(boolean z) {
        ifEnableNativeEnvironment();
    }

    public void openRepo(int i) {
        ifEnableNativeEnvironment();
    }

    public String getString(int i, String str) {
        if (!ifEnableNativeEnvironment()) {
            return null;
        }
        return C09580Ze.LIZJ().LIZIZ(i).LIZ(str, "");
    }

    public boolean hasValue(int i, String str) {
        if (!ifEnableNativeEnvironment()) {
            return false;
        }
        return C09580Ze.LIZJ().LIZIZ(i).LJIIIZ(str);
    }

    public void storeDeviceFeatureFloat(String str, float f) {
        ifEnableNativeEnvironment();
    }

    public void storeStrategy(int i, String str) {
        ifEnableNativeEnvironment();
    }

    public boolean getBoolean(int i, String str, boolean z) {
        if (!ifEnableNativeEnvironment()) {
            return z;
        }
        return C09580Ze.LIZJ().LIZIZ(i).LJIIIIZZ(str, z);
    }

    public void getDeviceFeature(int i, C05060Hu[] c05060HuArr, Bundle bundle) {
        if (!ifEnableNativeEnvironment()) {
            return;
        }
        ByteBenchBundle obtain = ByteBenchBundle.obtain();
        native_getDeviceFeature(i, obtain.getHandle());
        for (C05060Hu c05060Hu : c05060HuArr) {
            int i2 = C05110Hz.LIZ[c05060Hu.LIZIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        bundle.putBoolean(c05060Hu.LIZ, obtain.getBool(c05060Hu.LIZ));
                    }
                } else {
                    bundle.putString(c05060Hu.LIZ, obtain.getString(c05060Hu.LIZ));
                }
            } else {
                bundle.putFloat(c05060Hu.LIZ, obtain.getFloat(c05060Hu.LIZ));
            }
        }
        obtain.recycle();
    }

    public float getFloat(int i, String str, float f) {
        if (!ifEnableNativeEnvironment()) {
            return f;
        }
        return C09580Ze.LIZJ().LIZIZ(i).LIZLLL(f, str);
    }

    public int getInt(int i, String str, int i2) {
        if (!ifEnableNativeEnvironment()) {
            return i2;
        }
        return C09580Ze.LIZJ().LIZIZ(i).LJIIJJI(i2, str);
    }

    public long getLong(int i, String str, long j) {
        if (!ifEnableNativeEnvironment()) {
            return j;
        }
        return C09580Ze.LIZJ().LIZIZ(i).LJIIL(j, str);
    }

    public void storeBoolean(int i, String str, boolean z, boolean z2) {
        ifEnableNativeEnvironment();
    }

    public void storeFloat(int i, String str, boolean z, float f) {
        ifEnableNativeEnvironment();
    }

    public void storeInt(int i, String str, boolean z, int i2) {
        ifEnableNativeEnvironment();
    }

    public void storeLong(int i, String str, boolean z, long j) {
        ifEnableNativeEnvironment();
    }

    public void storeString(int i, String str, boolean z, String str2) {
        ifEnableNativeEnvironment();
    }
}
