package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TQ0 {
    public static String LIZ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_RtcMessageReaderV3_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_RtcMessageReaderV3_", i, LIZ2);
    }

    public static LinkLayerRTCMessage LIZIZ(String message) {
        o.LJIIIZ(message, "message");
        try {
            return (LinkLayerRTCMessage) C09650Zl.LIZIZ.LJI(message, LinkLayerRTCMessage.class);
        } catch (Exception e) {
            C32014ChO.LIZJ(LIZ(22), "unpackRoomMsgV3 failed", e.getMessage());
            return null;
        }
    }
}
