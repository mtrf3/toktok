package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage$onViewCreated$adapter$1$1", f = "DistrictFragment.kt", l = {1613}, m = "invokeSuspend")
/* renamed from: X.ApG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27406ApG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DistrictPage LJLILLLLZI;
    public final /* synthetic */ District LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27406ApG(DistrictPage districtPage, District district, InterfaceC67352kd<? super C27406ApG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = districtPage;
        this.LJLJI = district;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27406ApG(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            DistrictPage districtPage = this.LJLILLLLZI;
            District district = this.LJLJI;
            this.LJLIL = 1;
            obj = districtPage.Al(district, true, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            DistrictVm xl = this.LJLILLLLZI.xl();
            FragmentManager requireFragmentManager = this.LJLILLLLZI.requireFragmentManager();
            o.LJIIIIZZ(requireFragmentManager, "requireFragmentManager()");
            xl.jv0(requireFragmentManager, this.LJLILLLLZI.wl());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}