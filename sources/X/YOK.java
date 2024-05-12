package X;

/* loaded from: classes16.dex */
public final class YOK implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ YOE LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLJJL.LIZ.LJLLI != null) {
                this.LJLJJL.LIZ.LJLLI.onCompileError(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public YOK(YOE yoe, int i, int i2, float f, String str) {
        this.LJLJJL = yoe;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = f;
        this.LJLJJI = str;
    }
}
