package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8I implements XZO {
    public final VideoPublishEditModel LIZ;
    public final boolean LIZIZ;
    public long LIZJ;

    @Override // X.XZO
    public final void LJIIIIZZ(MusicModel musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
    }

    public static int LJIIL() {
        C78934UyQ.LJLIL.getMusicService().LJIL();
        new TCM();
        Integer LJIILLIIL = TCM.LJIILLIIL();
        if (LJIILLIIL != null) {
            return LJIILLIIL.intValue();
        }
        return 0;
    }

    @Override // X.XZO
    public final void LJIIJ() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.getCreationId());
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", this.LIZ.mShootWay);
        c145995oB.LJI("content_type", H7R.LJIIIZ(this.LIZ));
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(this.LIZ));
        String stickers = this.LIZ.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        c145995oB.LJI("prop_list", stickers);
        c145995oB.LIZ(this.LIZ.containBackgroundVideo ? 1 : 0, "is_gsv_prop");
        c145995oB.LIZJ(Float.valueOf(this.LIZ.voiceVolume), "volume");
        int i = this.LIZ.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        FMX.LJIIL("edit_volume", c145995oB.LIZ);
    }

    @Override // X.XZO
    public final void LIZLLL(boolean z) {
        String str;
        String str2;
        C145995oB c145995oB = new C145995oB();
        if (this.LIZ.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str = "promote";
        } else {
            str = this.LIZ.enterFrom;
        }
        c145995oB.LJI("enter_from", str);
        c145995oB.LJI("creation_id", this.LIZ.getCreationId());
        String stickers = this.LIZ.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        c145995oB.LJI("prop_list", stickers);
        c145995oB.LIZ(this.LIZ.containBackgroundVideo ? 1 : 0, "is_gsv_prop");
        c145995oB.LJI("shoot_way", this.LIZ.mShootWay);
        c145995oB.LJI("content_type", H7R.LJIIIZ(this.LIZ));
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(this.LIZ));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("status", str2);
        FMX.LJIIL("click_original_sound", c145995oB.LIZ);
    }

    @Override // X.XZO
    public final void LJI(String tabName) {
        String str;
        o.LJIIIZ(tabName, "tabName");
        C145995oB LJJJLIIL = H8F.LJJJLIIL(this.LIZ);
        if (this.LIZ.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str = "promote";
        } else {
            str = "video_edit_page";
        }
        LJJJLIIL.LJI("enter_from", str);
        LJJJLIIL.LJI("shoot_way", this.LIZ.mShootWay);
        LJJJLIIL.LJI("creation_id", this.LIZ.getCreationId());
        LJJJLIIL.LJI("tab_name", tabName);
        FMX.LJIIL("music_panel_drag_up", LJJJLIIL.LIZ);
    }

    @Override // X.XZO
    public final void LJII(boolean z) {
        if (this.LIZJ > 0) {
            VideoPublishEditModel videoPublishEditModel = this.LIZ;
            long currentTimeMillis = System.currentTimeMillis() - this.LIZJ;
            C145995oB LIZ = C279017q.LIZ(videoPublishEditModel, "model");
            LIZ.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
            LIZ.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
            Q8U.LIZJ(LIZ, "shoot_way", videoPublishEditModel.mShootWay, videoPublishEditModel, "creation_id");
            LIZ.LIZ(!z ? 1 : 0, "status");
            LIZ.LIZIZ(currentTimeMillis, "duration");
            FMX.LJIIL("ai_recommend_panel_music_show_duration", LIZ.LIZ);
            this.LIZJ = -1L;
        }
    }

    @Override // X.XZO
    public final void LJIIJJI(String tabName) {
        String str;
        o.LJIIIZ(tabName, "tabName");
        C145995oB LJJJLIIL = H8F.LJJJLIIL(this.LIZ);
        if (this.LIZ.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str = "promote";
        } else {
            str = "video_edit_page";
        }
        LJJJLIIL.LJI("enter_from", str);
        LJJJLIIL.LJI("shoot_way", this.LIZ.mShootWay);
        LJJJLIIL.LJI("creation_id", this.LIZ.getCreationId());
        LJJJLIIL.LJI("tab_name", tabName);
        FMX.LJIIL("music_panel_slide", LJJJLIIL.LIZ);
    }

    @Override // X.XZO
    public final void LIZ(String tabName, boolean z) {
        String str;
        o.LJIIIZ(tabName, "tabName");
        VideoPublishEditModel model = this.LIZ;
        boolean z2 = this.LIZIZ;
        o.LJIIIZ(model, "model");
        C145995oB LJJJLIIL = H8F.LJJJLIIL(model);
        if (model.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str = "promote";
        } else {
            str = "video_edit_page";
        }
        LJJJLIIL.LJI("enter_from", str);
        LJJJLIIL.LJI("shoot_way", model.mShootWay);
        LJJJLIIL.LIZ(z2 ? 1 : 0, "is_editor_pro");
        LJJJLIIL.LIZ(model.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(model));
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(model));
        String stickers = model.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        LJJJLIIL.LJI("prop_list", stickers);
        LJJJLIIL.LIZ(model.containBackgroundVideo ? 1 : 0, "is_gsv_prop");
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        LJJJLIIL.LJI("tab_name", tabName);
        LJJJLIIL.LJI("shoot_tab_name", H7R.LJJ(model));
        LJJJLIIL.LIZ(z ? 1 : 0, "is_slide");
        FMX.LJIIL("enter_music_tab", LJJJLIIL.LIZ);
    }

    public H8I(VideoPublishEditModel model, ActivityC45651qj activity, boolean z) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(activity, "activity");
        this.LIZ = model;
        this.LIZIZ = z;
        this.LIZJ = System.currentTimeMillis();
    }

    @Override // X.XZO
    public final void LJ(MusicModel musicModel, String str, String str2) {
        String LJIIIIZZ;
        String str3;
        String str4;
        Integer similarTag;
        VideoPublishEditModel model = this.LIZ;
        int LJIIL = LJIIL();
        o.LJIIIZ(model, "model");
        C145995oB LJJJLIIL = H8F.LJJJLIIL(model);
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        String str5 = "replace_music";
        if (C44384HbQ.LJLLLLLL(model)) {
            LJIIIIZZ = "replace_music";
        } else {
            LJIIIIZZ = H7R.LJIIIIZZ(model);
        }
        LJJJLIIL.LJI("content_source", LJIIIIZZ);
        if (!C44384HbQ.LJLLLLLL(model)) {
            str5 = H7R.LJIIIZ(model);
        }
        LJJJLIIL.LJI("content_type", str5);
        LJJJLIIL.LJI("shoot_way", model.mShootWay);
        String stickers = model.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        LJJJLIIL.LJI("prop_list", stickers);
        LJJJLIIL.LIZ(model.containBackgroundVideo ? 1 : 0, "is_gsv_prop");
        LJJJLIIL.LJI("music_id", model.getMusicId());
        LJJJLIIL.LJI("replace_music_content_type", H8F.LJ(model));
        LJJJLIIL.LIZ(LJIIL, "music_rec_type");
        int i = 0;
        LJJJLIIL.LIZ(0, "can_music_loop");
        LJJJLIIL.LJI("enter_method", "music_panel");
        if (model.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str3 = "promote";
        } else {
            str3 = "video_edit_page";
        }
        LJJJLIIL.LJI("enter_from", str3);
        Boolean LIZLLL = XVF.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "isEditorPro()");
        if (LIZLLL.booleanValue()) {
            LJJJLIIL.LIZ(1, "is_editor_pro");
        } else {
            LJJJLIIL.LIZ(0, "is_editor_pro");
        }
        if (C44384HbQ.LJLLLLLL(model)) {
            if (musicModel != null && (similarTag = musicModel.getSimilarTag()) != null && similarTag.intValue() > 0) {
                i = 1;
            }
            LJJJLIIL.LIZ(i, "is_similar_music");
        }
        if (C78685UuP.LJJJZ(str)) {
            LJJJLIIL.LIZLLL("tab_name", str);
        }
        if (C78685UuP.LJJJZ(str2)) {
            LJJJLIIL.LIZLLL("music_recent_type", str2);
        }
        if (C44384HbQ.LJLLLLLL(model)) {
            str4 = "edit_music_replace";
        } else {
            str4 = "edit_music";
        }
        FMX.LJIIL(str4, LJJJLIIL.LIZ);
    }

    @Override // X.XZO
    public final void LJFF(int i, MusicModel musicModel, String tabName, String str) {
        int i2;
        String str2;
        String str3;
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(tabName, "tabName");
        int i3 = 1;
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            i2 = musicModel.getEventPosition();
        } else {
            i2 = i + 1;
        }
        VideoPublishEditModel model = this.LIZ;
        String musicId = musicModel.getMusicId();
        String str4 = "";
        if (musicId == null) {
            musicId = "";
        }
        Integer similarTag = musicModel.getSimilarTag();
        o.LJIIIIZZ(similarTag, "musicModel.similarTag");
        int intValue = similarTag.intValue();
        o.LJIIIZ(model, "model");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", model.getCreationId());
        FlowDataMusicInfo flowDataMusicInfo = model.creativeFlowData.getFlowDataMusicInfo();
        if (flowDataMusicInfo != null && flowDataMusicInfo.isSelectedByAuto()) {
            str2 = "auto";
        } else {
            str2 = "manual";
        }
        c145995oB.LJI("music_selected_method", str2);
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(model));
        c145995oB.LJI("content_type", H7R.LJIIIZ(model));
        c145995oB.LJI("tab_name", tabName);
        String stickers = model.getStickers();
        if (stickers != null) {
            str4 = stickers;
        }
        c145995oB.LJI("prop_list", str4);
        c145995oB.LIZ(model.containBackgroundVideo ? 1 : 0, "is_gsv_prop");
        c145995oB.LJI("replace_music_content_type", H8F.LJ(model));
        c145995oB.LJI("shoot_way", model.mShootWay);
        c145995oB.LJI("music_id", musicId);
        c145995oB.LJI("enter_method", "music_panel");
        c145995oB.LIZ(i2, "music_show_rank");
        H8F.LIZJ(model, c145995oB);
        if (C44384HbQ.LJLLLLLL(model)) {
            if (intValue <= 0) {
                i3 = 0;
            }
            c145995oB.LIZ(i3, "is_similar_music");
            if (model.mShootWay.equals("change_ban_music")) {
                c145995oB.LIZLLL("content_type", "replace_music");
                c145995oB.LIZLLL("content_source", "replace_music");
            }
            boolean LJIIL = C42000Ge4.LJIIL(model);
            H8F.LIZ(LJIIL ? 1 : 0, model.shootEnterMethod, model.replaceMusicModel.getAid(), c145995oB);
        }
        if (C78685UuP.LJJJZ(str)) {
            c145995oB.LIZLLL("music_recent_type", str);
        }
        if (C44384HbQ.LJLLLLLL(model)) {
            str3 = "unselect_music_replace";
        } else {
            str3 = "unselect_music";
        }
        FMX.LJIIL(str3, c145995oB.LIZ);
    }

    @Override // X.XZO
    public final void LJIIIZ(boolean z, MusicModel musicModel, String tabName, String str) {
        String str2;
        String str3;
        String str4;
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(tabName, "tabName");
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            str2 = "favorite_recommend";
        } else {
            str2 = null;
        }
        String musicId = musicModel.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        int LJIIL = LJIIL();
        VideoPublishEditModel model = this.LIZ;
        boolean z2 = this.LIZIZ;
        o.LJIIIZ(model, "model");
        boolean LJLLLLLL = C44384HbQ.LJLLLLLL(model);
        if (!LJLLLLLL) {
            if (z) {
                str3 = "favourite_song";
            } else {
                str3 = "cancel_favourite_song";
            }
        } else if (LJLLLLLL) {
            if (z) {
                str3 = "favourite_song_replace";
            } else {
                str3 = "cancel_favourite_song_replace";
            }
        } else {
            throw new C162476Zf();
        }
        C145995oB LJJJLIIL = H8F.LJJJLIIL(model);
        LJJJLIIL.LJI("music_id", musicId);
        if (model.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str4 = "promote";
        } else {
            str4 = "video_edit_page";
        }
        LJJJLIIL.LJI("enter_from", str4);
        LJJJLIIL.LJI("mix_type", H8F.LJIIJ(model));
        LJJJLIIL.LIZ(LJIIL, "music_rec_type");
        LJJJLIIL.LIZ(z2 ? 1 : 0, "is_editor_pro");
        LJJJLIIL.LJI("shoot_way", model.mShootWay);
        LJJJLIIL.LJI("replace_music_content_type", H8F.LJ(model));
        String stickers = model.getStickers();
        if (stickers == null) {
            stickers = "";
        }
        LJJJLIIL.LJI("prop_list", stickers);
        LJJJLIIL.LIZ(model.containBackgroundVideo ? 1 : 0, "is_gsv_prop");
        LJJJLIIL.LJI("creation_id", model.getCreationId());
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(model));
        LJJJLIIL.LJI("shoot_entrance", C147065pu.LIZ(model, "shoot_entrance"));
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(model));
        LJJJLIIL.LJI("enter_method", "");
        if (str2 != null) {
            LJJJLIIL.LIZLLL("music_from", str2);
        }
        if (C44384HbQ.LJLLLLLL(model)) {
            if (model.mShootWay.equals("change_ban_music")) {
                LJJJLIIL.LIZLLL("content_type", "replace_music");
                LJJJLIIL.LIZLLL("content_source", "replace_music");
            }
            boolean LJIIL2 = C42000Ge4.LJIIL(model);
            H8F.LIZ(LJIIL2 ? 1 : 0, model.shootEnterMethod, model.replaceMusicModel.getAid(), LJJJLIIL);
        }
        if (C78685UuP.LJJJZ(tabName)) {
            LJJJLIIL.LIZLLL("tab_name", tabName);
        }
        if (C78685UuP.LJJJZ(str)) {
            LJJJLIIL.LIZLLL("music_recent_type", str);
        }
        FMX.LJIIL(str3, LJJJLIIL.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01df  */
    @Override // X.XZO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r20, java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8I.LIZJ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209  */
    @Override // X.XZO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r18, int r19, java.lang.String r20, boolean r21, boolean r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8I.LIZIZ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, int, java.lang.String, boolean, boolean, java.lang.String):void");
    }
}
