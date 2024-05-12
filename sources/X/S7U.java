package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel", f = "TemplateEditBottomAreaViewModel.kt", l = {101}, m = "doSaveTemplate")
/* loaded from: classes13.dex */
public final class S7U extends C3CS {
    public TemplateItem LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ TemplateEditBottomAreaViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7U(TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, InterfaceC67352kd<? super S7U> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = templateEditBottomAreaViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.gv0(null, null, this);
    }
}
