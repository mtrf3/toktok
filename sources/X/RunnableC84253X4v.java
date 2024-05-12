package X;

/* renamed from: X.X4v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class RunnableC84253X4v implements Runnable {
    public final String LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        C84241X4j remove;
        try {
            C84243X4l c84243X4l = X5I.LIZ;
            String str = this.LJLIL;
            synchronized (c84243X4l.LIZIZ) {
                remove = c84243X4l.LIZIZ.remove(str);
            }
            if (remove != null) {
                remove.end();
            }
        } catch (Throwable unused) {
        }
    }

    public RunnableC84253X4v(String str) {
        this.LJLIL = str;
    }
}
