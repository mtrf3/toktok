package X;

import Y.IDfS125S0100000;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
/* renamed from: X.2GT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC44011o5<Object>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ MBA LJLJI;
    public final /* synthetic */ InterfaceC65462ha<Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2GT(MBA mba, InterfaceC65462ha<Object> interfaceC65462ha, InterfaceC67352kd<? super C2GT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = mba;
        this.LJLJJI = interfaceC65462ha;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2GT c2gt = new C2GT(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c2gt.LJLILLLLZI = obj;
        return c2gt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC44011o5 interfaceC44011o5 = (InterfaceC44011o5) this.LJLILLLLZI;
            if (o.LJ(this.LJLJI, MBB.INSTANCE)) {
                InterfaceC65462ha<Object> interfaceC65462ha = this.LJLJJI;
                IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(interfaceC44011o5, 50);
                this.LJLIL = 1;
                if (interfaceC65462ha.collect(iDfS125S0100000, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                MBA mba = this.LJLJI;
                C2GS c2gs = new C2GS(this.LJLJJI, interfaceC44011o5, null);
                this.LJLIL = 2;
                if (XKX.LJI(mba, c2gs, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC44011o5<Object> interfaceC44011o5, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC44011o5, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
