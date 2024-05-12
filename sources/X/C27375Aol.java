package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$onViewCreated$5$1", f = "DistrictFragment.kt", l = {397}, m = "invokeSuspend")
/* renamed from: X.Aol, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27375Aol extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DistrictFragment LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27375Aol(DistrictFragment districtFragment, int i, InterfaceC67352kd<? super C27375Aol> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = districtFragment;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27375Aol(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            DistrictVm Al = this.LJLILLLLZI.Al();
            FragmentManager childFragmentManager = this.LJLILLLLZI.getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            this.LJLIL = 1;
            if (Al.kv0(childFragmentManager, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        DistrictVm Al2 = this.LJLILLLLZI.Al();
        FragmentManager childFragmentManager2 = this.LJLILLLLZI.getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager2, "childFragmentManager");
        Al2.jv0(childFragmentManager2, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
