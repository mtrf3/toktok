package X;

import Y.ARunnableS1S1200100_10;
import com.lynx.tasm.TemplateData;
import fjb.a;
import kotlin.jvm.internal.o;

/* renamed from: X.Nsl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60747Nsl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC70422pa LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public C60726NsQ LJLJI;
    public int LJLJJI;
    public final /* synthetic */ InterfaceC68342mE LJLJJL;
    public final /* synthetic */ ARunnableS1S1200100_10 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60747Nsl(InterfaceC68342mE interfaceC68342mE, InterfaceC67352kd interfaceC67352kd, ARunnableS1S1200100_10 aRunnableS1S1200100_10) {
        super(2, interfaceC67352kd);
        this.LJLJJL = interfaceC68342mE;
        this.LJLJJLL = aRunnableS1S1200100_10;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIJ(completion, "completion");
        C60747Nsl c60747Nsl = new C60747Nsl(this.LJLJJL, completion, this.LJLJJLL);
        c60747Nsl.LJLIL = (InterfaceC70422pa) obj;
        return c60747Nsl;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C60726NsQ c60726NsQ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                c60726NsQ = this.LJLJI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = this.LJLIL;
            c60726NsQ = (C60726NsQ) this.LJLJJLL.l1;
            InterfaceC68342mE interfaceC68342mE = this.LJLJJL;
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLJI = c60726NsQ;
            this.LJLJJI = 1;
            obj = interfaceC68342mE.LJI(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        c60726NsQ.updateData((TemplateData) obj);
        return C76800UCe.LIZ;
    }
}
