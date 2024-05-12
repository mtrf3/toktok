package X;

import Y.IDAListenerS74S0100000_5;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.liveevent.LiveEventDescCardWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C1B extends AbstractC34221Vy {
    public final /* synthetic */ LiveEventDescCardWidget LIZ;

    public C1B(LiveEventDescCardWidget liveEventDescCardWidget) {
        this.LIZ = liveEventDescCardWidget;
    }

    @Override // X.InterfaceC17380mE
    public final void LIZ(C17390mF c17390mF) {
        LiveEventDescCardWidget liveEventDescCardWidget = this.LIZ;
        liveEventDescCardWidget.LJLJJLL = c17390mF;
        if (liveEventDescCardWidget.LJLJJL) {
            liveEventDescCardWidget.hide();
            ValueAnimator lynxAlphaAnimator = this.LIZ.LJLJLLL;
            o.LJIIIIZZ(lynxAlphaAnimator, "lynxAlphaAnimator");
            lynxAlphaAnimator.addListener(new IDAListenerS74S0100000_5(this.LIZ, 5));
            return;
        }
        liveEventDescCardWidget.LJLILLLLZI.removeCallbacksAndMessages(null);
        LiveEventDescCardWidget liveEventDescCardWidget2 = this.LIZ;
        liveEventDescCardWidget2.LJLILLLLZI.postDelayed(liveEventDescCardWidget2.LJLJLJ, 30000L);
        this.LIZ.show();
    }

    @Override // X.InterfaceC17380mE
    public final void LIZIZ(C17390mF c17390mF) {
        LiveEventDescCardWidget liveEventDescCardWidget = this.LIZ;
        if (!liveEventDescCardWidget.LJLJJL) {
            liveEventDescCardWidget.LJLJJLL = c17390mF;
            liveEventDescCardWidget.LJLILLLLZI.removeCallbacksAndMessages(null);
            LiveEventDescCardWidget liveEventDescCardWidget2 = this.LIZ;
            liveEventDescCardWidget2.LJLILLLLZI.postDelayed(liveEventDescCardWidget2.LJLJLJ, 30000L);
            this.LIZ.show();
        }
    }

    @Override // X.InterfaceC17380mE
    public final void LIZJ(C17390mF c17390mF) {
        if (c17390mF.LIZLLL != EnumC17400mG.REPLACE) {
            this.LIZ.hide();
        }
    }

    @Override // X.InterfaceC17380mE
    public final void LIZLLL(C17390mF c17390mF) {
        if (!c17390mF.LIZJ) {
            LiveEventDescCardWidget liveEventDescCardWidget = this.LIZ;
            if (liveEventDescCardWidget.LJLJJL) {
                liveEventDescCardWidget.hide();
            }
        }
    }
}
