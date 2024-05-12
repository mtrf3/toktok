package X;

import Y.IDeS355S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleSettings;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.follow.FollowGuideWidgetDialog;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lsv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55661Lsv implements InterfaceC54196LOu {
    public static final C55661Lsv LIZ = new C55661Lsv();

    public static final void LJIJJ() {
        C55902Lwo.LJII = true;
    }

    public static final boolean LJFF() {
        int expGroup = FollowLiveBubbleSettings.INSTANCE.getExpGroup();
        if (2 > expGroup || expGroup >= 4) {
            return false;
        }
        return true;
    }

    public static final HashSet<String> LJIILL() {
        if (C00F.LIZ(31744, 0, "inbox_2_follow_guide_debug", true) != 0) {
            return new HashSet<>();
        }
        HashSet<String> LIZJ = InterfaceC30442Bx8.w3.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GUIDE_INBOX_TO_FOLLOW_UID.value");
        return LIZJ;
    }

    public static final void LJIIZILJ() {
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.U1;
        Long value = c48459J0d.LIZJ();
        o.LJIIIIZZ(value, "value");
        if (value.longValue() <= 0) {
            AnonymousClass030.LJFF(c48459J0d);
        }
    }

    public static final void LJIJI() {
        InterfaceC30442Bx8.V1.LIZ(Boolean.TRUE);
    }

    @Override // X.InterfaceC54196LOu
    public final C82694Wcs LIZJ() {
        return new C82694Wcs();
    }

    public static final boolean LJIIIIZZ() {
        if (1 == C55902Lwo.LIZIZ()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ() {
        if (1 != C55902Lwo.LIZIZ()) {
            return false;
        }
        Long showTime = InterfaceC30442Bx8.U1.LIZJ();
        o.LJIIIIZZ(showTime, "showTime");
        if ((showTime.longValue() > 0 && System.currentTimeMillis() - showTime.longValue() > 259200000) || C55902Lwo.LIZIZ <= 0 || InterfaceC30442Bx8.V1.LIZJ().booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJJI() {
        String LIZ2 = BKU.LIZ();
        if ((TextUtils.equals("balance_live_head", LIZ2) || TextUtils.equals("balance_balance_rec_watch", LIZ2)) && TextUtils.equals("follow_recommend", BM1.LJIILL)) {
            return true;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(BM1.LJIILL);
        LIZ3.append('_');
        LIZ3.append(BM1.LJIILLIIL);
        String LIZIZ = X1D.LIZIZ(LIZ3);
        if (TextUtils.equals("balance_balance_rec_explore", LIZIZ) || TextUtils.equals("balance_balance_non_rec_watch", LIZIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54196LOu
    public final C54193LOr LIZLLL() {
        return C82699Wcx.LJ;
    }

    public static final String LJI(long j) {
        if (j <= 0) {
            String string = C55902Lwo.LJ().getString("follow_anchor_live_info_0", "");
            o.LJIIIIZZ(string, "{\n            keva.getSt…NFO + \"_0\", \"\")\n        }");
            return string;
        }
        Keva LJ = C55902Lwo.LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("follow_anchor_live_info_");
        LIZ2.append(j);
        String string2 = LJ.getString(X1D.LIZIZ(LIZ2), "");
        o.LJIIIIZZ(string2, "{\n            keva.getSt…umpRoomId\", \"\")\n        }");
        return string2;
    }

    public static final boolean LJIIJ(boolean z) {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        boolean z2 = false;
        if (LJIIIIZZ == null) {
            return false;
        }
        if (C55902Lwo.LJI(LJIIIIZZ, z).length == 0) {
            z2 = true;
        }
        return !z2;
    }

    public static final boolean LJIIL(Context context) {
        o.LJIIIZ(context, "context");
        Boolean LIZJ = InterfaceC30442Bx8.W1.LIZJ();
        o.LJIIIIZZ(LIZJ, "FOLLOW_WIDGET_IS_ADDED.value");
        return LIZJ.booleanValue();
    }

    public static final void LJIILJJIL(String str) {
        ActivityC45651qj LJJIFFI;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && (LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ)) != null) {
            Bundle LIZ2 = C0H1.LIZ("from_position", str);
            FollowGuideWidgetDialog followGuideWidgetDialog = new FollowGuideWidgetDialog();
            followGuideWidgetDialog.setArguments(LIZ2);
            FragmentManager it = LJJIFFI.getSupportFragmentManager();
            o.LJIIIIZZ(it, "it");
            followGuideWidgetDialog.show(it, "FollowAddWidgetGuideUtil");
        }
    }

    public final String LJII(String str) {
        return C15510jD.LJIIIZ("tiktok_live_watch_resource_normal_1", str);
    }

    public static final void LJIILIIL(View view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        C15490jB.LIZJ(view, url);
    }

    @Override // X.InterfaceC54196LOu
    public final void LIZIZ(ArrayList arrayList, int i) {
        C54193LOr c54193LOr = C82699Wcx.LJ;
        c54193LOr.LIZ = i;
        c54193LOr.LIZIZ = 0;
        c54193LOr.LIZJ = arrayList;
    }

    @Override // X.InterfaceC54196LOu
    public final C54201LOz LJ(E67 e67, WeakReference weakReference) {
        return new C54201LOz((E6F) e67, weakReference);
    }

    public final void LJIJJLI(ActivityC45651qj activityC45651qj, Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (!o.LJ("follow_widget", C16880lQ.LLJJIJIIJIL(intent, "follow_widget_enter_from_merge"))) {
            return;
        }
        C55902Lwo.LJI = true;
        C55902Lwo.LJ = intent.getIntExtra("follow_widget_click_position", 0);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "follow_widget_click_type");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        C55902Lwo.LIZLLL = LLJJIJIIJIL;
        C55902Lwo.LJFF = intent.getLongExtra("follow_widget_click_room_id", 0L);
        intent.getLongExtra("follow_widget_click_anchor_id", 0L);
        if (!C55902Lwo.LJI) {
            return;
        }
        if (!BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin()) {
            Activity LIZ2 = C105574Cj.LIZ(activityC45651qj);
            if (LIZ2 == null) {
                return;
            }
            InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = LIZ2;
            c78450Uqc.LJ = new IDeS355S0100000_9(activityC45651qj, 4);
            C40925G4j.LIZ(c78450Uqc, LJIIIIZZ);
            return;
        }
        C55902Lwo.LJIIJ(activityC45651qj);
    }

    public static final void LJIILLIIL(int i, long j, String str) {
        if (TextUtils.isEmpty(str)) {
            Keva LJ = C55902Lwo.LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("follow_anchor_live_info_");
            LIZ2.append(j);
            LJ.storeString(X1D.LIZIZ(LIZ2), "");
            return;
        }
        Keva LJ2 = C55902Lwo.LJ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("follow_anchor_live_info_");
        LIZ3.append(j);
        LJ2.storeString(X1D.LIZIZ(LIZ3), str);
        if (i != 0) {
            return;
        }
        C55902Lwo.LJ().storeString("follow_anchor_live_info_0", str);
    }

    public final void LJIJ(int i, Context context, List list) {
        C55902Lwo.LIZIZ = i;
        C55902Lwo.LIZJ = list;
        if (context != null) {
            C55902Lwo.LJIIIZ(context);
        } else {
            C55902Lwo.LJIIIIZZ();
        }
        C55902Lwo.LJ().storeInt("follow_anchor_live_num", i);
    }

    @Override // X.InterfaceC54196LOu
    public final E6F LIZ(WeakReference weakReference, FollowLiveBubbleConfig followLiveBubbleConfig, WeakReference weakReference2, boolean z) {
        return new E6F(followLiveBubbleConfig, weakReference2, z);
    }
}
