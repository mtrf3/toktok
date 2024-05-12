package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Oex, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62439Oex {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(Aweme aweme, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        OSZ osz;
        int i6;
        int i7;
        int i8;
        int i9;
        OSZ[] oszArr = new OSZ[28];
        if (MixFeedService.LJJIJIIJIL().LJJIIZI(aweme) && C80S.LJI(aweme)) {
            i = R.raw.icon_2pt_playlist_fill;
        } else {
            i = R.raw.icon_2pt_playlist;
        }
        oszArr[0] = new OSZ("play_list", new AT1(i, R.raw.icon_playlist_fill, 4, 0));
        oszArr[1] = new OSZ("ad_personalization_new", new AT1(R.raw.icon_2pt_question_mark_circle_ltr, R.raw.icon_question_mark_circle_fill_ltr, 4, 0));
        oszArr[2] = new OSZ("report", new AT1(R.raw.icon_2pt_flag, R.raw.icon_flag_fill, 4, 0));
        oszArr[3] = new OSZ("unfollow", new AT1(R.raw.icon_2pt_person_x_mark, R.raw.icon_2pt_person_x_mark, 4, 0));
        oszArr[4] = new OSZ("dislike", new AT1(R.raw.icon_2pt_broken_heart, R.raw.icon_heart_broken_fill, 4, 0));
        oszArr[5] = new OSZ("bc_remove_tag", new AT1(R.raw.icon_2pt_block, R.raw.icon_block_fill, 4, 0));
        oszArr[6] = new OSZ("bc_view_insights", new AT1(R.raw.icon_2pt_line_chart, R.raw.icon_line_chart_fill, 4, 0));
        oszArr[7] = new OSZ("save", new AT1(R.raw.icon_2pt_arrow_to_bottom, R.raw.icon_arrow_down_to_line_bold, 4, 0));
        oszArr[8] = new OSZ("save_photo", new AT1(R.raw.icon_2pt_arrow_to_bottom, R.raw.icon_arrow_down_to_line_bold, 4, 0));
        oszArr[9] = new OSZ("now_save", new AT1(R.raw.icon_2pt_arrow_to_bottom, R.raw.icon_arrow_down_to_line_bold, 4, 0));
        oszArr[10] = new OSZ("following_feed_0_following", new AT1(R.raw.icon_personalization, R.raw.icon_personalization_fill, 4, 0));
        int i10 = R.raw.icon_2pt_bookmark;
        if (aweme != null && aweme.isCollected()) {
            i10 = R.raw.icon_2pt_bookmark_fill;
        }
        oszArr[11] = new OSZ("favorite", new AT1(i10, R.raw.icon_bookmark_fill, C62519OgF.LIZ(aweme)));
        if (C223258pV.LIZ()) {
            i2 = R.raw.icon_auto_scroll;
        } else {
            i2 = R.raw.icon_auto_scroll_off;
        }
        if (C223258pV.LIZ()) {
            i3 = R.raw.icon_auto_scroll_fill;
        } else {
            i3 = R.raw.icon_auto_scroll_off_fill;
        }
        oszArr[12] = new OSZ("auto_scroll", new AT1(i2, i3, 4, 0));
        oszArr[13] = new OSZ("duet", new AT1(R.raw.icon_2pt_duet, R.raw.icon_duet_fill, 4, 0));
        oszArr[14] = new OSZ("stitch", new AT1(R.raw.icon_2pt_stitch, R.raw.icon_stitch_fill, 4, 0));
        oszArr[15] = new OSZ("create_sticker", new AT1(R.raw.icon_2pt_rectangle_smile_face_plus, R.raw.icon_sticker_plus_fill, 4, 0));
        oszArr[16] = new OSZ("live_photo", new AT1(R.raw.icon_2pt_live_wallpaper, R.raw.icon_live_wallpaper_fill, 4, 0));
        oszArr[17] = new OSZ("gif", new AT1(R.raw.icon_2pt_gif, R.raw.icon_gif_fill, 4, 0));
        if (C2MX.LIZ().LIZ(str)) {
            i4 = R.raw.icon_2pt_slash_rectangle_x_mark;
        } else {
            i4 = R.raw.icon_2pt_slash_rectangle;
        }
        if (C2MX.LIZ().LIZ(str)) {
            i5 = R.raw.icon_doc_text_fill_ltr;
        } else {
            i5 = R.raw.icon_slash_rectangle_fill;
        }
        oszArr[18] = new OSZ("clear_mode", new AT1(i4, i5, 4, 0));
        if (C41032G8m.LIZ()) {
            osz = new OSZ("captions", new AT1(R.raw.icon_closed_captions_fill, R.raw.icon_closed_captions_fill, 4, 0));
        } else {
            osz = new OSZ("captions", new AT1(C62622Ohu.LIZIZ(null), C62622Ohu.LIZ(null), 4, 0));
        }
        oszArr[19] = osz;
        oszArr[20] = new OSZ("playback_speed", new AT1(R.raw.icon_2pt_speed, R.raw.icon_speed_meter_fill, 4, 0));
        oszArr[21] = new OSZ("campaign_detail", new AT1(R.raw.icon_2pt_shopping_bag_star, R.raw.icon_shopping_bag_star_fill, 4, 0));
        oszArr[22] = new OSZ("effect info action", new AT1(R.raw.icon_2pt_info_circle, R.raw.icon_info_circle_fill, 4, 0));
        oszArr[23] = new OSZ("playback_speed", new AT1(R.raw.icon_2pt_speed, R.raw.icon_speed_meter_fill, 4, 0));
        if (PipServiceImpl.LJJII().LJIIZILJ()) {
            i6 = R.raw.icon_rectangle_rectangle_1_ltr;
        } else {
            i6 = R.raw.icon_rectangle_rectangle_ltr;
        }
        if (PipServiceImpl.LJJII().LJIIZILJ()) {
            i7 = R.raw.icon_rectangle_rectangle_fill_1_ltr;
        } else {
            i7 = R.raw.icon_rectangle_rectangle_fill_ltr;
        }
        oszArr[24] = new OSZ("picture_in_picture", new AT1(i6, i7, 4, 0));
        C62623Ohv c62623Ohv = C62623Ohv.LIZIZ;
        if (c62623Ohv.LJII()) {
            i8 = R.raw.icon_danmu_slash;
        } else {
            i8 = R.raw.icon_danmu;
        }
        if (c62623Ohv.LJII()) {
            i9 = R.raw.icon_danmu_slash_fill;
        } else {
            i9 = R.raw.icon_danmu_fill;
        }
        oszArr[25] = new OSZ("danmaku", new AT1(i8, i9, 4, 0));
        oszArr[26] = new OSZ("share_to_story", new AT1(R.raw.icon_2pt_twinkle_star, R.raw.icon_twinkle_star_fill, 4, 0));
        oszArr[27] = new OSZ("manage_feed", new AT1(R.raw.icon_personalization, R.raw.icon_personalization_fill, 4, 0));
        return C113554cx.LJJL(oszArr);
    }
}
