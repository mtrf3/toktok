package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RCZ extends Message<RCZ, C69316RIi> {
    public static final ProtoAdapter<RCZ> ADAPTER = new C69152RCa();
    public RMW GroupIdList;
    public C69213REj acl_info;
    public RHL activity;
    public REM activity_pendant;
    public Integer ad_aweme_source;
    public Integer ad_link_type;
    public String ad_order_id;
    public String ad_schedule;
    public RGR ad_story_video;
    public RMZ add_yours_recommendation;
    public C69156RCe added_sound_music_info;
    public C69456RNs aigc_info;
    public Boolean allow_gift;
    public Boolean allow_reuse_original_sound;
    public RG4 anchor;
    public C69243RFn anchor_info;
    public List<RDH> anchors;
    public String anchors_extras;
    public C69263RGh animated_btn;
    public C69472ROi animated_image_info;
    public RGC audio;
    public C69154RCc author;
    public Long author_user_id;
    public C69213REj aweme_acl;
    public RH2 aweme_control;
    public String aweme_id;
    public Integer aweme_type;
    public C69279RGx banner_tip;
    public List<RP6> banners;
    public String batch_id;
    public Integer batch_index;
    public Integer bodydance_score;
    public RMN boost_tag_info;
    public C69372RKm bottom_bar;
    public List<C69154RCc> branded_content_accounts;
    public C69375RKp card;
    public RFH cell_room;
    public List<C69160RCi> cha_list;
    public List<RHN> challenge_position;
    public String city;
    public Boolean cmt_swt;
    public RGT cny_info;
    public Integer collect_stat;
    public RG6 comment_config;
    public ROQ comment_post_video;
    public List<RHY> commerce_config_data;
    public C69185RDh commerce_info;
    public C69423RMl commerce_rerank_info;
    public RGV commerce_sticker_info;
    public String commercial_video_info;
    public String content_desc;
    public List<C69204REa> content_desc_extra;
    public Integer content_original_type;
    public Integer content_size_type;
    public String content_type;
    public Long create_time;
    public Integer deduplication_type;
    public String desc;
    public String desc_language;
    public RMT descendants;
    public Boolean disable_search_trending_bar;
    public String distance;
    public Integer distribute_type;
    public C69245RFp dou_discount_mix_info;
    public C69414RMc duet_info;
    public Integer duration;
    public RKQ edit_post_permission;
    public Boolean enable_ad_drop;
    public Boolean enable_pos_adjust;
    public Boolean enable_top_view;
    public String extra;
    public String extra_info;
    public C69262RGg fake_landscape_video_info;
    public RG9 feed_relation_label;
    public Boolean filter_stranger_comments;
    public Boolean filter_unfriendly_user_comments;
    public RFU floating_card_content;
    public String follow_up_first_item_id;
    public String follow_up_item_id_groups;
    public Long follow_up_publish_from_id;
    public String forward_comment_id;
    public RCZ forward_item;
    public String forward_item_id;
    public RN3 game_info;
    public List<Integer> gap_list;
    public List<String> geofencing;
    public List<String> geofencing_regions;
    public REM gesture_red_packet;
    public List<RGY> green_screen_materials;
    public String group_id;
    public Boolean has_danmaku;
    public Integer has_promote_entry;
    public Boolean has_vs_entry;
    public C69245RFp hot_info;
    public RGO hot_list;
    public List<RGW> hybrid_label;
    public List<C69267RGl> image_infos;
    public RFQ image_post_info;
    public RG2 interact_permission;
    public List<RD8> interaction_stickers;
    public RG8 interaction_tag_info;
    public Boolean is_ads;
    public Boolean is_client_cache;
    public Boolean is_comment_post_video;
    public Boolean is_description_translatable;
    public Integer is_effect_designer;
    public Boolean is_familiar;
    public Integer is_hash_tag;
    public Boolean is_horizontal;
    public Boolean is_nff_or_nr;
    public Boolean is_pgcshow;
    public Boolean is_relieve;
    public Integer is_story;
    public Boolean is_story_to_normal;
    public Boolean is_sub_only_video;
    public Boolean is_text_sticker_translatable;
    public Boolean is_tiktok_story;
    public Integer is_top;
    public Boolean is_vr;
    public Integer item_comment_settings;
    public String item_distribute_source;
    public Integer item_duet;
    public Integer item_react;
    public Integer item_source_category;
    public Integer item_stitch;
    public REV label_friend;
    public REV label_large;
    public REV label_music_starter;
    public String label_music_starter_text;
    public REV label_origin_author;
    public REV label_private;
    public REV label_thumb;
    public REV label_top;
    public List<RH6> label_top_text;
    public String landing_page;
    public String link_ad_data;
    public RGD link_match;
    public String live_reason;
    public List<RG3> long_video;
    public String main_arch_common;
    public C69242RFm mask_info;
    public List<C69242RFm> mask_infos;
    public RFJ micro_app_info;
    public String misc_info;
    public C69228REy mix_info;
    public C69156RCe music;
    public Integer music_begin_time_in_ms;
    public C69251RFv music_dsp_info;
    public Integer music_end_time_in_ms;
    public String music_selected_from;
    public Integer music_title_style;
    public String music_volume;
    public RHS mutual_relation;
    public RHS mutual_relation_tmp;
    public C69420RMi nearby_info;
    public Boolean need_vs_entry;
    public List<RHN> nickname_position;
    public C69167RCp now_posts;
    public String open_platform_name;
    public List<RHF> operator_boost_info;
    public List<String> origin_comment_ids;
    public String origin_volume;
    public C69256RGa original_client_text;
    public Float parameterized_speed;
    public String part_n;
    public List<C69154RCc> picked_users;
    public Boolean playlist_blocked;
    public RKU playlist_info;
    public RCZ podcast_full_episode_item;
    public RDU podcast_info;
    public REN poi_data;
    public List<RHN> position;
    public String pre_forward_id;
    public Integer pred_playtime;
    public C69244RFo preload;
    public Boolean prevent_download;
    public C69260RGe promote;
    public String promote_toast;
    public String promote_toast_key;
    public List<RGX> question_list;
    public Integer rate;
    public String raw_ad_data;
    public C69276RGu real_survey_info;
    public RFX rec_reason;
    public List<String> reference_tts_voice_ids;
    public List<String> reference_voice_filter_ids;
    public String region;
    public C69387RLb related_live;
    public RH5 relation_recommend_info;
    public Integer retry_type;
    public RGK risk_infos;
    public C69199RDv share_info;
    public Integer share_story_status;
    public RN0 share_to_story_info;
    public String share_url;
    public String shoot_tab_name;
    public Boolean should_add_creator_tts_watermark_when_downloading;
    public Boolean show_sticker_guide;
    public String simple_promotions;
    public String simple_shop_seeding;
    public String sort_label;
    public Integer sound_exemption;
    public RGZ sp_sticker;
    public ROW standard_component_info;
    public RPY star_atlas_info;
    public Long star_atlas_order_id;
    public String star_recommend_tag;
    public C69234RFe statistics;
    public RE3 status;
    public RD1 sticker_detail;
    public String stickers;
    public C69497RPh stitch;
    public C69469ROf stitch_permission;
    public RGJ story_metadata;
    public Integer story_ttl;
    public Integer story_type;
    public C69264RGi suggest_words;
    public Boolean support_danmaku;
    public List<C69276RGu> survey_info;
    public String survey_key;
    public String take_down_desc;
    public Integer take_down_reason;
    public List<C69204REa> text_extra;
    public String text_sticker_major_lang;
    public String trans_params;
    public RGI trending_bar;
    public RGH trending_bar_fyp;
    public C69265RGj ttec_suggest_words;
    public C69281RGz ttm_info;
    public List<String> tts_voice_ids;
    public Integer ttt_product_recall_type;
    public List<RHN> uniqid_position;
    public C69453RNp upvote_preload;
    public RFR upvote_reason;
    public Integer user_digged;
    public C69396RLk user_profile_init_info;
    public REC user_story;
    public C69159RCh video;
    public C69235RFf video_control;
    public String video_feed_tag;
    public List<RH9> video_labels;
    public C69254RFy video_reply_info;
    public List<RH6> video_text;
    public List<String> voice_filter_ids;
    public C69466ROc vpa_info;
    public RP3 vs_entry;
    public Boolean with_promotional_music;
    public Boolean with_survey;
    public Boolean without_watermark;

    public RCZ() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.cha_list = C63685Oz3.LJIIIIZZ();
        this.text_extra = C63685Oz3.LJIIIIZZ();
        this.video_labels = C63685Oz3.LJIIIIZZ();
        this.image_infos = C63685Oz3.LJIIIIZZ();
        this.position = C63685Oz3.LJIIIIZZ();
        this.uniqid_position = C63685Oz3.LJIIIIZZ();
        this.geofencing = C63685Oz3.LJIIIIZZ();
        this.video_text = C63685Oz3.LJIIIIZZ();
        this.label_top_text = C63685Oz3.LJIIIIZZ();
        this.nickname_position = C63685Oz3.LJIIIIZZ();
        this.challenge_position = C63685Oz3.LJIIIIZZ();
        this.long_video = C63685Oz3.LJIIIIZZ();
        this.interaction_stickers = C63685Oz3.LJIIIIZZ();
        this.origin_comment_ids = C63685Oz3.LJIIIIZZ();
        this.commerce_config_data = C63685Oz3.LJIIIIZZ();
        this.anchors = C63685Oz3.LJIIIIZZ();
        this.hybrid_label = C63685Oz3.LJIIIIZZ();
        this.geofencing_regions = C63685Oz3.LJIIIIZZ();
        this.mask_infos = C63685Oz3.LJIIIIZZ();
        this.green_screen_materials = C63685Oz3.LJIIIIZZ();
        this.question_list = C63685Oz3.LJIIIIZZ();
        this.content_desc_extra = C63685Oz3.LJIIIIZZ();
        this.gap_list = C63685Oz3.LJIIIIZZ();
        this.branded_content_accounts = C63685Oz3.LJIIIIZZ();
        this.tts_voice_ids = C63685Oz3.LJIIIIZZ();
        this.reference_tts_voice_ids = C63685Oz3.LJIIIIZZ();
        this.voice_filter_ids = C63685Oz3.LJIIIIZZ();
        this.reference_voice_filter_ids = C63685Oz3.LJIIIIZZ();
        this.survey_info = C63685Oz3.LJIIIIZZ();
        this.operator_boost_info = C63685Oz3.LJIIIIZZ();
        this.banners = C63685Oz3.LJIIIIZZ();
        this.picked_users = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RCZ, C69316RIi> newBuilder2() {
        return null;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i70;
        int i71;
        int i72;
        int i73;
        int i74;
        int i75;
        int i76;
        int i77;
        int i78;
        int i79;
        int i80;
        int i81;
        int i82;
        int i83;
        int i84;
        int i85;
        int i86;
        int i87;
        int i88;
        int i89;
        int i90;
        int i91;
        int i92;
        int i93;
        int i94;
        int i95;
        int i96;
        int i97;
        int i98;
        int i99;
        int i100;
        int i101;
        int i102;
        int i103;
        int i104;
        int i105;
        int i106;
        int i107;
        int i108;
        int i109;
        int i110;
        int i111;
        int i112;
        int i113;
        int i114;
        int i115;
        int i116;
        int i117;
        int i118;
        int i119;
        int i120;
        int i121;
        int i122;
        int i123;
        int i124;
        int i125;
        int i126;
        int i127;
        int i128;
        int i129;
        int i130;
        int i131;
        int i132;
        int i133;
        int i134;
        int i135;
        int i136;
        int i137;
        int i138;
        int i139;
        int i140;
        int i141;
        int i142;
        int i143;
        int i144;
        int i145;
        int i146;
        int i147;
        int i148;
        int i149;
        int i150;
        int i151;
        int i152;
        int i153;
        int i154;
        int i155;
        int i156;
        int i157;
        int i158;
        int i159;
        int i160;
        int i161;
        int i162;
        int i163;
        int i164;
        int i165;
        int i166;
        int i167;
        int i168;
        int i169;
        int i170;
        int i171;
        int i172;
        int i173;
        int i174;
        int i175;
        int i176;
        int i177;
        int i178;
        int i179;
        int i180;
        int i181;
        int i182;
        int i183;
        int i184;
        int i185;
        int i186;
        int i187;
        int i188;
        int i189;
        int i190;
        int i191;
        int i192;
        int i193;
        int i194;
        int i195;
        int i196;
        int i197;
        int i198;
        int i199;
        int i200;
        int i201;
        int i202;
        int i203;
        int i204;
        int i205;
        int i206;
        int i207;
        int i208;
        int i209;
        int i210;
        int i211;
        int i212;
        int i213;
        int i214;
        int i215;
        int i216;
        int i217 = this.hashCode;
        if (i217 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.aweme_id;
            int i218 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i219 = (hashCode + i) * 37;
            String str2 = this.desc;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i220 = (i219 + i2) * 37;
            Long l = this.create_time;
            if (l != null) {
                i3 = l.hashCode();
            } else {
                i3 = 0;
            }
            int i221 = (i220 + i3) * 37;
            C69154RCc c69154RCc = this.author;
            if (c69154RCc != null) {
                i4 = c69154RCc.hashCode();
            } else {
                i4 = 0;
            }
            int i222 = (i221 + i4) * 37;
            C69156RCe c69156RCe = this.music;
            if (c69156RCe != null) {
                i5 = c69156RCe.hashCode();
            } else {
                i5 = 0;
            }
            int LIZ = C77339UWx.LIZ(this.cha_list, (i222 + i5) * 37, 37);
            C69159RCh c69159RCh = this.video;
            if (c69159RCh != null) {
                i6 = c69159RCh.hashCode();
            } else {
                i6 = 0;
            }
            int i223 = (LIZ + i6) * 37;
            String str3 = this.share_url;
            if (str3 != null) {
                i7 = str3.hashCode();
            } else {
                i7 = 0;
            }
            int i224 = (i223 + i7) * 37;
            Integer num = this.user_digged;
            if (num != null) {
                i8 = num.hashCode();
            } else {
                i8 = 0;
            }
            int i225 = (i224 + i8) * 37;
            C69234RFe c69234RFe = this.statistics;
            if (c69234RFe != null) {
                i9 = c69234RFe.hashCode();
            } else {
                i9 = 0;
            }
            int i226 = (i225 + i9) * 37;
            RE3 re3 = this.status;
            if (re3 != null) {
                i10 = re3.hashCode();
            } else {
                i10 = 0;
            }
            int i227 = (i226 + i10) * 37;
            String str4 = this.extra;
            if (str4 != null) {
                i11 = str4.hashCode();
            } else {
                i11 = 0;
            }
            int i228 = (i227 + i11) * 37;
            Integer num2 = this.rate;
            if (num2 != null) {
                i12 = num2.hashCode();
            } else {
                i12 = 0;
            }
            int LIZ2 = C77339UWx.LIZ(this.text_extra, (i228 + i12) * 37, 37);
            REV rev = this.label_large;
            if (rev != null) {
                i13 = rev.hashCode();
            } else {
                i13 = 0;
            }
            int i229 = (LIZ2 + i13) * 37;
            REV rev2 = this.label_thumb;
            if (rev2 != null) {
                i14 = rev2.hashCode();
            } else {
                i14 = 0;
            }
            int i230 = (i229 + i14) * 37;
            Integer num3 = this.is_top;
            if (num3 != null) {
                i15 = num3.hashCode();
            } else {
                i15 = 0;
            }
            int i231 = (i230 + i15) * 37;
            REV rev3 = this.label_top;
            if (rev3 != null) {
                i16 = rev3.hashCode();
            } else {
                i16 = 0;
            }
            int i232 = (i231 + i16) * 37;
            C69199RDv c69199RDv = this.share_info;
            if (c69199RDv != null) {
                i17 = c69199RDv.hashCode();
            } else {
                i17 = 0;
            }
            int i233 = (i232 + i17) * 37;
            REV rev4 = this.label_origin_author;
            if (rev4 != null) {
                i18 = rev4.hashCode();
            } else {
                i18 = 0;
            }
            int i234 = (i233 + i18) * 37;
            String str5 = this.distance;
            if (str5 != null) {
                i19 = str5.hashCode();
            } else {
                i19 = 0;
            }
            int i235 = (i234 + i19) * 37;
            REV rev5 = this.label_music_starter;
            if (rev5 != null) {
                i20 = rev5.hashCode();
            } else {
                i20 = 0;
            }
            int i236 = (i235 + i20) * 37;
            REV rev6 = this.label_private;
            if (rev6 != null) {
                i21 = rev6.hashCode();
            } else {
                i21 = 0;
            }
            int LIZ3 = C77339UWx.LIZ(this.video_labels, (i236 + i21) * 37, 37);
            Boolean bool = this.is_vr;
            if (bool != null) {
                i22 = bool.hashCode();
            } else {
                i22 = 0;
            }
            int i237 = (LIZ3 + i22) * 37;
            String str6 = this.landing_page;
            if (str6 != null) {
                i23 = str6.hashCode();
            } else {
                i23 = 0;
            }
            int i238 = (i237 + i23) * 37;
            Boolean bool2 = this.is_ads;
            if (bool2 != null) {
                i24 = bool2.hashCode();
            } else {
                i24 = 0;
            }
            int i239 = (i238 + i24) * 37;
            Integer num4 = this.duration;
            if (num4 != null) {
                i25 = num4.hashCode();
            } else {
                i25 = 0;
            }
            int i240 = (i239 + i25) * 37;
            Integer num5 = this.aweme_type;
            if (num5 != null) {
                i26 = num5.hashCode();
            } else {
                i26 = 0;
            }
            int i241 = (i240 + i26) * 37;
            Boolean bool3 = this.cmt_swt;
            if (bool3 != null) {
                i27 = bool3.hashCode();
            } else {
                i27 = 0;
            }
            int LIZ4 = C77339UWx.LIZ(this.image_infos, (i241 + i27) * 37, 37);
            RGK rgk = this.risk_infos;
            if (rgk != null) {
                i28 = rgk.hashCode();
            } else {
                i28 = 0;
            }
            int i242 = (LIZ4 + i28) * 37;
            Boolean bool4 = this.is_relieve;
            if (bool4 != null) {
                i29 = bool4.hashCode();
            } else {
                i29 = 0;
            }
            int i243 = (i242 + i29) * 37;
            REV rev7 = this.label_friend;
            if (rev7 != null) {
                i30 = rev7.hashCode();
            } else {
                i30 = 0;
            }
            int i244 = (i243 + i30) * 37;
            String str7 = this.sort_label;
            if (str7 != null) {
                i31 = str7.hashCode();
            } else {
                i31 = 0;
            }
            int LIZ5 = C77339UWx.LIZ(this.uniqid_position, C77339UWx.LIZ(this.position, (i244 + i31) * 37, 37), 37);
            Long l2 = this.author_user_id;
            if (l2 != null) {
                i32 = l2.hashCode();
            } else {
                i32 = 0;
            }
            int i245 = (LIZ5 + i32) * 37;
            Integer num6 = this.bodydance_score;
            if (num6 != null) {
                i33 = num6.hashCode();
            } else {
                i33 = 0;
            }
            int LIZ6 = C77339UWx.LIZ(this.geofencing, (i245 + i33) * 37, 37);
            Integer num7 = this.is_hash_tag;
            if (num7 != null) {
                i34 = num7.hashCode();
            } else {
                i34 = 0;
            }
            int i246 = (LIZ6 + i34) * 37;
            Boolean bool5 = this.is_pgcshow;
            if (bool5 != null) {
                i35 = bool5.hashCode();
            } else {
                i35 = 0;
            }
            int i247 = (i246 + i35) * 37;
            String str8 = this.region;
            if (str8 != null) {
                i36 = str8.hashCode();
            } else {
                i36 = 0;
            }
            int LIZ7 = C77339UWx.LIZ(this.video_text, (i247 + i36) * 37, 37);
            RGZ rgz = this.sp_sticker;
            if (rgz != null) {
                i37 = rgz.hashCode();
            } else {
                i37 = 0;
            }
            int i248 = (LIZ7 + i37) * 37;
            String str9 = this.ad_schedule;
            if (str9 != null) {
                i38 = str9.hashCode();
            } else {
                i38 = 0;
            }
            int i249 = (i248 + i38) * 37;
            Integer num8 = this.collect_stat;
            if (num8 != null) {
                i39 = num8.hashCode();
            } else {
                i39 = 0;
            }
            int LIZ8 = C77339UWx.LIZ(this.label_top_text, (i249 + i39) * 37, 37);
            String str10 = this.stickers;
            if (str10 != null) {
                i40 = str10.hashCode();
            } else {
                i40 = 0;
            }
            int i250 = (LIZ8 + i40) * 37;
            RCZ rcz = this.forward_item;
            if (rcz != null) {
                i41 = rcz.hashCode();
            } else {
                i41 = 0;
            }
            int i251 = (i250 + i41) * 37;
            String str11 = this.forward_comment_id;
            if (str11 != null) {
                i42 = str11.hashCode();
            } else {
                i42 = 0;
            }
            int i252 = (i251 + i42) * 37;
            String str12 = this.forward_item_id;
            if (str12 != null) {
                i43 = str12.hashCode();
            } else {
                i43 = 0;
            }
            int i253 = (i252 + i43) * 37;
            String str13 = this.group_id;
            if (str13 != null) {
                i44 = str13.hashCode();
            } else {
                i44 = 0;
            }
            int i254 = (i253 + i44) * 37;
            String str14 = this.pre_forward_id;
            if (str14 != null) {
                i45 = str14.hashCode();
            } else {
                i45 = 0;
            }
            int i255 = (i254 + i45) * 37;
            Boolean bool6 = this.prevent_download;
            if (bool6 != null) {
                i46 = bool6.hashCode();
            } else {
                i46 = 0;
            }
            int LIZ9 = C77339UWx.LIZ(this.challenge_position, C77339UWx.LIZ(this.nickname_position, (i255 + i46) * 37, 37), 37);
            Integer num9 = this.item_comment_settings;
            if (num9 != null) {
                i47 = num9.hashCode();
            } else {
                i47 = 0;
            }
            int i256 = (LIZ9 + i47) * 37;
            RMT rmt = this.descendants;
            if (rmt != null) {
                i48 = rmt.hashCode();
            } else {
                i48 = 0;
            }
            int i257 = (i256 + i48) * 37;
            String str15 = this.raw_ad_data;
            if (str15 != null) {
                i49 = str15.hashCode();
            } else {
                i49 = 0;
            }
            int i258 = (i257 + i49) * 37;
            RN3 rn3 = this.game_info;
            if (rn3 != null) {
                i50 = rn3.hashCode();
            } else {
                i50 = 0;
            }
            int i259 = (i258 + i50) * 37;
            RFJ rfj = this.micro_app_info;
            if (rfj != null) {
                i51 = rfj.hashCode();
            } else {
                i51 = 0;
            }
            int i260 = (i259 + i51) * 37;
            Boolean bool7 = this.with_promotional_music;
            if (bool7 != null) {
                i52 = bool7.hashCode();
            } else {
                i52 = 0;
            }
            int i261 = (i260 + i52) * 37;
            String str16 = this.link_ad_data;
            if (str16 != null) {
                i53 = str16.hashCode();
            } else {
                i53 = 0;
            }
            int i262 = (i261 + i53) * 37;
            REM rem = this.gesture_red_packet;
            if (rem != null) {
                i54 = rem.hashCode();
            } else {
                i54 = 0;
            }
            int i263 = (i262 + i54) * 37;
            REM rem2 = this.activity_pendant;
            if (rem2 != null) {
                i55 = rem2.hashCode();
            } else {
                i55 = 0;
            }
            int i264 = (i263 + i55) * 37;
            RD1 rd1 = this.sticker_detail;
            if (rd1 != null) {
                i56 = rd1.hashCode();
            } else {
                i56 = 0;
            }
            int LIZ10 = C77339UWx.LIZ(this.long_video, (i264 + i56) * 37, 37);
            Integer num10 = this.item_duet;
            if (num10 != null) {
                i57 = num10.hashCode();
            } else {
                i57 = 0;
            }
            int i265 = (LIZ10 + i57) * 37;
            Integer num11 = this.item_react;
            if (num11 != null) {
                i58 = num11.hashCode();
            } else {
                i58 = 0;
            }
            int i266 = (i265 + i58) * 37;
            C69245RFp c69245RFp = this.hot_info;
            if (c69245RFp != null) {
                i59 = c69245RFp.hashCode();
            } else {
                i59 = 0;
            }
            int i267 = (i266 + i59) * 37;
            Long l3 = this.star_atlas_order_id;
            if (l3 != null) {
                i60 = l3.hashCode();
            } else {
                i60 = 0;
            }
            int i268 = (i267 + i60) * 37;
            String str17 = this.label_music_starter_text;
            if (str17 != null) {
                i61 = str17.hashCode();
            } else {
                i61 = 0;
            }
            int i269 = (i268 + i61) * 37;
            Boolean bool8 = this.without_watermark;
            if (bool8 != null) {
                i62 = bool8.hashCode();
            } else {
                i62 = 0;
            }
            int i270 = (i269 + i62) * 37;
            C69244RFo c69244RFo = this.preload;
            if (c69244RFo != null) {
                i63 = c69244RFo.hashCode();
            } else {
                i63 = 0;
            }
            int i271 = (i270 + i63) * 37;
            String str18 = this.star_recommend_tag;
            if (str18 != null) {
                i64 = str18.hashCode();
            } else {
                i64 = 0;
            }
            int i272 = (i271 + i64) * 37;
            String str19 = this.ad_order_id;
            if (str19 != null) {
                i65 = str19.hashCode();
            } else {
                i65 = 0;
            }
            int i273 = (i272 + i65) * 37;
            String str20 = this.open_platform_name;
            if (str20 != null) {
                i66 = str20.hashCode();
            } else {
                i66 = 0;
            }
            int i274 = (i273 + i66) * 37;
            RPY rpy = this.star_atlas_info;
            if (rpy != null) {
                i67 = rpy.hashCode();
            } else {
                i67 = 0;
            }
            int i275 = (i274 + i67) * 37;
            String str21 = this.desc_language;
            if (str21 != null) {
                i68 = str21.hashCode();
            } else {
                i68 = 0;
            }
            int i276 = (i275 + i68) * 37;
            RFU rfu = this.floating_card_content;
            if (rfu != null) {
                i69 = rfu.hashCode();
            } else {
                i69 = 0;
            }
            int LIZ11 = C77339UWx.LIZ(this.interaction_stickers, (i276 + i69) * 37, 37);
            Integer num12 = this.ad_link_type;
            if (num12 != null) {
                i70 = num12.hashCode();
            } else {
                i70 = 0;
            }
            int i277 = (LIZ11 + i70) * 37;
            Integer num13 = this.take_down_reason;
            if (num13 != null) {
                i71 = num13.hashCode();
            } else {
                i71 = 0;
            }
            int i278 = (i277 + i71) * 37;
            String str22 = this.take_down_desc;
            if (str22 != null) {
                i72 = str22.hashCode();
            } else {
                i72 = 0;
            }
            int i279 = (i278 + i72) * 37;
            String str23 = this.simple_promotions;
            if (str23 != null) {
                i73 = str23.hashCode();
            } else {
                i73 = 0;
            }
            int i280 = (i279 + i73) * 37;
            String str24 = this.misc_info;
            if (str24 != null) {
                i74 = str24.hashCode();
            } else {
                i74 = 0;
            }
            int LIZ12 = C77339UWx.LIZ(this.commerce_config_data, C77339UWx.LIZ(this.origin_comment_ids, (i280 + i74) * 37, 37), 37);
            RGV rgv = this.commerce_sticker_info;
            if (rgv != null) {
                i75 = rgv.hashCode();
            } else {
                i75 = 0;
            }
            int i281 = (LIZ12 + i75) * 37;
            Boolean bool9 = this.enable_top_view;
            if (bool9 != null) {
                i76 = bool9.hashCode();
            } else {
                i76 = 0;
            }
            int i282 = (i281 + i76) * 37;
            Integer num14 = this.distribute_type;
            if (num14 != null) {
                i77 = num14.hashCode();
            } else {
                i77 = 0;
            }
            int i283 = (i282 + i77) * 37;
            C69235RFf c69235RFf = this.video_control;
            if (c69235RFf != null) {
                i78 = c69235RFf.hashCode();
            } else {
                i78 = 0;
            }
            int i284 = (i283 + i78) * 37;
            Integer num15 = this.is_effect_designer;
            if (num15 != null) {
                i79 = num15.hashCode();
            } else {
                i79 = 0;
            }
            int i285 = (i284 + i79) * 37;
            Integer num16 = this.ad_aweme_source;
            if (num16 != null) {
                i80 = num16.hashCode();
            } else {
                i80 = 0;
            }
            int i286 = (i285 + i80) * 37;
            RH2 rh2 = this.aweme_control;
            if (rh2 != null) {
                i81 = rh2.hashCode();
            } else {
                i81 = 0;
            }
            int i287 = (i286 + i81) * 37;
            Boolean bool10 = this.has_vs_entry;
            if (bool10 != null) {
                i82 = bool10.hashCode();
            } else {
                i82 = 0;
            }
            int i288 = (i287 + i82) * 37;
            RG4 rg4 = this.anchor;
            if (rg4 != null) {
                i83 = rg4.hashCode();
            } else {
                i83 = 0;
            }
            int i289 = (i288 + i83) * 37;
            RG9 rg9 = this.feed_relation_label;
            if (rg9 != null) {
                i84 = rg9.hashCode();
            } else {
                i84 = 0;
            }
            int i290 = (i289 + i84) * 37;
            C69228REy c69228REy = this.mix_info;
            if (c69228REy != null) {
                i85 = c69228REy.hashCode();
            } else {
                i85 = 0;
            }
            int i291 = (i290 + i85) * 37;
            String str25 = this.simple_shop_seeding;
            if (str25 != null) {
                i86 = str25.hashCode();
            } else {
                i86 = 0;
            }
            int i292 = (i291 + i86) * 37;
            RGO rgo = this.hot_list;
            if (rgo != null) {
                i87 = rgo.hashCode();
            } else {
                i87 = 0;
            }
            int i293 = (i292 + i87) * 37;
            C69185RDh c69185RDh = this.commerce_info;
            if (c69185RDh != null) {
                i88 = c69185RDh.hashCode();
            } else {
                i88 = 0;
            }
            int i294 = (i293 + i88) * 37;
            C69279RGx c69279RGx = this.banner_tip;
            if (c69279RGx != null) {
                i89 = c69279RGx.hashCode();
            } else {
                i89 = 0;
            }
            int i295 = (i294 + i89) * 37;
            C69213REj c69213REj = this.acl_info;
            if (c69213REj != null) {
                i90 = c69213REj.hashCode();
            } else {
                i90 = 0;
            }
            int i296 = (i295 + i90) * 37;
            C69243RFn c69243RFn = this.anchor_info;
            if (c69243RFn != null) {
                i91 = c69243RFn.hashCode();
            } else {
                i91 = 0;
            }
            int i297 = (i296 + i91) * 37;
            C69466ROc c69466ROc = this.vpa_info;
            if (c69466ROc != null) {
                i92 = c69466ROc.hashCode();
            } else {
                i92 = 0;
            }
            int i298 = (i297 + i92) * 37;
            RGT rgt = this.cny_info;
            if (rgt != null) {
                i93 = rgt.hashCode();
            } else {
                i93 = 0;
            }
            int i299 = (i298 + i93) * 37;
            Boolean bool11 = this.is_familiar;
            if (bool11 != null) {
                i94 = bool11.hashCode();
            } else {
                i94 = 0;
            }
            int i300 = (i299 + i94) * 37;
            Boolean bool12 = this.need_vs_entry;
            if (bool12 != null) {
                i95 = bool12.hashCode();
            } else {
                i95 = 0;
            }
            int i301 = (i300 + i95) * 37;
            RFH rfh = this.cell_room;
            if (rfh != null) {
                i96 = rfh.hashCode();
            } else {
                i96 = 0;
            }
            int i302 = (i301 + i96) * 37;
            String str26 = this.live_reason;
            if (str26 != null) {
                i97 = str26.hashCode();
            } else {
                i97 = 0;
            }
            int i303 = (i302 + i97) * 37;
            String str27 = this.video_feed_tag;
            if (str27 != null) {
                i98 = str27.hashCode();
            } else {
                i98 = 0;
            }
            int i304 = (i303 + i98) * 37;
            C69242RFm c69242RFm = this.mask_info;
            if (c69242RFm != null) {
                i99 = c69242RFm.hashCode();
            } else {
                i99 = 0;
            }
            int i305 = (i304 + i99) * 37;
            RGD rgd = this.link_match;
            if (rgd != null) {
                i100 = rgd.hashCode();
            } else {
                i100 = 0;
            }
            int i306 = (i305 + i100) * 37;
            C69254RFy c69254RFy = this.video_reply_info;
            if (c69254RFy != null) {
                i101 = c69254RFy.hashCode();
            } else {
                i101 = 0;
            }
            int LIZ13 = C77339UWx.LIZ(this.hybrid_label, C77339UWx.LIZ(this.anchors, (i306 + i101) * 37, 37), 37);
            RH5 rh5 = this.relation_recommend_info;
            if (rh5 != null) {
                i102 = rh5.hashCode();
            } else {
                i102 = 0;
            }
            int i307 = (LIZ13 + i102) * 37;
            C69396RLk c69396RLk = this.user_profile_init_info;
            if (c69396RLk != null) {
                i103 = c69396RLk.hashCode();
            } else {
                i103 = 0;
            }
            int i308 = (i307 + i103) * 37;
            Boolean bool13 = this.with_survey;
            if (bool13 != null) {
                i104 = bool13.hashCode();
            } else {
                i104 = 0;
            }
            int i309 = (i308 + i104) * 37;
            C69245RFp c69245RFp2 = this.dou_discount_mix_info;
            if (c69245RFp2 != null) {
                i105 = c69245RFp2.hashCode();
            } else {
                i105 = 0;
            }
            int i310 = (i309 + i105) * 37;
            C69213REj c69213REj2 = this.aweme_acl;
            if (c69213REj2 != null) {
                i106 = c69213REj2.hashCode();
            } else {
                i106 = 0;
            }
            int i311 = (i310 + i106) * 37;
            RHL rhl = this.activity;
            if (rhl != null) {
                i107 = rhl.hashCode();
            } else {
                i107 = 0;
            }
            int i312 = (i311 + i107) * 37;
            Integer num17 = this.is_story;
            if (num17 != null) {
                i108 = num17.hashCode();
            } else {
                i108 = 0;
            }
            int i313 = (i312 + i108) * 37;
            RP3 rp3 = this.vs_entry;
            if (rp3 != null) {
                i109 = rp3.hashCode();
            } else {
                i109 = 0;
            }
            int i314 = (i313 + i109) * 37;
            Integer num18 = this.item_stitch;
            if (num18 != null) {
                i110 = num18.hashCode();
            } else {
                i110 = 0;
            }
            int i315 = (i314 + i110) * 37;
            Boolean bool14 = this.show_sticker_guide;
            if (bool14 != null) {
                i111 = bool14.hashCode();
            } else {
                i111 = 0;
            }
            int i316 = (i315 + i111) * 37;
            Integer num19 = this.story_ttl;
            if (num19 != null) {
                i112 = num19.hashCode();
            } else {
                i112 = 0;
            }
            int i317 = (i316 + i112) * 37;
            Boolean bool15 = this.is_horizontal;
            if (bool15 != null) {
                i113 = bool15.hashCode();
            } else {
                i113 = 0;
            }
            int LIZ14 = C77339UWx.LIZ(this.geofencing_regions, (i317 + i113) * 37, 37);
            String str28 = this.city;
            if (str28 != null) {
                i114 = str28.hashCode();
            } else {
                i114 = 0;
            }
            int i318 = (LIZ14 + i114) * 37;
            RHS rhs = this.mutual_relation_tmp;
            if (rhs != null) {
                i115 = rhs.hashCode();
            } else {
                i115 = 0;
            }
            int i319 = (i318 + i115) * 37;
            String str29 = this.anchors_extras;
            if (str29 != null) {
                i116 = str29.hashCode();
            } else {
                i116 = 0;
            }
            int i320 = (i319 + i116) * 37;
            Boolean bool16 = this.allow_gift;
            if (bool16 != null) {
                i117 = bool16.hashCode();
            } else {
                i117 = 0;
            }
            int i321 = (i320 + i117) * 37;
            RHS rhs2 = this.mutual_relation;
            if (rhs2 != null) {
                i118 = rhs2.hashCode();
            } else {
                i118 = 0;
            }
            int LIZ15 = C77339UWx.LIZ(this.mask_infos, (i321 + i118) * 37, 37);
            RMN rmn = this.boost_tag_info;
            if (rmn != null) {
                i119 = rmn.hashCode();
            } else {
                i119 = 0;
            }
            int i322 = (LIZ15 + i119) * 37;
            C69372RKm c69372RKm = this.bottom_bar;
            if (c69372RKm != null) {
                i120 = c69372RKm.hashCode();
            } else {
                i120 = 0;
            }
            int i323 = (i322 + i120) * 37;
            RKU rku = this.playlist_info;
            if (rku != null) {
                i121 = rku.hashCode();
            } else {
                i121 = 0;
            }
            int i324 = (i323 + i121) * 37;
            Integer num20 = this.sound_exemption;
            if (num20 != null) {
                i122 = num20.hashCode();
            } else {
                i122 = 0;
            }
            int i325 = (i324 + i122) * 37;
            C69497RPh c69497RPh = this.stitch;
            if (c69497RPh != null) {
                i123 = c69497RPh.hashCode();
            } else {
                i123 = 0;
            }
            int i326 = (i325 + i123) * 37;
            Boolean bool17 = this.playlist_blocked;
            if (bool17 != null) {
                i124 = bool17.hashCode();
            } else {
                i124 = 0;
            }
            int i327 = (i326 + i124) * 37;
            String str30 = this.part_n;
            if (str30 != null) {
                i125 = str30.hashCode();
            } else {
                i125 = 0;
            }
            int LIZ16 = C77339UWx.LIZ(this.green_screen_materials, (i327 + i125) * 37, 37);
            C69469ROf c69469ROf = this.stitch_permission;
            if (c69469ROf != null) {
                i126 = c69469ROf.hashCode();
            } else {
                i126 = 0;
            }
            int i328 = (LIZ16 + i126) * 37;
            RGI rgi = this.trending_bar;
            if (rgi != null) {
                i127 = rgi.hashCode();
            } else {
                i127 = 0;
            }
            int i329 = (i328 + i127) * 37;
            REC rec = this.user_story;
            if (rec != null) {
                i128 = rec.hashCode();
            } else {
                i128 = 0;
            }
            int i330 = (i329 + i128) * 37;
            RGJ rgj = this.story_metadata;
            if (rgj != null) {
                i129 = rgj.hashCode();
            } else {
                i129 = 0;
            }
            int i331 = (i330 + i129) * 37;
            RG2 rg2 = this.interact_permission;
            if (rg2 != null) {
                i130 = rg2.hashCode();
            } else {
                i130 = 0;
            }
            int i332 = (i331 + i130) * 37;
            String str31 = this.item_distribute_source;
            if (str31 != null) {
                i131 = str31.hashCode();
            } else {
                i131 = 0;
            }
            int LIZ17 = C77339UWx.LIZ(this.question_list, (i332 + i131) * 37, 37);
            RGC rgc = this.audio;
            if (rgc != null) {
                i132 = rgc.hashCode();
            } else {
                i132 = 0;
            }
            int i333 = (LIZ17 + i132) * 37;
            RFR rfr = this.upvote_reason;
            if (rfr != null) {
                i133 = rfr.hashCode();
            } else {
                i133 = 0;
            }
            int i334 = (i333 + i133) * 37;
            Integer num21 = this.deduplication_type;
            if (num21 != null) {
                i134 = num21.hashCode();
            } else {
                i134 = 0;
            }
            int i335 = (i334 + i134) * 37;
            RG8 rg8 = this.interaction_tag_info;
            if (rg8 != null) {
                i135 = rg8.hashCode();
            } else {
                i135 = 0;
            }
            int i336 = (i335 + i135) * 37;
            String str32 = this.content_desc;
            if (str32 != null) {
                i136 = str32.hashCode();
            } else {
                i136 = 0;
            }
            int LIZ18 = C77339UWx.LIZ(this.content_desc_extra, (i336 + i136) * 37, 37);
            C69414RMc c69414RMc = this.duet_info;
            if (c69414RMc != null) {
                i137 = c69414RMc.hashCode();
            } else {
                i137 = 0;
            }
            int i337 = (LIZ18 + i137) * 37;
            String str33 = this.extra_info;
            if (str33 != null) {
                i138 = str33.hashCode();
            } else {
                i138 = 0;
            }
            int i338 = (i337 + i138) * 37;
            Integer num22 = this.item_source_category;
            if (num22 != null) {
                i139 = num22.hashCode();
            } else {
                i139 = 0;
            }
            int i339 = (i338 + i139) * 37;
            Boolean bool18 = this.enable_pos_adjust;
            if (bool18 != null) {
                i140 = bool18.hashCode();
            } else {
                i140 = 0;
            }
            int i340 = (i339 + i140) * 37;
            Boolean bool19 = this.enable_ad_drop;
            if (bool19 != null) {
                i141 = bool19.hashCode();
            } else {
                i141 = 0;
            }
            int i341 = (i340 + i141) * 37;
            Integer num23 = this.pred_playtime;
            if (num23 != null) {
                i142 = num23.hashCode();
            } else {
                i142 = 0;
            }
            int LIZ19 = C77339UWx.LIZ(this.gap_list, (i341 + i142) * 37, 37);
            Boolean bool20 = this.is_client_cache;
            if (bool20 != null) {
                i143 = bool20.hashCode();
            } else {
                i143 = 0;
            }
            int i342 = (LIZ19 + i143) * 37;
            Long l4 = this.follow_up_publish_from_id;
            if (l4 != null) {
                i144 = l4.hashCode();
            } else {
                i144 = 0;
            }
            int i343 = (i342 + i144) * 37;
            RGH rgh = this.trending_bar_fyp;
            if (rgh != null) {
                i145 = rgh.hashCode();
            } else {
                i145 = 0;
            }
            int i344 = (i343 + i145) * 37;
            C69251RFv c69251RFv = this.music_dsp_info;
            if (c69251RFv != null) {
                i146 = c69251RFv.hashCode();
            } else {
                i146 = 0;
            }
            int i345 = (i344 + i146) * 37;
            Boolean bool21 = this.disable_search_trending_bar;
            if (bool21 != null) {
                i147 = bool21.hashCode();
            } else {
                i147 = 0;
            }
            int i346 = (i345 + i147) * 37;
            RFQ rfq = this.image_post_info;
            if (rfq != null) {
                i148 = rfq.hashCode();
            } else {
                i148 = 0;
            }
            int i347 = (i346 + i148) * 37;
            C69264RGi c69264RGi = this.suggest_words;
            if (c69264RGi != null) {
                i149 = c69264RGi.hashCode();
            } else {
                i149 = 0;
            }
            int i348 = (i347 + i149) * 37;
            RMW rmw = this.GroupIdList;
            if (rmw != null) {
                i150 = rmw.hashCode();
            } else {
                i150 = 0;
            }
            int i349 = (i348 + i150) * 37;
            String str34 = this.commercial_video_info;
            if (str34 != null) {
                i151 = str34.hashCode();
            } else {
                i151 = 0;
            }
            int i350 = (i349 + i151) * 37;
            Boolean bool22 = this.allow_reuse_original_sound;
            if (bool22 != null) {
                i152 = bool22.hashCode();
            } else {
                i152 = 0;
            }
            int i351 = (i350 + i152) * 37;
            Integer num24 = this.music_begin_time_in_ms;
            if (num24 != null) {
                i153 = num24.hashCode();
            } else {
                i153 = 0;
            }
            int i352 = (i351 + i153) * 37;
            Integer num25 = this.music_end_time_in_ms;
            if (num25 != null) {
                i154 = num25.hashCode();
            } else {
                i154 = 0;
            }
            int i353 = (i352 + i154) * 37;
            Integer num26 = this.retry_type;
            if (num26 != null) {
                i155 = num26.hashCode();
            } else {
                i155 = 0;
            }
            int i354 = (i353 + i155) * 37;
            C69453RNp c69453RNp = this.upvote_preload;
            if (c69453RNp != null) {
                i156 = c69453RNp.hashCode();
            } else {
                i156 = 0;
            }
            int i355 = (i354 + i156) * 37;
            C69423RMl c69423RMl = this.commerce_rerank_info;
            if (c69423RMl != null) {
                i157 = c69423RMl.hashCode();
            } else {
                i157 = 0;
            }
            int i356 = (i355 + i157) * 37;
            RN0 rn0 = this.share_to_story_info;
            if (rn0 != null) {
                i158 = rn0.hashCode();
            } else {
                i158 = 0;
            }
            int i357 = (i356 + i158) * 37;
            RGR rgr = this.ad_story_video;
            if (rgr != null) {
                i159 = rgr.hashCode();
            } else {
                i159 = 0;
            }
            int i358 = (i357 + i159) * 37;
            C69420RMi c69420RMi = this.nearby_info;
            if (c69420RMi != null) {
                i160 = c69420RMi.hashCode();
            } else {
                i160 = 0;
            }
            int LIZ20 = C77339UWx.LIZ(this.branded_content_accounts, (i358 + i160) * 37, 37);
            RFX rfx = this.rec_reason;
            if (rfx != null) {
                i161 = rfx.hashCode();
            } else {
                i161 = 0;
            }
            int i359 = (LIZ20 + i161) * 37;
            Boolean bool23 = this.should_add_creator_tts_watermark_when_downloading;
            if (bool23 != null) {
                i162 = bool23.hashCode();
            } else {
                i162 = 0;
            }
            int i360 = (i359 + i162) * 37;
            REN ren = this.poi_data;
            if (ren != null) {
                i163 = ren.hashCode();
            } else {
                i163 = 0;
            }
            int i361 = (i360 + i163) * 37;
            Boolean bool24 = this.is_description_translatable;
            if (bool24 != null) {
                i164 = bool24.hashCode();
            } else {
                i164 = 0;
            }
            int i362 = (i361 + i164) * 37;
            C69167RCp c69167RCp = this.now_posts;
            if (c69167RCp != null) {
                i165 = c69167RCp.hashCode();
            } else {
                i165 = 0;
            }
            int i363 = (i362 + i165) * 37;
            RDU rdu = this.podcast_info;
            if (rdu != null) {
                i166 = rdu.hashCode();
            } else {
                i166 = 0;
            }
            int i364 = (i363 + i166) * 37;
            String str35 = this.follow_up_first_item_id;
            if (str35 != null) {
                i167 = str35.hashCode();
            } else {
                i167 = 0;
            }
            int i365 = (i364 + i167) * 37;
            String str36 = this.follow_up_item_id_groups;
            if (str36 != null) {
                i168 = str36.hashCode();
            } else {
                i168 = 0;
            }
            int i366 = (i365 + i168) * 37;
            Integer num27 = this.story_type;
            if (num27 != null) {
                i169 = num27.hashCode();
            } else {
                i169 = 0;
            }
            int i367 = (i366 + i169) * 37;
            Boolean bool25 = this.is_text_sticker_translatable;
            if (bool25 != null) {
                i170 = bool25.hashCode();
            } else {
                i170 = 0;
            }
            int i368 = (i367 + i170) * 37;
            String str37 = this.text_sticker_major_lang;
            if (str37 != null) {
                i171 = str37.hashCode();
            } else {
                i171 = 0;
            }
            int i369 = (i368 + i171) * 37;
            C69281RGz c69281RGz = this.ttm_info;
            if (c69281RGz != null) {
                i172 = c69281RGz.hashCode();
            } else {
                i172 = 0;
            }
            int i370 = (i369 + i172) * 37;
            RKQ rkq = this.edit_post_permission;
            if (rkq != null) {
                i173 = rkq.hashCode();
            } else {
                i173 = 0;
            }
            int i371 = (i370 + i173) * 37;
            C69256RGa c69256RGa = this.original_client_text;
            if (c69256RGa != null) {
                i174 = c69256RGa.hashCode();
            } else {
                i174 = 0;
            }
            int i372 = (i371 + i174) * 37;
            String str38 = this.music_selected_from;
            if (str38 != null) {
                i175 = str38.hashCode();
            } else {
                i175 = 0;
            }
            int LIZ21 = C77339UWx.LIZ(this.reference_voice_filter_ids, C77339UWx.LIZ(this.voice_filter_ids, C77339UWx.LIZ(this.reference_tts_voice_ids, C77339UWx.LIZ(this.tts_voice_ids, (i372 + i175) * 37, 37), 37), 37), 37);
            Integer num28 = this.music_title_style;
            if (num28 != null) {
                i176 = num28.hashCode();
            } else {
                i176 = 0;
            }
            int i373 = (LIZ21 + i176) * 37;
            C69260RGe c69260RGe = this.promote;
            if (c69260RGe != null) {
                i177 = c69260RGe.hashCode();
            } else {
                i177 = 0;
            }
            int i374 = (i373 + i177) * 37;
            C69472ROi c69472ROi = this.animated_image_info;
            if (c69472ROi != null) {
                i178 = c69472ROi.hashCode();
            } else {
                i178 = 0;
            }
            int i375 = (i374 + i178) * 37;
            RG6 rg6 = this.comment_config;
            if (rg6 != null) {
                i179 = rg6.hashCode();
            } else {
                i179 = 0;
            }
            int i376 = (i375 + i179) * 37;
            String str39 = this.survey_key;
            if (str39 != null) {
                i180 = str39.hashCode();
            } else {
                i180 = 0;
            }
            int i377 = (i376 + i180) * 37;
            String str40 = this.trans_params;
            if (str40 != null) {
                i181 = str40.hashCode();
            } else {
                i181 = 0;
            }
            int i378 = (i377 + i181) * 37;
            C69263RGh c69263RGh = this.animated_btn;
            if (c69263RGh != null) {
                i182 = c69263RGh.hashCode();
            } else {
                i182 = 0;
            }
            int LIZ22 = C77339UWx.LIZ(this.survey_info, (i378 + i182) * 37, 37);
            C69156RCe c69156RCe2 = this.added_sound_music_info;
            if (c69156RCe2 != null) {
                i183 = c69156RCe2.hashCode();
            } else {
                i183 = 0;
            }
            int i379 = (LIZ22 + i183) * 37;
            String str41 = this.origin_volume;
            if (str41 != null) {
                i184 = str41.hashCode();
            } else {
                i184 = 0;
            }
            int i380 = (i379 + i184) * 37;
            String str42 = this.music_volume;
            if (str42 != null) {
                i185 = str42.hashCode();
            } else {
                i185 = 0;
            }
            int i381 = (i380 + i185) * 37;
            Boolean bool26 = this.support_danmaku;
            if (bool26 != null) {
                i186 = bool26.hashCode();
            } else {
                i186 = 0;
            }
            int i382 = (i381 + i186) * 37;
            Boolean bool27 = this.has_danmaku;
            if (bool27 != null) {
                i187 = bool27.hashCode();
            } else {
                i187 = 0;
            }
            int i383 = (i382 + i187) * 37;
            C69276RGu c69276RGu = this.real_survey_info;
            if (c69276RGu != null) {
                i188 = c69276RGu.hashCode();
            } else {
                i188 = 0;
            }
            int i384 = (i383 + i188) * 37;
            C69375RKp c69375RKp = this.card;
            if (c69375RKp != null) {
                i189 = c69375RKp.hashCode();
            } else {
                i189 = 0;
            }
            int i385 = (i384 + i189) * 37;
            C69265RGj c69265RGj = this.ttec_suggest_words;
            if (c69265RGj != null) {
                i190 = c69265RGj.hashCode();
            } else {
                i190 = 0;
            }
            int i386 = (i385 + i190) * 37;
            Integer num29 = this.content_original_type;
            if (num29 != null) {
                i191 = num29.hashCode();
            } else {
                i191 = 0;
            }
            int i387 = (i386 + i191) * 37;
            String str43 = this.shoot_tab_name;
            if (str43 != null) {
                i192 = str43.hashCode();
            } else {
                i192 = 0;
            }
            int i388 = (i387 + i192) * 37;
            String str44 = this.content_type;
            if (str44 != null) {
                i193 = str44.hashCode();
            } else {
                i193 = 0;
            }
            int i389 = (i388 + i193) * 37;
            Integer num30 = this.content_size_type;
            if (num30 != null) {
                i194 = num30.hashCode();
            } else {
                i194 = 0;
            }
            int i390 = (i389 + i194) * 37;
            Boolean bool28 = this.is_tiktok_story;
            if (bool28 != null) {
                i195 = bool28.hashCode();
            } else {
                i195 = 0;
            }
            int i391 = (i390 + i195) * 37;
            Boolean bool29 = this.is_sub_only_video;
            if (bool29 != null) {
                i196 = bool29.hashCode();
            } else {
                i196 = 0;
            }
            int i392 = (i391 + i196) * 37;
            Boolean bool30 = this.is_nff_or_nr;
            if (bool30 != null) {
                i197 = bool30.hashCode();
            } else {
                i197 = 0;
            }
            int i393 = (i392 + i197) * 37;
            RCZ rcz2 = this.podcast_full_episode_item;
            if (rcz2 != null) {
                i198 = rcz2.hashCode();
            } else {
                i198 = 0;
            }
            int i394 = (i393 + i198) * 37;
            Float f = this.parameterized_speed;
            if (f != null) {
                i199 = f.hashCode();
            } else {
                i199 = 0;
            }
            int LIZ23 = C77339UWx.LIZ(this.operator_boost_info, (i394 + i199) * 37, 37);
            Boolean bool31 = this.filter_unfriendly_user_comments;
            if (bool31 != null) {
                i200 = bool31.hashCode();
            } else {
                i200 = 0;
            }
            int i395 = (LIZ23 + i200) * 37;
            Boolean bool32 = this.filter_stranger_comments;
            if (bool32 != null) {
                i201 = bool32.hashCode();
            } else {
                i201 = 0;
            }
            int i396 = (i395 + i201) * 37;
            Boolean bool33 = this.is_story_to_normal;
            if (bool33 != null) {
                i202 = bool33.hashCode();
            } else {
                i202 = 0;
            }
            int i397 = (i396 + i202) * 37;
            C69262RGg c69262RGg = this.fake_landscape_video_info;
            if (c69262RGg != null) {
                i203 = c69262RGg.hashCode();
            } else {
                i203 = 0;
            }
            int i398 = (i397 + i203) * 37;
            String str45 = this.main_arch_common;
            if (str45 != null) {
                i204 = str45.hashCode();
            } else {
                i204 = 0;
            }
            int i399 = (i398 + i204) * 37;
            String str46 = this.batch_id;
            if (str46 != null) {
                i205 = str46.hashCode();
            } else {
                i205 = 0;
            }
            int i400 = (i399 + i205) * 37;
            Integer num31 = this.batch_index;
            if (num31 != null) {
                i206 = num31.hashCode();
            } else {
                i206 = 0;
            }
            int i401 = (i400 + i206) * 37;
            C69456RNs c69456RNs = this.aigc_info;
            if (c69456RNs != null) {
                i207 = c69456RNs.hashCode();
            } else {
                i207 = 0;
            }
            int i402 = (i401 + i207) * 37;
            Integer num32 = this.ttt_product_recall_type;
            if (num32 != null) {
                i208 = num32.hashCode();
            } else {
                i208 = 0;
            }
            int i403 = (i402 + i208) * 37;
            C69387RLb c69387RLb = this.related_live;
            if (c69387RLb != null) {
                i209 = c69387RLb.hashCode();
            } else {
                i209 = 0;
            }
            int i404 = (i403 + i209) * 37;
            Integer num33 = this.share_story_status;
            if (num33 != null) {
                i210 = num33.hashCode();
            } else {
                i210 = 0;
            }
            int i405 = (i404 + i210) * 37;
            RMZ rmz = this.add_yours_recommendation;
            if (rmz != null) {
                i211 = rmz.hashCode();
            } else {
                i211 = 0;
            }
            int LIZ24 = C77339UWx.LIZ(this.picked_users, C77339UWx.LIZ(this.banners, (i405 + i211) * 37, 37), 37);
            ROW row = this.standard_component_info;
            if (row != null) {
                i212 = row.hashCode();
            } else {
                i212 = 0;
            }
            int i406 = (LIZ24 + i212) * 37;
            Boolean bool34 = this.is_comment_post_video;
            if (bool34 != null) {
                i213 = bool34.hashCode();
            } else {
                i213 = 0;
            }
            int i407 = (i406 + i213) * 37;
            ROQ roq = this.comment_post_video;
            if (roq != null) {
                i214 = roq.hashCode();
            } else {
                i214 = 0;
            }
            int i408 = (i407 + i214) * 37;
            Integer num34 = this.has_promote_entry;
            if (num34 != null) {
                i215 = num34.hashCode();
            } else {
                i215 = 0;
            }
            int i409 = (i408 + i215) * 37;
            String str47 = this.promote_toast;
            if (str47 != null) {
                i216 = str47.hashCode();
            } else {
                i216 = 0;
            }
            int i410 = (i409 + i216) * 37;
            String str48 = this.promote_toast_key;
            if (str48 != null) {
                i218 = str48.hashCode();
            }
            int i411 = i410 + i218;
            this.hashCode = i411;
            return i411;
        }
        return i217;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RCZ, C69316RIi> newBuilder2() {
        newBuilder2();
        return null;
    }
}
