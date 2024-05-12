package X;

/* loaded from: classes12.dex */
public final class QSD {
    public static volatile QSD LIZ;

    public static QSD LIZ() {
        if (LIZ == null) {
            synchronized (QSD.class) {
                if (LIZ == null) {
                    LIZ = new QSD();
                }
            }
        }
        return LIZ;
    }
}
