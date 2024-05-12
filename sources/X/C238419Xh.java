package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$recordRelationForLogin$1", f = "ReflowSideProcessor.kt", l = {279}, m = "invokeSuspend")
/* renamed from: X.9Xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238419Xh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ A7W LJLILLLLZI;
    public final /* synthetic */ C238479Xn LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238419Xh(A7W a7w, C238479Xn c238479Xn, InterfaceC67352kd<? super C238419Xh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = a7w;
        this.LJLJI = c238479Xn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C238419Xh(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
                C84661XKn LIZIZ = XKX.LIZIZ(this.LJLILLLLZI.LIZ, null, null, new C238449Xk(false, this.LJLJI, null), 3);
                this.LJLIL = 1;
                if (LIZIZ.LJJIJ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Throwable th) {
            C221018lt.LIZJ("@LinkRelation", "recordRelation for login error", th);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
