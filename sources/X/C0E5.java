package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.0E5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0E5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String contentType) {
        long j;
        long j2;
        o.LJIIIZ(contentType, "contentType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_floating_interact_tips_show");
        if (B83.LIZ().LIZIZ() != null) {
            j = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        } else {
            j = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j), "anchor_id");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        C07250Qf.LIZJ(j2, LIZ2, "room_id", str, "tips_type");
        LIZ2.LJIJJ(contentType, "content_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(long j, String str, String contentType) {
        long j2;
        o.LJIIIZ(contentType, "contentType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_floating_interact_tips_close");
        if (B83.LIZ().LIZIZ() != null) {
            j2 = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        } else {
            j2 = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j2), "anchor_id");
        LIZ2.LJIJJ(Long.valueOf(j), "room_id");
        LIZ2.LJIJJ(str, "tips_type");
        LIZ2.LJIJJ(contentType, "content_type");
        LIZ2.LJJIIJZLJL();
    }
}
