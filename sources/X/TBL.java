package X;

/* loaded from: classes13.dex */
public final class TBL implements Runnable {
    public final /* synthetic */ TBK LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.setPressed(false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public TBL(TBK tbk) {
        this.LJLIL = tbk;
    }
}
