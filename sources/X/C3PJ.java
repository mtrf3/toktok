package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.ui.assem.IMSearchAssem$onCreate$1", f = "IMSearchAssem.kt", l = {133}, m = "invokeSuspend")
/* renamed from: X.3PJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C3PJ(InterfaceC67352kd<? super C3PJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3PJ(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C83483Pk c83483Pk;
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(500L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C3PK c3pk = C3PK.LJI;
        String invoke = c3pk.LIZJ.invoke();
        C98453th c98453th = c3pk.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSearchContentManually ");
        LIZ.append(invoke);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        String invoke2 = c3pk.LIZJ.invoke();
        if (!c3pk.LIZIZ.containsKey(invoke2) && c3pk.LIZLLL.invoke().booleanValue() && c3pk.LJ.invoke().booleanValue()) {
            c3pk.LIZ.LJFF("recreate CombinedSearchContentEngine");
            c3pk.LIZIZ.put(invoke2, c3pk.LJFF.invoke(invoke2));
        }
        C3PI c3pi = c3pk.LIZIZ.get(invoke);
        if (c3pi != null && (c83483Pk = c3pi.LIZJ) != null) {
            ((C3BJ) c83483Pk.LJIIL.getValue()).LIZIZ(new C3PT(C3PO.REPLACE_ALL, null, true, 2));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C3PJ(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
