package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2$refreshWhenSwitchLocale$1", f = "SessionListManagerV2.kt", l = {1204}, m = "invokeSuspend")
/* renamed from: X.37K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37K extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C82253Kr LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37K(C82253Kr c82253Kr, InterfaceC67352kd<? super C37K> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c82253Kr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37K(this.LJLILLLLZI, interfaceC67352kd);
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
            InterfaceC81953Jn LJ = this.LJLILLLLZI.LJ();
            if (LJ == null) {
                return C76800UCe.LIZ;
            }
            C34B.LJI("SessionListManagerV2", "refreshWhenSwitchLocale");
            C82253Kr c82253Kr = this.LJLILLLLZI;
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C82253Kr.LJJ(c82253Kr, C4WC.LJIILIIL(), LJ, false, 28);
            XIF xif = EXV.LIZ;
            C37J c37j = new C37J(this.LJLILLLLZI, LJ, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, c37j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
