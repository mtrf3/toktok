package X;

import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.ui.profiletab.BottomProfileObserver$requirePermissionPopUp$1", f = "BottomProfileObserver.kt", l = {592}, m = "invokeSuspend")
/* renamed from: X.Ltp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55717Ltp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ LN0 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55717Ltp(LN0 ln0, InterfaceC67352kd<? super C55717Ltp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = ln0;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55717Ltp c55717Ltp = new C55717Ltp(this.LJLJI, interfaceC67352kd);
        c55717Ltp.LJLILLLLZI = obj;
        return c55717Ltp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3C3 LIZJ;
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
            InterfaceC70542pm LJJII = C78609UtB.LJJII(this.LJLJI.LJLIL, new AqS175S0100000_9((InterfaceC70422pa) this.LJLILLLLZI, 571));
            if (LJJII != null && (LIZJ = ((C77202URq) LJJII).LIZJ()) != null) {
                C55720Lts c55720Lts = new C55720Lts();
                this.LJLIL = 1;
                if (LIZJ.collect(c55720Lts, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
