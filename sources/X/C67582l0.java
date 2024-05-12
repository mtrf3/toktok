package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.common.MobClickConsentHelper$addEventToPendingList$1", f = "MobClickConsentHelper.kt", l = {39, 41}, m = "invokeSuspend")
/* renamed from: X.2l0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67582l0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C67602l2 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67582l0(C67602l2 c67602l2, InterfaceC67352kd<? super C67582l0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c67602l2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67582l0(this.LJLILLLLZI, interfaceC67352kd);
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
        List list = (List) obj;
        list.add(this.LJLILLLLZI);
        this.LJLIL = 2;
        Object LJI = XKX.LJI(C67612l3.LIZJ, new C67562ky(list, null), this);
        if (LJI != enumC58928NAu) {
            LJI = C76800UCe.LIZ;
        }
        if (LJI == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
