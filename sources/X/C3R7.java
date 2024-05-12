package X;

import Y.IDComparatorS29S0000000_1;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.LegacyRelationModel$followLoader$1", f = "LegacyRelationModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3R7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3R7 extends AbstractC65782Prm implements InterfaceC88471Ynr<List<? extends IMUser>, InterfaceC67352kd<? super List<? extends IMUser>>, Object> {
    public /* synthetic */ Object LJLIL;

    public C3R7(InterfaceC67352kd<? super C3R7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3R7 c3r7 = new C3R7(interfaceC67352kd);
        c3r7.LJLIL = obj;
        return c3r7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return ORZ.LLILII(new IDComparatorS29S0000000_1(18), (Iterable) this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(List<? extends IMUser> list, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        return ((a) create(list, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
