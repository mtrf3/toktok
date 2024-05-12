package X;

import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.0hN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14370hN {
    public static String LIZ = "normal_video_live";
    public static Long LIZIZ = 0L;

    public static void LIZIZ(boolean z) {
        Long l;
        String str;
        Accompaniment accompaniment;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_ksong_cut_off_music");
        LIZ2.LJIIZILJ();
        C1VT c1vt = C14270hD.LJZI;
        if (c1vt != null && (accompaniment = c1vt.getAccompaniment()) != null) {
            l = Long.valueOf(accompaniment.id);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(String.valueOf(l), "music_id");
        LIZ2.LJIJJ(String.valueOf(C14270hD.LJZ), "collection_id");
        if (z) {
            str = "cut_off_click";
        } else {
            str = "collection_click";
        }
        LIZ2.LJIJJ(str, "method");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(DataChannel dataChannel, String str) {
        Long l;
        Room room;
        Accompaniment accompaniment;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_ksong_request_button_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "button_type");
        C1VT c1vt = C14270hD.LJZI;
        Long l2 = null;
        if (c1vt != null && (accompaniment = c1vt.getAccompaniment()) != null) {
            l = Long.valueOf(accompaniment.id);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(String.valueOf(l), "music_id");
        LIZ2.LJIJJ(String.valueOf(C14270hD.LJZ), "collection_id");
        LIZ2.LJJIIJZLJL();
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            l2 = Long.valueOf(room.getId());
        }
        LIZIZ = l2;
    }
}
