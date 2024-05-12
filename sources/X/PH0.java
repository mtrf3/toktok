package X;

/* loaded from: classes12.dex */
public final class PH0 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ java.util.Map LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ C64185PGz LJLJJI;

    public final void LIZ() {
        PH1 ph1 = this.LJLJJI.LJLILLLLZI.get(this.LJLIL);
        if (ph1 == null) {
            this.LJLJJI.LJLILLLLZI.put(this.LJLIL, new PH1(this.LJLJI));
        } else {
            ph1.LIZ += this.LJLJI;
            ph1.LIZJ++;
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

    public PH0(C64185PGz c64185PGz, String str, java.util.Map map, float f) {
        this.LJLJJI = c64185PGz;
        this.LJLIL = str;
        this.LJLILLLLZI = map;
        this.LJLJI = f;
    }
}
