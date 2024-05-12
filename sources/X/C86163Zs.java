package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.decorator.FamiliarsRelationDaoPerformance$1", f = "FamiliarsRelationDaoPerformance.kt", l = {33}, m = "invokeSuspend")
/* renamed from: X.3Zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86163Zs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC75532xp LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ C86463aM LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86163Zs(C86463aM c86463aM, InterfaceC67352kd<? super C86163Zs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c86463aM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C86163Zs(this.LJLJJL, interfaceC67352kd);
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
            C86463aM c86463aM = this.LJLJJL;
            interfaceC75532xp = c86463aM.LIZIZ;
            InterfaceC86173Zt interfaceC86173Zt = c86463aM.LIZ;
            this.LJLIL = interfaceC75532xp;
            str = "FRIENDS_RELATION_row_count";
            this.LJLILLLLZI = "FRIENDS_RELATION_row_count";
            obj2 = "value";
            this.LJLJI = "value";
            this.LJLJJI = 1;
            obj = interfaceC86173Zt.LIZLLL(this);
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
