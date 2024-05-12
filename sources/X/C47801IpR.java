package X;

import Y.ARunnableS8S0201000_5;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.IpR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47801IpR {
    public final C47831Ipv LIZ;
    public final C47831Ipv LIZIZ;
    public final C47831Ipv LIZJ;
    public final C47634Imk LIZLLL;
    public volatile boolean LJ;
    public final C47809IpZ LJFF;

    public final void LIZ() {
        if (this.LJ) {
            C78253UnR.LJI("PlayDurationManager", "Already started");
            return;
        }
        this.LJ = true;
        this.LIZ.LIZIZ();
        if (this.LIZLLL.LIZIZ()) {
            this.LIZIZ.LIZIZ();
        } else if (this.LIZLLL.LIZJ()) {
            this.LIZJ.LIZIZ();
        }
        TTVideoEngineLog.d("PlayDurationManager", "start play");
    }

    public final void LIZIZ() {
        if (!this.LJ) {
            C78253UnR.LJI("PlayDurationManager", "Already stopped");
            return;
        }
        this.LJ = false;
        this.LIZ.LIZJ();
        if (this.LIZLLL.LIZIZ()) {
            this.LIZIZ.LIZJ();
        }
        if (this.LIZLLL.LIZJ()) {
            this.LIZJ.LIZJ();
        }
        TTVideoEngineLog.d("PlayDurationManager", C16880lQ.LLLZ("stop: play duration: %s, wiredDuration: %s, wirelessDuration: %s", new Object[]{Integer.valueOf(this.LIZ.LIZ()), Integer.valueOf(this.LIZIZ.LIZ()), Integer.valueOf(this.LIZJ.LIZ())}));
    }

    public C47801IpR(C47634Imk c47634Imk) {
        C47809IpZ c47809IpZ = new C47809IpZ(this);
        this.LJFF = c47809IpZ;
        this.LIZLLL = c47634Imk;
        this.LIZ = new C47831Ipv();
        this.LIZIZ = new C47831Ipv();
        this.LIZJ = new C47831Ipv();
        C47634Imk.LJI(c47634Imk.LIZIZ, new ARunnableS8S0201000_5(3, c47634Imk, c47809IpZ, 0));
    }
}
