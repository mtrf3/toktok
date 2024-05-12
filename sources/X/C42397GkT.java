package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;

/* renamed from: X.GkT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42397GkT implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ MovieDetailActivity LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ Intent LIZLLL;

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
        C42398GkU.LIZ(asyncAVService, "service").recordActivityResult(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public C42397GkT(MovieDetailActivity movieDetailActivity, int i, int i2, Intent intent) {
        this.LIZ = movieDetailActivity;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = intent;
    }
}
