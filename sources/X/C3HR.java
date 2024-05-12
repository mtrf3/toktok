package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SharePanelContactsPreloadManager$refreshContacts$1", f = "SharePanelContactsPreloadManager.kt", l = {212}, m = "invokeSuspend")
/* renamed from: X.3HR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C3HR(InterfaceC67352kd<? super C3HR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3HR(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
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
            C82563Lw c82563Lw = C82563Lw.LJLIL;
            if (C82563Lw.LJLJI == C3MU.INIT) {
                z = true;
            } else {
                z = false;
            }
            this.LJLIL = 1;
            if (c82563Lw.LJ(z, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C3HR(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
