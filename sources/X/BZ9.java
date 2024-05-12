package X;

/* loaded from: classes6.dex */
public final class BZ9 implements VCA {
    public final /* synthetic */ InterfaceC73573Su9<Boolean> LIZ;
    public final /* synthetic */ BZ3 LIZIZ;

    public BZ9(C73433Srt c73433Srt, BZ3 bz3) {
        this.LIZ = c73433Srt;
        this.LIZIZ = bz3;
    }

    @Override // X.VCA
    public final void LIZ(boolean z) {
        C0NB.LIZIZ("SwitchResolutionHelper:switchNormal:end", String.valueOf(z));
        if (z) {
            this.LIZ.onNext(Boolean.valueOf(z));
        } else {
            this.LIZIZ.LIZ(2);
            this.LIZ.tryOnError(new BZ4("switch error"));
        }
    }
}
