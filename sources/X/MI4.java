package X;

/* loaded from: classes10.dex */
public final class MI4 {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        MI2.LIZ.getClass();
        LIZ = MI2.LIZ().getV1_lower_bound();
        LIZIZ = MI2.LIZ().getV1_upper_bound();
        LIZJ = MI2.LIZ().getV2_lower_bound();
        LIZLLL = MI2.LIZ().getV2_upper_bound();
    }

    public static int LIZ(boolean z) {
        int i;
        int i2;
        int i3;
        try {
            C66906QNq LIZ2 = C78841Uwv.LIZ(System.currentTimeMillis());
            if (z) {
                i2 = LIZ;
                i3 = LIZIZ;
            } else {
                i2 = LIZJ;
                i3 = LIZLLL;
            }
            i = LIZ2.nextInt(i2, i3);
        } catch (IllegalArgumentException unused) {
            i = 0;
        }
        if (z) {
            MI6.LIZ.storeInt("daily_count_question_focus", i);
        } else {
            MI6.LIZ.storeInt("daily_count_video_focus", i);
        }
        return i;
    }
}
