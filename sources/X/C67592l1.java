package X;

import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.common.MobClickConsentHelper$flushPendingEvents$1", f = "MobClickConsentHelper.kt", l = {84, 89}, m = "invokeSuspend")
/* renamed from: X.2l1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67592l1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C67592l1(InterfaceC67352kd<? super C67592l1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67592l1(interfaceC67352kd);
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
            this.LJLIL = 1;
            obj = XKX.LJI(C67612l3.LIZJ, new C67572kz(null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        for (C67602l2 c67602l2 : (List) obj) {
            FMX.LJIIL(c67602l2.getEventName(), c67602l2.getParams());
        }
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJLIL = 2;
        Object LJI = XKX.LJI(C67612l3.LIZJ, new C67562ky(c61878OQg, null), this);
        if (LJI != EnumC58928NAu.COROUTINE_SUSPENDED) {
            LJI = C76800UCe.LIZ;
        }
        if (LJI == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C67592l1(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}