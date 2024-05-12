package X;

import com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel$createJob$1", f = "ForceBackFYPViewModel.kt", l = {77, 78}, m = "invokeSuspend")
/* renamed from: X.3EF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ ForceBackFYPViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3EF(long j, ForceBackFYPViewModel forceBackFYPViewModel, InterfaceC67352kd<? super C3EF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = forceBackFYPViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3EF(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
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
            StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "delay ");
            LIZIZ.append(this.LJLILLLLZI);
            LIZIZ.append(" time job to switch.");
            C221018lt.LJFF("LandingFYP", X1D.LIZIZ(LIZIZ));
            long j = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == obj2) {
                return obj2;
            }
        }
        ForceBackFYPViewModel forceBackFYPViewModel = this.LJLJI;
        this.LJLIL = 2;
        forceBackFYPViewModel.getClass();
        Object LJI = XKX.LJI(EXV.LIZ, new C3EG(forceBackFYPViewModel, null), this);
        if (LJI != obj2) {
            LJI = C76800UCe.LIZ;
        }
        if (LJI == obj2) {
            return obj2;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
