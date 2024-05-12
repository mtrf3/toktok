package X;

/* renamed from: X.YKn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class RunnableC87209YKn implements Runnable {
    public final /* synthetic */ YKT LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            YKT ykt = this.LJLIL;
            ykt.LJIIIIZZ = false;
            YKR ykr = ykt.LJIILL;
            if (ykr != null) {
                ykr.invalidate();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC87209YKn(YKT ykt) {
        this.LJLIL = ykt;
    }
}
