package X;

import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BsP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30149BsP {
    public static boolean LIZ() {
        Boolean LIZJ = InterfaceC30442Bx8.LLLI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_AUDIENCE_LANDSCAPE_MESSAGE_PANEL_CLOSED.value");
        return LIZJ.booleanValue();
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        Boolean bool;
        Boolean bool2;
        if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(C30114Brq.class)) == null || !bool.booleanValue() || (bool2 = (Boolean) dataChannel.kv0(CommentOrMessageData.class)) == null || !bool2.booleanValue()) {
            return false;
        }
        return true;
    }
}
