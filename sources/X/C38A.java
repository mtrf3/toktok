package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$triggerFullUpdate$2$result$1", f = "StorageDataSource.kt", l = {115}, m = "invokeSuspend")
/* renamed from: X.38A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38A extends AbstractC65782Prm implements InterfaceC88471Ynr<AnonymousClass385, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C38C LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38A(C38C c38c, int i, InterfaceC67352kd<? super C38A> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c38c;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C38A c38a = new C38A(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c38a.LJLILLLLZI = obj;
        return c38a;
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
            AnonymousClass385 anonymousClass385 = (AnonymousClass385) this.LJLILLLLZI;
            C38C c38c = this.LJLJI;
            C38K c38k = new C38K(0);
            int i2 = this.LJLJJI;
            this.LJLIL = 1;
            obj = c38c.LJFF(c38k, anonymousClass385, i2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(AnonymousClass385 anonymousClass385, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(anonymousClass385, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
