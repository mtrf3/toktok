package X;

import Y.IDDListenerS140S0100000;
import Y.IDObserverS225S0100000;
import Y.IDcS169S0100000;
import android.os.Handler;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.livesetting.game.BitrateErrorPromptData;
import com.bytedance.android.livesdk.livesetting.game.BitrateErrorPromptSetting;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38921fs implements InterfaceC04500Fq {
    public final GameBroadcastFragment LIZ;
    public final Room LIZIZ;
    public final C12C LIZJ;
    public int LIZLLL;
    public long LJ;
    public final BitrateErrorPromptData LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public LiveDialog LJIIIZ;
    public LiveDialog LJIIJ;
    public AnonymousClass159 LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final Handler LJIILJJIL;

    @Override // X.InterfaceC04500Fq
    public final void LIZ() {
    }

    @Override // X.InterfaceC04500Fq
    public final void LIZIZ() {
        this.LIZLLL = 0;
        this.LJ = 0L;
        this.LJIIJJI = null;
        LJIIJ();
        this.LJIILJJIL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC04500Fq
    public final void LIZJ() {
        this.LJI = false;
    }

    @Override // X.InterfaceC04500Fq
    public final void LJI() {
    }

    @Override // X.InterfaceC04500Fq
    public final void LJII() {
    }

    @Override // X.InterfaceC04500Fq
    public final void onPause() {
    }

    public final void LJIIJ() {
        EnumC264412a LJII;
        if (this.LJIILIIL && C40210FqI.LJ(this.LIZ.mo49getActivity()) && ((LJII = this.LIZJ.LJII()) == EnumC264412a.LIVE_TIP_PUSH_STREAM_ERROR_TIPS || LJII == EnumC264412a.LIVE_TIP_PUSH_STREAM_RETRY_TIPS)) {
            C12B.LIZ(this.LIZJ, false, LJII.ordinal(), "", 8);
        }
        LiveDialog liveDialog = this.LJIIIZ;
        if (liveDialog != null && liveDialog.isShowing()) {
            liveDialog.dismiss();
            LJIIJJI("popup", "other", null);
        }
        LiveDialog liveDialog2 = this.LJIIJ;
        if (liveDialog2 != null && liveDialog2.isShowing()) {
            liveDialog2.dismiss();
        }
    }

    public final void LJIIL() {
        this.LIZJ.LIZIZ().ee0(9);
        this.LIZ.LJIIL().rv0(GameBroadcastStateChannel.class, CWI.StateEnd);
        String str = null;
        if (this.LJIILIIL) {
            this.LJII = true;
            if (!C40210FqI.LJ(this.LIZ.mo49getActivity())) {
                return;
            }
            EnumC264412a LJII = this.LIZJ.LJII();
            EnumC264412a enumC264412a = EnumC264412a.LIVE_TIP_PUSH_STREAM_ERROR_TIPS;
            int i = 0;
            if (LJII == enumC264412a) {
                C12B.LIZ(this.LIZJ, false, enumC264412a.ordinal(), "", 8);
            }
            EnumC264412a LJII2 = this.LIZJ.LJII();
            EnumC264412a enumC264412a2 = EnumC264412a.LIVE_TIP_PUSH_STREAM_RETRY_TIPS;
            if (LJII2 == enumC264412a2) {
                return;
            }
            C12C c12c = this.LIZJ;
            int ordinal = enumC264412a2.ordinal();
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ngb);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_network_20unstable_toast)");
            C12B.LIZ(c12c, true, ordinal, LJIILJJIL, 8);
            BZI LIZ = C28787BRn.LIZ("livesdk_push_stream_fail_reminder_show");
            LIZ.LJIJJ(String.valueOf(this.LIZIZ.getOwnerUserId()), "anchor_id");
            LIZ.LJIJJ(this.LIZIZ.getIdStr(), "room_id");
            RoomStats stats = this.LIZIZ.getStats();
            if (stats != null) {
                i = stats.getTotalUser();
            }
            KNV.LJ(i, LIZ, "viewer_cnt", "float_window", "reminder_type");
            LIZ.LJIJJ("several_attempt_fail", "content_type");
            AnonymousClass159 anonymousClass159 = this.LJIIJJI;
            if (anonymousClass159 != null) {
                str = anonymousClass159.LIZLLL;
            }
            LIZ.LJIJJ(str, "error_type");
            LIZ.LJJIIJZLJL();
            return;
        }
        LJIILIIL();
        LiveDialog liveDialog = this.LJIIIZ;
        if (liveDialog != null && liveDialog.isShowing()) {
            liveDialog.dismiss();
            LJIIJJI("popup", "other", null);
        }
    }

    public final void LJIILIIL() {
        Boolean bool;
        LiveDialog liveDialog = this.LJIIJ;
        if (liveDialog != null) {
            bool = Boolean.valueOf(liveDialog.isShowing());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return;
        }
        if (this.LIZ.mo49getActivity() != null && this.LJIIJ == null) {
            C47071t1 c47071t1 = new C47071t1(this.LIZ.mo49getActivity());
            c47071t1.LJIILLIIL(R.string.ngi);
            c47071t1.LJFF(R.string.nga);
            c47071t1.LJIIL(R.string.ng_, new IDcS169S0100000(this, 37));
            c47071t1.LJIIIZ(R.string.ng9, new IDcS169S0100000(this, 38));
            c47071t1.LJIIZILJ = new IDDListenerS140S0100000(this, 10);
            c47071t1.LJIILJJIL = false;
            this.LJIIJ = c47071t1.LIZ();
        }
        this.LIZJ.LIZIZ().addToShow(49, this.LIZ, new IDObserverS225S0100000(this, 15));
        this.LJII = false;
        this.LJIIIIZZ = false;
    }

    public final void LJIILJJIL() {
        Boolean bool;
        LiveDialog liveDialog = this.LJIIIZ;
        if (liveDialog != null) {
            bool = Boolean.valueOf(liveDialog.isShowing());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return;
        }
        if (this.LIZ.mo49getActivity() != null && this.LJIIIZ == null) {
            C47071t1 c47071t1 = new C47071t1(this.LIZ.mo49getActivity());
            c47071t1.LJIILLIIL(R.string.ngi);
            c47071t1.LJFF(R.string.ngh);
            c47071t1.LJIIL(R.string.n0m, new IDcS169S0100000(this, 39));
            c47071t1.LJIIZILJ = new IDDListenerS140S0100000(this, 11);
            c47071t1.LJIILJJIL = false;
            this.LJIIIZ = c47071t1.LIZ();
        }
        this.LIZJ.LIZIZ().addToShow(9, this.LIZ, new IDObserverS225S0100000(this, 16));
        this.LJIIIIZZ = false;
    }

    @Override // X.InterfaceC04500Fq
    public final void onResume() {
        int i;
        Integer num;
        if (this.LJI) {
            return;
        }
        if (this.LJII) {
            LJIILIIL();
            LiveDialog liveDialog = this.LJIIIZ;
            if (liveDialog != null && liveDialog.isShowing()) {
                liveDialog.dismiss();
                LJIIJJI("popup", "other", null);
                return;
            }
            return;
        }
        int i2 = this.LIZLLL;
        BitrateErrorPromptData bitrateErrorPromptData = this.LJFF;
        if (bitrateErrorPromptData != null && (num = bitrateErrorPromptData.showTips) != null) {
            i = num.intValue();
        } else {
            i = 3;
        }
        if (i2 >= i && this.LJIIIIZZ) {
            LJIILJJIL();
        }
    }

    @Override // X.InterfaceC04500Fq
    public final void LJIIIIZZ(boolean z) {
        this.LJI = true;
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LIZLLL = 0;
        this.LJ = 0L;
        this.LJIIJJI = null;
        LJIIJ();
    }

    public final void LJIIIZ(long j) {
        String str;
        int i;
        Integer num;
        Integer num2;
        if (this.LJI) {
            return;
        }
        int i2 = 0;
        Boolean bool = null;
        if (j < 1) {
            this.LIZLLL++;
            if (this.LJ == 0) {
                this.LJ = System.currentTimeMillis();
            }
        } else {
            if (this.LJIIL) {
                BZI LIZ = C28787BRn.LIZ("livesdk_push_stream_fail_recover");
                LIZ.LJIJJ(String.valueOf(this.LIZIZ.getOwnerUserId()), "anchor_id");
                LIZ.LJIJJ(this.LIZIZ.getIdStr(), "room_id");
                LIZ.LJIJJ(Integer.valueOf(this.LIZLLL), "fail_cnt");
                AnonymousClass159 anonymousClass159 = this.LJIIJJI;
                if (anonymousClass159 != null) {
                    str = anonymousClass159.LIZLLL;
                } else {
                    str = null;
                }
                LIZ.LJIJJ(str, "error_type");
                LIZ.LJJIIJZLJL();
                this.LJIIL = false;
            }
            this.LJII = false;
            LJIIJ();
            this.LIZLLL = 0;
            this.LJ = 0L;
            this.LJIIJJI = null;
        }
        StringBuilder LIZJ = V10.LIZJ("push stream bitrate = ", j, " , bitRateZeroCount = ");
        LIZJ.append(this.LIZLLL);
        LIZJ.append(' ');
        C0NB.LIZIZ("PushStreamBitrate", X1D.LIZIZ(LIZJ));
        int i3 = this.LIZLLL;
        BitrateErrorPromptData bitrateErrorPromptData = this.LJFF;
        int i4 = 3;
        if (bitrateErrorPromptData != null && (num2 = bitrateErrorPromptData.showTips) != null) {
            i = num2.intValue();
        } else {
            i = 3;
        }
        if (i3 == i) {
            if (!this.LJII) {
                LiveDialog liveDialog = this.LJIIJ;
                if (liveDialog != null) {
                    bool = Boolean.valueOf(liveDialog.isShowing());
                }
                if (C29306Beo.LJJIFFI(bool)) {
                    return;
                }
                if (this.LJIILIIL) {
                    this.LJIIIIZZ = true;
                    if (!C40210FqI.LJ(this.LIZ.mo49getActivity())) {
                        return;
                    }
                    EnumC264412a LJII = this.LIZJ.LJII();
                    EnumC264412a enumC264412a = EnumC264412a.LIVE_TIP_PUSH_STREAM_ERROR_TIPS;
                    if (LJII == enumC264412a) {
                        return;
                    }
                    C12C c12c = this.LIZJ;
                    int ordinal = enumC264412a.ordinal();
                    String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ngj);
                    o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_network_unstable_toast)");
                    C12B.LIZ(c12c, true, ordinal, LJIILJJIL, 8);
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_push_stream_fail_reminder_show");
                    LIZ2.LJIJJ(String.valueOf(this.LIZIZ.getOwnerUserId()), "anchor_id");
                    LIZ2.LJIJJ(this.LIZIZ.getIdStr(), "room_id");
                    RoomStats stats = this.LIZIZ.getStats();
                    if (stats != null) {
                        i2 = stats.getTotalUser();
                    }
                    KNV.LJ(i2, LIZ2, "viewer_cnt", "float_window", "reminder_type");
                    C06490Nh.LIZLLL(LIZ2, "first_fail", "content_type", "stream_error", "error_type");
                    return;
                }
                LJIILJJIL();
                return;
            }
            return;
        }
        BitrateErrorPromptData bitrateErrorPromptData2 = this.LJFF;
        if (bitrateErrorPromptData2 != null && (num = bitrateErrorPromptData2.retryStream) != null) {
            i4 = num.intValue();
        }
        if (i3 != i4) {
            return;
        }
        if (this.LJIIJJI == null || this.LJIIL) {
            this.LJIIJJI = new AnonymousClass159(20001, -1, "push stream bitrate error need retry", "stream_error");
            this.LJIIL = false;
        }
        LJIIL();
        C29689Bkz.LIZ.LJIIL(new C534828a(System.currentTimeMillis() - this.LJ));
    }

    public C38921fs(GameBroadcastFragment fragment, Room room, C37661dq c37661dq) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(room, "room");
        this.LIZ = fragment;
        this.LIZIZ = room;
        this.LIZJ = c37661dq;
        this.LJIILJJIL = new Handler(C16880lQ.LLJJJJ());
        BitrateErrorPromptData data = BitrateErrorPromptSetting.INSTANCE.getData();
        this.LJFF = data;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("promptData = ");
        LIZ.append(data);
        C0NB.LIZIZ("PushStreamBitrate", X1D.LIZIZ(LIZ));
    }

    public final void LJIIJJI(String str, String str2, EnumC264412a enumC264412a) {
        int i;
        String str3;
        String str4;
        if (enumC264412a == null || (i = C15A.LIZ[enumC264412a.ordinal()]) == 1 || i != 2) {
            str3 = "stream_error";
            str4 = "first_fail";
        } else {
            AnonymousClass159 anonymousClass159 = this.LJIIJJI;
            if (anonymousClass159 != null) {
                str3 = anonymousClass159.LIZLLL;
            } else {
                str3 = null;
            }
            str4 = "several_attempt_fail";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_push_stream_fail_reminder_close");
        LIZ.LJIJJ(String.valueOf(this.LIZIZ.getOwnerUserId()), "anchor_id");
        LIZ.LJIJJ(this.LIZIZ.getIdStr(), "room_id");
        LIZ.LJIJJ(str, "reminder_type");
        LIZ.LJIJJ(str2, "action_type");
        C06490Nh.LIZLLL(LIZ, str4, "content_type", str3, "error_type");
    }
}
