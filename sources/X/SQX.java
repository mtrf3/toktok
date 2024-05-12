package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel", f = "HighlightsListViewModel.kt", l = {80}, m = "onRefresh")
/* loaded from: classes13.dex */
public final class SQX extends C3CS {
    public HighlightsListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ HighlightsListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQX(HighlightsListViewModel highlightsListViewModel, InterfaceC67352kd<? super SQX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = highlightsListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onRefresh(this);
    }
}
