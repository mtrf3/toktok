package Y;

import X.BLW;
import X.BZI;
import X.C04120Ee;
import X.C28787BRn;
import X.C30627C0h;
import X.C7MY;
import X.CS5;
import X.CS6;
import X.WM7;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class ARunnableS2S0100200_5 implements Runnable {
    public final int $t;
    public long j1;
    public long j2;
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        LiveAbsPollEffectWidget liveAbsPollEffectWidget = (LiveAbsPollEffectWidget) this.l0;
        if (liveAbsPollEffectWidget.LLD) {
            liveAbsPollEffectWidget.LJZL().LJIIIIZZ(this.j1, this.j2, 0L);
            ((LiveAbsPollEffectWidget) this.l0).LLD = false;
        } else if (liveAbsPollEffectWidget.LJLIL == 257) {
            liveAbsPollEffectWidget.LJZL().LJIIIIZZ(this.j1, this.j2, 300L);
        } else {
            liveAbsPollEffectWidget.LJZL().LJIIIIZZ(this.j1, this.j2, 600L);
        }
    }

    public final void LIZ$1() {
        LiveGiftPollEffectWidget liveGiftPollEffectWidget = (LiveGiftPollEffectWidget) this.l0;
        if (liveGiftPollEffectWidget.LLD) {
            liveGiftPollEffectWidget.LJZL().LJIIIIZZ(this.j1, this.j2, 0L);
            ((LiveGiftPollEffectWidget) this.l0).LLD = false;
        } else if (liveGiftPollEffectWidget.LLFF == 257) {
            liveGiftPollEffectWidget.LJZL().LJIIIIZZ(this.j1, this.j2, 300L);
        } else {
            liveGiftPollEffectWidget.LJZL().LJIIIIZZ(this.j1, this.j2, 600L);
        }
    }

    public final void LIZ$2() {
        long j = this.j1;
        long j2 = this.j2;
        BLW blw = (BLW) this.l0;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_room_enter_full_link_duration", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        HashMap hashMap = new HashMap();
        C7MY.LJFF(j2, j, hashMap, "request_total_time");
        String str = blw.LIZIZ;
        if (str != null) {
            hashMap.put("enter_from_merge", str);
        }
        String str2 = blw.LIZJ;
        if (str2 != null) {
            hashMap.put("enter_method", str2);
        }
        String str3 = blw.LIZ;
        if (str3 != null) {
            hashMap.put("action_type", str3);
        }
        String str4 = blw.LJ;
        if (str4 != null) {
            hashMap.put("path", str4);
        }
        String str5 = blw.LJFF;
        if (str5 != null) {
            hashMap.put(WM7.SCENE_SERVICE, str5);
        }
        String str6 = blw.LJI;
        if (str6 != null) {
            hashMap.put("is_from_ec", str6);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_room_enter_full_link_duration");
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(hashMap);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
    }

    public static final void run$0(ARunnableS2S0100200_5 aRunnableS2S0100200_5) {
        boolean LIZ;
        try {
            long j = aRunnableS2S0100200_5.j1;
            long j2 = aRunnableS2S0100200_5.j2;
            C30627C0h.LJIILL(j, j2 - (j2 % 1000), (C04120Ee) aRunnableS2S0100200_5.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0100200_5 aRunnableS2S0100200_5) {
        boolean LIZ;
        try {
            aRunnableS2S0100200_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S0100200_5 aRunnableS2S0100200_5) {
        boolean LIZ;
        try {
            aRunnableS2S0100200_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS2S0100200_5 aRunnableS2S0100200_5) {
        boolean LIZ;
        try {
            aRunnableS2S0100200_5.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS2S0100200_5 aRunnableS2S0100200_5) {
        boolean LIZ;
        try {
            CS5 cs5 = CS5.LIZ;
            long j = aRunnableS2S0100200_5.j1;
            long j2 = aRunnableS2S0100200_5.j2;
            CS6 cs6 = (CS6) aRunnableS2S0100200_5.l0;
            cs5.getClass();
            CS5.LJIILL(j, j2 - (j2 % 1000), cs6);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS2S0100200_5 aRunnableS2S0100200_5) {
        boolean LIZ;
        try {
            CS5 cs5 = CS5.LIZ;
            long j = aRunnableS2S0100200_5.j1;
            long j2 = aRunnableS2S0100200_5.j2 - 1000;
            CS6 cs6 = (CS6) aRunnableS2S0100200_5.l0;
            cs5.getClass();
            CS5.LJIILL(j, j2, cs6);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S0100200_5(long j, long j2, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.j2 = j2;
        this.l0 = obj;
    }
}
