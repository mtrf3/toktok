package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {99}, m = "invokeSuspend")
/* renamed from: X.2DA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC37501da LJLJI;
    public final /* synthetic */ InterfaceC88473Ynt<C1N5, C10370av, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DA(InterfaceC37501da interfaceC37501da, InterfaceC67352kd interfaceC67352kd, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC88472Yns interfaceC88472Yns3, InterfaceC88473Ynt interfaceC88473Ynt) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC37501da;
        this.LJLJJI = interfaceC88473Ynt;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC88472Yns2;
        this.LJLJL = interfaceC88472Yns3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2DA c2da = new C2DA(this.LJLJI, interfaceC67352kd, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJJI);
        c2da.LJLILLLLZI = obj;
        return c2da;
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
            C42091kz c42091kz = new C42091kz(this.LJLJI);
            InterfaceC37501da interfaceC37501da = this.LJLJI;
            C2D9 c2d9 = new C2D9(c42091kz, this.LJLJJI, interfaceC70422pa, this.LJLJJL, this.LJLJJLL, this.LJLJL, null);
            this.LJLIL = 1;
            if (C0UR.LIZIZ(interfaceC37501da, c2d9, this) == enumC58928NAu) {
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
