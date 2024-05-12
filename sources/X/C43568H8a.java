package X;

import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;

/* renamed from: X.H8a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43568H8a implements FetchResourcesListener {
    public final /* synthetic */ FetchResourcesListener LIZ;

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onSuccess() {
        FetchResourcesListener fetchResourcesListener = this.LIZ;
        if (fetchResourcesListener != null) {
            fetchResourcesListener.onSuccess();
        }
        H78.LIZIZ("lens_hdr", "download success");
    }

    public C43568H8a(FetchResourcesListener fetchResourcesListener) {
        this.LIZ = fetchResourcesListener;
    }

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onFailed(Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download failed: ");
        LIZ.append(exc);
        H78.LIZIZ("lens_hdr", X1D.LIZIZ(LIZ));
        FetchResourcesListener fetchResourcesListener = this.LIZ;
        if (fetchResourcesListener != null) {
            fetchResourcesListener.onFailed(exc);
        }
        if (exc != null) {
            C16880lQ.LLLLIIL(exc);
        }
    }
}
