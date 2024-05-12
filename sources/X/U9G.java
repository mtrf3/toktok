package X;

/* loaded from: classes14.dex */
public final class U9G implements Runnable {
    public final /* synthetic */ U7U LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;

    public U9G(U7U u7u, String str, float f, float f2) {
        this.LJLIL = u7u;
        this.LJLILLLLZI = str;
        this.LJLJI = f;
        this.LJLJJI = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            U9F u9f = this.LJLIL.LJFF;
            if (u9f != null) {
                u9f.LJIIZILJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
