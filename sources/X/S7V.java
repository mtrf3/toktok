package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel", f = "TemplateListViewModel.kt", l = {192}, m = "doSaveTemplate")
/* loaded from: classes13.dex */
public final class S7V extends C3CS {
    public TemplateItem LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ TemplateListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7V(TemplateListViewModel templateListViewModel, InterfaceC67352kd<? super S7V> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = templateListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.gv0(null, this);
    }
}
