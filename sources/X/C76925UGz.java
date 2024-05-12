package X;

/* renamed from: X.UGz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76925UGz implements UH1 {
    public final /* synthetic */ UH1 LIZ;
    public final /* synthetic */ C76923UGx LIZIZ;

    @Override // X.UH1
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // X.UH1
    public final void onStart() {
        this.LIZ.onStart();
    }

    @Override // X.UH1
    public final void LIZ(int i) {
        C76923UGx c76923UGx = this.LIZIZ;
        c76923UGx.LLJJ.removeCallbacks(c76923UGx.LLJJI);
        C76923UGx c76923UGx2 = this.LIZIZ;
        if (c76923UGx2.LLJILJILJ != null && i == c76923UGx2.LLILZIL) {
            c76923UGx2.LLJJ.postDelayed(c76923UGx2.LLJJI, 100L);
        }
        this.LIZ.LIZ(i);
    }

    @Override // X.UH1
    public final void LIZIZ(int i) {
        this.LIZ.LIZIZ(i);
    }

    public C76925UGz(C76923UGx c76923UGx, UH1 uh1) {
        this.LIZIZ = c76923UGx;
        this.LIZ = uh1;
    }
}
