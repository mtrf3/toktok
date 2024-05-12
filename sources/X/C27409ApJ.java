package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage", f = "DistrictFragment.kt", l = {1677, 1995, 1715}, m = "requestDistricts")
/* renamed from: X.ApJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27409ApJ extends C3CS {
    public DistrictPage LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ DistrictPage LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27409ApJ(DistrictPage districtPage, InterfaceC67352kd<? super C27409ApJ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = districtPage;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.Dl(this);
    }
}
