package X;

import Y.ARunnableS9S0101000_5;

/* renamed from: X.Bvp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30361Bvp implements C40 {
    public final /* synthetic */ C30350Bve LIZ;

    public C30361Bvp(C30350Bve c30350Bve) {
        this.LIZ = c30350Bve;
    }

    @Override // X.C40
    public final void onResult(int i) {
        ActivityC45651qj mo49getActivity;
        C30350Bve c30350Bve = this.LIZ;
        if (c30350Bve.LJLJJI && c30350Bve.LJII()) {
            long currentTimeMillis = System.currentTimeMillis();
            C30350Bve c30350Bve2 = this.LIZ;
            if (currentTimeMillis - c30350Bve2.LJLLI > 100) {
                c30350Bve2.LJLLI = System.currentTimeMillis();
                C30350Bve c30350Bve3 = this.LIZ;
                if (c30350Bve3.LJLIL && (mo49getActivity = c30350Bve3.LJLILLLLZI.mo49getActivity()) != null) {
                    mo49getActivity.runOnUiThread(new ARunnableS9S0101000_5(i, this.LIZ, 5));
                }
            }
        }
    }
}
