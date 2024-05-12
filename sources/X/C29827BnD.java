package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageReachSamplingSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.BnD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29827BnD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(CR6 message) {
        o.LJIIIZ(message, "message");
        if (message.notifyMsgSampleLogState == 1) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_notify_msg_show");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(Long.valueOf(message.getMessageId()), "msg_id");
            LIZ2.LJIJJ(message.getMessageType().getWsMethod(), "method");
            LIZ2.LJIJJ(Long.valueOf(message.baseMessage.roomId), "room_id");
            LIZ2.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "show_ms");
            LIZ2.LJJIIJZLJL();
            message.notifyMsgSampleLogState = 2;
        }
    }

    public static void LIZ(CR6 message, String str) {
        o.LJIIIZ(message, "message");
        if (message.notifyMsgSampleLogState == 1) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_notify_msg_drop");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(Long.valueOf(message.getMessageId()), "msg_id");
            LIZ2.LJIJJ(message.getMessageType().getWsMethod(), "method");
            LIZ2.LJIJJ(Long.valueOf(message.baseMessage.roomId), "room_id");
            LIZ2.LJIJJ(str, "drop_reason");
            LIZ2.LJJIIJZLJL();
            message.notifyMsgSampleLogState = 3;
        }
    }

    public static void LIZIZ(CR6 cr6, boolean z) {
        Object obj = LiveMessageReachSamplingSetting.INSTANCE.getValue().get(cr6.getMessageType().getWsMethod());
        if (obj == null) {
            obj = Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        if (Math.random() < ((Double) obj).doubleValue()) {
            if ((C32072CiK.LIZJ(cr6.getGeneralMessageType()) || z) && cr6.notifyMsgSampleLogState == 0) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_notify_msg_received");
                LIZ2.LJIJJ(Long.valueOf(cr6.getMessageId()), "msg_id");
                LIZ2.LJIJJ(cr6.getMessageType().getWsMethod(), "method");
                LIZ2.LJIJJ(Long.valueOf(cr6.baseMessage.roomId), "room_id");
                LIZ2.LJIJJ(Long.valueOf(cr6.receiveTime), "receive_ms");
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                    LIZ2.LJIIZILJ();
                    LIZ2.LJJIIJZLJL();
                } else {
                    LIZ2.LJJIJ();
                    LIZ2.LJJIIZI();
                }
                cr6.notifyMsgSampleLogState = 1;
            }
        }
    }
}
