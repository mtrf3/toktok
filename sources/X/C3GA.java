package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.decorator.IMUserDaoPerformance$1", f = "ImUserDaoPerformance.kt", l = {44}, m = "invokeSuspend")
/* renamed from: X.3GA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC75532xp LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ C86503aQ LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3GA(C86503aQ c86503aQ, InterfaceC67352kd<? super C3GA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c86503aQ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3GA(this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC75532xp interfaceC75532xp;
        String str;
        Object obj2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LJLJI;
                str = (String) this.LJLILLLLZI;
                interfaceC75532xp = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C86503aQ c86503aQ = this.LJLJJL;
            interfaceC75532xp = c86503aQ.LIZLLL;
            InterfaceC80883Fk interfaceC80883Fk = c86503aQ.LIZ;
            this.LJLIL = interfaceC75532xp;
            str = "SIMPLE_USER_row_count";
            this.LJLILLLLZI = "SIMPLE_USER_row_count";
            obj2 = "value";
            this.LJLJI = "value";
            this.LJLJJI = 1;
            obj = interfaceC80883Fk.LIZLLL(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        interfaceC75532xp.LIZIZ(str, C51029K0z.LJJIIZI(new OSZ(obj2, String.valueOf(((Number) obj).intValue()))));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
