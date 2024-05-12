package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BKC {
    public static final C62822Ol8 LJIILL = C221108m2.LIZIZ(BKE.LJLIL);
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public ActivityC45651qj LIZLLL;
    public C73411SrX LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public LiveRoomFragment LJIILJJIL;

    public final String LIZ() {
        if (this.LIZ) {
            return "mini_window";
        }
        Boolean LIZJ = InterfaceC30442Bx8.LLJJJJLIIL.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_BG_AUDIO_PLAY_OPEN.value");
        if (LIZJ.booleanValue()) {
            return "voice_only";
        }
        return LiveGiftNewGifterBadgeSetting.DEFAULT;
    }

    public final void LJIIIIZZ() {
        C73411SrX c73411SrX = this.LJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(100L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new BPC(this));
    }

    public BKC() {
        BKD bkd = new BKD(this);
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            iHostAppContext.registerLifeCycleCallback(bkd);
        }
    }

    public static String LIZIZ() {
        if (C30184Bsy.LIZJ()) {
            Context LIZLLL = C15380j0.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getContext()");
            if (C30184Bsy.LIZ(LIZLLL)) {
                return "1";
            }
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static boolean LIZJ(Activity activity) {
        List<Class> liveActivity = ((IHostAction) CN1.LIZ(IHostAction.class)).getLiveActivityClass();
        if (liveActivity != null && !liveActivity.isEmpty() && activity != null) {
            o.LJIIIIZZ(liveActivity, "liveActivity");
            for (Class cls : liveActivity) {
                o.LJI(activity);
                if (o.LJ(activity.getClass(), cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LJ(String str) {
        String str2;
        boolean z;
        String str3;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_live_backstage_return_click", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        EnterRoomLinkSession LIZ = B57.LIZ.LIZ();
        if (LIZ != null && (enterRoomConfig = LIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            str2 = roomsData.warmUpPlayerTag;
        } else {
            str2 = null;
        }
        InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str2);
        boolean z2 = false;
        if (LIZIZ != null) {
            z = LIZIZ.isPlaying();
        } else {
            z = false;
        }
        Boolean bool = (Boolean) DataChannelGlobal.LJLJJI.mv0(C29031BaN.class);
        if (bool != null) {
            z2 = bool.booleanValue();
        }
        BZI LIZIZ2 = C0N3.LIZIZ("livesdk_live_backstage_return_click", str, "backstage_type");
        if (z) {
            if (z2) {
                str3 = "paused";
            } else {
                str3 = "live";
            }
        } else {
            str3 = "closed";
        }
        LIZIZ2.LJIJJ(str3, "live_status");
        LIZIZ2.LJJIIJZLJL();
    }

    public final void LIZLLL(long j) {
        if (TextUtils.equals(LIZ(), "voice_only")) {
            BZI LIZ = C28787BRn.LIZ("livesdk_audio_player_pause_duration");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(Long.valueOf(j), "pause_duration");
            LIZ.LJJIIJZLJL();
        }
    }

    public final void LJI(LiveRoomFragment liveRoomFragment) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateLiveRoomFragment is invoked and the param liveRoomFragment is ");
        LIZ.append(liveRoomFragment);
        LIZ.append(" but the current liveRoomFragment is ");
        LIZ.append(this.LJIILJJIL);
        C0NB.LIZIZ("PipController", X1D.LIZIZ(LIZ));
        this.LJIILJJIL = liveRoomFragment;
    }

    public final void LJII(boolean z) {
        C0NB.LIZIZ("AudioLiveService", "PipController updateMuteStatus");
        LJIIIIZZ();
        if (this.LJI && TextUtils.equals("voice_only", LIZ())) {
            if (z) {
                this.LJIIL = SystemClock.elapsedRealtime();
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJIIL;
            this.LJIILIIL += elapsedRealtime;
            this.LJIIL = 0L;
            LIZLLL(elapsedRealtime);
        }
    }

    public final void LJFF(B5X endType, String str) {
        String str2;
        o.LJIIIZ(endType, "endType");
        if (this.LJIIIZ) {
            this.LJIIIZ = false;
            long j = 0;
            if (this.LJIIL > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJIIL;
                this.LJIILIIL += elapsedRealtime;
                this.LJIIL = 0L;
                LIZLLL(elapsedRealtime);
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.LJIIJJI;
            if (o.LJ(str, "mini_window")) {
                j = elapsedRealtime2;
            } else if (o.LJ(str, "voice_only")) {
                j = elapsedRealtime2 - this.LJIILIIL;
            }
            if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_live_backstage_watch_duration", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
                BZI LIZIZ = C0N3.LIZIZ("livesdk_live_backstage_watch_duration", str, "backstage_type");
                String name = endType.name();
                Locale US = Locale.US;
                o.LJIIIIZZ(US, "US");
                String lowerCase = name.toLowerCase(US);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                LIZIZ.LJIJJ(lowerCase, "end_type");
                LIZIZ.LJIJJ(Long.valueOf(j), "duration");
                LIZIZ.LJIJJ(LIZIZ(), "mini_window_sys_auth");
                Boolean LIZJ = InterfaceC30442Bx8.LLJJJJ.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_PIP_SWITCHER_OPEN.value");
                if (LIZJ.booleanValue()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZIZ.LJIJJ(str2, "mini_window_app_auth");
                LIZIZ.LJJIIJZLJL();
            }
            if (endType == B5X.BACK_APP) {
                LJ(str);
            } else {
                this.LJIIJ = true;
            }
        }
        if (this.LJIIJ && endType == B5X.BACK_APP) {
            this.LJIIJ = false;
            LJ(str);
        }
    }
}
