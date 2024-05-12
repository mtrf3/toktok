package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SortWeightRelationModel$followingLoader$2", f = "SortWeightRelationModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3O1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3O1 extends AbstractC65782Prm implements InterfaceC88471Ynr<IMContact, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C3R9 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3O1(C3R9 c3r9, InterfaceC67352kd<? super C3O1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3r9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3O1 c3o1 = new C3O1(this.LJLILLLLZI, interfaceC67352kd);
        c3o1.LJLIL = obj;
        return c3o1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IMContact obj2 = (IMContact) this.LJLIL;
        C3R9 parameters = this.LJLILLLLZI;
        o.LJIIIZ(parameters, "parameters");
        C3O0 c3o0 = new C3O0(parameters);
        o.LJIIIZ(obj2, "obj");
        return Boolean.valueOf(c3o0.LJLJI.LJIIL(obj2));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(IMContact iMContact, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(iMContact, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
