package X;

/* loaded from: classes12.dex */
public final class QQF {
    public static volatile QQF LIZIZ;
    public QWL LIZ;

    public static QQF LIZ() {
        if (LIZIZ == null) {
            synchronized (QQF.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QQF();
                }
            }
        }
        return LIZIZ;
    }
}
