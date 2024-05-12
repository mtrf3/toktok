package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateEvent;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.RegionSelectHelper;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.RegionSelectHelper$onEvent$2", f = "RegionSelectHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AnA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27276AnA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ RegionSelectHelper LJLIL;
    public final /* synthetic */ MapLocateEvent LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27276AnA(RegionSelectHelper regionSelectHelper, MapLocateEvent mapLocateEvent, InterfaceC67352kd<? super C27276AnA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = regionSelectHelper;
        this.LJLILLLLZI = mapLocateEvent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27276AnA(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.showLocateIcon();
        AddressEditViewModel viewModel = this.LJLIL.getViewModel();
        Context context = this.LJLIL.getTargetView().getContext();
        o.LJIIIIZZ(context, "targetView.context");
        viewModel.nw0(context);
        this.LJLIL.showLocateMsgToast(this.LJLILLLLZI.locateMsg);
        this.LJLIL.getViewModel().LJZL = true;
        this.LJLIL.getViewModel().lw0(this.LJLILLLLZI.errorCode, this.LJLIL.getViewModel().LL, null, false, this.LJLIL.getViewModel().LJZL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
