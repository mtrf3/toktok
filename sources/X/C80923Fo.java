package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.RelationFetchManager$fetchRelationAsyncInternal$2", f = "RelationFetchManager.kt", l = {156}, m = "invokeSuspend")
/* renamed from: X.3Fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80923Fo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C3YM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80923Fo(C3YM c3ym, InterfaceC67352kd<? super C80923Fo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3ym;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80923Fo(this.LJLILLLLZI, interfaceC67352kd);
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
            C3YC c3yc = C3YC.LJLIL;
            C3YM c3ym = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = c3yc.LJIIIIZZ(c3ym, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchRelationAsync [");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append("]: result=");
        LIZ.append(booleanValue);
        C3YC.LJIIL(X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
