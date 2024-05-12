package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.3TC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TC extends C82673Mh implements C3JJ {
    public final C39N LJLILLLLZI = C39N.INBOX;

    @Override // X.C3JJ
    public final void LIZLLL() {
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C3JJ
    public final void LJIIL() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.C3MX
    public final C39N LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C3MX
    public final void LJ(InterfaceC82723Mm sessionVO) {
        boolean z;
        IMUser imUser;
        String uid;
        o.LJIIIZ(sessionVO, "sessionVO");
        if (!(sessionVO instanceof C3TO)) {
            return;
        }
        C3TO c3to = (C3TO) sessionVO;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("session.unreadViewState: ");
        LIZ.append(c3to.getSessionUnreadViewState());
        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("session.isSupportMute && session.isMute: ");
        LIZ2.append(c3to.isMute());
        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("imUser?.isBlock: ");
        LIZ3.append(c3to.isBlock());
        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ3));
        boolean z2 = true;
        if (c3to.getSessionUnreadViewState() == null && !c3to.isMute() && !c3to.isBlock()) {
            C3TD.LIZ().getClass();
            if (!C3U2.LIZ()) {
                IMUser imUser2 = c3to.getImUser();
                if (c3to.getLastMessageMsgType() == 15 && (((imUser = c3to.getImUser()) == null || imUser.getFollowStatus() != 0) && imUser2 != null && (uid = imUser2.getUid()) != null)) {
                    C89253er c89253er = C89253er.LIZ;
                    C89263es.LJII(System.currentTimeMillis(), C89263es.LIZ(), uid);
                    if (C57107Mb9.LIZIZ(c89253er, uid, 4)) {
                        z = true;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("start Decorate: ");
                        LIZ4.append(sessionVO.getName());
                        LIZ4.append(": ");
                        LIZ4.append(z);
                        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ4));
                        if (!z && !c3to.isRecommendedChat()) {
                            z2 = false;
                        }
                        c3to.setShowSayHiButton(z2);
                    }
                }
            }
        }
        z = false;
        StringBuilder LIZ42 = X1D.LIZ();
        LIZ42.append("start Decorate: ");
        LIZ42.append(sessionVO.getName());
        LIZ42.append(": ");
        LIZ42.append(z);
        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ42));
        if (!z) {
            z2 = false;
        }
        c3to.setShowSayHiButton(z2);
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onRefreshMessageButton(C3U3 event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRefreshMessageButton: ");
        LIZ.append(event);
        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ));
        try {
            final String LIZJ = C81273Gx.LIZJ(event.LJLIL);
            C3L3 c3l3 = (C3L3) C771431a.LIZ().LIZJ(LIZJ);
            if (c3l3 == null) {
                return;
            }
            final boolean LJFF = LJFF(c3l3.LLIIIZ, c3l3);
            InterfaceC82853Mz interfaceC82853Mz = new InterfaceC82853Mz(LIZJ, LJFF) { // from class: X.3TB
                public final String LIZ;
                public final boolean LIZIZ;
                public final String LIZJ = "SessionVOMessageBtnDecorator-Operation";

                @Override // X.InterfaceC82853Mz
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC82853Mz
                public final String LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC82853Mz
                public final InterfaceC82723Mm LIZJ(InterfaceC82723Mm sessionVO) {
                    o.LJIIIZ(sessionVO, "sessionVO");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("MessageBtnOperation: ");
                    LIZ2.append(this.LIZ);
                    LIZ2.append(": ");
                    LIZ2.append(this.LIZIZ);
                    String msg = X1D.LIZIZ(LIZ2);
                    o.LJIIIZ(msg, "msg");
                    C34B.LIZJ("SessionRefactor-SessionVOMessageBtnProcessor", msg);
                    if (!(sessionVO instanceof C3TO)) {
                        return sessionVO;
                    }
                    ((C3TO) sessionVO).setShowSayHiButton(this.LIZIZ);
                    return sessionVO;
                }

                {
                    this.LIZ = LIZJ;
                    this.LIZIZ = LJFF;
                }
            };
            InterfaceC88472Yns<? super InterfaceC82853Mz, C76800UCe> interfaceC88472Yns = this.LJLIL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(interfaceC82853Mz);
            }
        } catch (Exception e) {
            C34B.LJ("SessionRefactor-SessionVOMessageBtnProcessor", e);
        }
    }

    public static boolean LJFF(IMUser iMUser, C3L3 c3l3) {
        boolean z;
        Boolean bool;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("session.unreadViewState: ");
        LIZ.append(c3l3.LLF);
        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("session.unreadCount: ");
        LIZ2.append(c3l3.LJLLILLLL);
        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("session.hasUnreadLikes(): ");
        LIZ3.append(c3l3.LJLLJ);
        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("session.isSupportMute && session.isMute: ");
        if (c3l3.LJIIJ() && c3l3.LL) {
            z = true;
        } else {
            z = false;
        }
        LIZ4.append(z);
        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("imUser?.isBlock: ");
        if (iMUser != null) {
            bool = Boolean.valueOf(iMUser.isBlock());
        } else {
            bool = null;
        }
        LIZ5.append(bool);
        C81843Jc.LIZIZ("SessionRefactor-SessionVOMessageBtnProcessor", X1D.LIZIZ(LIZ5));
        if (c3l3.LLF != null || c3l3.LJLLILLLL > 0 || c3l3.LJLLJ) {
            return false;
        }
        if (c3l3.LJIIJ() && c3l3.LL) {
            return false;
        }
        if (iMUser != null && iMUser.isBlock()) {
            return false;
        }
        C3TD.LIZ().getClass();
        if (!C3U2.LIZIZ(iMUser, c3l3)) {
            return false;
        }
        return true;
    }
}
