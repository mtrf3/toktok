package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage", f = "DistrictFragment.kt", l = {1833}, m = "onItemClick")
/* renamed from: X.ApK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27410ApK extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ DistrictPage LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27410ApK(DistrictPage districtPage, InterfaceC67352kd<? super C27410ApK> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = districtPage;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.Al(null, false, this);
    }
}
