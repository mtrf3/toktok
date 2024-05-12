package Y;

import X.C0K7;
import X.C29306Beo;
import X.C77276UUm;
import X.CN1;
import X.InterfaceC65784Pro;
import X.T4F;
import android.os.Build;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;

/* loaded from: classes13.dex */
public class IDcS171S0100000_12 implements C0K7 {
    public final int $t;
    public Object l0;

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LJIILLIIL$0(this, liveDialog);
                return;
            case 1:
                LJIILLIIL$1(this, liveDialog);
                return;
            case 2:
                LJIILLIIL$2(this, liveDialog);
                return;
            case 3:
                LJIILLIIL$3(this, liveDialog);
                return;
            case 4:
                LJIILLIIL$4(this, liveDialog);
                return;
            case 5:
                LJIILLIIL$5(this, liveDialog);
                return;
            case 6:
                LJIILLIIL$6(this, liveDialog);
                return;
            case 7:
                LJIILLIIL$7(this, liveDialog);
                return;
            default:
                return;
        }
    }

    public IDcS171S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILLIIL$0(IDcS171S0100000_12 iDcS171S0100000_12, LiveDialog liveDialog) {
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = (LiveReplayVideoPlayerDialogFragment) iDcS171S0100000_12.l0;
        long parseLong = CastLongProtector.parseLong(liveReplayVideoPlayerDialogFragment.LJLLLLLL);
        if (!liveReplayVideoPlayerDialogFragment.LL) {
            liveReplayVideoPlayerDialogFragment.LL = true;
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).cancelLiveReplayAutoDownload(parseLong).LJJJLIIL(new AfS7S0100100_12(liveReplayVideoPlayerDialogFragment, parseLong, 1), new AfS64S0100000_12(liveReplayVideoPlayerDialogFragment, 101));
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$1(IDcS171S0100000_12 iDcS171S0100000_12, LiveDialog liveDialog) {
        ((LiveReplayVideoPlayerDialogFragment) iDcS171S0100000_12.l0).Jl("livesdk_live_replay_delete_popup_click", "cancel");
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$2(IDcS171S0100000_12 iDcS171S0100000_12, LiveDialog liveDialog) {
        ((LiveReplayVideoPlayerDialogFragment) iDcS171S0100000_12.l0).Jl("livesdk_live_replay_delete_popup_click", "delete");
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = (LiveReplayVideoPlayerDialogFragment) iDcS171S0100000_12.l0;
        long parseLong = CastLongProtector.parseLong(liveReplayVideoPlayerDialogFragment.LJLLLLLL);
        if (!liveReplayVideoPlayerDialogFragment.LL) {
            liveReplayVideoPlayerDialogFragment.LL = true;
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).deleteLiveReplayAutoDownload(parseLong).LJJJLIIL(new AfS64S0100000_12(liveReplayVideoPlayerDialogFragment, 106), new AfS64S0100000_12(liveReplayVideoPlayerDialogFragment, 107));
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$3(IDcS171S0100000_12 iDcS171S0100000_12, LiveDialog liveDialog) {
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = (LiveReplayVideoPlayerDialogFragment) iDcS171S0100000_12.l0;
        long parseLong = CastLongProtector.parseLong(liveReplayVideoPlayerDialogFragment.LJLLLLLL);
        if (Build.VERSION.SDK_INT >= 33) {
            liveReplayVideoPlayerDialogFragment.Al(parseLong);
        } else {
            new C77276UUm(C29306Beo.LIZIZ(liveReplayVideoPlayerDialogFragment.getContext()), TokenCert.Companion.with("bpea-schedule_auto_download_in_video_player")).LIZ(new T4F(liveReplayVideoPlayerDialogFragment, parseLong), "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$4(IDcS171S0100000_12 iDcS171S0100000_12, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS171S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$5(IDcS171S0100000_12 iDcS171S0100000_12, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS171S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$6(IDcS171S0100000_12 iDcS171S0100000_12, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS171S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LJIILLIIL$7(IDcS171S0100000_12 iDcS171S0100000_12, LiveDialog liveDialog) {
        ((InterfaceC65784Pro) iDcS171S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }
}
