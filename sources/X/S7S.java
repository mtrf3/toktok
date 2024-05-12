package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel", f = "TemplateEditBottomAreaViewModel.kt", l = {133, 144, 150, 163}, m = "saveAndDisplay")
/* loaded from: classes13.dex */
public final class S7S extends C3CS {
    public TemplateEditBottomAreaViewModel LJLIL;
    public TemplateItem LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public S6S LJLJJL;
    public LiveEffect LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ TemplateEditBottomAreaViewModel LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7S(TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, InterfaceC67352kd<? super S7S> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = templateEditBottomAreaViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.hv0(null, null, null, this);
    }
}
