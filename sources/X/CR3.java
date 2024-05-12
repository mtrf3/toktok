package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenOnMessageOptSetting;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.model.message.tracking.IdReasonMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class CR3 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZLLL(CR6 cr6) {
        if (cr6 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("clickedMessage", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, IdMessage.from(cr6)));
        C28733BPl.LJIILIIL().LIZIZ("ttlive_text_message_clicked_on_content", hashMap);
    }

    public static final void LJ(CR6 cr6) {
        if (cr6 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("clickedMessage", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, IdMessage.from(cr6)));
        C28733BPl.LJIILIIL().LIZIZ("ttlive_text_message_clicked_on_name", hashMap);
    }

    public static final void LIZ(CR6 cr6, String str) {
        if (cr6 == null || LivePublicScreenOnMessageOptSetting.enable()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("discardedMessage", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, IdReasonMessage.from(cr6, str)));
        C28733BPl.LJIILIIL().LIZIZ("ttlive_message_discarded_on_buffer", hashMap);
    }

    public static final void LIZIZ(CR6 cr6, String str) {
        if (cr6 == null || LivePublicScreenOnMessageOptSetting.enable()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("discardedMessage", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, IdReasonMessage.from(cr6, str)));
        C28733BPl.LJIILIIL().LIZIZ("ttlive_message_discarded_on_message", hashMap);
    }

    public static final void LIZJ(Room room, DataChannel dataChannel, String str) {
        String str2;
        String str3 = null;
        if (room != null) {
            str2 = room.title();
        } else {
            str2 = null;
        }
        if (CN1.LIZ(IHostAppContext.class) != null) {
            str3 = C87095YGd.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale());
        }
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIJJ(str3, "room_language");
        LIZ2.LJIJJ(String.valueOf(str2), "room_title");
        LIZ2.LJIJJ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        LIZ2.LJIJJ(str3, "tag_language");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }
}
