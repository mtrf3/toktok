package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.BhW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29474BhW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(BZI bzi) {
        long j;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        long j2 = 0;
        if (room != null) {
            j = room.getId();
            if (room.getOwner() != null) {
                j2 = room.getOwner().getId();
            }
        } else {
            j = 0;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        bzi.LJIJJ(Long.valueOf(j), "room_id");
        bzi.LJIJJ(Long.valueOf(j2), "anchor_id");
        bzi.LJIJJ(Long.valueOf(currentUserId), "user_id");
    }

    public static void LIZJ(String str, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_fans_club_join_guide");
        LIZ2.LJIIZILJ();
        LIZ(LIZ2);
        LIZ2.LJIJJ(enterFrom, "enter_from");
        LIZ2.LJIJJ(str, "action_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(DataChannel dataChannel, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_join_fans_club_success");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ(LIZ2);
        LIZ2.LJIJJ(enterFrom, "enter_from");
        LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ2.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (X.C29306Beo.LJIIJ(r8) == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r7, com.bytedance.ies.sdk.datachannel.DataChannel r8, boolean r9) {
        /*
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            if (r8 == 0) goto L58
            boolean r1 = X.C29306Beo.LJIIJ(r8)
            r0 = 1
            if (r1 != r0) goto L58
        Le:
            r5 = 0
            if (r0 == 0) goto L2c
            java.lang.String r3 = "-1"
            r1 = -1
        L16:
            java.lang.String r0 = "is_fans_club_anchor"
            r4.put(r0, r3)
            if (r9 == 0) goto L22
            java.lang.String r0 = "is_fans_club_level"
            r4.put(r0, r3)
        L22:
            java.lang.String r3 = "fans_club_level"
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r4.put(r3, r0)
            return r4
        L2c:
            java.lang.String r3 = "0"
            if (r7 == 0) goto L46
            com.bytedance.android.live.base.model.user.User r0 = r7.getOwner()
            if (r0 == 0) goto L43
            com.bytedance.android.live.base.model.user.User$FansClubInfo r0 = r0.fansClubInfo
            if (r0 == 0) goto L43
            long r1 = r0.fansLevel
        L3c:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L16
            java.lang.String r3 = "1"
            goto L16
        L43:
            r1 = 0
            goto L3c
        L46:
            if (r8 == 0) goto L55
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel> r0 = com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel.class
            java.lang.Object r0 = r8.kv0(r0)
            X.Bly r0 = (X.C29750Bly) r0
            if (r0 == 0) goto L55
            long r1 = r0.LIZ
            goto L3c
        L55:
            r1 = 0
            goto L16
        L58:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29474BhW.LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel, boolean):java.util.Map");
    }

    public static void LJ(int i, int i2, String str, boolean z) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_config_exist");
        LIZ2.LJIIZILJ();
        LIZ(LIZ2);
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_exist");
        LIZ2.LJIJJ(str, WM7.SCENE_SERVICE);
        LIZ2.LJIJJ(Integer.valueOf(i), "from_grade");
        UFE.LIZIZ(i2, LIZ2, "to_grade");
    }
}
