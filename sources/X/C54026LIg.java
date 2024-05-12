package X;

import Y.ACallableS112S0100000_9;

/* renamed from: X.LIg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54026LIg implements JC4 {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ C57407Mfz LJLILLLLZI;

    @Override // X.JC4
    public final void LIZ() {
    }

    @Override // X.JC4
    public final void onStart() {
    }

    @Override // X.JC4
    public final void LJIILIIL(long j) {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        C34K c34k = this.LJLIL;
        if (c34k.element) {
            c34k.element = false;
        } else {
            C10K.LIZIZ(new ACallableS112S0100000_9(this.LJLILLLLZI, 22), C10K.LJI, null);
        }
    }

    public C54026LIg(C34K c34k, C57407Mfz c57407Mfz) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = c57407Mfz;
    }
}
