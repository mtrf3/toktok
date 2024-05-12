package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;

/* renamed from: X.HOf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43989HOf implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").openDMAlbum(this.LIZ, C43988HOe.LIZ(this.LIZJ, this.LIZIZ, C43988HOe.LIZLLL()));
    }

    public C43989HOf(Activity activity, String str, int i) {
        this.LIZ = activity;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
