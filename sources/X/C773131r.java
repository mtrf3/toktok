package X;

import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.service.DraftListenerServiceImpl$notifyUpdated$1", f = "DraftListenerServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.31r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C773131r extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IDraftListener.UpdateParams LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773131r(IDraftListener.UpdateParams updateParams, InterfaceC67352kd<? super C773131r> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = updateParams;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C773131r(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<IDraftListener> list = C773231s.LIZIZ;
        IDraftListener.UpdateParams updateParams = this.LJLIL;
        for (IDraftListener iDraftListener : list) {
            if (updateParams == null) {
                return C76800UCe.LIZ;
            }
            if (iDraftListener != null) {
                iDraftListener.onUpdated(updateParams);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
