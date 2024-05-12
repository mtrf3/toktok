package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel", f = "PdpViewModel.kt", l = {5563}, m = "realFetchSkuInfo")
/* renamed from: X.RdH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69979RdH extends C3CS {
    public PdpViewModel LJLIL;
    public C68322mC LJLILLLLZI;
    public Object LJLJI;
    public SkuItem LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ PdpViewModel LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69979RdH(PdpViewModel pdpViewModel, InterfaceC67352kd<? super C69979RdH> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = pdpViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.Zw0(this);
    }
}
