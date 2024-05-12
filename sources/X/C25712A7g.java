package X;

import com.ss.android.ugc.aweme.relation.model.LinkPrivacyPopupStatusResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.LinkPrivacyNoticeController$fetchStatus$2", f = "LinkPrivacyNoticeController.kt", l = {132}, m = "invokeSuspend")
/* renamed from: X.A7g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25712A7g extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super LinkPrivacyPopupStatusResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ C25710A7e LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25712A7g(C25710A7e c25710A7e, InterfaceC67352kd<? super C25712A7g> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c25710A7e;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25712A7g(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                AbstractC73638SvC<LinkPrivacyPopupStatusResponse> linkPrivacyPopupStatus = this.LJLILLLLZI.LJ.getLinkPrivacyPopupStatus();
                this.LJLIL = 1;
                obj = C77318UWc.LIZ(linkPrivacyPopupStatus, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (LinkPrivacyPopupStatusResponse) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("@LinkRelation", "the privacy get fail", m10exceptionOrNullimpl);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            return null;
        }
        return LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super LinkPrivacyPopupStatusResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
