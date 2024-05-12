package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFFeedAssem;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.main.assems.mainfragment.MFFeedAssem$onViewCreated$1", f = "MFFeedAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.LTt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54325LTt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MFFeedAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54325LTt(MFFeedAssem mFFeedAssem, InterfaceC67352kd<? super C54325LTt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mFFeedAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54325LTt(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC36571c5 currentFragment = this.LJLIL.getCurrentFragment();
        if (currentFragment != null && (currentFragment instanceof InterfaceC215378cn)) {
            InterfaceC72642tA cl = ((InterfaceC215378cn) currentFragment).cl();
            boolean z = !o.LJ("", AccountService.LJIJ().LJIILL());
            if (cl instanceof LU2) {
                LU2 lu2 = (LU2) cl;
                lu2.LIZJ(new LU3(z, lu2));
            } else if (cl instanceof DetailFragmentPanel) {
                LU1 lu1 = (LU1) cl;
                lu1.qe(new LU4(z, lu1));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
