package X;

import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.effectmanager.IFetchModelListener;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HLV implements IFetchModelListener {
    public final /* synthetic */ IFoundationAVService.IFetchResourcesListener LJLIL;

    public HLV(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        this.LJLIL = iFetchResourcesListener;
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.LJLIL;
        if (iFetchResourcesListener != null) {
            iFetchResourcesListener.onFailed(e);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
    public final void onSuccess(String[] requirements) {
        o.LJIIIZ(requirements, "requirements");
        IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.LJLIL;
        if (iFetchResourcesListener != null) {
            iFetchResourcesListener.onSuccess(requirements);
        }
    }
}
