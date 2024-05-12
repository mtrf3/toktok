package X;

import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3T9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3T9 extends C82673Mh implements C3JJ {
    public final C39N LJLILLLLZI = C39N.INBOX;
    public boolean LJLJI;

    @Override // X.C3JJ
    public final void LIZLLL() {
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        this.LJLJI = false;
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
    }

    @Override // X.C3JJ
    public final void LJIIL() {
        this.LJLJI = C3TE.LIZIZ();
    }

    @Override // X.C3MX
    public final C39N LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C3MX
    public final void LJ(InterfaceC82723Mm sessionVO) {
        o.LJIIIZ(sessionVO, "sessionVO");
        if (!(sessionVO instanceof C3TO)) {
            return;
        }
        C3TO c3to = (C3TO) sessionVO;
        if (!c3to.getShowSayHiButton() && !c3to.getHasUnreadMsg() && c3to.getSessionUnreadViewState() == null && (this.LJLJI || (!c3to.isMute() && !c3to.isBlock()))) {
            C82223Ko c82223Ko = C99033ud.Companion;
            String sessionId = sessionVO.getSessionId();
            c82223Ko.getClass();
            if (!C82223Ko.LIZ(sessionId)) {
                if (C96573qf.LIZIZ() == 1 || C96573qf.LIZIZ() == 5) {
                    c3to.setShowCameraIcon(true);
                    return;
                } else if (C96573qf.LIZJ()) {
                    C75382xa.LJI(sessionVO.getSessionId(), c3to.getUid(), new AqS164S0200000_1(sessionVO, this, 21));
                    return;
                } else {
                    c3to.setShowCameraIcon(false);
                    return;
                }
            }
        }
        c3to.setShowCameraIcon(false);
    }
}
