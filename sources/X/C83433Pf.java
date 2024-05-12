package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.UserSearchContentUpdateEngine$12", f = "UserSearchContentUpdateEngine.kt", l = {145}, m = "invokeSuspend")
/* renamed from: X.3Pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83433Pf extends AbstractC65782Prm implements InterfaceC88471Ynr<C3PT, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C83483Pk LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83433Pf(C83483Pk c83483Pk, InterfaceC67352kd<? super C83433Pf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c83483Pk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C83433Pf c83433Pf = new C83433Pf(this.LJLJI, interfaceC67352kd);
        c83433Pf.LJLILLLLZI = obj;
        return c83433Pf;
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
            C3PT c3pt = (C3PT) this.LJLILLLLZI;
            this.LJLJI.LIZ.LJFF(c3pt.toString());
            if (c3pt.LIZ == C3PO.REMOVE) {
                this.LJLJI.LIZIZ.LIZIZ(C47261Igj.LJJIJ(new C3QL(0, 0L, c3pt.LIZIZ, 2, "")));
                return C76800UCe.LIZ;
            }
            C98453th c98453th = this.LJLJI.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("is contact module enable ");
            LIZ.append(this.LJLJI.LJIIJ.invoke().booleanValue());
            c98453th.LJFF(X1D.LIZIZ(LIZ));
            C83483Pk c83483Pk = this.LJLJI;
            boolean z = c3pt.LIZJ;
            this.LJLIL = 1;
            if (c83483Pk.LIZ(z, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3PT c3pt, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3pt, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
