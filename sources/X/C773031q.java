package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.service.DraftListenerServiceImpl$notifyDeleted$1", f = "DraftListenerServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.31q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C773031q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AwemeDraft LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773031q(AwemeDraft awemeDraft, InterfaceC67352kd<? super C773031q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = awemeDraft;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C773031q(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<IDraftListener> LLIILII = ORZ.LLIILII(C773231s.LIZIZ);
        AwemeDraft awemeDraft = this.LJLIL;
        for (IDraftListener iDraftListener : LLIILII) {
            if (iDraftListener != null) {
                iDraftListener.onDeleted(awemeDraft);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
