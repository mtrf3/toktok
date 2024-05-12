package X;

import fjb.a;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {237}, m = "invokeSuspend")
/* renamed from: X.2DF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC88471Ynr<C11P, C10370av, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DF(InterfaceC67352kd interfaceC67352kd, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = interfaceC65784Pro2;
        this.LJLJJLL = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2DF c2df = new C2DF(interfaceC67352kd, this.LJLJI, this.LJLJJL, this.LJLJJI, this.LJLJJLL);
        c2df.LJLILLLLZI = obj;
        return c2df;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC37501da interfaceC37501da = (InterfaceC37501da) this.LJLILLLLZI;
                C2DE c2de = new C2DE(null, this.LJLJJL, this.LJLJI, this.LJLJJI, this.LJLJJLL);
                this.LJLIL = 1;
                if (interfaceC37501da.LJIJJLI(c2de, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        } catch (CancellationException e) {
            this.LJLJI.invoke();
            throw e;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
