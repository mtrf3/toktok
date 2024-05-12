package X;

import com.ss.android.ugc.aweme.services.IFoundationAVService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJS implements IFoundationAVService.IFetchResourcesListener {
    public final /* synthetic */ IFoundationAVService.IFetchResourcesListener LJLIL;

    public HJS(C73343SqR c73343SqR) {
        this.LJLIL = c73343SqR;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onFailed(Exception exc) {
        IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.LJLIL;
        if (iFetchResourcesListener != null) {
            iFetchResourcesListener.onFailed(exc);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onSuccess(String[] requirements) {
        o.LJIIIZ(requirements, "requirements");
        IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.LJLIL;
        if (iFetchResourcesListener != null) {
            iFetchResourcesListener.onSuccess(requirements);
        }
    }
}
