package X;

import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDObjectS0S0101000;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.U3m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76574U3m {
    public final FrameLayout LIZ;
    public InterfaceC76578U3q LIZIZ;
    public final C47061t0 LIZJ;
    public InterfaceC76578U3q LIZLLL;
    public final C47061t0 LJ;
    public final C15540jG LJFF;
    public final C15540jG LJI;

    public final void LIZIZ() {
        C0NB.LJIIIZ("LiveShowAnimationManager", "dispose");
        this.LIZ.post(new ARunnableS49S0100000_13(this, 243));
    }

    public final void LIZLLL() {
        C0NB.LJIIIZ("LiveShowAnimationManager", "startLiveShowAnimation");
        this.LIZ.post(new ARunnableS32S0200000_13(this, 129));
    }

    public final boolean LIZ(C47061t0 c47061t0) {
        IDObjectS0S0101000 iDObjectS0S0101000;
        Iterator<View> it = C78924UyG.LIZLLL(this.LIZ).iterator();
        do {
            iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (!iDObjectS0S0101000.hasNext()) {
                return false;
            }
        } while (!o.LJ(iDObjectS0S0101000.next(), c47061t0));
        return true;
    }

    public final void LIZJ(InterfaceC76578U3q interfaceC76578U3q) {
        C0NB.LJIIIZ("LiveShowAnimationManager", "endLiveShowAnimation");
        this.LIZ.post(new ARunnableS32S0200000_13(this, interfaceC76578U3q, 130));
    }

    public C76574U3m(Context context, FrameLayout mAnchorContainer) {
        String str;
        String str2;
        o.LJIIIZ(mAnchorContainer, "mAnchorContainer");
        this.LIZ = mAnchorContainer;
        MultiGuestLiveShowConfigSetting multiGuestLiveShowConfigSetting = MultiGuestLiveShowConfigSetting.INSTANCE;
        if (multiGuestLiveShowConfigSetting.isAnimationDowngradeEnabled()) {
            str = "start_show_downgrade.webp";
        } else {
            str = "start_show.webp";
        }
        if (multiGuestLiveShowConfigSetting.isAnimationDowngradeEnabled()) {
            str2 = "end_show_downgrade.webp";
        } else {
            str2 = "end_show.webp";
        }
        C47061t0 c47061t0 = new C47061t0(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) KL2.LIZJ(c47061t0.getContext(), 320.0f), (int) KL2.LIZJ(c47061t0.getContext(), 240.0f), 1);
        layoutParams.setMargins(0, (int) KL2.LIZJ(c47061t0.getContext(), 246.0f), 0, 0);
        c47061t0.setLayoutParams(layoutParams);
        this.LIZJ = c47061t0;
        C47061t0 c47061t02 = new C47061t0(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) KL2.LIZJ(c47061t02.getContext(), 320.0f), (int) KL2.LIZJ(c47061t02.getContext(), 240.0f), 1);
        layoutParams2.setMargins(0, (int) KL2.LIZJ(c47061t02.getContext(), 246.0f), 0, 0);
        c47061t02.setLayoutParams(layoutParams2);
        this.LJ = c47061t02;
        C15540jG c15540jG = new C15540jG();
        c15540jG.LIZ = c47061t0;
        c15540jG.LIZIZ = "tiktok_live_liveshow_resource_demand";
        c15540jG.LIZJ = str;
        c15540jG.LJFF = true;
        c15540jG.LJ = new C76576U3o(this);
        this.LJFF = c15540jG;
        C15540jG c15540jG2 = new C15540jG();
        c15540jG2.LIZ = c47061t02;
        c15540jG2.LIZIZ = "tiktok_live_liveshow_resource_demand";
        c15540jG2.LIZJ = str2;
        c15540jG2.LJFF = true;
        c15540jG2.LJ = new C76575U3n(this);
        this.LJI = c15540jG2;
        C15490jB.LJIJ("tiktok_live_liveshow_resource_demand", str);
        C15490jB.LJIJ("tiktok_live_liveshow_resource_demand", str2);
    }
}
