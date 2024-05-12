package X;

import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.sync.StorageSyncer$init$1$1", f = "StorageSyncer.kt", l = {31, 31}, m = "invokeSuspend")
/* renamed from: X.2oN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69672oN extends AbstractC65782Prm implements InterfaceC88473Ynt<String, List<? extends AbstractC74232vj>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;

    public C69672oN(InterfaceC67352kd<? super C69672oN> interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<? extends AbstractC74232vj> list;
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
            list = (List) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            String str = (String) this.LJLILLLLZI;
            list = (List) this.LJLJI;
            C72552t1 c72552t1 = C38C.LIZLLL;
            this.LJLILLLLZI = list;
            this.LJLIL = 1;
            obj = c72552t1.LIZ(str, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI = null;
        this.LJLIL = 2;
        if (((C38C) obj).LJI(list, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(String str, List<? extends AbstractC74232vj> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C69672oN c69672oN = new C69672oN(interfaceC67352kd);
        c69672oN.LJLILLLLZI = str;
        c69672oN.LJLJI = list;
        return c69672oN.invokeSuspend(C76800UCe.LIZ);
    }
}
