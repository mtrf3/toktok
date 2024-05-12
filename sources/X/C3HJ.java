package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.BaseRelationModel$recentLoader$2$1", f = "BaseRelationModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3HJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HJ extends AbstractC65782Prm implements InterfaceC88471Ynr<C63120Opw, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C3LH LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3HJ(C3LH c3lh, InterfaceC67352kd<? super C3HJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3lh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3HJ c3hj = new C3HJ(this.LJLILLLLZI, interfaceC67352kd);
        c3hj.LJLIL = obj;
        return c3hj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return Boolean.valueOf(this.LJLILLLLZI.LJIIL((C63120Opw) this.LJLIL));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C63120Opw c63120Opw, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(c63120Opw, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
