package X;

import Y.IDCListenerS135S0100000;
import Y.IDDListenerS140S0100000;
import Y.IDObserverS225S0100000;
import Y.IDcS169S0100000;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.livesetting.game.InterruptGuidelinesSettingV2;
import com.bytedance.android.livesdk.livesetting.game.InterruptionGuideImproveData;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41341jm implements InterfaceC30601Ia {
    public final Fragment LIZ;
    public final DataChannel LIZIZ;
    public final C12C LIZJ;
    public boolean LIZLLL;
    public LiveDialog LJ;
    public LiveDialog LJFF;
    public boolean LJI;
    public int LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public C22940vC LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;

    @Override // X.InterfaceC04500Fq
    public final void LIZ() {
    }

    @Override // X.InterfaceC04500Fq
    public final void LIZIZ() {
        this.LJIIJ = null;
        LiveDialog liveDialog = this.LJ;
        if (liveDialog != null) {
            C29306Beo.LJJJJ(liveDialog);
        }
        LiveDialog liveDialog2 = this.LJFF;
        if (liveDialog2 != null) {
            C29306Beo.LJJJJ(liveDialog2);
        }
    }

    @Override // X.InterfaceC04500Fq
    public final void LIZJ() {
        this.LIZLLL = false;
    }

    @Override // X.InterfaceC04500Fq
    public final void LJII() {
        this.LJI = true;
    }

    @Override // X.InterfaceC04500Fq
    public final void onPause() {
    }

    @Override // X.InterfaceC30601Ia
    public final void LIZLLL() {
        C22940vC c22940vC = this.LJIIJ;
        if (c22940vC != null) {
            c22940vC.LJ(EnumC266912z.RED_TOAST, null, null);
        }
        if (this.LJIIIIZZ == 2) {
            LJIILJJIL();
            InterfaceC30442Bx8.U0.LIZ(Boolean.FALSE);
        } else {
            ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            C16880lQ.LIZLLL(mo49getActivity, new Intent(C39849FkT.LIZ(), (Class<?>) ((IHostAction) CN1.LIZ(IHostAction.class)).getHostActivity(6)));
        }
    }

    @Override // X.InterfaceC30601Ia
    public final void LJ() {
        if (this.LJII == 0) {
            this.LJII = 1;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_unexcepted_interruption_click");
        LIZ.LJIJJ(LJIIIZ(), "anchor_id");
        LIZ.LJIJJ("screen_share", "live_type");
        LIZ.LJIJJ(Long.valueOf(LJIIL()), "room_id");
        LIZ.LJIJJ("hover", "event_page");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC04500Fq
    public final void LJI() {
        LiveDialog liveDialog = this.LJFF;
        if (liveDialog != null) {
            C29306Beo.LJJJJ(liveDialog);
        }
        LiveDialog liveDialog2 = this.LJ;
        if (liveDialog2 != null) {
            C29306Beo.LJJJJ(liveDialog2);
        }
    }

    public final String LJIIIZ() {
        return (String) this.LJIIL.getValue();
    }

    public final InterfaceC74834TYo LJIIJ() {
        if (this.LIZ.isAdded()) {
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
            ViewModelProvider of = ViewModelProviders.of(this.LIZ);
            o.LJIIIIZZ(of, "of(fragment)");
            return iRoomFunctionService.RG(of);
        }
        return new C32583CqZ();
    }

    public final String LJIIJJI() {
        int i = this.LJII;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return LiveGiftNewGifterBadgeSetting.DEFAULT;
                }
                return "frontend";
            }
            return "backend";
        }
        return "hover";
    }

    public final long LJIIL() {
        return ((Number) this.LJIIJJI.getValue()).longValue();
    }

    public final void LJIILJJIL() {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        Intent intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        intent.putExtra("pns.sandbox.dataflow_id", 1207965697);
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        if (mo49getActivity != null) {
            C16880lQ.LIZLLL(mo49getActivity, intent);
        }
    }

    public final void LJIILL() {
        LiveDialog liveDialog;
        if (this.LIZ.mo49getActivity() == null) {
            return;
        }
        C22940vC c22940vC = this.LJIIJ;
        if (c22940vC != null) {
            c22940vC.LJFF(EnumC266912z.SETTING_POPUP, null, AnonymousClass130.IN_LIVE);
        }
        C47071t1 c47071t1 = new C47071t1(this.LIZ.mo49getActivity());
        c47071t1.LIZLLL(new C28998BZq(CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1"), "game_live_interrupt_dialog_image.png"));
        c47071t1.LJIILLIIL(R.string.nzn);
        String LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_samsung_LIVE_disconnected_last_time_text");
        if (LIZ == null) {
            LIZ = C39849FkT.LIZ().getString(R.string.nzl);
            o.LJIIIIZZ(LIZ, "context.getString(R.stri…connected_last_time_text)");
        }
        c47071t1.LJII(LIZ);
        c47071t1.LJIIL(R.string.nzj, new IDcS169S0100000(this, 18));
        c47071t1.LJIIIZ(R.string.nzp, new IDcS169S0100000(this, 19));
        c47071t1.LJIIZILJ = new IDDListenerS140S0100000(this, 3);
        c47071t1.LJIILJJIL = false;
        this.LJFF = c47071t1.LIZ();
        if (this.LIZ.mo49getActivity() != null && (liveDialog = this.LJFF) != null) {
            C15N c15n = new C15N();
            c15n.LIZ(R.string.nzo, this.LIZ.mo49getActivity());
            c15n.LIZIZ = new IDCListenerS135S0100000(this, 58);
            liveDialog.LJJ(new C38951fv(c15n));
        }
        LJIIJ().addToShow(51, this.LIZ, new IDObserverS225S0100000(this, 5));
    }

    @Override // X.InterfaceC04500Fq
    public final void onResume() {
        if (C29306Beo.LJIL((Boolean) this.LIZIZ.kv0(BDT.class))) {
            return;
        }
        Boolean bool = null;
        if (this.LIZLLL) {
            if (C1O1.LJIIJ() || this.LJIIIIZZ == 0) {
                if (!InterfaceC30442Bx8.U0.LIZJ().booleanValue()) {
                    LJIILIIL(2);
                } else {
                    C22940vC c22940vC = this.LJIIJ;
                    if (c22940vC != null) {
                        c22940vC.LIZLLL(EnumC266912z.RED_TOAST, null);
                    }
                    this.LIZJ.LIZ();
                    C12B.LIZ(this.LIZJ, false, EnumC264412a.LIVE_TIP_MESSAGE_INTERRUPTED_ERROR.ordinal(), "", 8);
                }
            } else {
                LJIILL();
            }
            this.LIZLLL = false;
            return;
        }
        LiveDialog liveDialog = this.LJFF;
        if (liveDialog != null) {
            bool = Boolean.valueOf(liveDialog.isShowing());
        }
        if (!C29306Beo.LJJIFFI(bool) || !C1O1.LJIIJ()) {
            return;
        }
        LiveDialog liveDialog2 = this.LJFF;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
        }
        C22940vC c22940vC2 = this.LJIIJ;
        if (c22940vC2 != null) {
            c22940vC2.LIZLLL(EnumC266912z.SETTING_POPUP, AnonymousClass130.IN_LIVE);
        }
        this.LIZJ.LIZ();
    }

    @Override // X.InterfaceC30601Ia
    public final void LJFF(C22940vC c22940vC) {
        this.LJIIJ = c22940vC;
    }

    @Override // X.InterfaceC04500Fq
    public final void LJIIIIZZ(boolean z) {
        this.LIZLLL = z;
        if (!C1O1.LJIIIIZZ() || this.LJIIIIZZ == 0) {
            if (!z) {
                LJIILIIL(3);
                return;
            }
            String string = this.LIZ.getString(R.string.lfc);
            o.LJIIIIZZ(string, "fragment.getString(R.str…_gamelive_interrupt_tips)");
            C12B.LIZ(this.LIZJ, true, EnumC264412a.LIVE_TIP_MESSAGE_INTERRUPTED_ERROR.ordinal(), string, 8);
            BZI LIZ = C28787BRn.LIZ("livesdk_live_unexcepted_interruption_show");
            LIZ.LJIJJ(LJIIIZ(), "anchor_id");
            LIZ.LJIJJ("screen_share", "live_type");
            LIZ.LJIJJ(Long.valueOf(LJIIL()), "room_id");
            LIZ.LJIJJ("hover", "event_page");
            LIZ.LJJIIJZLJL();
            return;
        }
        InterfaceC30442Bx8.U0.LIZ(Boolean.TRUE);
        if (!z) {
            LJIILL();
            return;
        }
        C12C c12c = this.LIZJ;
        int ordinal = EnumC264412a.LIVE_TIP_MESSAGE_INTERRUPTED_ERROR_GUIDE_IMPROVE.ordinal();
        String LIZ2 = C86881Y7x.LIZIZ().LIZ("pm_mt_samsung_LIVE_disconnected_floating_window_toast");
        if (LIZ2 == null) {
            LIZ2 = C15380j0.LJIILJJIL(R.string.nzh);
        }
        o.LJIIIIZZ(LIZ2, "I18nCenter.inst().get(\"p…ed_floating_window_toast)");
        C12B.LIZ(c12c, true, ordinal, LIZ2, 8);
        C30868C9o.LJIIIIZZ(R.string.nzq, GlobalContext.getApplicationContext());
        C22940vC c22940vC = this.LJIIJ;
        if (c22940vC == null) {
            return;
        }
        c22940vC.LJFF(EnumC266912z.RED_TOAST, null, null);
    }

    public final void LJIILIIL(int i) {
        if (this.LJII == 0) {
            this.LJII = i;
        }
        if (this.LIZ.mo49getActivity() != null) {
            C47071t1 c47071t1 = new C47071t1(this.LIZ.mo49getActivity());
            c47071t1.LJIILLIIL(R.string.lfd);
            c47071t1.LJFF(R.string.lfa);
            c47071t1.LJIIL(R.string.lfe, new IDcS169S0100000(this, 20));
            c47071t1.LJIIIZ(R.string.lfb, new IDcS169S0100000(this, 21));
            c47071t1.LJIIZILJ = new IDDListenerS140S0100000(this, 4);
            c47071t1.LJIILJJIL = false;
            this.LJ = c47071t1.LIZ();
        }
        LJIIJ().addToShow(50, this.LIZ, new IDObserverS225S0100000(this, 4));
    }

    public C41341jm(Fragment fragment, DataChannel dataChannel, C12C listener) {
        int i;
        String str;
        Integer num;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(listener, "listener");
        this.LIZ = fragment;
        this.LIZIZ = dataChannel;
        this.LIZJ = listener;
        InterruptionGuideImproveData data = InterruptGuidelinesSettingV2.INSTANCE.getData();
        if (data != null && (num = data.group) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.LJIIIIZZ = i;
        if (data != null) {
            str = data.guideUrl;
        } else {
            str = null;
        }
        this.LJIIIZ = str;
        this.LJIIJJI = C221108m2.LIZIZ(C48251uv.LJLIL);
        this.LJIIL = C221108m2.LIZIZ(C48241uu.LJLIL);
    }
}
