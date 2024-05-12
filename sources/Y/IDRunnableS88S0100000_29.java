package Y;

import X.AbstractC91339Zt1;
import X.C163306b0;
import X.C16970lZ;
import X.C8VR;
import X.C91169ZqH;
import X.C91171ZqJ;
import X.C91173ZqL;
import X.C91299ZsN;
import X.C91330Zss;
import X.C91335Zsx;
import X.C91362ZtO;
import X.C91369ZtV;
import X.C91432ZuW;
import X.C91443Zuh;
import X.C91476ZvE;
import X.C91483ZvL;
import X.C91502Zve;
import X.EnumC91326Zso;
import X.InterfaceC65784Pro;
import X.InterfaceC91159Zq7;
import X.LSY;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;
import com.ss.android.ugc.aweme.dsp.playpage.card.DspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.AudioCardAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioconver.AudioCoverInfoAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonAssem;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS417S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDRunnableS88S0100000_29 implements Runnable {
    public final int $t;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((C91330Zss) iDRunnableS88S0100000_29.l0).LJIIL().LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((C91335Zsx) iDRunnableS88S0100000_29.l0).LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((MusicDspUGCButtonAssem) iDRunnableS88S0100000_29.l0).getContainerView().setVisibility(0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((C91369ZtV) iDRunnableS88S0100000_29.l0).LJIILL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            LSY lsy = ((C91369ZtV) iDRunnableS88S0100000_29.l0).LJFF;
            if (lsy != null) {
                AnimatorSet animatorSet = lsy.LJLIL;
                if (animatorSet != null) {
                    animatorSet.end();
                }
                lsy.LJLILLLLZI.end();
                C163306b0 c163306b0 = lsy.LJLJI;
                c163306b0.LJLLJ.removeAllUpdateListeners();
                c163306b0.LJLLJ.end();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((C91171ZqJ) iDRunnableS88S0100000_29.l0).requestLayout();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            C91173ZqL c91173ZqL = (C91173ZqL) iDRunnableS88S0100000_29.l0;
            C91171ZqJ c91171ZqJ = c91173ZqL.LIZLLL;
            InterfaceC91159Zq7 interfaceC91159Zq7 = c91173ZqL.LJFF;
            o.LJI(interfaceC91159Zq7);
            C91169ZqH LJFF = c91171ZqJ.LJFF(interfaceC91159Zq7.getCurrentItemCompat());
            if (LJFF != null) {
                C91171ZqJ c91171ZqJ2 = LJFF.LIZJ;
                if (c91171ZqJ2 != null) {
                    c91171ZqJ2.LJII(LJFF, true);
                } else {
                    "Tab not attached to a TabLayout".toString();
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((InterfaceC65784Pro) iDRunnableS88S0100000_29.l0).invoke();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((C91502Zve) iDRunnableS88S0100000_29.l0).LJIIL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            C91432ZuW.LJ((BaseDspFeedResponse) iDRunnableS88S0100000_29.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            C16970lZ.LJ(R.layout.bve, (Context) iDRunnableS88S0100000_29.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((C91362ZtO) iDRunnableS88S0100000_29.l0).setScrollState(0);
            r0.LJJI(((C91362ZtO) iDRunnableS88S0100000_29.l0).LJLJJLL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((C91335Zsx) iDRunnableS88S0100000_29.l0).LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((C91443Zuh) iDRunnableS88S0100000_29.l0).LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
            if (LJII.LIZIZ()) {
                LJII.LJ("music", true);
            }
            ((C91443Zuh) iDRunnableS88S0100000_29.l0).LIZIZ.LJIL(new C91299ZsN("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            AbstractC91339Zt1.LJIIIIZZ((AbstractC91339Zt1) iDRunnableS88S0100000_29.l0, 0, false, 4);
            ((AbstractC91339Zt1) iDRunnableS88S0100000_29.l0).getClass();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((C91483ZvL) iDRunnableS88S0100000_29.l0).LJIJJ(new C91299ZsN("PLAY_FROM_AUTO_PLAY_NEXT"));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            Context context = ((DspItemReusedAssem) iDRunnableS88S0100000_29.l0).getContext();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing()) {
                    if (activity.isDestroyed()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            DspItemReusedAssem dspItemReusedAssem = (DspItemReusedAssem) iDRunnableS88S0100000_29.l0;
            C8VR.LIZ(dspItemReusedAssem, new IDqS417S0100000_29(dspItemReusedAssem, 4));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            Context context = ((AudioCardAssem) iDRunnableS88S0100000_29.l0).getContext();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing()) {
                    if (activity.isDestroyed()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            AudioCardAssem audioCardAssem = (AudioCardAssem) iDRunnableS88S0100000_29.l0;
            C8VR.LIZ(audioCardAssem, new IDqS417S0100000_29(audioCardAssem, 11));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((AudioCoverInfoAssem) iDRunnableS88S0100000_29.l0).k4().setVisibility(0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            ((AudioCoverInfoAssem) iDRunnableS88S0100000_29.l0).k4().setVisibility(8);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(IDRunnableS88S0100000_29 iDRunnableS88S0100000_29) {
        boolean LIZ;
        try {
            C91476ZvE c91476ZvE = ((AudioSeekBarAssem) iDRunnableS88S0100000_29.l0).LLIIIL;
            if (c91476ZvE != null) {
                c91476ZvE.setMode(EnumC91326Zso.NORMAL);
            }
            ((AudioSeekBarAssem) iDRunnableS88S0100000_29.l0).LLIIII = false;
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS88S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
