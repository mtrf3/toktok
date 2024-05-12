package X;

/* loaded from: classes12.dex */
public final class QQG {
    public static volatile QQG LIZIZ;
    public final OJM<QOJ> LIZ = new OJM<>();

    public static QQG LIZ() {
        if (LIZIZ == null) {
            synchronized (QQG.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QQG();
                }
            }
        }
        return LIZIZ;
    }
}
