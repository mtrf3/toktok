package X;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XVF {
    public static String LIZ = null;
    public static String LIZIZ = null;
    public static String LIZJ = null;
    public static int LIZLLL = -1;
    public static String LJ;
    public static String LJFF;
    public static int LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static boolean LJIIIZ;
    public static XUK LJIIJ;

    public static Boolean LIZLLL() {
        String str = LJII;
        if (str != null && !str.isEmpty()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static boolean LIZJ() {
        return CommerceMediaServiceImpl.LIZJ().LJIIIZ();
    }

    public static String LIZIZ(String str) {
        if (str == null) {
            return "";
        }
        if (!str.equals("video_edit_page")) {
            if (!str.equals("video_shoot_page")) {
                return "";
            }
            return "shoot_change_music";
        }
        return "edit_change_music";
    }

    public static void LJ(String str) {
        XUK xuk = LJIIJ;
        if (xuk == null) {
            return;
        }
        if (!o.LJ(xuk.LIZ, str)) {
            xuk.LIZIZ = -1L;
            xuk.LIZJ = 0L;
        } else {
            xuk.LIZJ = System.currentTimeMillis() - xuk.LIZIZ;
        }
    }

    public static void LJFF(long j) {
        HashMap LIZJ2 = C03660Ck.LIZJ("tab_name", "your_sounds");
        LIZJ2.put("read_duration", String.valueOf(j));
        FMX.LJIILJJIL("local_music_read_duration", C78963Uyt.LJJJJIZL(LIZJ2));
    }

    public static void LJI(int i) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("tab_name", "favourite_song");
        c188727au.LJIIIZ("enter_from", "change_music_page");
        c188727au.LJIIIZ("button_name", "see_more");
        c188727au.LIZLLL(i, "load_cnt");
        FMX.LJIIL("click_common_button", c188727au.LIZ);
    }

    public static void LJIILLIIL(String str) {
        LIZ = str;
        LIZIZ(str);
    }

    public static void LIZ(MusicModel musicModel, C188727au c188727au) {
        boolean z;
        if (C52536Kjc.LIZ() && musicModel.getMusicTags() != null && musicModel.getMusicTags().size() > 0 && !TextUtils.isEmpty(((MusicTag) ListProtector.get(musicModel.getMusicTags(), 0)).getTagTitle())) {
            z = true;
        } else {
            z = false;
        }
        if (C52536Kjc.LIZIZ() && musicModel.getUserCount() > 0) {
            if (!z) {
                c188727au.LIZLLL(musicModel.getUserCount(), "post_cnt");
                return;
            }
        } else if (!z) {
            return;
        }
        c188727au.LJI("tag", ((MusicTag) ListProtector.get(musicModel.getMusicTags(), 0)).getTagTitle());
    }

    public static void LJIILJJIL(EnumC61629OGr enumC61629OGr, boolean z) {
        String str;
        String str2;
        String str3;
        C188727au c188727au = new C188727au();
        int i = C61628OGq.LIZ[enumC61629OGr.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        str = "";
                    } else {
                        str = "more_song";
                    }
                } else {
                    str = "your_sounds";
                }
            } else {
                str = "favourite_song";
            }
        } else {
            str = "popular_song";
        }
        c188727au.LJIIIZ("tab_name", str);
        c188727au.LJIIIZ("shoot_tab_name", LIZIZ);
        c188727au.LJIIIZ("previous_page", LIZ);
        c188727au.LJIIIZ("enter_from", LIZ);
        c188727au.LJIIIZ("creation_id", LJ);
        if (LJIIIZ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJI("carousel_open", str2);
        if (LIZLLL().booleanValue()) {
            c188727au.LJIIIZ("from_location", LJII);
            c188727au.LJIIIZ("type", LJIIIIZZ);
            c188727au.LIZLLL(1, "is_editor_pro");
        }
        if (LIZJ()) {
            c188727au.LJI("is_commercial", "1");
        }
        if (enumC61629OGr == EnumC61629OGr.TAB_TYPE_LOCAL) {
            String str4 = "on";
            if (z) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            c188727au.LJI("system_music_authorization_status", str3);
            if (!z) {
                str4 = "off";
            }
            c188727au.LJI("system_photo_authorization_status", str4);
        }
        FMX.LJIIL("enter_music_tab", c188727au.LIZ);
    }

    public static void LJIIJ(XVG xvg, MusicModel musicModel, boolean z) {
        String str;
        String str2;
        if (xvg != null && musicModel != null && !musicModel.isLocalMusic() && LIZLLL != -1) {
            C188727au c188727au = new C188727au();
            String str3 = xvg.LIZIZ;
            int i = LIZLLL;
            MusicModel.MusicItemType musicItemType = musicModel.getMusicItemType();
            MusicModel.MusicItemType musicItemType2 = MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC;
            if (musicItemType == musicItemType2) {
                i = musicModel.getEventPosition();
                str3 = "favorite_recommend";
            }
            if (musicModel.getEventPosition() != -1) {
                i = musicModel.getEventPosition();
            }
            c188727au.LJIIIZ("enter_from", xvg.LIZ);
            c188727au.LJIIIZ("music_id", musicModel.getMusicId());
            c188727au.LJIIIZ("category_name", str3);
            c188727au.LJIIIZ("enter_method", xvg.LIZJ);
            c188727au.LJIIIZ("previous_page", xvg.LIZLLL);
            c188727au.LIZLLL(i, "order");
            c188727au.LJ(xvg.LJIIJJI, "max_shoot_time");
            c188727au.LJI("creation_id", LJ);
            if (!TextUtils.isEmpty(xvg.LJI)) {
                c188727au.LJI("tag_id", xvg.LJI);
            }
            if (!TextUtils.isEmpty(xvg.LJFF)) {
                c188727au.LJI("prop_id", xvg.LJFF);
            }
            LIZ(musicModel, c188727au);
            if (!TextUtils.isEmpty(xvg.LJ)) {
                c188727au.LJI("category_id", xvg.LJ);
            }
            LogPbBean logPbBean = xvg.LJIIIIZZ;
            if (logPbBean != null) {
                c188727au.LJFF(logPbBean, "log_pb");
                if (!TextUtils.isEmpty(xvg.LJIIIIZZ.getImprId())) {
                    str2 = xvg.LJIIIIZZ.getImprId();
                } else {
                    str2 = "";
                }
                c188727au.LJI("impr_id", str2);
            }
            if (musicModel.getLogPb() != null) {
                c188727au.LJI("music_request_id", musicModel.getLogPb().getImprId());
            }
            boolean z2 = true;
            if (LIZLLL().booleanValue()) {
                c188727au.LJIIIZ("from_location", LJII);
                c188727au.LJIIIZ("type", LJIIIIZZ);
                c188727au.LIZLLL(1, "is_editor_pro");
            }
            c188727au.LJIIIIZZ(new H96().LJFF("is_commercial", "commercial_music_suggestion_id"));
            c188727au.LIZLLL(i, "commercial_music_order");
            c188727au.LJI("music_name", musicModel.getName());
            if (musicModel.getMusicItemType() == musicItemType2) {
                c188727au.LJI("music_from", "favorite_recommend");
            }
            if (H92.LJ()) {
                c188727au.LJI("enter_from", "promote");
            }
            float LIZ2 = C47130Iec.LIZ(musicModel.getMusicVolumeInfo());
            if (C47130Iec.LIZJ(Float.valueOf(LIZ2))) {
                c188727au.LIZIZ(LIZ2, "bgm_volume_difference_with_feed_db");
            }
            if (TextUtils.equals(xvg.LIZ, "search_music")) {
                if (musicModel.getCardType() != MusicModel.CardType.AWESearchMusicCardMusicWithVideo) {
                    z2 = false;
                }
                if (Boolean.valueOf(z2).booleanValue()) {
                    str = "music_with_video";
                } else {
                    str = "music";
                }
                c188727au.LJI("search_keyword", LIZJ);
                c188727au.LJI("log_pb", GsonProtectorUtils.toJson(new Gson(), musicModel.getLogPb()));
                c188727au.LJI("search_id", musicModel.getSearchId());
                c188727au.LJ(musicModel.getId(), "search_result_id");
                c188727au.LIZLLL(LIZLLL, "order");
                c188727au.LJI("token_type", str);
                FMX.LJIILJJIL("play_music", C78963Uyt.LJJJJIZL(c188727au.LIZ));
                return;
            }
            c188727au.LIZLLL(MusicService.LJJLIIIJJI().LJIJI(), "music_rec_type");
            FMX.LJIIL("play_music", c188727au.LIZ);
            return;
        }
        if (!musicModel.isLocalMusic()) {
            return;
        }
        C188727au c188727au2 = new C188727au();
        if (xvg != null && xvg.LIZIZ.equals("device_upload")) {
            c188727au2.LJIIIZ("creation_id", LJ);
            c188727au2.LJI("shoot_way", LJFF);
            c188727au2.LIZLLL(z ? 1 : 0, "is_selected");
            String str4 = xvg.LIZLLL;
            if (str4 != null && str4.contains("shoot")) {
                c188727au2.LJI("enter_from", "shoot_page_upload_song");
            } else {
                String str5 = xvg.LIZLLL;
                if (str5 != null && str5.contains("edit")) {
                    c188727au2.LJI("enter_from", "edit_page_upload_song");
                } else {
                    c188727au2.LJI("enter_from", xvg.LIZ);
                }
            }
            FMX.LJIIL("click_local_sound_detail", c188727au2.LIZ);
            return;
        }
        c188727au2.LJIIIZ("creation_id", LJ);
        c188727au2.LJIIIZ("enter_from", xvg.LIZ);
        c188727au2.LJIIIZ("shoot_way", LJFF);
        c188727au2.LJIIIZ("fake_music_id", musicModel.getMusicId());
        c188727au2.LJIIIZ("music_name", musicModel.getName());
        c188727au2.LJI("tab_name", "your_sounds");
        if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL_SCAN) {
            c188727au2.LJI("category_name", "device_upload");
        } else if (musicModel.getMusicType() == MusicModel.MusicType.VIDEO_EXTRACT) {
            c188727au2.LJI("category_name", "video_upload");
        } else {
            c188727au2.LJI("category_name", "upload");
        }
        float LIZ3 = C47130Iec.LIZ(musicModel.getMusicVolumeInfo());
        if (C47130Iec.LIZJ(Float.valueOf(LIZ3))) {
            c188727au2.LIZIZ(LIZ3, "bgm_volume_difference_with_feed_db");
        }
        FMX.LJIIL("play_music", c188727au2.LIZ);
    }

    public static void LJIIJJI(String str, XVG xvg, MusicModel musicModel) {
        int i;
        String str2;
        String str3;
        if (xvg == null || LJIIJ == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("category_name", xvg.LIZIZ);
        XUK xuk = LJIIJ;
        boolean z = false;
        if (xuk == null || !o.LJ(xuk.LIZ, str)) {
            i = 0;
        } else {
            i = xuk.LIZLLL;
        }
        c188727au.LIZLLL(i, "time");
        XUK xuk2 = LJIIJ;
        long j = 0;
        if (xuk2 != null && o.LJ(xuk2.LIZ, str)) {
            if (xuk2.LIZJ <= 0 && xuk2.LIZIZ > 0) {
                xuk2.LIZJ = System.currentTimeMillis() - xuk2.LIZIZ;
            }
            j = xuk2.LIZJ;
        }
        c188727au.LJ(j, "stay_time");
        c188727au.LJIIIZ("enter_from", xvg.LIZ);
        c188727au.LJIIIZ("enter_method", xvg.LIZJ);
        c188727au.LJIIIZ("previous_page", xvg.LIZLLL);
        c188727au.LJ(xvg.LJIIJJI, "max_shoot_time");
        c188727au.LJI("creation_id", LJ);
        if (!TextUtils.isEmpty(xvg.LJI)) {
            c188727au.LJI("tag_id", xvg.LJI);
        }
        if (!TextUtils.isEmpty(xvg.LJFF)) {
            c188727au.LJI("prop_id", xvg.LJFF);
        }
        LogPbBean logPbBean = xvg.LJIIIIZZ;
        if (logPbBean != null) {
            c188727au.LJFF(logPbBean, "log_pb");
            if (!TextUtils.isEmpty(xvg.LJIIIIZZ.getImprId())) {
                str3 = xvg.LJIIIIZZ.getImprId();
            } else {
                str3 = "";
            }
            c188727au.LJI("impr_id", str3);
        }
        if (TextUtils.equals(xvg.LIZ, "search_music")) {
            if (musicModel.getCardType() == MusicModel.CardType.AWESearchMusicCardMusicWithVideo) {
                z = true;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                str2 = "music_with_video";
            } else {
                str2 = "music";
            }
            c188727au.LJI("search_keyword", LIZJ);
            c188727au.LJI("search_id", musicModel.getSearchId());
            c188727au.LJ(musicModel.getId(), "search_result_id");
            c188727au.LJI("token_type", str2);
            c188727au.LIZLLL(LIZLLL, "order");
        }
        FMX.LJIIL("music_play_time", c188727au.LIZ);
        LJIIJ = null;
    }

    public static void LJIIIIZZ(XVG xvg, String str, boolean z, String str2) {
        String str3;
        String str4;
        if (xvg != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", xvg.LIZ);
            c188727au.LJIIIZ("music_id", str);
            c188727au.LJIIIZ("category_name", xvg.LIZIZ);
            c188727au.LJIIIZ("creation_id", LJ);
            if (z) {
                str3 = "click_banner";
            } else {
                str3 = "click_button";
            }
            c188727au.LJIIIZ("enter_method", str3);
            c188727au.LJIIIIZZ(new H96().LJFF("is_commercial", "commercial_music_suggestion_id"));
            if (!TextUtils.isEmpty(xvg.LJ)) {
                c188727au.LJI("category_id", xvg.LJ);
            }
            if (!TextUtils.isEmpty(str2)) {
                c188727au.LJI("process_id", str2);
            }
            LogPbBean logPbBean = xvg.LJIIIIZZ;
            if (logPbBean != null) {
                c188727au.LJFF(logPbBean, "log_pb");
                if (!TextUtils.isEmpty(xvg.LJIIIIZZ.getImprId())) {
                    str4 = xvg.LJIIIIZZ.getImprId();
                } else {
                    str4 = "";
                }
                c188727au.LJI("impr_id", str4);
            }
            FMX.LJIIL("enter_music_detail", c188727au.LIZ);
        }
    }

    public static void LJIILIIL(String str, String str2, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("playlist_id", str2);
        c188727au.LJIIIZ("playlist_name", str3);
        c188727au.LJI("platform", str4);
        FMX.LJIIL("share_playlist", c188727au.LIZ);
    }

    public static void LJIILL(XVG xvg, MusicModel musicModel, int i, LogPbBean logPbBean) {
        int i2;
        String str;
        boolean z;
        boolean z2;
        String str2;
        Integer num;
        String str3;
        if (xvg != null) {
            C188727au c188727au = new C188727au();
            MusicModel.MusicItemType musicItemType = musicModel.getMusicItemType();
            MusicModel.MusicItemType musicItemType2 = MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC;
            if (musicItemType == musicItemType2) {
                i2 = musicModel.getEventPosition();
            } else {
                i2 = i;
            }
            if (musicModel.getEventPosition() != -1) {
                i2 = musicModel.getEventPosition();
            }
            if (musicModel.isLocalMusic()) {
                c188727au.LJI("fake_music_id", musicModel.getMusicId());
            } else {
                c188727au.LJI("music_id", musicModel.getMusicId());
            }
            c188727au.LJIIIZ("enter_from", xvg.LIZ);
            c188727au.LJIIIZ("enter_method", xvg.LIZJ);
            c188727au.LIZLLL(i2, "order");
            c188727au.LJIIIZ("previous_page", LIZ);
            c188727au.LJ(xvg.LJIIJJI, "max_shoot_time");
            c188727au.LIZLLL(0, "is_from_video");
            c188727au.LJIIIZ("creation_id", LJ);
            c188727au.LJIIIZ("music_name", musicModel.getName());
            c188727au.LJI("shoot_way", LJFF);
            String str4 = xvg.LJIILIIL;
            if (str4 != null && !str4.isEmpty()) {
                c188727au.LJI("tab_name", xvg.LJIILIIL);
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL_SCAN) {
                c188727au.LJI("category_name", "device_upload");
            } else if (musicModel.getMusicType() == MusicModel.MusicType.VIDEO_EXTRACT) {
                c188727au.LJI("category_name", "video_upload");
            } else {
                c188727au.LJI("category_name", "upload");
            }
            if (!TextUtils.isEmpty(xvg.LJI)) {
                c188727au.LJI("tag_id", xvg.LJI);
            }
            if (!TextUtils.isEmpty(xvg.LJFF)) {
                c188727au.LJI("prop_id", xvg.LJFF);
            }
            if (!TextUtils.isEmpty(xvg.LJ)) {
                c188727au.LJI("category_id", xvg.LJ);
            }
            if (!TextUtils.isEmpty(xvg.LJIILJJIL)) {
                c188727au.LJI("token_type", xvg.LJIILJJIL);
            }
            LogPbBean logPbBean2 = xvg.LJIIIIZZ;
            if (logPbBean2 != null) {
                c188727au.LJFF(logPbBean2, "log_pb");
                if (!TextUtils.isEmpty(xvg.LJIIIIZZ.getImprId())) {
                    str3 = xvg.LJIIIIZZ.getImprId();
                    c188727au.LJI("music_request_id", str3);
                } else {
                    str3 = "";
                }
                c188727au.LJI("impr_id", str3);
            }
            Long videoLength = EditVideoInfoServiceImpl.LIZ().getVideoLength(LJ);
            if (videoLength != null) {
                str = videoLength.toString();
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("creation_duration", str);
            String editFrom = musicModel.getEditFrom();
            if (editFrom != null && !editFrom.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c188727au.LIZLLL(1, "is_edited_music");
                c188727au.LIZLLL(musicModel.getDuration(), "original_music_duration");
                c188727au.LIZLLL(LJI, "new_music_duration");
                c188727au.LJI("music_edited_from", musicModel.getEditFrom());
            } else {
                c188727au.LIZLLL(0, "is_edited_music");
            }
            LIZ(musicModel, c188727au);
            if (LIZLLL().booleanValue()) {
                c188727au.LJIIIZ("from_location", LJII);
                c188727au.LJIIIZ("type", LJIIIIZZ);
                c188727au.LIZLLL(1, "is_editor_pro");
            }
            c188727au.LJIIIIZZ(new H96().LJFF("is_commercial", "commercial_music_suggestion_id", "commercial_music_playlist_order"));
            if (LIZJ() && (num = xvg.LJIIL) != null) {
                c188727au.LJFF(num, "commercial_music_playlist_order");
            }
            if (musicModel.getMusicItemType() == musicItemType2) {
                c188727au.LJI("music_from", "favorite_recommend");
            }
            if (H92.LJ()) {
                c188727au.LJI("enter_from", "promote");
            }
            if (TextUtils.equals(xvg.LIZ, "search_music")) {
                if (musicModel.getCardType() == MusicModel.CardType.AWESearchMusicCardMusicWithVideo) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                Integer valueOf2 = Integer.valueOf(valueOf.booleanValue() ? 1 : 0);
                String awemeId = musicModel.getAwemeId();
                if (valueOf.booleanValue()) {
                    str2 = "music_with_video";
                } else {
                    str2 = "music";
                }
                int i3 = 0;
                if (!musicModel.isPgc() && musicModel.getMatchedSongInfo() != null && !TextUtils.isEmpty(musicModel.getMatchedSongInfo().getTitle())) {
                    i3 = 2;
                } else if (valueOf.booleanValue()) {
                    i3 = 1;
                }
                c188727au.LJI("search_keyword", LIZJ);
                c188727au.LJI("search_id", xvg.LJIIIZ);
                c188727au.LJI("search_result_id", musicModel.getMusicId());
                if (!TextUtils.isEmpty(musicModel.getSearchResultId())) {
                    c188727au.LJI("search_result_id", musicModel.getSearchResultId());
                }
                c188727au.LJI("log_pb", GsonProtectorUtils.toJson(new Gson(), logPbBean));
                c188727au.LJFF(valueOf2, "is_from_video");
                c188727au.LJI("token_type", str2);
                c188727au.LJI("group_id", awemeId);
                c188727au.LJFF(i3, "words_type");
                c188727au.LIZLLL(i, "rank");
                if (musicModel.getListItemId() != null && !TextUtils.isEmpty(musicModel.getListItemId())) {
                    c188727au.LJI("list_item_id", musicModel.getListItemId());
                }
                FMX.LJIILJJIL("add_music", C78963Uyt.LJJJJIZL(c188727au.LIZ));
                return;
            }
            c188727au.LIZLLL(MusicService.LJJLIIIJJI().LJIJI(), "music_rec_type");
            FMX.LJIIL("add_music", c188727au.LIZ);
        }
    }

    public static void LJII(boolean z, MusicModel musicModel, XVG xvg, int i, LogPbBean logPbBean) {
        String str;
        String str2;
        if (xvg == null) {
            return;
        }
        String str3 = null;
        if (musicModel != null) {
            str = musicModel.getMusicId();
            str3 = musicModel.getName();
        } else {
            str = null;
        }
        C188727au c188727au = new C188727au();
        String str4 = xvg.LIZIZ;
        if (musicModel != null) {
            if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
                i = musicModel.getEventPosition();
                str4 = "favorite_recommend";
            }
            if (musicModel.getEventPosition() != -1) {
                i = musicModel.getEventPosition();
            }
        }
        c188727au.LJIIIZ("enter_from", xvg.LIZ);
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("category_name", str4);
        c188727au.LJIIIZ("enter_method", xvg.LIZJ);
        c188727au.LJIIIZ("previous_page", xvg.LIZLLL);
        c188727au.LIZLLL(i, "order");
        c188727au.LJIIIZ("creation_id", LJ);
        c188727au.LJIIIZ("music_name", str3);
        c188727au.LJ(xvg.LJIIJJI, "max_shoot_time");
        c188727au.LJIIIIZZ(new H96().LJFF("is_commercial", "commercial_music_suggestion_id"));
        if (!TextUtils.isEmpty(xvg.LJ)) {
            c188727au.LJI("category_id", xvg.LJ);
        }
        if (!TextUtils.isEmpty(xvg.LJI)) {
            c188727au.LJI("tag_id", xvg.LJI);
        }
        if (!TextUtils.isEmpty(xvg.LJFF)) {
            c188727au.LJI("prop_id", xvg.LJFF);
        }
        LogPbBean logPbBean2 = xvg.LJIIIIZZ;
        if (logPbBean2 != null) {
            c188727au.LJFF(logPbBean2, "log_pb");
            if (!TextUtils.isEmpty(xvg.LJIIIIZZ.getImprId())) {
                str2 = xvg.LJIIIIZZ.getImprId();
            } else {
                str2 = "";
            }
            c188727au.LJI("impr_id", str2);
        }
        if (musicModel != null && musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            c188727au.LJI("music_from", "favorite_recommend");
        }
        String str5 = "favourite_song";
        if (TextUtils.equals(xvg.LIZ, "search_music")) {
            c188727au.LJI("search_keyword", LIZJ);
            c188727au.LJI("search_id", xvg.LJIIIZ);
            c188727au.LJI("search_result_id", str);
            c188727au.LJI("log_pb", GsonProtectorUtils.toJson(new Gson(), logPbBean));
            if (!z) {
                str5 = "cancel_favourite_song";
            }
            FMX.LJIILJJIL(str5, C78963Uyt.LJJJJIZL(c188727au.LIZ));
            return;
        }
        if (!z) {
            return;
        }
        FMX.LJIIL("favourite_song", c188727au.LIZ);
    }

    public static void LJIIIZ(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5) {
        C188727au c188727au = new C188727au();
        if (!TextUtils.isEmpty(str3)) {
            c188727au.LJI("banner_id", str3);
        }
        c188727au.LJIIIZ("category_name", str);
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("enter_from", str4);
        c188727au.LJI("creation_id", LJ);
        if (!TextUtils.isEmpty(str5)) {
            c188727au.LJI("category_id", str5);
        }
        if (LIZJ()) {
            c188727au.LJI("is_commercial", "1");
            if (num != null) {
                c188727au.LJFF(num, "csp_section_order");
            }
            if (num2 != null) {
                c188727au.LJFF(num2, "commercial_banner_order");
            }
        }
        FMX.LJIIL("enter_song_category", c188727au.LIZ);
    }

    public static void LJIIL(MusicShowOverChecker musicShowOverChecker, LifecycleOwner lifecycleOwner, final XVG xvg, final MusicModel musicModel, final int i, final boolean z, final boolean z2) {
        if (!z) {
            return;
        }
        AbstractC73672Svk.LJJIIJZLJL(new Callable() { // from class: X.XVE
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2;
                String str;
                XVG xvg2 = XVG.this;
                MusicModel musicModel2 = musicModel;
                int i3 = i;
                boolean z3 = z;
                boolean z4 = z2;
                if (z3) {
                    C188727au c188727au = new C188727au();
                    MusicModel.MusicItemType musicItemType = musicModel2.getMusicItemType();
                    MusicModel.MusicItemType musicItemType2 = MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC;
                    if (musicItemType == musicItemType2) {
                        i2 = musicModel2.getEventPosition();
                    } else {
                        i2 = i3;
                    }
                    if (musicModel2.getEventPosition() != -1) {
                        i2 = musicModel2.getEventPosition();
                    }
                    c188727au.LJIIIZ("enter_from", xvg2.LIZ);
                    c188727au.LJIIIZ("enter_method", xvg2.LIZJ);
                    c188727au.LJIIIZ("previous_page", xvg2.LIZLLL);
                    c188727au.LIZLLL(i2, "order");
                    c188727au.LJIIIZ("creation_id", XVF.LJ);
                    c188727au.LIZLLL(z4 ? 1 : 0, "ugc_to_pgc_meta");
                    c188727au.LJIIIZ("music_name", musicModel2.getName());
                    c188727au.LJIIIZ("tab_name", xvg2.LJIILIIL);
                    c188727au.LJIIIZ("music_name", musicModel2.getName());
                    c188727au.LJFF(musicModel2, "ai_recommend_tag");
                    c188727au.LJI("shoot_way", XVF.LJFF);
                    if (musicModel2.isLocalMusic()) {
                        c188727au.LJI("fake_music_id", musicModel2.getMusicId());
                        if (musicModel2.getMusicType() == MusicModel.MusicType.LOCAL_SCAN) {
                            c188727au.LJI("category_name", "device_upload");
                        } else if (musicModel2.getMusicType() == MusicModel.MusicType.VIDEO_EXTRACT) {
                            c188727au.LJI("category_name", "video_upload");
                        }
                    } else {
                        c188727au.LJI("music_id", musicModel2.getMusicId());
                        c188727au.LJI("category_name", "upload");
                    }
                    XVF.LIZ(musicModel2, c188727au);
                    if (!TextUtils.isEmpty(xvg2.LJ)) {
                        c188727au.LJI("category_id", xvg2.LJ);
                    }
                    if (!TextUtils.isEmpty(xvg2.LJI)) {
                        c188727au.LJI("tag_id", xvg2.LJI);
                    }
                    if (!TextUtils.isEmpty(xvg2.LJFF)) {
                        c188727au.LJI("prop_id", xvg2.LJFF);
                    }
                    LogPbBean logPbBean = xvg2.LJIIIIZZ;
                    if (logPbBean != null) {
                        c188727au.LJFF(logPbBean, "log_pb");
                        if (!TextUtils.isEmpty(xvg2.LJIIIIZZ.getImprId())) {
                            str = xvg2.LJIIIIZZ.getImprId();
                        } else {
                            str = "";
                        }
                        c188727au.LJI("music_request_id", str);
                        c188727au.LJI("impr_id", str);
                    }
                    if (XVF.LIZLLL().booleanValue()) {
                        c188727au.LJIIIZ("from_location", XVF.LJII);
                        c188727au.LJIIIZ("type", XVF.LJIIIIZZ);
                        c188727au.LIZLLL(1, "is_editor_pro");
                    }
                    if (XVF.LIZJ()) {
                        c188727au.LIZLLL(i3, "commercial_music_order");
                    }
                    if (H92.LJ()) {
                        c188727au.LJI("enter_from", "promote");
                    }
                    c188727au.LJIIIIZZ(new H96().LJFF("is_commercial", "commercial_music_suggestion_id"));
                    c188727au.LIZLLL(MusicService.LJJLIIIJJI().LJIJI(), "music_rec_type");
                    if (musicModel2.getMusicItemType() == musicItemType2) {
                        c188727au.LJI("music_from", "favorite_recommend");
                    }
                    FMX.LJIIL("show_music", c188727au.LIZ);
                }
                return Boolean.TRUE;
            }
        }).LJJL(T16.LIZ()).LJJJJZ();
        musicShowOverChecker.LIZLLL(lifecycleOwner);
    }
}
