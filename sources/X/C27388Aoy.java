package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$initSearchResultRecyclerView$2$onItemClick$5$1$1", f = "DistrictFragment.kt", l = {771}, m = "invokeSuspend")
/* renamed from: X.Aoy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27388Aoy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public DistrictFragment LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ DistrictFragment LJLJI;
    public final /* synthetic */ DistrictPage LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27388Aoy(DistrictFragment districtFragment, DistrictPage districtPage, InterfaceC67352kd<? super C27388Aoy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = districtFragment;
        this.LJLJJI = districtPage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27388Aoy(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        DistrictFragment districtFragment;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                districtFragment = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            District district = (District) ORZ.LJLLLLLL(0, this.LJLJI.Al().LL);
            if (district != null) {
                DistrictPage districtPage = this.LJLJJI;
                districtFragment = this.LJLJI;
                this.LJLIL = districtFragment;
                this.LJLILLLLZI = 1;
                obj = districtPage.Al(district, false, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        if (((Boolean) obj).booleanValue()) {
            DistrictVm Al = districtFragment.Al();
            FragmentManager childFragmentManager = districtFragment.getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            Al.jv0(childFragmentManager, 0);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
