package X;

/* renamed from: X.Htc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45512Htc implements InterfaceC45885Hzd {
    public final /* synthetic */ C45500HtQ LIZ;

    public C45512Htc(C45500HtQ c45500HtQ) {
        this.LIZ = c45500HtQ;
    }

    @Override // X.InterfaceC45885Hzd
    public final void LIZ(boolean z) {
        this.LIZ.LJLJI.LLIIJI(z);
        if (z) {
            C45500HtQ c45500HtQ = this.LIZ;
            ((HMV) c45500HtQ.LLILZIL.getValue()).setEnterFrom("enter_from_multi");
            HQB hqb = c45500HtQ.LLIIZ;
            if (hqb != null) {
                hqb.LIZ(true);
                return;
            }
            return;
        }
        C45500HtQ c45500HtQ2 = this.LIZ;
        ((HMV) c45500HtQ2.LLILZIL.getValue()).setEnterFrom("enter_from_single");
        HQB hqb2 = c45500HtQ2.LLIIZ;
        if (hqb2 == null) {
            return;
        }
        hqb2.LIZ(false);
    }
}
