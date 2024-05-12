package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubathonSetting;

/* renamed from: X.CCv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30953CCv {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(long j) {
        long j2 = 60;
        long j3 = j / j2;
        long j4 = (j3 / j2) % 24;
        long j5 = j3 % j2;
        long j6 = j % j2;
        StringBuilder LIZ2 = X1D.LIZ();
        long j7 = 10;
        LIZ2.append(j4 / j7);
        LIZ2.append(j4 % j7);
        LIZ2.append(':');
        LIZ2.append(j5 / j7);
        LIZ2.append(j5 % j7);
        LIZ2.append(':');
        LIZ2.append(j6 / j7);
        LIZ2.append(j6 % j7);
        return X1D.LIZIZ(LIZ2);
    }

    public static long LIZ(long j, long j2, boolean z) {
        long LIZIZ = (C31012CFc.LIZIZ() / 1000) - j2;
        if (z && Math.abs(LIZIZ) < LiveSubathonSetting.INSTANCE.getValue().getTimeAlignMinGap()) {
            return j;
        }
        if (Math.abs(LIZIZ) > LiveSubathonSetting.INSTANCE.getValue().getTimeAlignMaxGap()) {
            return j;
        }
        return Math.max(j - LIZIZ, 0L);
    }
}
