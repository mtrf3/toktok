package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SharePanelContactsPreloadManager$internalLoadConcurrently$deferredMafContact$1$1", f = "SharePanelContactsPreloadManager.kt", l = {286}, m = "invokeSuspend")
/* renamed from: X.3HU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<IMContact>>, Object> {
    public int LJLIL;

    public C3HU(InterfaceC67352kd<? super C3HU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3HU(interfaceC67352kd);
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
            C80673Ep c80673Ep = C82563Lw.LJLJLJ;
            this.LJLIL = 1;
            obj = c80673Ep.LJFF(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<IMContact>> interfaceC67352kd) {
        return new C3HU(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
