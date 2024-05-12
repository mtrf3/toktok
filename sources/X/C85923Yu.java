package X;

import com.ss.android.ugc.aweme.contact.model.IMContactEvent;
import com.ss.android.ugc.aweme.contact.model.SharePermission;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager$setByteSyncData$1", f = "IMContactManager.kt", l = {380, 383}, m = "invokeSuspend")
/* renamed from: X.3Yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85923Yu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IMContactEvent LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85923Yu(IMContactEvent iMContactEvent, InterfaceC67352kd<? super C85923Yu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iMContactEvent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85923Yu(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            IMContactEvent iMContactEvent = this.LJLILLLLZI;
            if (iMContactEvent != null) {
                int contactEventType = iMContactEvent.getContactEventType();
                if (contactEventType == C3ZB.CREATE_CONTACT.getType() || contactEventType == C3ZB.UPDATE_AVATAR.getType() || contactEventType == C3ZB.UPDATE_NICKNAME.getType() || contactEventType == C3ZB.UPDATE_UNIQUEID.getType() || contactEventType == C3ZB.UPDATE_FOLLOWSTATUS.getType() || contactEventType == C3ZB.UPDATE_MAFSTATUS.getType()) {
                    C85913Yt c85913Yt = C85913Yt.LIZ;
                    this.LJLIL = 1;
                    if (c85913Yt.LJIIL(iMContactEvent, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else if (contactEventType == C3ZB.UPDATE_CANSHAREMESSAGE.getType()) {
                    C85913Yt c85913Yt2 = C85913Yt.LIZ;
                    SharePermission sharePermission = iMContactEvent.getSharePermission();
                    this.LJLIL = 2;
                    if (c85913Yt2.LJIILLIIL(sharePermission, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
