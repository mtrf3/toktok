package X;

import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;

/* renamed from: X.abc, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94104abc implements FetchResourcesListener {
    public final /* synthetic */ InterfaceC93663aUV LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onSuccess() {
        this.LIZ.onSuccess(this.LIZIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onFailed(Exception exc) {
        this.LIZ.onFail();
    }

    public C94104abc(String str, InterfaceC93663aUV interfaceC93663aUV) {
        this.LIZ = interfaceC93663aUV;
        this.LIZIZ = str;
    }
}
