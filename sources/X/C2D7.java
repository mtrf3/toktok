package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", f = "TapGestureDetector.kt", l = {148}, m = "invokeSuspend")
/* renamed from: X.2D7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2D7 extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C42091kz LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C10370av, C76800UCe> LJLJJLL;
    public final /* synthetic */ C68322mC<C11P> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2D7(C42091kz c42091kz, InterfaceC88472Yns<? super C10370av, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super C10370av, C76800UCe> interfaceC88472Yns2, C68322mC<C11P> c68322mC, InterfaceC67352kd<? super C2D7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c42091kz;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC88472Yns2;
        this.LJLJL = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2D7 c2d7 = new C2D7(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c2d7.LJLJI = obj;
        return c2d7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC37471dX interfaceC37471dX = (InterfaceC37471dX) this.LJLJI;
            this.LJLILLLLZI = 1;
            obj = C0UM.LIZLLL(interfaceC37471dX, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C11P c11p = (C11P) obj;
        if (c11p != null) {
            c11p.LIZ();
            C42091kz c42091kz = this.LJLJJI;
            c42091kz.LJLILLLLZI = true;
            c42091kz.LJLJJI.LIZIZ(null);
            this.LJLJJL.invoke(new C10370av(c11p.LIZJ));
            return C76800UCe.LIZ;
        }
        C42091kz c42091kz2 = this.LJLJJI;
        c42091kz2.LJLJI = true;
        c42091kz2.LJLJJI.LIZIZ(null);
        InterfaceC88472Yns<C10370av, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        if (interfaceC88472Yns == null) {
            return null;
        }
        interfaceC88472Yns.invoke(new C10370av(this.LJLJL.element.LIZJ));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
