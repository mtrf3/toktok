package X;

import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XVC implements InterfaceC82196WNs {
    public static final XVC LIZ = new XVC();

    public static final void LJFF(XVD data) {
        boolean z;
        o.LJIIIZ(data, "data");
        C188727au c188727au = new C188727au();
        LIZ(c188727au, data);
        MusicModel.MusicType musicType = data.LJIILJJIL;
        if (musicType != null && musicType.equals(MusicModel.MusicType.LOCAL_SCAN)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c188727au.LJI("category_name", "device_upload");
        } else {
            MusicModel.MusicType musicType2 = data.LJIILJJIL;
            if (musicType2 != null && musicType2.equals(MusicModel.MusicType.VIDEO_EXTRACT)) {
                c188727au.LJI("category_name", "video_upload");
            }
        }
        if (data.LJII) {
            c188727au.LJI("tab_name", "your_sounds");
        }
        c188727au.LIZLLL(MusicService.LJJLIIIJJI().LJIJI(), "music_rec_type");
        c188727au.LJI("enter_method", data.LJIILIIL);
        c188727au.LIZLLL(0, "is_editor_pro");
        String str = data.LJIILLIIL;
        if (str != null) {
            c188727au.LJI("music_recent_type", str);
        }
        FMX.LJIIL("edit_music", c188727au.LIZ);
    }

    public static void LIZ(C188727au c188727au, XVD data) {
        o.LJIIIZ(data, "data");
        c188727au.LJIIIZ("enter_from", data.LIZ);
        c188727au.LJIIIZ("shoot_way", data.LIZIZ);
        c188727au.LJIIIZ("creation_id", data.LIZJ);
        c188727au.LJIIIZ("content_source", data.LIZLLL);
        c188727au.LJIIIZ("content_type", data.LJ);
        c188727au.LJIIIZ("music_edited_from", data.LJI);
        c188727au.LJIIIZ("enter_method", data.LJIILIIL);
        if (data.LJII) {
            c188727au.LJI("fake_music_id", data.LJFF);
        } else {
            c188727au.LJI("music_id", data.LJFF);
        }
        LIZIZ(c188727au, "search_id", data.LJIIIIZZ);
        LIZIZ(c188727au, "search_result_id", data.LJIIIZ);
        LIZIZ(c188727au, "list_item_id", data.LJIIJ);
        LIZIZ(c188727au, "token_type", data.LJIIL);
        LIZIZ(c188727au, "search_rank", data.LJIIJJI);
        LIZIZ(c188727au, "tab_name", data.LJIILL);
    }

    public static final void LJI(XVD data, Integer num) {
        o.LJIIIZ(data, "data");
        C188727au c188727au = new C188727au();
        LIZ(c188727au, data);
        if (num != null && o.LJ(data.LIZ, "search_music")) {
            c188727au.LIZLLL(num.intValue(), "original_music_duration");
        }
        String str = data.LJIILLIIL;
        if (str != null) {
            c188727au.LJI("music_recent_type", str);
        }
        FMX.LJIIL("edit_music_cancel", c188727au.LIZ);
    }

    public static final void LIZIZ(C188727au c188727au, String str, String str2) {
        if (C78685UuP.LJJJZ(str2)) {
            c188727au.LJI(str, str2);
        }
    }

    public static void LIZJ(XVD xvd, float f, boolean z) {
        C188727au c188727au = new C188727au();
        LIZ(c188727au, xvd);
        c188727au.LIZLLL(z ? 1 : 0, "is_editor_pro");
        c188727au.LIZIZ(f, "speed_mode");
        FMX.LJIIL("choose_sound_speed", c188727au.LIZ);
    }

    public static void LIZLLL(XVD xvd, boolean z, boolean z2) {
        String str;
        C188727au c188727au = new C188727au();
        LIZ(c188727au, xvd);
        c188727au.LIZLLL(z2 ? 1 : 0, "is_editor_pro");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJI("to_status", str);
        FMX.LJIIL("click_change_pitch", c188727au.LIZ);
    }

    public static final void LJ(XVD data, int i, int i2, String str) {
        o.LJIIIZ(data, "data");
        C188727au c188727au = new C188727au();
        LIZ(c188727au, data);
        c188727au.LIZLLL(i2, "starting_point");
        c188727au.LIZLLL(i, "original_music_duration");
        c188727au.LJIIIZ("action_type", str);
        c188727au.LIZLLL(0, "is_editor_pro");
        FMX.LJIIL("click_editing_music_progress_bar", c188727au.LIZ);
    }

    public static final void LJII(XVD data, int i, int i2, float f, String str, boolean z, boolean z2) {
        XVD xvd;
        String str2;
        o.LJIIIZ(data, "data");
        C188727au c188727au = new C188727au();
        if (z2) {
            xvd = XVD.LIZ(data, "video_edit_page", "change_ban_music", "replace_music", "replace_music", null, null, null, 131044);
        } else {
            xvd = data;
        }
        LIZ(c188727au, xvd);
        c188727au.LIZLLL(i, "original_music_duration");
        c188727au.LIZLLL(i2, "new_music_duration");
        c188727au.LIZIZ(f, "sound_speed_mode");
        c188727au.LJIIIZ("sound_filter_id", str);
        c188727au.LIZLLL(z ? 1 : 0, "is_change_pitch");
        c188727au.LJIIIZ("enter_method", data.LJIILIIL);
        c188727au.LIZLLL(0, "is_editor_pro");
        String str3 = data.LJIILLIIL;
        if (str3 != null) {
            c188727au.LJI("music_recent_type", str3);
        }
        if (z2) {
            str2 = "edit_music_complete_replace";
        } else {
            str2 = "edit_music_complete";
        }
        FMX.LJIIL(str2, c188727au.LIZ);
    }
}
