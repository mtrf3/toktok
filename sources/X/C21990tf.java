package X;

/* renamed from: X.0tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21990tf {
    public static final float LIZ;
    public static final float LIZIZ;
    public static final float LIZJ;

    static {
        LIZ(0.0f);
        LIZ(0.5f);
        LIZ = 0.5f;
        LIZ(-1.0f);
        LIZIZ = -1.0f;
        LIZ(1.0f);
        LIZJ = 1.0f;
    }

    public static void LIZ(float f) {
        if ((0.0f <= f && f <= 1.0f) || f == -1.0f) {
            return;
        }
        "topRatio should be in [0..1] range or -1".toString();
        throw new IllegalStateException("topRatio should be in [0..1] range or -1");
    }
}
