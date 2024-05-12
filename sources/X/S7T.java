package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel", f = "TemplateListViewModel.kt", l = {77}, m = "onRefresh")
/* loaded from: classes13.dex */
public final class S7T extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ TemplateListViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7T(TemplateListViewModel templateListViewModel, InterfaceC67352kd<? super S7T> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = templateListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.onRefresh(this);
    }
}
