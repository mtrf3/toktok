package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {220}, m = "invokeSuspend")
/* renamed from: X.2D1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2D1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C42091kz LJLJI;
    public final /* synthetic */ InterfaceC37501da LJLJJI;
    public final /* synthetic */ InterfaceC88473Ynt<C1N5, C10370av, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2D1(C42091kz c42091kz, InterfaceC37501da interfaceC37501da, InterfaceC88473Ynt<? super C1N5, ? super C10370av, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, InterfaceC88472Yns<? super C10370av, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C2D1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c42091kz;
        this.LJLJJI = interfaceC37501da;
        this.LJLJJL = interfaceC88473Ynt;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2D1 c2d1 = new C2D1(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c2d1.LJLILLLLZI = obj;
        return c2d1;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C42091kz c42091kz = this.LJLJI;
            c42091kz.LJLJJI.LIZJ(null);
            c42091kz.LJLILLLLZI = false;
            c42091kz.LJLJI = false;
            InterfaceC37501da interfaceC37501da = this.LJLJJI;
            C2D0 c2d0 = new C2D0(this.LJLJJL, interfaceC70422pa, this.LJLJI, this.LJLJJLL, null);
            this.LJLIL = 1;
            if (interfaceC37501da.LJIJJLI(c2d0, this) == enumC58928NAu) {
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
