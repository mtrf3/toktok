package X;

import com.ss.android.ugc.aweme.services.IFoundationAVService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I72 implements IFoundationAVService.IFetchResourcesListener {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ C46072I6i LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onFailed(Exception exc) {
        H78.LIZ("downloadResourceFinderModelFile failed when start music sync");
        this.LJLILLLLZI.LIZIZ.LJJIJLIJ(false, true, true);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onSuccess(String[] requirements) {
        o.LJIIIZ(requirements, "requirements");
        this.LJLIL.invoke();
    }

    public I72(C46078I6o c46078I6o, C46072I6i c46072I6i) {
        this.LJLIL = c46078I6o;
        this.LJLILLLLZI = c46072I6i;
    }
}
