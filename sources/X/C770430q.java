package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.FamiliarsRelationFetchManager$fetchFamiliarAsync$1", f = "FamiliarsRelationFetchManager.kt", l = {74}, m = "invokeSuspend")
/* renamed from: X.30q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C770430q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C770430q(InterfaceC67352kd<? super C770430q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C770430q(interfaceC67352kd);
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
            C3YT.LJLIL.getClass();
            boolean z = false;
            if (System.currentTimeMillis() - C80993Fv.LIZ().LIZ.getLong("last_friends_relation_fetch_time", 0L) >= 21600000) {
                EF7.LIZIZ();
                try {
                    z = C2NU.LIZ.LIZIZ();
                } catch (Exception unused) {
                }
                if (!z) {
                    C3YT.LJLIL.getClass();
                    C3YT.LJLJJI = true;
                } else {
                    C3YT c3yt = C3YT.LJLIL;
                    this.LJLIL = 1;
                    if (c3yt.LIZJ(this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C770430q(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
