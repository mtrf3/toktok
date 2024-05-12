package X;

/* renamed from: X.Mch, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57203Mch implements FTD {
    public final /* synthetic */ int LIZ = 3000;
    public final /* synthetic */ int LIZIZ = 800;
    public final /* synthetic */ C57233MdB LIZJ;

    @Override // X.FTD
    public final void LIZ() {
    }

    @Override // X.FTD
    public final void LIZIZ() {
        C57233MdB c57233MdB = this.LIZJ;
        c57233MdB.LJLL = this.LIZ;
        c57233MdB.LJLJLLL = this.LIZIZ;
        c57233MdB.LJLLI.removeCallbacksAndMessages(null);
        c57233MdB.LJLLI.postDelayed(c57233MdB.LJLLILLLL, c57233MdB.LJLJJL.nextInt(4) * 100);
    }

    public C57203Mch(C57233MdB c57233MdB) {
        this.LIZJ = c57233MdB;
    }
}
