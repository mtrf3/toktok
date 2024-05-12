package X;

/* loaded from: classes12.dex */
public final class QWH {
    public static volatile QWH LIZIZ;
    public C28791BRr LIZ;

    public static QWH LIZ() {
        if (LIZIZ == null) {
            synchronized (QWH.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QWH();
                }
            }
        }
        return LIZIZ;
    }
}
