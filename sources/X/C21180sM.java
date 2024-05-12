package X;

import android.os.Handler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0sM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21180sM {
    public static boolean LIZIZ;
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static long LIZJ = -1;

    public static void LJIIIIZZ(String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_setting_playlist_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(str, "click_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(DataChannel dataChannel, String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_quit");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "button_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJFF(EnumC21140sI action, long j) {
        o.LJIIIZ(action, "action");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_position_button_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(action.getValue(), "click_type");
        LIZ2.LJIJJ(Long.valueOf(j), "music_id");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(long j, EnumC21150sJ panel, long j2) {
        o.LJIIIZ(panel, "panel");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_add_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(j), "music_id");
        LIZ2.LJIJJ(panel.getValue(), "panel");
        LIZ2.LJJI(Long.valueOf(j2), "collection_id", new IDqS420S0100000(panel, 159));
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(EnumC07640Rs actionType, long j, EnumC21150sJ panel) {
        EnumC21160sK enumC21160sK;
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(panel, "panel");
        if (actionType == EnumC07640Rs.ADD_FAV) {
            enumC21160sK = EnumC21160sK.ADD_FAV;
        } else if (actionType != EnumC07640Rs.REMOVE_FAV) {
            return;
        } else {
            enumC21160sK = EnumC21160sK.REMOVE_FAV;
        }
        if (enumC21160sK != null) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_favorite_click");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(enumC21160sK.getValue(), "click_type");
            LIZ2.LJIJJ(Long.valueOf(j), "music_id");
            LIZ2.LJIJJ(panel.getValue(), "panel");
            LIZ2.LJJIIJZLJL();
        }
    }

    public static void LIZLLL(DataChannel dataChannel, EnumC21150sJ tabName, boolean z) {
        o.LJIIIZ(tabName, "tabName");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_queue_change");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJIIJ(dataChannel))) ? 1 : 0), "is_anchor");
        LIZ2.LJJI(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_red_dot", new IDqS176S0200000(tabName, dataChannel, 44));
        LIZ2.LJIJJ(tabName.getValue(), "queue");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJ(EnumC21140sI action, long j, EnumC21150sJ panel) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(panel, "panel");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_play_relate_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(action.getValue(), "click_type");
        LIZ2.LJIJJ(Long.valueOf(j), "music_id");
        LIZ2.LJIJJ(panel.getValue(), "panel");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJII(DataChannel dataChannel, String str, boolean z) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_setting_button_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_open");
        LIZ2.LJIJJ(str, "click_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIIZ(DataChannel dataChannel, String str, float f) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_tune_volume_adjust");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIL("adjusted_value", Float.valueOf(f));
        LIZ2.LJIJJ(str, "click_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJI(long j, EnumC21150sJ panel, long j2, int i) {
        o.LJIIIZ(panel, "panel");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_audience_request_button_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(j), "music_id");
        LIZ2.LJIJJ(panel.getValue(), "panel");
        LIZ2.LJJI(Long.valueOf(j2), "collection_id", new IDqS420S0100000(panel, 160));
        LIZ2.LJJI(Integer.valueOf(i), "request_times", new IDqS420S0100000(panel, 161));
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIJ(long j, long j2, String str, boolean z, boolean z2) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_karaoke_play_duration");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(j), "music_id");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_vocal");
        LIZ2.LJIJJ(Long.valueOf(j2), "use_time");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z2)) ? 1 : 0), "is_finish");
        LIZ2.LJJIIJZLJL();
    }
}
