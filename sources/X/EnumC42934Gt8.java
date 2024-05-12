package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gt8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC42934Gt8 {
    NO_TYPE(-1, "no type"),
    WIKIPEDIA(0, "wikipedia"),
    WIKIHOW(1, "wikihow"),
    SHOP(3, "shop"),
    ARTICLE(5, "article"),
    ANCHOR_SHOP_LINK(6, "product"),
    YELP(8, "yelp"),
    TRIP_ADVISOR(9, "trip_advisor"),
    UG(12, "ug"),
    OPEN_PLATFORM_ANCHOR(15, "openplatform"),
    MIXED_VIDEO(16, "mix video"),
    INDIA_MOVIE(18, "india movie"),
    DONATION_STICKER(19, "donation"),
    TIKTOK_GAME(24, "Game"),
    VIA_MAKER(26, "VIAMAKER"),
    PROP(28, "prop"),
    PROP_COMMERCIAL_EFFECT(-28, "prop"),
    MV_TEMPLATE(29, "template"),
    GREEN_SCREEN(30, "green screen"),
    PHOTO_MV_ANCHOR(31, "photo mv"),
    NEWS(32, "news"),
    ANCHOR_SHOP_WINDOW(33, "product"),
    WIKI_ON_EDIT(34, "wiki on edit"),
    ANCHOR_SHOP_MIX(35, "product"),
    QUIZLET(36, "quizlet"),
    DUET(37, "duet"),
    ANCHOR_BREATHWRK(38, "breathwrk"),
    WHISK(39, "whisk"),
    SHOUTOUT(40, "shoutout"),
    LIVE_EVENT(41, "live event"),
    TABELOG(43, "tabelog"),
    THIRD_PART_GENERAL(44, "third part general"),
    POI(45, "poi"),
    TTCM(46, "ttcm"),
    ANCHOR_LIBRARY(49, "library_material"),
    VERTICAL_SOLUTION_GAME(51, "ext_game"),
    MUSIC_DSP(52, "music dsp"),
    UG_PICK(53, "ug_pick_resso"),
    CAPCUT(54, "capcut"),
    TTS_VOICE(50, "tts voice"),
    MUSIC_DSP_PLAY_FULL_SONG(52, "music dsp"),
    PAID_COLLECTION(55, "paid collection"),
    GET_LEADS(56, "get leads"),
    ANCHOR_BOOKTOK(57, "book"),
    ADS_ANCHOR(58, "ads"),
    ANCHOR_TCM_COMMENT(59, "tcm_comment"),
    ANCHOR_SOUND_SYNC(60, "use_sound_sync"),
    ANCHOR_MOVIETOK(61, "movie"),
    COMMON_TYPE(-100, "common"),
    AD_PHOTO_CAROUSEL_ANCHOR(62, "ad photo carousel"),
    MUSIC_NEW_RELEASE(63, "music_new_release"),
    ANCHOR_EDIT_EFFECT(64, "edit_effect"),
    ANCHOR_UGC_TEMPLATE(65, "ugc_template"),
    ANCHOR_AUTO_CUT(66, "auto_cut"),
    ANCHOR_EDITOR_PRO(67, "editor_pro"),
    MUSIC_PLAYLIST(68, "music playlist"),
    ANCHOR_TICKETMASTER(69, "ticket_master"),
    ANCHOR_AIGC_AVATAR(70, "Create AI vatars"),
    ANCHOR_VOICECONVERSION(72, "voice_conversion"),
    ARTICLE_PHOTO_MODE(73, "TT_ARTICLE"),
    ANCHOR_PUGC_TEMPLATE(78, "pugc_template"),
    HYPIC_ANCHOR(74, "Hypic"),
    LEMON8_ANCHOR(77, "Lemon8"),
    LEMON8_GENERAL_ANCHOR(75, "Lemon8"),
    BA_PRODUCT_ANCHOR(76, "ba_product_anchor");

    public int LJLIL;
    public String LJLILLLLZI;

    public static EnumC42934Gt8 valueOf(String str) {
        return (EnumC42934Gt8) V0N.LJJJ(EnumC42934Gt8.class, str);
    }

    public final int getTYPE() {
        return this.LJLIL;
    }

    public final String getTYPENAME() {
        return this.LJLILLLLZI;
    }

    public final void setTYPE(int i) {
        this.LJLIL = i;
    }

    public final void setTYPENAME(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    EnumC42934Gt8(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
