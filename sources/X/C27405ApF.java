package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage$onViewCreated$3", f = "DistrictFragment.kt", l = {1655, 1656}, m = "invokeSuspend")
/* renamed from: X.ApF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27405ApF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DistrictPage LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27405ApF(DistrictPage districtPage, InterfaceC67352kd<? super C27405ApF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = districtPage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27405ApF(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLILLLLZI.xl().LJLJJL > this.LJLILLLLZI.wl()) {
                DistrictVm xl = this.LJLILLLLZI.xl();
                FragmentManager requireFragmentManager = this.LJLILLLLZI.requireFragmentManager();
                o.LJIIIIZZ(requireFragmentManager, "requireFragmentManager()");
                this.LJLIL = 1;
                if (xl.kv0(requireFragmentManager, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        DistrictPage districtPage = this.LJLILLLLZI;
        this.LJLIL = 2;
        if (districtPage.Dl(this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
