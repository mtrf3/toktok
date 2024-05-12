package X;

import com.ss.android.ugc.aweme.services.ISDKService;

/* loaded from: classes8.dex */
public final class HOY implements ISDKService.SplitCallback {
    public final /* synthetic */ XJL<OSZ<Integer, Integer>> LIZ;

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final void onFail() {
        if (this.LIZ.isActive()) {
            XJL<OSZ<Integer, Integer>> xjl = this.LIZ;
            C3C4 LIZ = C141335gf.LIZ(new RuntimeException("split failed"));
            C3C5.m7constructorimpl(LIZ);
            xjl.resumeWith(LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final boolean checkIsCanceled() {
        return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
    }

    public HOY(XKS xks) {
        this.LIZ = xks;
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final void onSuccess(int i, int i2) {
        if (this.LIZ.isActive()) {
            XJL<OSZ<Integer, Integer>> xjl = this.LIZ;
            OSZ osz = new OSZ(Integer.valueOf(i), Integer.valueOf(i2));
            C3C5.m7constructorimpl(osz);
            xjl.resumeWith(osz);
        }
    }
}
