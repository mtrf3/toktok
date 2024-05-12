package X;

import Y.ALAdapterS7S0300000_14;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.VxE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81408VxE implements InterfaceC81973WFd {
    public final /* synthetic */ WFU LIZ;
    public final /* synthetic */ SmartImageView LIZIZ;

    @Override // X.InterfaceC81973WFd
    public final void LIZ(C81970WFa c81970WFa) {
    }

    @Override // X.InterfaceC81973WFd
    public final void LIZIZ() {
        WFU wfu = this.LIZ;
        SmartImageView smartImageView = this.LIZIZ;
        wfu.getClass();
        if (smartImageView == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(smartImageView, "alpha", 1.0f, 0.5f);
        ofFloat.setDuration(60L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(smartImageView, "alpha", 0.5f, 1.0f);
        ofFloat2.setDuration(60L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        C29H c29h = C17T.LJIILJJIL;
        C39661h4 LJLLLLLL = WFU.LJLLLLLL(smartImageView, c29h, 1.0f, 0.9f);
        C39661h4 LJLLLLLL2 = WFU.LJLLLLLL(smartImageView, c29h, 0.9f, 1.0f);
        C29I c29i = C17T.LJIILL;
        C39661h4 LJLLLLLL3 = WFU.LJLLLLLL(smartImageView, c29i, 1.0f, 0.9f);
        C39661h4 LJLLLLLL4 = WFU.LJLLLLLL(smartImageView, c29i, 0.9f, 1.0f);
        LJLLLLLL.LIZIZ(new C81409VxF(LJLLLLLL2));
        LJLLLLLL3.LIZIZ(new C81410VxG(LJLLLLLL4));
        ofFloat.addListener(new ALAdapterS7S0300000_14(LJLLLLLL, LJLLLLLL3, ofFloat2, 1));
        LJLLLLLL.LJIIIZ();
        LJLLLLLL3.LJIIIZ();
        ofFloat.start();
    }

    public C81408VxE(WFU wfu, SmartImageView smartImageView) {
        this.LIZ = wfu;
        this.LIZIZ = smartImageView;
    }
}
