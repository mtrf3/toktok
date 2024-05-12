package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper;
import fjb.a;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper$autoFillLogNode$1$1", f = "TextInputHelper.kt", l = {405}, m = "invokeSuspend")
/* renamed from: X.Amm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27252Amm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TextInputHelper LJLILLLLZI;
    public final /* synthetic */ C27021Aj3 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27252Amm(TextInputHelper textInputHelper, C27021Aj3 c27021Aj3, InterfaceC67352kd<? super C27252Amm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = textInputHelper;
        this.LJLJI = c27021Aj3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27252Amm(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            AddressEditViewModel addressEditViewModel = this.LJLILLLLZI.viewModel;
            C27021Aj3 c27021Aj3 = this.LJLJI;
            this.LJLIL = 1;
            obj = addressEditViewModel.zw0(c27021Aj3, null, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        TextInputHelper textInputHelper = this.LJLILLLLZI;
        C253009wO c253009wO = (C253009wO) obj;
        textInputHelper.showDifferentVerifyResult(textInputHelper.targetView, this.LJLJI, c253009wO);
        AddressEditFragment addressEditFragment = AddressEditFragment.LLD;
        if (addressEditFragment != null) {
            C78946Uyc.LJJII(addressEditFragment, new C70929Rsb(), new AqS170S0100000_4(this.LJLJI, 197));
        }
        AddressEditFragment addressEditFragment2 = AddressEditFragment.LLD;
        if (addressEditFragment2 != null) {
            C78946Uyc.LJJII(addressEditFragment2, new C70930Rsc(), new AqS135S0200000_4(this.LJLJI, c253009wO, 14));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
