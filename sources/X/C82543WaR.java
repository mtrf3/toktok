package X;

import com.ss.android.ugc.aweme.external.PreDownloadEffectModel;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;

/* renamed from: X.WaR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82543WaR implements FetchResourcesListener {
    public final /* synthetic */ PreDownloadEffectModel LIZ;

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onSuccess() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pre download effect model success ");
        LIZ.append(this.LIZ.LJLIL);
        H7B.LJ(X1D.LIZIZ(LIZ));
    }

    public C82543WaR(PreDownloadEffectModel preDownloadEffectModel) {
        this.LIZ = preDownloadEffectModel;
    }

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onFailed(Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pre download effect model fail ");
        LIZ.append(exc);
        H7B.LIZJ(X1D.LIZIZ(LIZ));
    }
}
