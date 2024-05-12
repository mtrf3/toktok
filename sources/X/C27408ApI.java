package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage", f = "DistrictFragment.kt", l = {1762}, m = "updateUI")
/* renamed from: X.ApI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27408ApI extends C3CS {
    public DistrictPage LJLIL;
    public DistrictData LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ DistrictPage LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27408ApI(DistrictPage districtPage, InterfaceC67352kd<? super C27408ApI> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = districtPage;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.Gl(null, 0, this);
    }
}
