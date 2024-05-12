package X;

import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.PjJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65257PjJ extends AbstractC65259PjL<GuestAuthToken> {
    public final /* synthetic */ CountDownLatch LIZ;
    public final /* synthetic */ C65254PjG LIZIZ;

    @Override // X.AbstractC65259PjL
    public final void LIZ(C65053Pg1 c65053Pg1) {
        ((C65264PjQ) this.LIZIZ.LIZIZ).LIZ();
        this.LIZ.countDown();
    }

    @Override // X.AbstractC65259PjL
    public final void LIZIZ(H4F h4f) {
        InterfaceC65283Pjj<C65256PjI> interfaceC65283Pjj = this.LIZIZ.LIZIZ;
        C65256PjI c65256PjI = new C65256PjI((GuestAuthToken) h4f.LIZ);
        C65264PjQ c65264PjQ = (C65264PjQ) interfaceC65283Pjj;
        c65264PjQ.LIZLLL();
        c65264PjQ.LIZJ(c65256PjI.id, c65256PjI, true);
        this.LIZ.countDown();
    }

    public C65257PjJ(C65254PjG c65254PjG, CountDownLatch countDownLatch) {
        this.LIZIZ = c65254PjG;
        this.LIZ = countDownLatch;
    }
}
