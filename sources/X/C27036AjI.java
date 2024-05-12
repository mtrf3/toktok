package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.TextInputHelper;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS0S0320000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.TextInputHelper$onBind$5$7$5", f = "TextInputHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AjI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27036AjI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TextInputHelper LJLIL;
    public final /* synthetic */ C27021Aj3 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27036AjI(TextInputHelper textInputHelper, C27021Aj3 c27021Aj3, boolean z, boolean z2, InterfaceC67352kd<? super C27036AjI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = textInputHelper;
        this.LJLILLLLZI = c27021Aj3;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27036AjI(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C253009wO c253009wO;
        List<C27021Aj3> list;
        Integer num;
        C141335gf.LIZJ(obj);
        AddressEditDetailViewModel addressEditDetailViewModel = this.LJLIL.viewModel;
        C27021Aj3 item = this.LJLILLLLZI;
        addressEditDetailViewModel.getClass();
        o.LJIIIZ(item, "item");
        Integer num2 = item.LIZ.type;
        if ((num2 == null || num2.intValue() != -100) && ((num = item.LIZ.type) == null || num.intValue() != -101)) {
            c253009wO = addressEditDetailViewModel.Kv0(item);
        } else {
            Object obj2 = item.LIZIZ;
            if ((obj2 instanceof List) && (list = (List) obj2) != null) {
                boolean z = false;
                for (C27021Aj3 c27021Aj3 : list) {
                    if (c27021Aj3 != null && addressEditDetailViewModel.Kv0(c27021Aj3).LIZ != null) {
                        z = true;
                    }
                }
                if (z) {
                    c253009wO = new C253009wO("", null, false, 6);
                }
            }
            c253009wO = null;
        }
        TextInputHelper textInputHelper = this.LJLIL;
        textInputHelper.showDifferentVerifyResult(textInputHelper.targetView, this.LJLILLLLZI, c253009wO);
        if (this.LJLIL.startFocus != -1) {
            AddressEditDetailActivity addressEditDetailActivity = AddressEditDetailActivity.LJLZ;
            if (addressEditDetailActivity != null) {
                C78946Uyc.LJJII(addressEditDetailActivity, new C70930Rsc(), new AqS0S0320000_4(this.LJLILLLLZI, this.LJLIL, this.LJLJI, this.LJLJJI, c253009wO, 0));
            }
            this.LJLIL.startFocus = -1L;
        }
        this.LJLIL.userInput = false;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
