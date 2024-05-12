package X;

import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CC4 {
    public static CCC LIZ;
    public static long LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static boolean LIZJ() {
        if (LIZ == CCC.GIFT && C1I.LIZJ) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        if (LIZ == CCC.NORMAL && C1I.LIZJ) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(String displayText) {
        o.LJIIIZ(displayText, "displayText");
        if (displayText.length() != 1) {
            return false;
        }
        return Character.isDigit(displayText.charAt(0));
    }

    public static PollData LIZ(DataChannel dataChannel, CCC pollType) {
        HashMap hashMap;
        o.LJIIIZ(pollType, "pollType");
        if (dataChannel == null || (hashMap = (HashMap) dataChannel.kv0(C28979BYx.class)) == null) {
            return null;
        }
        return (PollData) hashMap.get(Integer.valueOf(pollType.ordinal()));
    }
}
