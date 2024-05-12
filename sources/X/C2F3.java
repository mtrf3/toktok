package X;

import fjb.a;
import kotlin.jvm.internal.IDqS420S0100000;

@InterfaceC65848Psq(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", f = "BringIntoViewResponder.kt", l = {284}, m = "invokeSuspend")
/* renamed from: X.2F3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2F3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C2F1 LJLJI;
    public final /* synthetic */ InterfaceC274415w LJLJJI;
    public final /* synthetic */ C10390ax LJLJJL;
    public final /* synthetic */ C10390ax LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2F3(C2F1 c2f1, InterfaceC274415w interfaceC274415w, C10390ax c10390ax, C10390ax c10390ax2, InterfaceC67352kd<? super C2F3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c2f1;
        this.LJLJJI = interfaceC274415w;
        this.LJLJJL = c10390ax;
        this.LJLJJLL = c10390ax2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2F3 c2f3 = new C2F3(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c2f3.LJLILLLLZI = obj;
        return c2f3;
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
            XKX.LIZLLL((InterfaceC70422pa) this.LJLILLLLZI, null, null, new C2F2(this.LJLJI, this.LJLJJL, null), 3);
            C2F1 c2f1 = this.LJLJI;
            InterfaceC14650hp interfaceC14650hp = c2f1.LJLILLLLZI;
            if (interfaceC14650hp == null) {
                interfaceC14650hp = c2f1.LJLIL;
            }
            InterfaceC274415w interfaceC274415w = this.LJLJJI;
            IDqS420S0100000 iDqS420S0100000 = new IDqS420S0100000(this.LJLJJLL, 129);
            this.LJLIL = 1;
            if (interfaceC14650hp.LIZ(interfaceC274415w, iDqS420S0100000, this) == enumC58928NAu) {
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
