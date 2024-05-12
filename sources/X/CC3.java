package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CC3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJFF() {
        Long l;
        Gift gift;
        Gift gift2;
        HashMap hashMap = new HashMap();
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        if (C1I.LIZJ) {
            if (CC4.LIZ == CCC.GIFT) {
                hashMap.put("ongoing_type", "gift_poll");
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
            } else {
                hashMap.put("ongoing_type", "normal_poll");
            }
            hashMap.put("poll_id", String.valueOf(CC4.LIZIZ));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_poll_entrance_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Integer.valueOf(C1I.LIZJ ? 1 : 0), "is_ongoing");
        LIZ2.LJIJJ("toolbar", "request_page");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIIIZZ() {
        Long l;
        Gift gift;
        Gift gift2;
        HashMap hashMap = new HashMap();
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        if (C1I.LIZJ) {
            if (CC4.LIZ == CCC.GIFT) {
                hashMap.put("ongoing_type", "gift_poll");
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
            } else {
                hashMap.put("ongoing_type", "normal_poll");
            }
            hashMap.put("poll_id", String.valueOf(CC4.LIZIZ));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_poll_entrance_show");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Integer.valueOf(C1I.LIZJ ? 1 : 0), "is_ongoing");
        LIZ2.LJIJJ("toolbar", "request_page");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(BZI bzi) {
        boolean z;
        if (C1I.LJ < 2) {
            z = true;
        } else {
            z = false;
        }
        bzi.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_new");
    }

    public static void LJIIJ(String failReason) {
        o.LJIIIZ(failReason, "failReason");
        C30869C9p.LIZ(CC4.LIZIZ, C0N3.LIZIZ("livesdk_anchor_poll_start_fail", failReason, "fail_reason"), "poll_id");
    }

    public static void LIZ(DataChannel dataChannel, CCC pollType) {
        String str;
        o.LJIIIZ(pollType, "pollType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_poll_end_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Long.valueOf(CC4.LIZIZ), "poll_id");
        if (pollType == CCC.GIFT) {
            str = "gift_poll";
        } else {
            str = "normal_poll";
        }
        LIZ2.LJIJJ(str, "poll_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(CCC type, int i) {
        Long l;
        Gift gift;
        Gift gift2;
        o.LJIIIZ(type, "type");
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        HashMap hashMap = new HashMap();
        String str = "gift_poll";
        if (C1I.LIZJ) {
            if (CC4.LIZ == CCC.GIFT) {
                hashMap.put("ongoing_type", "gift_poll");
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
            } else {
                hashMap.put("ongoing_type", "normal_poll");
            }
            hashMap.put("poll_id", String.valueOf(CC4.LIZIZ));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_poll_click_start");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Integer.valueOf(C1I.LIZJ ? 1 : 0), "is_ongoing");
        if (type != CCC.GIFT) {
            str = "normal_poll";
        }
        LIZ2.LJIJJ(str, "poll_type");
        LIZ2.LJIJJ(Integer.valueOf(i), "is_effective");
        LIZ2.LJJIFFI(hashMap);
        LIZLLL(LIZ2);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJ(BZI bzi, DataChannel dataChannel) {
        boolean z;
        if (dataChannel == null || dataChannel.kv0(C28979BYx.class) == null) {
            z = true;
        } else {
            z = false;
        }
        bzi.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_new");
    }

    public static void LJII(DataChannel dataChannel, CCC pollType) {
        String str;
        o.LJIIIZ(pollType, "pollType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_poll_start_popup_show");
        LIZ2.LJIILLIIL(dataChannel);
        if (pollType == CCC.GIFT) {
            str = "gift_poll";
        } else {
            str = "normal_poll";
        }
        LIZ2.LJIJJ(str, "poll_type");
        LJ(LIZ2, dataChannel);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIIZ(DataChannel dataChannel, CCC pollType) {
        HashMap hashMap;
        PollData pollData;
        Long l;
        Gift gift;
        Long l2;
        Gift gift2;
        Gift gift3;
        Long l3;
        Gift gift4;
        o.LJIIIZ(pollType, "pollType");
        if (dataChannel == null || (hashMap = (HashMap) dataChannel.kv0(C28979BYx.class)) == null || (pollData = (PollData) hashMap.get(Integer.valueOf(pollType.ordinal()))) == null) {
            return;
        }
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        HashMap hashMap2 = new HashMap();
        if (pollData.pollKind == 0) {
            hashMap2.put("winner", pollData.LIZJ());
            hashMap2.put("poll_type", "normal_poll");
            hashMap2.put("poll_result", pollData.LIZIZ());
        } else {
            Long l4 = null;
            if (o.LJ(pollData.LIZ(), CardStruct.IStatusCode.DEFAULT)) {
                if (pollGifts != null && (gift4 = pollGifts.LJLIL) != null) {
                    l3 = Long.valueOf(gift4.id);
                } else {
                    l3 = null;
                }
                hashMap2.put("winner", String.valueOf(l3));
            } else if (o.LJ(pollData.LIZ(), "1")) {
                if (pollGifts != null && (gift = pollGifts.LJLILLLLZI) != null) {
                    l = Long.valueOf(gift.id);
                } else {
                    l = null;
                }
                hashMap2.put("winner", String.valueOf(l));
            } else {
                hashMap2.put("winner", pollData.LIZ());
            }
            hashMap2.put("poll_type", "gift_poll");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("{gift_1_id: ");
            LIZ2.append(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 0)).votes);
            LIZ2.append(" , gift_2_id: ");
            hashMap2.put("poll_result", C47135Ieh.LIZIZ(LIZ2, ((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 1)).votes, '}', LIZ2));
            if (pollGifts != null && (gift3 = pollGifts.LJLIL) != null) {
                l2 = Long.valueOf(gift3.id);
            } else {
                l2 = null;
            }
            hashMap2.put("gift_1_id", String.valueOf(l2));
            if (pollGifts != null && (gift2 = pollGifts.LJLILLLLZI) != null) {
                l4 = Long.valueOf(gift2.id);
            }
            hashMap2.put("gift_2_id", String.valueOf(l4));
            hashMap2.put("gift_1_cnts", String.valueOf(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 0)).votes));
            hashMap2.put("gift_2_cnts", String.valueOf(((PollOptionInfo) ListProtector.get(pollData.pollOptionList, 1)).votes));
        }
        BZI LIZ3 = C28787BRn.LIZ("livesdk_anchor_poll_history_show");
        LIZ3.LJIILLIIL(dataChannel);
        LIZ3.LJIJJ(Long.valueOf(pollData.pollId), "poll_id");
        LIZ3.LJIJJ(Long.valueOf(pollData.endTime - pollData.startTime), "time");
        LIZ3.LJIJJ(pollData.LIZJ(), "winner");
        LIZ3.LJJIFFI(hashMap2);
        LIZ3.LJJIIJZLJL();
    }

    public static void LIZIZ(DataChannel dataChannel, CCC ccc, int i) {
        String str;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_poll_end_popup_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Long.valueOf(CC4.LIZIZ), "poll_id");
        LIZ2.LJIJJ(Integer.valueOf(i), "selection");
        if (ccc == CCC.GIFT) {
            str = "gift_poll";
        } else {
            str = "normal_poll";
        }
        LIZ2.LJIJJ(str, "poll_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJI(DataChannel dataChannel, String str, CCC pollType) {
        String str2;
        o.LJIIIZ(pollType, "pollType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_poll_start_popup_click");
        LIZ2.LJIILLIIL(dataChannel);
        LJ(LIZ2, dataChannel);
        if (pollType == CCC.GIFT) {
            str2 = "gift_poll";
        } else {
            str2 = "normal_poll";
        }
        C06490Nh.LIZLLL(LIZ2, str2, "poll_type", str, "selection");
    }
}
