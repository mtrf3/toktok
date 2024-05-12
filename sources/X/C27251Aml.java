package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper;
import fjb.a;
import kotlin.jvm.internal.AqS0S0320000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper$onBind$4$7$5", f = "TextInputHelper.kt", l = {336}, m = "invokeSuspend")
/* renamed from: X.Aml, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27251Aml extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TextInputHelper LJLILLLLZI;
    public final /* synthetic */ C27021Aj3 LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27251Aml(TextInputHelper textInputHelper, C27021Aj3 c27021Aj3, boolean z, boolean z2, InterfaceC67352kd<? super C27251Aml> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = textInputHelper;
        this.LJLJI = c27021Aj3;
        this.LJLJJI = z;
        this.LJLJJL = z2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27251Aml(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            AddressEditViewModel addressEditViewModel = this.LJLILLLLZI.viewModel;
            C27021Aj3 c27021Aj3 = this.LJLJI;
            this.LJLIL = 1;
            obj2 = addressEditViewModel.zw0(c27021Aj3, null, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        TextInputHelper textInputHelper = this.LJLILLLLZI;
        C253009wO c253009wO = (C253009wO) obj2;
        textInputHelper.showDifferentVerifyResult(textInputHelper.targetView, this.LJLJI, c253009wO);
        if (this.LJLILLLLZI.startFocus != -1) {
            AddressEditFragment addressEditFragment = AddressEditFragment.LLD;
            if (addressEditFragment != null) {
                C78946Uyc.LJJII(addressEditFragment, new C70930Rsc(), new AqS0S0320000_4(this.LJLJI, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, c253009wO, 1));
            }
            this.LJLILLLLZI.startFocus = -1L;
        }
        this.LJLILLLLZI.userInput = false;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
