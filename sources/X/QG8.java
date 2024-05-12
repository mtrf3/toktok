package X;

/* loaded from: classes12.dex */
public final class QG8 {
    public static volatile QG8 LIZ;

    public final synchronized void LIZIZ() {
    }

    public static QG8 LIZ() {
        if (LIZ == null) {
            synchronized (QG8.class) {
                if (LIZ == null) {
                    LIZ = new QG8();
                }
            }
        }
        return LIZ;
    }
}
