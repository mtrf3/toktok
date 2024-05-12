package Y;

import X.B4U;
import X.BLM;
import X.BP4;
import X.C28718BOw;
import X.C37179EiV;
import X.C38993FSb;
import X.C65814PsI;
import X.C7N;
import X.CN1;
import X.FR4;
import X.IWF;
import X.Q7L;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.api.StatusApi;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndPresenter;
import com.bytedance.android.livesdk.init.BadPhonesCommonOptTask;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioCatcher;

/* loaded from: classes6.dex */
public class ARunnableS0S0001000_5 implements Runnable {
    public final int $t;
    public int i0;

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
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS0S0001000_5 aRunnableS0S0001000_5) {
        switch (aRunnableS0S0001000_5.i0) {
            case 0:
                ((BroadcastRoomApi) Q7L.LIZIZ(BroadcastRoomApi.class)).getPreviewRoomCreateInfo(0L);
                C65814PsI.LIZ().getClass();
                ((BroadcastRoomApi) C65814PsI.LIZJ(BroadcastRoomApi.class)).getLivePermissionApply("");
                C65814PsI.LIZ().getClass();
                ((RoomRetrofitApi) C65814PsI.LIZIZ(RoomRetrofitApi.class)).createRoom(null);
                BP4 LIZ = C28718BOw.LIZ();
                LIZ.getClass();
                ((StatusApi) LIZ.LIZIZ(StatusApi.class)).sendStatus(0L, 0, 0L, 0, "", 0L, 0L);
                C7N.LJIIIIZZ().preloadBroadcastApi();
                C7N.LJII().preloadBroadcastApi();
                return;
            default:
                MainActivity.lambda$logAppLaunch$7();
                return;
        }
    }

    public static final void run$1(ARunnableS0S0001000_5 aRunnableS0S0001000_5) {
        switch (aRunnableS0S0001000_5.i0) {
            case 0:
                ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LJII();
                return;
            default:
                BadPhonesCommonOptTask.lambda$preloadWatchWidgets$1();
                return;
        }
    }

    public static final void run$2(ARunnableS0S0001000_5 aRunnableS0S0001000_5) {
        switch (aRunnableS0S0001000_5.i0) {
            case 0:
                B4U.LIZ().LJJIIZ(false);
                B4U.LIZ().LJJIJ();
                B4U.LIZ();
                return;
            default:
                AudioCatcher.lambda$Stop$1();
                return;
        }
    }

    public static final void run$3(ARunnableS0S0001000_5 aRunnableS0S0001000_5) {
        switch (aRunnableS0S0001000_5.i0) {
            case 0:
                BLM.LIZ = false;
                return;
            default:
                C37179EiV.LIZ().postDelayed(new ARunnableS0S0001000_5(1, 4), 1000L);
                return;
        }
    }

    public static final void run$4(ARunnableS0S0001000_5 aRunnableS0S0001000_5) {
        switch (aRunnableS0S0001000_5.i0) {
            case 0:
                BLM.LIZ = false;
                return;
            default:
                C38993FSb.LIZ = false;
                return;
        }
    }

    public static final void run$5(ARunnableS0S0001000_5 aRunnableS0S0001000_5) {
        switch (aRunnableS0S0001000_5.i0) {
            case 0:
                LiveNewAudienceEndPresenter.lambda$onDestroy$0();
                return;
            default:
                IWF.LJJLIIIIJ().LJJ();
                return;
        }
    }

    public static final void run$6(ARunnableS0S0001000_5 aRunnableS0S0001000_5) {
        switch (aRunnableS0S0001000_5.i0) {
            case 0:
                BadPhonesCommonOptTask.lambda$preloadLiveResource$5();
                return;
            case 1:
                try {
                    FR4.LIZ();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                return;
        }
    }

    public ARunnableS0S0001000_5(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }
}
