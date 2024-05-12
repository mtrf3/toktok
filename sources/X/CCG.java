package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CCG {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZJ(long j, DataChannel dataChannel) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_send_gift_poll_popup_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ("send_gift_confirm", "show_reason");
        LIZ2.LJIJJ(Long.valueOf(CC4.LIZIZ), "poll_id");
        LIZ2.LJIJJ(String.valueOf(j), "gift_id");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(long j, DataChannel dataChannel, CCC pollType) {
        Long l;
        Gift gift;
        Gift gift2;
        o.LJIIIZ(pollType, "pollType");
        HashMap hashMap = new HashMap();
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        if (pollType == CCC.NORMAL) {
            hashMap.put("poll_type", "normal_poll");
        } else {
            hashMap.put("poll_type", "gift_poll");
            Long l2 = null;
            if (pollGifts != null && (gift2 = pollGifts.LJLIL) != null) {
                l = Long.valueOf(gift2.id);
            } else {
                l = null;
            }
            hashMap.put("gift_1_id", String.valueOf(l));
            if (pollGifts != null && (gift = pollGifts.LJLILLLLZI) != null) {
                l2 = Long.valueOf(gift.id);
            }
            hashMap.put("gift_2_id", String.valueOf(l2));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_poll_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Long.valueOf(CC4.LIZIZ), "poll_id");
        LIZ2.LJIJJ(Long.valueOf(j), "time_remain");
        LIZ2.LIZJ("show");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(long j, DataChannel dataChannel, String str, boolean z) {
        String str2;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_send_gift_poll_popup_click");
        LIZ2.LJIILLIIL(dataChannel);
        if (z) {
            str2 = "close";
        } else {
            str2 = "open";
        }
        LIZ2.LJIJJ(str2, "wont_show_again");
        LIZ2.LJIJJ("send_gift_confirm", "show_reason");
        C07250Qf.LIZJ(CC4.LIZIZ, LIZ2, "poll_id", str, "selection");
        LIZ2.LJIJJ(String.valueOf(j), "gift_id");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(PollMessage pollMessage, DataChannel dataChannel, long j, CCC pollType) {
        long j2;
        Long l;
        String str;
        o.LJIIIZ(pollType, "pollType");
        if (pollMessage != null) {
            j2 = pollMessage.pollId;
        } else {
            j2 = 0;
        }
        LIZ = j2;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_poll_result_latency");
        if (pollMessage != null) {
            l = Long.valueOf(pollMessage.pollId);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "poll_id");
        LIZ2.LJIJJ(Long.valueOf(C30725C4b.LIZ() - j), "latency");
        if (pollType == CCC.GIFT) {
            str = "gift_poll";
        } else {
            str = "normal_poll";
        }
        LIZ2.LJIJJ(str, "poll_type");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }
}
