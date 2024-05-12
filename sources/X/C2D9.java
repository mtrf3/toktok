package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {100}, m = "invokeSuspend")
/* renamed from: X.2D9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2D9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C42091kz LJLJI;
    public final /* synthetic */ InterfaceC88473Ynt<C1N5, C10370av, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJL;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2D9(C42091kz c42091kz, InterfaceC88473Ynt<? super C1N5, ? super C10370av, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, InterfaceC70422pa interfaceC70422pa, InterfaceC88472Yns<? super C10370av, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super C10370av, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super C10370av, C76800UCe> interfaceC88472Yns3, InterfaceC67352kd<? super C2D9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c42091kz;
        this.LJLJJI = interfaceC88473Ynt;
        this.LJLJJL = interfaceC70422pa;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC88472Yns2;
        this.LJLJLJ = interfaceC88472Yns3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2D9 c2d9 = new C2D9(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c2d9.LJLILLLLZI = obj;
        return c2d9;
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
            InterfaceC37501da interfaceC37501da = (InterfaceC37501da) this.LJLILLLLZI;
            C2D8 c2d8 = new C2D8(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, null);
            this.LJLIL = 1;
            if (interfaceC37501da.LJIJJLI(c2d8, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
