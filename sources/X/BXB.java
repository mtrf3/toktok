package X;

import Y.IDCSpanS3S0200000_5;
import android.app.Activity;
import android.text.SpannableString;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.AgeBlockEvent;
import com.bytedance.android.livesdk.broadcast.AgeGateNotifyEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BXB {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(Activity activity, DataChannel dataChannel) {
        dataChannel.pv0(AgeBlockEvent.class);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C15380j0.LJIILJJIL(R.string.k96));
        LIZ2.append(" >");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C15380j0.LJIILL(R.string.k9d, Integer.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue())));
        LIZ3.append('\n');
        LIZ3.append(LIZIZ);
        SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ3));
        spannableString.setSpan(new IDCSpanS3S0200000_5(activity, dataChannel, 1), spannableString.length() - LIZIZ.length(), spannableString.length(), 17);
        C23010vJ.LJFF(spannableString, spannableString.length() - LIZIZ.length(), spannableString.length(), 17, 600);
        dataChannel.qv0(AgeGateNotifyEvent.class, new C28913BWj(0, BUW.AGE_GATE_BLOCK, spannableString, 8));
        BZI LIZ4 = C28787BRn.LIZ("livesdk_live_banned_toast_show");
        LIZ4.LJIILLIIL(dataChannel);
        LIZ4.LJIIL("show");
        LIZ4.LJIJJ("age_appeal", "show_scene");
        LIZ4.LJJIIJZLJL();
    }

    public static void LIZ(ActivityC45651qj activityC45651qj, int i, DataChannel dataChannel) {
        if (i != 1) {
            if (i != 3) {
                return;
            }
            LIZIZ(activityC45651qj, dataChannel);
            return;
        }
        LIZJ(activityC45651qj, "live_host", "live_takepage", new BXM(activityC45651qj, dataChannel));
    }

    public static void LIZJ(Activity activity, String enterMethod, String requestPage, InterfaceC05250In listener) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(requestPage, "requestPage");
        o.LJIIIZ(listener, "listener");
        BXE bxe = new BXE(listener);
        BXF bxf = new BXF(listener);
        BXH bxh = new BXH(listener);
        if (BXL.LIZ) {
            return;
        }
        C47071t1 c47071t1 = new C47071t1(activity);
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIILLIIL(R.string.k9b);
        c47071t1.LJFF(R.string.k9a);
        c47071t1.LJIIL(R.string.k9_, new BXC(requestPage, activity, enterMethod, bxe, bxf));
        c47071t1.LJIIIZ(R.string.k99, new BXD(requestPage, bxh));
        c47071t1.LJIIZILJ = BXJ.LJLIL;
        c47071t1.LJIILLIIL = BXK.LJLIL;
        LiveDialog LIZ2 = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-6927761606179907960")).LIZ) {
            LIZ2.show();
        }
        BZI LIZ3 = C28787BRn.LIZ("livesdk_add_birth_popup_window_show");
        LIZ3.LJIIZILJ();
        LIZ3.LJIJJ(requestPage, "request_page");
        LIZ3.LJJIIJZLJL();
    }
}
