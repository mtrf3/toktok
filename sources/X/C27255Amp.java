package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel", f = "AddressEditViewModel.kt", l = {2860}, m = "verifyItem")
/* renamed from: X.Amp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27255Amp extends C3CS {
    public AddressEditViewModel LJLIL;
    public C27021Aj3 LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ AddressEditViewModel LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27255Amp(AddressEditViewModel addressEditViewModel, InterfaceC67352kd<? super C27255Amp> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = addressEditViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.zw0(null, null, this);
    }
}
