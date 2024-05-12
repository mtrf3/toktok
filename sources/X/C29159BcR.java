package X;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.GameLandScapeOrientationChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS10S2000000_5;
import kotlin.jvm.internal.AqS30S0001000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BcR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29159BcR implements InterfaceC28916BWm {
    public String LIZ = "go_live_page";
    public final LiveMode LIZIZ = LiveMode.SCREEN_RECORD;
    public final InterfaceC28918BWo[] LIZJ = {new C28523BHj(), new C28521BHh(), new BZA(), new C28520BHg(), new C28914BWk(), new C29353BfZ(), new C28562BIw(), new C29120Bbo(), new C29118Bbm(), new C29207BdD(), new C30546Byo()};

    @Override // X.InterfaceC28916BWm
    public final void LIZIZ() {
        String str;
        if (C40210FqI.LJ(C15380j0.LIZLLL())) {
            str = "go_live_page";
        } else {
            str = "overlay_setting";
        }
        this.LIZ = str;
        C29689Bkz c29689Bkz = C29689Bkz.LIZ;
        c29689Bkz.LJIIJ(this.LIZIZ);
        c29689Bkz.LJIIJJI(this.LIZIZ);
        c29689Bkz.LJIIL(C29170Bcc.LJLIL);
    }

    @Override // X.InterfaceC28916BWm
    public final InterfaceC28918BWo[] LJFF() {
        return this.LIZJ;
    }

    public static void LJIIIZ(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_screening_remind_banner_click");
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(str, "action_type");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC28916BWm
    public final void LIZJ(Fragment fragment) {
        DataChannel LJIILIIL;
        Context context;
        String str;
        if (fragment == null || (LJIILIIL = C51029K0z.LJIILIIL(fragment)) == null || (context = fragment.getContext()) == null) {
            return;
        }
        if (GameLiveMemoryOptSetting.INSTANCE.getValue()) {
            Object value = C7N.LJFF.getValue();
            o.LJIIIIZZ(value, "<get-hostPerformanceOpt>(...)");
            ((IHostPerformanceOpt) value).yF();
        }
        Intent createStartBroadcastIntent = C7N.LJIIJJI().createStartBroadcastIntent(C29306Beo.LIZIZ(context), C29152BcK.LIZ(this.LIZIZ));
        InterfaceC30442Bx8.LJJIJ.LIZ(Boolean.FALSE);
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) LJIILIIL.kv0(RoomCreateInfoChannel.class);
        if (roomCreateInfo != null) {
            str = roomCreateInfo.mAdditionalPrompt;
        } else {
            str = null;
        }
        createStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
        createStartBroadcastIntent.putExtra("hotsoon.intent.extra.PROJECTION_INTENT", (Parcelable) LJIILIIL.kv0(C29206BdC.class));
        createStartBroadcastIntent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", (Boolean) LJIILIIL.kv0(GameLandScapeOrientationChannel.class));
        createStartBroadcastIntent.putExtra("request_page", (String) LJIILIIL.kv0(C28990BZi.class));
        C16880lQ.LIZJ(context, createStartBroadcastIntent);
    }

    @Override // X.InterfaceC28916BWm
    public final boolean LJII(Fragment fragment) {
        Context context;
        MediaProjectionManager mediaProjectionManager;
        o.LJIIIZ(fragment, "fragment");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(fragment);
        if (LJIILIIL == null || (context = fragment.getContext()) == null) {
            return true;
        }
        if (LJIILIIL.kv0(C29206BdC.class) == null) {
            Object LLILL = C16880lQ.LLILL(context, "media_projection");
            if ((LLILL instanceof MediaProjectionManager) && (mediaProjectionManager = (MediaProjectionManager) LLILL) != null) {
                try {
                    P34 p34 = C29174Bcg.LIZ;
                    C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476411393, "bpea-check_screen_capture_intent");
                    p34.getClass();
                    C16880lQ.LJII(fragment, P34.LIZIZ(mediaProjectionManager, LJJIIJ), 20001);
                } catch (Q0C e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("check capture intent exception errorCode: ");
                    LIZ.append(e.getErrorCode());
                    LIZ.append(", msg: ");
                    LIZ.append(e.getMessage());
                    C0NB.LJ("GameStartLiveStrategy", X1D.LIZIZ(LIZ));
                    LJIIJ(LJIILIIL);
                }
                return true;
            }
            LJIIJ(LJIILIIL);
            return true;
        }
        return false;
    }

    public final void LJIIIIZZ(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_screening_allow_show");
        C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id", str, "action_type");
        LIZ.LJIJJ(this.LIZ, "enter_from");
        LIZ.LJJIIJZLJL();
    }

    public final void LJIIJ(DataChannel dataChannel) {
        String LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_mobile_gaming_unauthorized_toast");
        if (LIZ == null) {
            LIZ = C15380j0.LJIILJJIL(R.string.n1p);
        }
        C30868C9o.LJI(LIZ);
        LIZLLL(105, dataChannel);
    }

    @Override // X.InterfaceC28916BWm
    public final void LIZLLL(int i, DataChannel dataChannel) {
        C29697Bl7.LJFF(i, this.LIZIZ);
        ((C29165BcX) C7N.LJ().startLiveManager()).fg(i, dataChannel);
        C29689Bkz c29689Bkz = C29689Bkz.LIZ;
        c29689Bkz.LJIIL(new AqS30S0001000_5(i, 3));
        c29689Bkz.LJIIJ(this.LIZIZ);
    }

    @Override // X.InterfaceC28916BWm
    public final boolean LJ(C29180Bcm c29180Bcm, BUT but) {
        Boolean bool;
        Boolean bool2 = null;
        if (c29180Bcm != null) {
            bool = Boolean.valueOf(c29180Bcm.LJLILLLLZI);
        } else {
            bool = null;
        }
        if (C29306Beo.LJIL(bool)) {
            if (but != null) {
                bool2 = Boolean.valueOf(but.LJLILLLLZI);
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC28916BWm
    public final void LJI(String str, String str2) {
        C29689Bkz c29689Bkz = C29689Bkz.LIZ;
        c29689Bkz.LJIIL(new AqS10S2000000_5(str, str2, 0));
        c29689Bkz.LJIIJ(this.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0222  */
    @Override // X.InterfaceC28916BWm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C29164BcW LIZ(android.content.Context r10, com.bytedance.ies.sdk.datachannel.DataChannel r11, X.HandlerC28345BAn r12) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29159BcR.LIZ(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, X.BAn):X.BcW");
    }
}
