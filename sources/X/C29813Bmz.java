package X;

import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.Bmz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29813Bmz {
    public static final C29813Bmz LIZ = C29814Bn0.LIZ;

    public static void LIZ(int i, boolean z, EnumC29816Bn2 selectType) {
        long j;
        int i2;
        o.LJIIIZ(selectType, "selectType");
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
        C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        BZI LIZ2 = C28787BRn.LIZ("livesdk_panel_tab_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(j), "room_id");
        LIZ2.LJIJJ(Long.valueOf(j2), "anchor_id");
        LIZ2.LJIJJ(Long.valueOf(currentUserId), "user_id");
        LIZ2.LJIJJ(Integer.valueOf(i), "tab_id");
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_reddot");
        if (gr != null) {
            i2 = gr.LIZ;
        } else {
            i2 = 0;
        }
        LIZ2.LJIJJ(Integer.valueOf(i2), "user_level");
        LIZ2.LJIJJ(selectType.getStringKey(), "select_type");
        LIZ2.LJJIIJZLJL();
    }
}
