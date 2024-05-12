package X;

import Y.ARunnableS1S1200100_10;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import fjb.a;
import kotlin.jvm.internal.o;

/* renamed from: X.Nsk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60746Nsk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC70422pa LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ InterfaceC68342mE LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ ARunnableS1S1200100_10 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60746Nsk(InterfaceC68342mE interfaceC68342mE, long j, InterfaceC67352kd interfaceC67352kd, ARunnableS1S1200100_10 aRunnableS1S1200100_10) {
        super(2, interfaceC67352kd);
        this.LJLJJI = interfaceC68342mE;
        this.LJLJJL = j;
        this.LJLJJLL = aRunnableS1S1200100_10;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIJ(completion, "completion");
        C60746Nsk c60746Nsk = new C60746Nsk(this.LJLJJI, this.LJLJJL, completion, this.LJLJJLL);
        c60746Nsk.LJLIL = (InterfaceC70422pa) obj;
        return c60746Nsk;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            InterfaceC70422pa interfaceC70422pa = this.LJLIL;
            InterfaceC68342mE interfaceC68342mE = this.LJLJJI;
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLJI = 1;
            obj2 = interfaceC68342mE.LJI(this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        TemplateData templateData = (TemplateData) obj2;
        ARunnableS1S1200100_10 aRunnableS1S1200100_10 = this.LJLJJLL;
        C60726NsQ c60726NsQ = (C60726NsQ) aRunnableS1S1200100_10.l1;
        C60606NqU c60606NqU = c60726NsQ.LJLJI;
        TemplateBundle templateBundle = null;
        if (c60606NqU != null && c60606NqU.LJJIIZ != null) {
            if (c60606NqU != null) {
                templateBundle = c60606NqU.LJJIIZ;
            }
            c60726NsQ.LJIIZILJ(templateBundle, templateData, aRunnableS1S1200100_10.s0, this.LJLJJL);
        } else {
            c60726NsQ.LJIILLIIL((byte[]) aRunnableS1S1200100_10.l2, templateData, aRunnableS1S1200100_10.s0, this.LJLJJL);
        }
        return C76800UCe.LIZ;
    }
}
