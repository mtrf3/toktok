package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.OrganizationModel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS23S0000100_5;
import kotlin.jvm.internal.AqS43S0001000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BjW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29598BjW {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static C29637Bk9 LIZLLL;

    static {
        C29599BjX c29599BjX = C29599BjX.LJLIL;
        o.LJIIIZ(c29599BjX, "<set-?>");
        C31014CFe.LJIJ = c29599BjX;
    }

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 4) {
                return "text";
            }
            if (num.intValue() == 5) {
                return "image";
            }
            if (num.intValue() == 6) {
                return "event";
            }
        }
        return "unknow";
    }

    public static void LIZIZ(DataChannel dataChannel, RoomSticker roomSticker) {
        if (roomSticker == null) {
            return;
        }
        int i = roomSticker.type;
        if (i != 5) {
            if (i == 6) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_picture_prop_show");
                KNV.LJ(roomSticker.LIZIZ ? 1 : 0, LIZ2, "is_remember", "event", "tab");
                LIZ2.LJIJJ(String.valueOf(roomSticker.id), "prop_id");
                LIZ2.LJIJJ("video_live", "live_type");
                LIZ2.LJIJJ(roomSticker.name, "prop_name");
                LIZ2.LJIJJ(roomSticker.LIZ, "resource_id");
                LIZ2.LJIILLIIL(dataChannel);
                LIZ2.LJJIIJZLJL();
            }
        } else {
            BZI LIZ3 = C28787BRn.LIZ("livesdk_live_picture_prop_show");
            KNV.LJ(roomSticker.LIZIZ ? 1 : 0, LIZ3, "is_remember", "image", "tab");
            LIZ3.LJIJJ(String.valueOf(roomSticker.id), "prop_id");
            LIZ3.LJIJJ("video_live", "live_type");
            LIZ3.LJIJJ(roomSticker.name, "prop_name");
            LIZ3.LJIJJ(roomSticker.LIZ, "resource_id");
            LIZ3.LJIILLIIL(dataChannel);
            LIZ3.LJJIIJZLJL();
        }
        int i2 = roomSticker.type;
        if (i2 == 5 || i2 == 6) {
            LIZLLL = null;
        }
    }

    public static void LIZLLL(DataChannel dataChannel, RoomSticker roomSticker) {
        if (roomSticker == null || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_audience_prop_show", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_audience_prop_show");
        LIZ2.LJIJJ("live_video", "live_type");
        LIZ2.LJIJJ(LIZ(Integer.valueOf(roomSticker.type)), "tab");
        LIZ2.LJIJJ(Long.valueOf(roomSticker.id), "prop_id");
        LIZ2.LJIJJ(roomSticker.name, "prop_name");
        LIZ2.LJJI("character", "prop_type", new AqS155S0100000_5(roomSticker, 367));
        LIZ2.LJJI("picture", "prop_type", new AqS155S0100000_5(roomSticker, 368));
        LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ2.LJIJJ(roomSticker.LIZ, "resource_id");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJFF(DataChannel dataChannel, String str, OrganizationModel organizationModel) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        if (C29306Beo.LJIIJ(dataChannel)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str2);
        if (organizationModel == null || (str3 = organizationModel.name) == null) {
            str3 = "";
        }
        hashMap.put("NGO_name", str3);
        hashMap.put("position", str);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_donation_icon_show");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIJJ(C28949BXt.LIZIZ(), "powered_by");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJI(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool) {
        o.LJIIIZ(roomSticker, "roomSticker");
        int i = roomSticker.type;
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    return;
                }
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_picture_prop_effective_use");
                LIZ2.LJIJJ(Integer.valueOf(roomSticker.LIZIZ ? 1 : 0), "is_remember");
                LIZ2.LJIJJ(String.valueOf(roomSticker.id), "prop_id");
                LIZ2.LJIJJ(roomSticker.name, "prop_name");
                LIZ2.LJIJJ("event", "tab");
                LIZ2.LJIJJ(roomSticker.LIZ, "resource_id");
                LIZ2.LJIIJJI("live_take_detail");
                LIZ2.LJIIIZ("live_take");
                LIZ2.LJIILLIIL(dataChannel);
                LIZ2.LJJIIJZLJL();
                return;
            }
            BZI LIZ3 = C28787BRn.LIZ("livesdk_live_picture_prop_effective_use");
            LIZ3.LJIJJ(Integer.valueOf(roomSticker.LIZIZ ? 1 : 0), "is_remember");
            LIZ3.LJIJJ(String.valueOf(roomSticker.id), "prop_id");
            LIZ3.LJIJJ(roomSticker.name, "prop_name");
            LIZ3.LJIJJ("image", "tab");
            LIZ3.LJIJJ(roomSticker.LIZ, "resource_id");
            LIZ3.LJIIJJI("live_take_detail");
            LIZ3.LJIIIZ("live_take");
            LIZ3.LJIILLIIL(dataChannel);
            LIZ3.LJJIIJZLJL();
            return;
        }
        BZI LIZ4 = C28787BRn.LIZ("livesdk_live_character_prop_effective_use");
        LIZ4.LJIJJ(Integer.valueOf(roomSticker.LIZIZ ? 1 : 0), "is_remember");
        LIZ4.LJIJJ(String.valueOf(roomSticker.id), "prop_id");
        LIZ4.LJIJJ(roomSticker.name, "prop_name");
        LIZ4.LJIJJ("text", "tab");
        LIZ4.LJIIJJI("live_take_detail");
        LIZ4.LJIIIZ("live_take");
        LIZ4.LJIJJ(Integer.valueOf(!o.LJ(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
        LIZ4.LJIJJ(roomSticker.LIZ, "resource_id");
        LIZ4.LJIILLIIL(dataChannel);
        LIZ4.LJJIIJZLJL();
    }

    public static void LJII(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool) {
        if (roomSticker != null && roomSticker.type == 4 && C29306Beo.LJIIJ(dataChannel)) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_host_character_prop_show");
            LIZ2.LJIJJ(Integer.valueOf(roomSticker.LIZIZ ? 1 : 0), "is_remember");
            LIZ2.LJIJJ(String.valueOf(roomSticker.id), "prop_id");
            LIZ2.LJIJJ(roomSticker.name, "prop_name");
            LIZ2.LJIJJ(Integer.valueOf(!o.LJ(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
            LIZ2.LJIIJJI("live_take_detail");
            LIZ2.LJIJJ(roomSticker.LIZ, "resource_id");
            LIZ2.LJIILLIIL(dataChannel);
            LIZ2.LJJIIJZLJL();
            LIZLLL = new C29637Bk9(roomSticker, bool);
        }
    }

    public static void LJIIIIZZ(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool) {
        long j;
        if (roomSticker != null && roomSticker.type == 4) {
            if (LIZJ > 0) {
                j = SystemClock.elapsedRealtime() - LIZJ;
            } else {
                j = 0;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_host_character_prop_use_time");
            LIZ2.LJIILLIIL(dataChannel);
            LIZ2.LJIIJJI("live_take_detail");
            LIZ2.LJIJJ(Integer.valueOf(roomSticker.LIZIZ ? 1 : 0), "is_remember");
            LIZ2.LJJI("character", "prop_type", new AqS155S0100000_5(roomSticker, 369));
            LIZ2.LJJI("picture", "prop_type", new AqS155S0100000_5(roomSticker, 370));
            LIZ2.LJIJJ(LIZ(Integer.valueOf(roomSticker.type)), "tab");
            LIZ2.LJIJJ(Long.valueOf(roomSticker.id), "prop_id");
            LIZ2.LJIJJ(roomSticker.name, "prop_name");
            C06530Nl.LIZLLL(LIZ2, "video_live", "live_type", j, "use_time");
            LIZ2.LJIJJ(roomSticker.LIZ, "resource_id");
            LIZ2.LJIJJ(Integer.valueOf(o.LJ(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
            LIZ2.LJJIIJZLJL();
        }
        LIZJ = 0L;
        LIZLLL = null;
    }

    public static void LJIIIZ(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool) {
        if (roomSticker != null) {
            if (roomSticker.type == 5 || roomSticker.type == 6) {
                long j = 0;
                if (LIZ > 0) {
                    j = SystemClock.elapsedRealtime() - LIZ;
                }
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_picture_prop_use_time");
                LIZ2.LJIILLIIL(dataChannel);
                LIZ2.LJIIJJI("live_take_detail");
                LIZ2.LJIJJ(Integer.valueOf(roomSticker.LIZIZ ? 1 : 0), "is_remember");
                LIZ2.LJJI("character", "prop_type", new AqS155S0100000_5(roomSticker, 371));
                LIZ2.LJJI("picture", "prop_type", new AqS155S0100000_5(roomSticker, 372));
                LIZ2.LJIJJ(LIZ(Integer.valueOf(roomSticker.type)), "tab");
                LIZ2.LJIJJ(Long.valueOf(roomSticker.id), "prop_id");
                LIZ2.LJIJJ(roomSticker.name, "prop_name");
                C06530Nl.LIZLLL(LIZ2, "video_live", "live_type", j, "use_time");
                LIZ2.LJIJJ(roomSticker.LIZ, "resource_id");
                LIZ2.LJIJJ(Integer.valueOf(o.LJ(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
                LIZ2.LJJIIJZLJL();
            }
        }
    }

    public static void LJIIJ(DataChannel dataChannel, RoomSticker roomSticker, String str) {
        Room room;
        long j;
        User owner;
        Long l = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_character_submit_false");
        LIZ2.LJIILLIIL(dataChannel);
        if (room != null && (owner = room.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        }
        LIZ2.LJIJJ(String.valueOf(l), "anchor_id");
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j), "room_id");
        C07250Qf.LIZJ(roomSticker.id, LIZ2, "prop_id", str, "resource_id");
        LIZ2.LJIJJ(roomSticker.name, "prop_name");
        LIZ2.LJIIJJI("live_take_detail");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool, int i, long j) {
        String str;
        o.LJIIIZ(roomSticker, "roomSticker");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "unknow";
                } else {
                    str = "reject";
                }
            } else {
                str = "done";
            }
        } else {
            str = "under_review";
        }
        if (roomSticker.type == 4) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_character_prop_show");
            KNV.LJ(roomSticker.LIZIZ ? 1 : 0, LIZ2, "is_remember", "text", "tab");
            LIZ2.LJIJJ(String.valueOf(roomSticker.id), "prop_id");
            LIZ2.LJIJJ("video_live", "live_type");
            LIZ2.LJIJJ(roomSticker.name, "prop_name");
            LIZ2.LJIJJ(Integer.valueOf(!o.LJ(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
            LIZ2.LJJI(str, "status", new AqS43S0001000_5(i, 1));
            LIZ2.LJJI(String.valueOf(j), "use_time", new AqS23S0000100_5(j, 0));
            LIZ2.LJIJJ(roomSticker.LIZ, "resource_id");
            LIZ2.LJIILLIIL(dataChannel);
            LIZ2.LJJIIJZLJL();
        }
        String str2 = roomSticker.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        C31014CFe.LJIIZILJ(str2);
    }

    public static void LJ(DataChannel dataChannel, RoomSticker roomSticker, Boolean bool, int i, String str) {
        String str2;
        if (roomSticker != null && 1 <= i && i < 4) {
            StringBuilder LJFF = C72972SkS.LJFF(str, '_');
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str2 = "unknow";
                    } else {
                        str2 = "reject";
                    }
                } else {
                    str2 = "done";
                }
            } else {
                str2 = "under_review";
            }
            LJFF.append(str2);
            String LIZIZ2 = X1D.LIZIZ(LJFF);
            long j = 0;
            if (LIZIZ > 0) {
                j = SystemClock.elapsedRealtime() - LIZIZ;
            }
            if (roomSticker.type == 4) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_character_prop_audit_result");
                LIZ2.LJIJJ(Integer.valueOf(roomSticker.LIZIZ ? 1 : 0), "is_remember");
                LIZ2.LJIJJ(String.valueOf(roomSticker.id), "prop_id");
                LIZ2.LJIJJ(roomSticker.name, "prop_name");
                LIZ2.LJIJJ(Integer.valueOf(!o.LJ(bool, Boolean.TRUE) ? 1 : 0), "is_origin_words");
                LIZ2.LJJI(LIZIZ2, "status", new AqS43S0001000_5(i, 2));
                LIZ2.LJJI(String.valueOf(j), "use_time", new AqS23S0000100_5(j, 1));
                LIZ2.LJIIJJI("live_take_detail");
                LIZ2.LJIJJ(roomSticker.LIZ, "resource_id");
                LIZ2.LJIILLIIL(dataChannel);
                LIZ2.LJJIIJZLJL();
            }
        }
    }
}
