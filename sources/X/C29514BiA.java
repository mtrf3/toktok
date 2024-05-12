package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.BiA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29514BiA {
    public static final boolean LIZ(BadgeStruct badgeStruct) {
        if (badgeStruct != null && badgeStruct.display && badgeStruct.badgeScene == 6) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(BadgeStruct badgeStruct) {
        if (badgeStruct != null && badgeStruct.display && badgeStruct.badgeScene == 2) {
            return true;
        }
        return false;
    }

    public static final void LJ(long j, String str, boolean z) {
        BZI LIZ = C28787BRn.LIZ("livesdk_badge_click");
        LIZ.LJIIZILJ();
        LJI(LIZ, str, j, z);
        LIZ.LJJIIJZLJL();
    }

    public static final void LJFF(long j, String str, boolean z) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_badge_show", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_badge_show");
        LJI(LIZ, str, j, z);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
    }

    public static final void LIZJ(long j, String str, String str2, String str3) {
        if (o.LJ("livesdk_top_active_user_rank_badge_show", str) && !UnusedLogOfflineSetting.INSTANCE.isEnable(str)) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ(str);
        C06530Nl.LIZLLL(LIZ, str3, "user_type", j, "to_user_id");
        LIZ.LJIJJ(str2, "show_entrance");
        LIZ.LJIJJ("", "privilege_id");
        LIZ.LJIJJ(2, "data_version_id");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
    }

    public static final void LIZLLL(String str, String str2, long j, DataChannel dataChannel) {
        String str3;
        o.LJIIIZ(dataChannel, "dataChannel");
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIILLIIL(dataChannel);
        if (o.LJ(Boolean.TRUE, dataChannel.kv0(UserIsAnchorChannel.class))) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        C06530Nl.LIZLLL(LIZ, str3, "user_type", j, "to_user_id");
        LIZ.LJIJJ(str2, "show_entrance");
        C0JT.LIZJ(LIZ, "", "privilege_id", 2, "data_version_id");
    }

    public static void LJI(BZI bzi, String str, long j, boolean z) {
        int i;
        String str2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        bzi.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        bzi.LJIJJ(Long.valueOf(j), "to_user_id");
        bzi.LJIJJ(str, "show_entrance");
        if (currentUserId == j) {
            i = 1;
        } else {
            i = 0;
        }
        bzi.LJIJJ(Integer.valueOf(i), "is_self");
        bzi.LJIJJ(String.valueOf(room.getOwnerUserId()), "anchor_id");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        bzi.LJIJJ(str2, "is_anchor");
        bzi.LJIJJ(room.getIdStr(), "room_id");
        bzi.LJIJJ(BJM.LJFF(), "enter_from_merge");
        bzi.LJIJJ(BJM.LIZLLL(), "action_type");
        bzi.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        bzi.LJIJJ("2", "badge_type");
    }
}
