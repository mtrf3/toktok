package X;

/* loaded from: classes19.dex */
public final class ZU8 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ ZUU LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            ZUU zuu = this.LJLILLLLZI;
            String str = this.LJLIL;
            zuu.getClass();
            C89999ZTv.LIZ(new ZUB(zuu, str), C89999ZTv.LJ);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ZU8(ZUU zuu, String str) {
        this.LJLILLLLZI = zuu;
        this.LJLIL = str;
    }
}
