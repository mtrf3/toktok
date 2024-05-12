package X;

import android.text.TextUtils;

/* renamed from: X.G7v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41015G7v {
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static final /* synthetic */ int LIZJ = 0;

    public static void LIZ(long j, String str, String str2) {
        long j2 = j - LIZ;
        if (TextUtils.equals(str, "duet_mode_creation")) {
            j2 = j - LIZIZ;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", str);
        c145995oB.LJI("enter_method", str2);
        c145995oB.LJI("duration", String.valueOf(j2));
        FMX.LJIIL("stay_time", c145995oB.LIZ);
    }
}
