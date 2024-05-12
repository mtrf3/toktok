package X;

/* renamed from: X.03F, reason: invalid class name */
/* loaded from: classes.dex */
public class C03F implements Runnable {
    public final /* synthetic */ C03G LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C03G c03g = this.LJLIL;
            c03g.LJLLJ = null;
            c03g.drawableStateChanged();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C03F(C03G c03g) {
        this.LJLIL = c03g;
    }
}
