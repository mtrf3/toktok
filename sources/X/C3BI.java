package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {219}, m = "invokeSuspend")
/* renamed from: X.3BI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BI extends AbstractC65782Prm implements InterfaceC88471Ynr<C3BM, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC65462ha<Object> LJLJI;
    public final /* synthetic */ C3BJ<Object> LJLJJI;
    public final /* synthetic */ Object LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3BI(InterfaceC65462ha<Object> interfaceC65462ha, C3BJ<Object> c3bj, Object obj, InterfaceC67352kd<? super C3BI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC65462ha;
        this.LJLJJI = c3bj;
        this.LJLJJL = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3BI c3bi = new C3BI(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c3bi.LJLILLLLZI = obj;
        return c3bi;
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
            int i2 = C3BL.LIZ[((C3BM) this.LJLILLLLZI).ordinal()];
            if (i2 != 1) {
                if (i2 == 3) {
                    Object obj2 = this.LJLJJL;
                    if (obj2 == C79853Bl.LIZ) {
                        this.LJLJJI.LIZ();
                    } else {
                        this.LJLJJI.LIZIZ(obj2);
                    }
                }
            } else {
                InterfaceC65462ha<Object> interfaceC65462ha = this.LJLJI;
                C3BJ<Object> c3bj = this.LJLJJI;
                this.LJLIL = 1;
                if (interfaceC65462ha.collect(c3bj, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3BM c3bm, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3bm, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
