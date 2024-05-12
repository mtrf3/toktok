package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.BaseRelationModel$recentLoader$1$3", f = "BaseRelationModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81323Hc extends AbstractC65782Prm implements InterfaceC88471Ynr<IMContact, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C3LJ LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81323Hc(C3LJ c3lj, InterfaceC67352kd<? super C81323Hc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3lj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C81323Hc c81323Hc = new C81323Hc(this.LJLILLLLZI, interfaceC67352kd);
        c81323Hc.LJLIL = obj;
        return c81323Hc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return Boolean.valueOf(this.LJLILLLLZI.LJIIL((IMContact) this.LJLIL));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(IMContact iMContact, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(iMContact, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
