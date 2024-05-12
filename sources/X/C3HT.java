package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SharePanelContactsPreloadManager$internalLoadConcurrently$deferredMafContact$1", f = "SharePanelContactsPreloadManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3HT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super InterfaceC68342mE<? extends List<IMContact>>>, Object> {
    public /* synthetic */ Object LJLIL;

    public C3HT(InterfaceC67352kd<? super C3HT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3HT c3ht = new C3HT(interfaceC67352kd);
        c3ht.LJLIL = obj;
        return c3ht;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return XKX.LIZIZ((InterfaceC70422pa) this.LJLIL, null, null, new C3HU(null), 3);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super InterfaceC68342mE<? extends List<IMContact>>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
