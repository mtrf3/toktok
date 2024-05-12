package X;

import Y.ARunnableS9S0101000_5;

/* renamed from: X.Bvo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30360Bvo implements C40 {
    public final /* synthetic */ C30351Bvf LIZ;

    public C30360Bvo(C30351Bvf c30351Bvf) {
        this.LIZ = c30351Bvf;
    }

    @Override // X.C40
    public final void onResult(int i) {
        ActivityC45651qj mo49getActivity;
        C30351Bvf c30351Bvf = this.LIZ;
        if (c30351Bvf.LJLJJI && c30351Bvf.LJI()) {
            long currentTimeMillis = System.currentTimeMillis();
            C30351Bvf c30351Bvf2 = this.LIZ;
            if (currentTimeMillis - c30351Bvf2.LJLLI > 100) {
                c30351Bvf2.LJLLI = System.currentTimeMillis();
                C30351Bvf c30351Bvf3 = this.LIZ;
                if (c30351Bvf3.LJLIL && (mo49getActivity = c30351Bvf3.LJLILLLLZI.mo49getActivity()) != null) {
                    mo49getActivity.runOnUiThread(new ARunnableS9S0101000_5(i, this.LIZ, 4));
                }
            }
        }
    }
}
