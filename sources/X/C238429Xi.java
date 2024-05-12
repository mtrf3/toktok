package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$tryRecordRelation$1", f = "ReflowSideProcessor.kt", l = {295}, m = "invokeSuspend")
/* renamed from: X.9Xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238429Xi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public XJO LJLIL;
    public A7W LJLILLLLZI;
    public C238479Xn LJLJI;
    public int LJLJJI;
    public final /* synthetic */ A7W LJLJJL;
    public final /* synthetic */ C238479Xn LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238429Xi(A7W a7w, C238479Xn c238479Xn, InterfaceC67352kd<? super C238429Xi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = a7w;
        this.LJLJJLL = c238479Xn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C238429Xi(this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        A7W a7w;
        XJO xjo;
        C238479Xn c238479Xn;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                c238479Xn = this.LJLJI;
                a7w = this.LJLILLLLZI;
                xjo = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            a7w = this.LJLJJL;
            xjo = a7w.LIZLLL;
            c238479Xn = this.LJLJJLL;
            this.LJLIL = xjo;
            this.LJLILLLLZI = a7w;
            this.LJLJI = c238479Xn;
            this.LJLJJI = 1;
            if (xjo.LIZ(null, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        try {
            C84661XKn LIZIZ = XKX.LIZIZ(a7w.LIZ, null, null, new C238449Xk(true, c238479Xn, null), 3);
            XKQ xkq = a7w.LJ;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            a7w.LJ = XKX.LIZLLL(a7w.LIZ, null, null, new C238439Xj(LIZIZ, a7w, c238479Xn, null), 3);
            xjo.LIZIZ(null);
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            xjo.LIZIZ(null);
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
