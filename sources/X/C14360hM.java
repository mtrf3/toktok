package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* renamed from: X.0hM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14360hM {
    public static MusicSong LIZ;
    public static String LIZIZ;

    public static void LIZLLL() {
        Long l;
        String str;
        String str2;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_ksong_play");
        LIZ2.LJIIZILJ();
        MusicSong musicSong = LIZ;
        String str3 = null;
        if (musicSong != null) {
            l = Long.valueOf(musicSong.id);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "music_id");
        MusicSong musicSong2 = LIZ;
        if (musicSong2 != null) {
            str = musicSong2.title;
        } else {
            str = null;
        }
        LIZ2.LJIJJ(str, "music_name");
        MusicSong musicSong3 = LIZ;
        if (musicSong3 != null) {
            str2 = musicSong3.author;
        } else {
            str2 = null;
        }
        LIZ2.LJIJJ(str2, "artist_name");
        MusicSong musicSong4 = LIZ;
        if (musicSong4 != null) {
            str3 = musicSong4.previewUrl;
        }
        LIZ2.LJIJJ(str3, "music_url");
        LIZ2.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
        LIZ2.LJIJJ("decorate", "enter_from");
        LIZ2.LJJIIJZLJL();
        LIZIZ = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
    }

    public static void LIZJ(int i, String str) {
        Long l;
        String str2;
        String str3;
        BZI LIZIZ2 = C0N3.LIZIZ("livesdk_anchor_ksong_play_duration", str, "is_finish");
        MusicSong musicSong = LIZ;
        String str4 = null;
        if (musicSong != null) {
            l = Long.valueOf(musicSong.id);
        } else {
            l = null;
        }
        LIZIZ2.LJIJJ(l, "music_id");
        MusicSong musicSong2 = LIZ;
        if (musicSong2 != null) {
            str2 = musicSong2.title;
        } else {
            str2 = null;
        }
        LIZIZ2.LJIJJ(str2, "music_name");
        MusicSong musicSong3 = LIZ;
        if (musicSong3 != null) {
            str3 = musicSong3.author;
        } else {
            str3 = null;
        }
        LIZIZ2.LJIJJ(str3, "artist_name");
        MusicSong musicSong4 = LIZ;
        if (musicSong4 != null) {
            str4 = musicSong4.previewUrl;
        }
        LIZIZ2.LJIJJ(str4, "music_url");
        C0JT.LIZJ(LIZIZ2, LIZIZ, "select_scene", i, "duration");
    }

    public static void LIZ(DataChannel dataChannel, String str, String str2) {
        Long l;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_ksong_request_button_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str2, "button_type");
        MusicSong musicSong = LIZ;
        if (musicSong != null) {
            l = Long.valueOf(musicSong.id);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "music_id");
        C06490Nh.LIZLLL(LIZ2, str, "panel_type", str2, "button_type");
    }

    public static void LJ(DataChannel dataChannel, String str, MusicSong musicSong) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_ksong_remove");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "click_type");
        if (musicSong != null) {
            LIZ2.LJIJJ(Long.valueOf(musicSong.id), "music_id");
            LIZ2.LJIJJ(musicSong.title, "music_name");
            LIZ2.LJIJJ(musicSong.author, "artist_name");
            LIZ2.LJIJJ(musicSong.previewUrl, "music_url");
        }
        LIZ2.LJJIIJZLJL();
    }

    public static void LJFF(DataChannel dataChannel, TreeMap visibleItems, List list, boolean z) {
        MusicSong musicSong;
        long j;
        o.LJIIIZ(visibleItems, "visibleItems");
        if (visibleItems.isEmpty() || list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : visibleItems.entrySet()) {
            int i = ((C75295Tgp) entry.getValue()).LIZ;
            if (!z) {
                i++;
            }
            arrayList.add(Integer.valueOf(i));
            int i2 = ((C75295Tgp) entry.getValue()).LIZ;
            if (!z ? (musicSong = (MusicSong) ORZ.LJLLLLLL(i2, list)) != null : (musicSong = (MusicSong) ORZ.LJLLLLLL(i2 - 1, list)) != null) {
                j = musicSong.id;
            } else {
                j = 0;
            }
            arrayList2.add(Long.valueOf(j));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_ksong_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(0, "is_shortcut_panel");
        LIZ2.LJIJJ(arrayList.toString(), "music_position");
        LIZ2.LJIJJ(arrayList2.toString(), "music_id_set");
        LIZ2.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJI(long j, DataChannel dataChannel, String str, boolean z) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_ksong_panel_duration");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Long.valueOf(j), "use_time");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_default_open");
        LIZ2.LJIJJ(str, "panel_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(DataChannel dataChannel, MusicSong musicSong, String str, long j, String fromRequestType) {
        Long l;
        String str2;
        String str3;
        o.LJIIIZ(fromRequestType, "fromRequestType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_ksong_favorite_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "click_type");
        String str4 = null;
        if (musicSong != null) {
            l = Long.valueOf(musicSong.id);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "music_id");
        if (musicSong != null) {
            str2 = musicSong.title;
        } else {
            str2 = null;
        }
        LIZ2.LJIJJ(str2, "music_name");
        if (musicSong != null) {
            str3 = musicSong.author;
        } else {
            str3 = null;
        }
        LIZ2.LJIJJ(str3, "artist_name");
        if (musicSong != null) {
            str4 = musicSong.previewUrl;
        }
        C06530Nl.LIZLLL(LIZ2, str4, "music_url", j, "collection_id");
        LIZ2.LJIJJ(fromRequestType, "from_request_type");
        LIZ2.LJJIIJZLJL();
    }
}
