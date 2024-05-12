package X;

import com.ss.android.ugc.aweme.services.IFoundationAVService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJT implements IFoundationAVService.IFetchResourcesListener {
    public final /* synthetic */ IFoundationAVService.IFetchResourcesListener LJLIL;

    public HJT(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        this.LJLIL = iFetchResourcesListener;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onFailed(Exception exc) {
        C45771Hxn.LIZ = false;
        IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.LJLIL;
        if (iFetchResourcesListener != null) {
            iFetchResourcesListener.onFailed(exc);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onSuccess(String[] requirements) {
        o.LJIIIZ(requirements, "requirements");
        C45771Hxn.LIZ = true;
        IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.LJLIL;
        if (iFetchResourcesListener != null) {
            iFetchResourcesListener.onSuccess(requirements);
        }
    }
}
