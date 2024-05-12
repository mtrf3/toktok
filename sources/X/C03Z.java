package X;

/* renamed from: X.03Z, reason: invalid class name */
/* loaded from: classes.dex */
public class C03Z implements Runnable {
    public final /* synthetic */ C19M LJLIL;

    public final void LIZ() {
        C03G c03g = this.LJLIL.LJLJI;
        if (c03g != null && C16330kX.LIZIZ(c03g) && this.LJLIL.LJLJI.getCount() > this.LJLIL.LJLJI.getChildCount()) {
            int childCount = this.LJLIL.LJLJI.getChildCount();
            C19M c19m = this.LJLIL;
            if (childCount <= c19m.LJLLJ) {
                c19m.LLFFF.setInputMethodMode(2);
                this.LJLIL.show();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C03Z(C19M c19m) {
        this.LJLIL = c19m;
    }
}
