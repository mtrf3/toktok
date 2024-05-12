package X;

import Y.IDDListenerS140S0100000;
import Y.IDObserverS225S0100000;
import Y.IDcS169S0100000;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideData;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41351jn implements InterfaceC30601Ia {
    public final Fragment LIZ;
    public final DataChannel LIZIZ;
    public final C12C LIZJ;
    public boolean LIZLLL;
    public LiveDialog LJ;
    public LiveDialog LJFF;
    public boolean LJI;
    public int LJII;
    public final String LJIIIIZZ;
    public final Boolean LJIIIZ;
    public SparkContext LJIIJ;
    public C22940vC LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;

    @Override // X.InterfaceC04500Fq
    public final void LIZ() {
    }

    @Override // X.InterfaceC04500Fq
    public final void LIZIZ() {
        InterfaceC40159FpT LJIILL;
        this.LJIIJJI = null;
        SparkContext sparkContext = this.LJIIJ;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
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
        C22940vC c22940vC = this.LJIIJJI;
        if (c22940vC != null) {
            c22940vC.LJII(LJIIL(), EnumC266912z.RED_TOAST, null, AnonymousClass130.IN_LIVE);
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
        return (String) this.LJIILIIL.getValue();
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
        return ((Number) this.LJIIL.getValue()).longValue();
    }

    public final void LJIILJJIL() {
        if (this.LIZ.mo49getActivity() == null) {
            return;
        }
        C47071t1 c47071t1 = new C47071t1(this.LIZ.mo49getActivity());
        c47071t1.LIZLLL(new C28998BZq(CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1"), "game_live_interrupt_dialog_image.png"));
        c47071t1.LJIILLIIL(R.string.jxm);
        c47071t1.LJFF(R.string.jxe);
        c47071t1.LJIIL(R.string.jxf, new IDcS169S0100000(this, 22));
        c47071t1.LJIIIZ(R.string.jxg, new IDcS169S0100000(this, 23));
        c47071t1.LJIIZILJ = new IDDListenerS140S0100000(this, 5);
        c47071t1.LJIILLIIL = new DialogInterface.OnShowListener() { // from class: X.0Ot
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C41351jn.this.getClass();
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.U0;
                Boolean bool = Boolean.FALSE;
                c48459J0d.LIZ(bool);
                InterfaceC30442Bx8.V0.LIZ(bool);
                C41351jn c41351jn = C41351jn.this;
                C22940vC c22940vC = c41351jn.LJIIJJI;
                if (c22940vC != null) {
                    c22940vC.LJIIIIZZ(c41351jn.LJIIL(), EnumC266912z.LIVE_POPUP, AnonymousClass130.IN_LIVE);
                }
            }
        };
        c47071t1.LJIILJJIL = false;
        this.LJFF = c47071t1.LIZ();
        LJIIJ().addToShow(51, this.LIZ, new IDObserverS225S0100000(this, 7));
    }

    @Override // X.InterfaceC04500Fq
    public final void onResume() {
        Boolean bool;
        InterfaceC40159FpT LJIILL;
        if (C29306Beo.LJIL((Boolean) this.LIZIZ.kv0(BDT.class))) {
            return;
        }
        if (this.LIZLLL) {
            if (C1O1.LJIIJ()) {
                if (!InterfaceC30442Bx8.U0.LIZJ().booleanValue()) {
                    LJIILIIL(2);
                } else {
                    this.LIZJ.LIZ();
                    C12B.LIZ(this.LIZJ, false, EnumC264412a.LIVE_TIP_MESSAGE_INTERRUPTED_ERROR.ordinal(), "", 8);
                }
            } else {
                LJIILJJIL();
            }
            this.LIZLLL = false;
            return;
        }
        LiveDialog liveDialog = this.LJFF;
        if (liveDialog != null) {
            bool = Boolean.valueOf(liveDialog.isShowing());
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool) || !C1O1.LJIIJ()) {
            return;
        }
        SparkContext sparkContext = this.LJIIJ;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
        LiveDialog liveDialog2 = this.LJFF;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
        }
        C22940vC c22940vC = this.LJIIJJI;
        if (c22940vC != null) {
            c22940vC.LJI(LJIIL(), EnumC266912z.LIVE_POPUP, AnonymousClass130.IN_LIVE);
        }
        this.LIZJ.LIZ();
    }

    @Override // X.InterfaceC30601Ia
    public final void LJFF(C22940vC c22940vC) {
        this.LJIIJJI = c22940vC;
    }

    @Override // X.InterfaceC04500Fq
    public final void LJIIIIZZ(boolean z) {
        this.LIZLLL = z;
        if (C29306Beo.LJIL(this.LJIIIZ) || !C1O1.LJIIIIZZ()) {
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
            LJIILJJIL();
            return;
        }
        C12C c12c = this.LIZJ;
        int ordinal = EnumC264412a.LIVE_TIP_MESSAGE_INTERRUPTED_ERROR_GUIDE_IMPROVE.ordinal();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.jxh);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_LI…ed_floating_window_toast)");
        C12B.LIZ(c12c, true, ordinal, LJIILJJIL, 8);
        C30868C9o.LJIIIIZZ(R.string.jxh, GlobalContext.getApplicationContext());
        C22940vC c22940vC = this.LJIIJJI;
        if (c22940vC == null) {
            return;
        }
        c22940vC.LJIIIIZZ(LJIIL(), EnumC266912z.RED_TOAST, AnonymousClass130.IN_LIVE);
    }

    public final void LJIILIIL(int i) {
        if (this.LJII == 0) {
            this.LJII = i;
        }
        if (this.LIZ.mo49getActivity() != null) {
            C47071t1 c47071t1 = new C47071t1(this.LIZ.mo49getActivity());
            c47071t1.LJIILLIIL(R.string.lfd);
            c47071t1.LJFF(R.string.lfa);
            c47071t1.LJIIL(R.string.lfe, new IDcS169S0100000(this, 24));
            c47071t1.LJIIIZ(R.string.lfb, new IDcS169S0100000(this, 25));
            c47071t1.LJIIZILJ = new IDDListenerS140S0100000(this, 6);
            c47071t1.LJIILJJIL = false;
            this.LJ = c47071t1.LIZ();
        }
        LJIIJ().addToShow(50, this.LIZ, new IDObserverS225S0100000(this, 6));
    }

    public C41351jn(Fragment fragment, DataChannel dataChannel, C12C listener) {
        boolean z;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(listener, "listener");
        this.LIZ = fragment;
        this.LIZIZ = dataChannel;
        this.LIZJ = listener;
        this.LJIIL = C221108m2.LIZIZ(C48291uz.LJLIL);
        this.LJIILIIL = C221108m2.LIZIZ(C48281uy.LJLIL);
        MultiDeviceInterruptGuideData data = MultiDeviceInterruptGuideSetting.INSTANCE.getData();
        Integer num = data.enable;
        if (num == null || num.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIZ = Boolean.valueOf(z);
        this.LJIIIIZZ = data.guideUrl;
    }
}
