package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm", f = "DistrictFragment.kt", l = {1980}, m = "push")
/* renamed from: X.Aou, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27384Aou extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ DistrictVm LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27384Aou(DistrictVm districtVm, InterfaceC67352kd<? super C27384Aou> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = districtVm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.kv0(null, this);
    }
}
