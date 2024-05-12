package X;

import Y.IDDListenerS152S0100000_13;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.livesdk.widgets.giftwidget.presenter.FastGiftConfirmDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.UGg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76906UGg {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(long j) {
        java.util.Set<String> LIZJ = InterfaceC30442Bx8.LJJIIZ.LIZJ();
        if (LIZJ == null || !LIZJ.contains(String.valueOf(j))) {
            return true;
        }
        return false;
    }

    public static void LIZ(boolean z, boolean z2) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "send";
        } else {
            str = "cancel";
        }
        hashMap.put("click_type", str);
        BZI LIZ2 = C28787BRn.LIZ("convenient_gift_first_popup_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(hashMap);
        if (z2) {
            str2 = "new";
        } else {
            str2 = "normal";
        }
        LIZ2.LJIJJ(str2, "popup_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(C29S context, boolean z, InterfaceC76911UGl interfaceC76911UGl, DataChannel dataChannel) {
        String str;
        o.LJIIIZ(context, "context");
        BZI LIZ2 = C28787BRn.LIZ("shortcut_popup_show");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
        FastGiftConfirmDialog fastGiftConfirmDialog = new FastGiftConfirmDialog();
        fastGiftConfirmDialog.LJLIL = interfaceC76911UGl;
        fastGiftConfirmDialog.LJLJJLL = z;
        FragmentManager supportFragmentManager = context.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "context.supportFragmentManager");
        fastGiftConfirmDialog.show(supportFragmentManager, "FastGiftConfirmDialog");
        if (dataChannel != null) {
            dataChannel.rv0(FastGiftVisibleChannel.class, Boolean.TRUE);
        }
        fastGiftConfirmDialog.setOnDismissListener(new IDDListenerS152S0100000_13(dataChannel, 20));
        BZI LIZ3 = C28787BRn.LIZ("convenient_gift_first_popup_show");
        LIZ3.LJIIZILJ();
        if (z) {
            str = "new";
        } else {
            str = "normal";
        }
        LIZ3.LJIJJ(str, "popup_type");
        LIZ3.LJJIIJZLJL();
    }
}
