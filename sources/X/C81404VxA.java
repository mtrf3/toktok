package X;

import Y.ALAdapterS0S0100000_1;
import Y.ARunnableS50S0100000_14;
import android.animation.ObjectAnimator;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.VxA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81404VxA implements InterfaceC81973WFd {
    public final /* synthetic */ Keva LIZ;

    @Override // X.InterfaceC81973WFd
    public final void LIZIZ() {
    }

    public C81404VxA(Keva keva) {
        this.LIZ = keva;
    }

    @Override // X.InterfaceC81973WFd
    public final void LIZ(C81970WFa c81970WFa) {
        this.LIZ.storeBoolean("hasShownIcon", true);
        if (c81970WFa != null) {
            c81970WFa.LJLJJL.setAnimation("star_lottie.json");
            c81970WFa.LJLJJL.setRepeatCount(1);
            c81970WFa.LJLJJL.setRepeatMode(1);
            c81970WFa.LJLJJL.post(new ARunnableS50S0100000_14(c81970WFa, LiveTryModeCountDownThresholdSetting.DEFAULT));
            SmartImageView smartImageView = c81970WFa.LJLIL;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(smartImageView, "scaleX", 1.0f, 0.6f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(smartImageView, "scaleY", 1.0f, 0.6f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(C55953Lxd.LIZLLL());
            ofFloat2.setDuration(200L);
            ofFloat2.setInterpolator(C55953Lxd.LIZLLL());
            ofFloat.addListener(new ALAdapterS0S0100000_1(smartImageView, 5));
            ofFloat.start();
            ofFloat2.start();
        }
    }
}
