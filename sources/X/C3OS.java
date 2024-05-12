package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.3OS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OS implements InterfaceC102253zp {
    public static final C3OS LIZ = new C3OS();

    @Override // X.InterfaceC102253zp
    public final boolean LIZ() {
        return C3OT.LIZJ;
    }

    @Override // X.InterfaceC102253zp
    public final boolean LIZIZ() {
        return C3OT.LIZLLL;
    }

    @Override // X.InterfaceC102253zp
    public final boolean LIZJ() {
        return C3OT.LIZIZ;
    }

    @Override // X.InterfaceC102253zp
    public final void LIZLLL(String str, String chatType, boolean z) {
        boolean z2;
        String str2;
        o.LJIIIZ(chatType, "chatType");
        IMCriticalFlowKeva iMCriticalFlowKeva = IMCriticalFlowKeva.LIZ;
        Keva LIZ2 = iMCriticalFlowKeva.LIZ();
        boolean z3 = true;
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = -1;
        if (!z2) {
            String LLLZ = C16880lQ.LLLZ("tag_type_%s", Arrays.copyOf(new Object[]{str}, 1));
            o.LJIIIIZZ(LLLZ, "format(this, *args)");
            i = LIZ2.getInt(LLLZ, -1);
        }
        Keva LIZ3 = iMCriticalFlowKeva.LIZ();
        if (str.length() != 0) {
            z3 = false;
        }
        long j = -1;
        if (!z3) {
            j = LIZ3.getLong(str, -1L);
            LIZ3.clear();
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (j > 0 && currentTimeMillis > 0) {
            C85323Wm LIZ4 = C772831o.LIZ();
            C1HQ LIZ5 = C77800Ug8.LIZ(LIZ4, "onEventV3");
            LIZ5.put("duration", String.valueOf(currentTimeMillis));
            LIZ5.put("enter_method", "click");
            LIZ5.put("enter_from", "chat");
            LIZ5.put("chat_type", chatType);
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ5.put("is_success", str2);
            LIZ5.put("tag_type", String.valueOf(i));
            LIZ4.LIZIZ("chat_video_play_performance", LIZ5);
        }
    }
}
