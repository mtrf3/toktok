package X;

import com.bytedance.geckox.model.UpdatePackage;

/* loaded from: classes7.dex */
public final class FP3 extends AbstractC61537ODd {
    public final /* synthetic */ FP6 LIZ;

    public FP3(SFS sfs) {
        this.LIZ = sfs;
    }

    @Override // X.AbstractC61537ODd
    public final void LJI(UpdatePackage updatePackage, Throwable th) {
        this.LIZ.onFail();
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        this.LIZ.onSuccess();
    }
}
