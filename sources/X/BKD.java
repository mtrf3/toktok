package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.dataChannel.PlayerStatusChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBackstageTrafficOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePipResumeEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePullPureAudioSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BKD implements InterfaceC78494UrK {
    public boolean LJLIL = true;
    public final /* synthetic */ BKC LJLILLLLZI;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    public final void LIZ() {
        String str;
        if (this.LJLILLLLZI.LIZLLL == null) {
            return;
        }
        if (C30184Bsy.LIZJ()) {
            BKC bkc = this.LJLILLLLZI;
            if (!bkc.LIZ) {
                bkc.LJFF = true;
            }
        }
        if (this.LJLIL) {
            this.LJLIL = false;
            BKC bkc2 = this.LJLILLLLZI;
            String LIZ = bkc2.LIZ();
            if (!bkc2.LIZJ) {
                bkc2.LJIIIZ = true;
                bkc2.LJIIJJI = SystemClock.elapsedRealtime();
                bkc2.LJIILIIL = 0L;
                if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_live_exit_backgroud", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
                    BZI LIZIZ = C0N3.LIZIZ("livesdk_live_exit_backgroud", LIZ, "backstage_type");
                    LIZIZ.LJIJJ(BKC.LIZIZ(), "mini_window_sys_auth");
                    Boolean LIZJ = InterfaceC30442Bx8.LLJJJJ.LIZJ();
                    o.LJIIIIZZ(LIZJ, "LIVE_PIP_SWITCHER_OPEN.value");
                    if (LIZJ.booleanValue()) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    LIZIZ.LJIJJ(str, "mini_window_app_auth");
                    LIZIZ.LJJIIJZLJL();
                }
            }
        }
    }

    public BKD(BKC bkc) {
        this.LJLILLLLZI = bkc;
    }

    @Override // X.InterfaceC78494UrK
    public final void LIZIZ(boolean z) {
        BKC bkc = this.LJLILLLLZI;
        if (z != bkc.LJI) {
            bkc.LJIIIIZZ = false;
        }
        bkc.LJI = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipController setAppEnterBackground isAppBackground=");
        C19U.LIZJ(LIZ, this.LJLILLLLZI.LJI, LIZ, "AudioLiveService");
        this.LJLILLLLZI.LJIIIIZZ();
        if (z) {
            if (!InterfaceC30442Bx8.LLJJJJLIIL.LIZJ().booleanValue() && LiveBackstageTrafficOpt.INSTANCE.getCurrentValue()) {
                DataChannelGlobal.LJLJJI.tv0(PlayerStatusChannel.class, BKH.STOP);
            }
            this.LJLILLLLZI.LJII = false;
            if (!InterfaceC30442Bx8.LLJJJJ.LIZJ().booleanValue()) {
                Boolean LIZJ = InterfaceC30442Bx8.LLJJJJLIIL.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_BG_AUDIO_PLAY_OPEN.value");
                if (LIZJ.booleanValue() && LivePullPureAudioSetting.INSTANCE.getCurrentValue().getEnable()) {
                    DataChannelGlobal.LJLJJI.tv0(PlayerStatusChannel.class, BKH.SWITCH_AO);
                    this.LJLILLLLZI.LJII = true;
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LJLILLLLZI.LJII) {
            return;
        }
        DataChannelGlobal.LJLJJI.tv0(PlayerStatusChannel.class, BKH.SWITCH_NORMAL);
        this.LJLILLLLZI.LJII = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI.getClass();
        if (!BKC.LIZJ(activity)) {
            return;
        }
        BKC bkc = this.LJLILLLLZI;
        if (bkc.LIZ) {
            bkc.LJFF(B5X.CLOSE_MINI_WINDOW, "mini_window");
        }
        BKC bkc2 = this.LJLILLLLZI;
        bkc2.LJIIIZ = false;
        bkc2.LJIIIIZZ = true;
        C0NB.LIZIZ("AudioLiveService", "PipController cancelNotification");
        bkc2.LJIIIIZZ();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI.getClass();
        if (BKC.LIZJ(activity) && this.LJLILLLLZI.LIZ) {
            LIZ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        BKJ currentFragment;
        Class cls;
        BKJ currentFragment2;
        o.LJIIIZ(activity, "activity");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipController#onActivityResumed: playActivity=");
        LIZ.append(this.LJLILLLLZI.LIZLLL);
        LIZ.append(" pip=");
        LIZ.append(C30184Bsy.LIZIZ(this.LJLILLLLZI.LIZLLL));
        LIZ.append(" activity=");
        LIZ.append(activity);
        C0NB.LJIIIZ("picture_in_picture", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.getClass();
        if (BKC.LIZJ(activity)) {
            LiveRoomFragment liveRoomFragment = this.LJLILLLLZI.LJIILJJIL;
            if (liveRoomFragment != null && (currentFragment2 = liveRoomFragment.getCurrentFragment()) != null) {
                currentFragment2.Jf(false);
            }
        } else {
            LiveRoomFragment liveRoomFragment2 = this.LJLILLLLZI.LJIILJJIL;
            if (liveRoomFragment2 != null && (currentFragment = liveRoomFragment2.getCurrentFragment()) != null) {
                currentFragment.Jf(true);
            }
        }
        if (C30184Bsy.LIZIZ(this.LJLILLLLZI.LIZLLL)) {
            this.LJLILLLLZI.getClass();
            if (!BKC.LIZJ(activity) && LivePipResumeEnableSetting.INSTANCE.getValue()) {
                Context LIZLLL = C15380j0.LIZLLL();
                this.LJLILLLLZI.getClass();
                List<Class> liveActivityClass = ((IHostAction) CN1.LIZ(IHostAction.class)).getLiveActivityClass();
                if (liveActivityClass == null || liveActivityClass.isEmpty()) {
                    cls = null;
                } else {
                    cls = (Class) ListProtector.get(liveActivityClass, 0);
                }
                Intent intent = new Intent(LIZLLL, (Class<?>) cls);
                intent.setFlags(131072);
                intent.putExtra("is_pip_resume", true);
                C16880lQ.LIZIZ(activity, intent);
                C0NB.LJIIIZ("picture_in_picture", "PipController#onActivityResumed: resume PlayActivity");
            }
        }
        if (this.LJLILLLLZI.LIZLLL == null || !BKC.LIZJ(activity) || C30184Bsy.LIZIZ(activity)) {
            return;
        }
        this.LJLIL = true;
        BKC bkc = this.LJLILLLLZI;
        bkc.LJFF(B5X.BACK_APP, bkc.LIZ());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI.getClass();
        if (BKC.LIZJ(activity) && this.LJLILLLLZI.LJI) {
            LIZ();
        }
    }
}
