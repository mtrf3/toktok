package X;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterSession;

/* renamed from: X.PjN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65261PjN extends AbstractC65259PjL<TwitterSession> {
    public final InterfaceC65283Pjj<TwitterSession> LIZ;
    public final AbstractC65259PjL<TwitterSession> LIZIZ;

    @Override // X.AbstractC65259PjL
    public final void LIZ(C65053Pg1 c65053Pg1) {
        C65265PjR.LIZIZ().getClass();
        this.LIZIZ.LIZ(c65053Pg1);
    }

    @Override // X.AbstractC65259PjL
    public final void LIZIZ(H4F h4f) {
        C65265PjR.LIZIZ().getClass();
        InterfaceC65283Pjj<TwitterSession> interfaceC65283Pjj = this.LIZ;
        Session session = (Session) h4f.LIZ;
        C65264PjQ c65264PjQ = (C65264PjQ) interfaceC65283Pjj;
        if (session != null) {
            c65264PjQ.LIZLLL();
            c65264PjQ.LIZJ(session.id, session, true);
            this.LIZIZ.LIZIZ(h4f);
            return;
        }
        c65264PjQ.getClass();
        throw new IllegalArgumentException("Session must not be null!");
    }

    public C65261PjN(InterfaceC65283Pjj<TwitterSession> interfaceC65283Pjj, AbstractC65259PjL<TwitterSession> abstractC65259PjL) {
        this.LIZ = interfaceC65283Pjj;
        this.LIZIZ = abstractC65259PjL;
    }
}
