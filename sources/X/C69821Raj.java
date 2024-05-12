package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.TtfPdpViewModelKt", f = "TtfPdpViewModel.kt", l = {383, 418, 448}, m = "openSkuPanelByStateTtfAndUs")
/* renamed from: X.Raj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69821Raj extends C3CS {
    public PdpViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C69821Raj(InterfaceC67352kd<? super C69821Raj> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C69819Rah.LJ(null, null, 0, null, null, null, null, null, null, this);
    }
}
