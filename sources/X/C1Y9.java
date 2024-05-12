package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1Y9, reason: invalid class name */
/* loaded from: classes.dex */
public class C1Y9 implements InterfaceC18370np, InterfaceC18380nq {
    public static final List<String> LIZ = Arrays.asList("RLI-AN00");

    @Override // X.InterfaceC18380nq
    public final boolean LIZIZ() {
        String str = Build.MODEL;
        C0NB.LIZ(str);
        return LIZ.contains(str);
    }

    @Override // X.InterfaceC18370np
    public final boolean LIZ(Context context) {
        try {
            try {
                try {
                    Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                    return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
                } catch (Exception unused) {
                    C0NB.LIZIZ("HW_TAG", "hasNotchInScreen Exception");
                    return false;
                }
            } catch (ClassNotFoundException unused2) {
                C0NB.LIZIZ("HW_TAG", "hasNotchInScreen ClassNotFoundException");
                return false;
            } catch (NoSuchMethodException unused3) {
                C0NB.LIZIZ("HW_TAG", "hasNotchInScreen NoSuchMethodException");
                return false;
            }
        } catch (Throwable unused4) {
            return false;
        }
    }

    @Override // X.InterfaceC18380nq
    public final int LIZJ(Configuration configuration) {
        if (!LIZIZ()) {
            return -1;
        }
        if (configuration != null) {
            float f = (configuration.screenHeightDp * 1.0f) / configuration.screenWidthDp;
            if (f >= 0.75f && f <= 1.3333334f) {
                return 0;
            }
            return 1;
        }
        return 0;
    }
}
