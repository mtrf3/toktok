package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.policy.PdpPolicyHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.PoliciesFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.policy.PdpPolicyHolder$onBind$2$1$1", f = "PdpPolicyHolder.kt", l = {51}, m = "invokeSuspend")
/* renamed from: X.AfL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26791AfL extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpPolicyHolder LJLILLLLZI;
    public final /* synthetic */ C26792AfM LJLJI;
    public final /* synthetic */ C5H3<PdpViewModel> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26791AfL(PdpPolicyHolder pdpPolicyHolder, C26792AfM c26792AfM, C5H3<? extends PdpViewModel> c5h3, InterfaceC67352kd<? super C26791AfL> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = pdpPolicyHolder;
        this.LJLJI = c26792AfM;
        this.LJLJJI = c5h3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26791AfL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object LIZ;
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
            ProductPackStruct productPackStruct = this.LJLJJI.getValue().LJLJLLL;
            if (productPackStruct == null || (str = productPackStruct.productId) == null) {
                str = "";
            }
            FragmentManager fragmentManager = this.LJLILLLLZI.LJLIL.getFragmentManager();
            List<ShopPolicy> list = this.LJLJI.LJLIL;
            this.LJLIL = 1;
            if (fragmentManager == null) {
                LIZ = C76800UCe.LIZ;
            } else {
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                PoliciesFragment.LJLILLLLZI = c84654XKg;
                ShopPolicy[] data = (ShopPolicy[]) list.toArray(new ShopPolicy[0]);
                o.LJIIIZ(data, "data");
                ASL LIZ2 = C249109q6.LIZ(1);
                LIZ2.LIZ.LJLLLLLL = (int) C27162AlK.LIZJ;
                PoliciesFragment policiesFragment = new PoliciesFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("data", data);
                bundle.putString("id", str);
                policiesFragment.setArguments(bundle);
                TuxSheet tuxSheet = LIZ2.LIZ;
                tuxSheet.LJLLILLLL = policiesFragment;
                tuxSheet.LJZI = false;
                tuxSheet.show(fragmentManager, "CommercePoliciesFragment");
                LIZ = c84654XKg.LIZ();
                if (LIZ != enumC58928NAu) {
                    LIZ = C76800UCe.LIZ;
                }
            }
            if (LIZ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
