package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: X.RCa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69152RCa extends ProtoAdapter<RCZ> {
    public C69152RCa() {
        super(FieldEncoding.LENGTH_DELIMITED, RCZ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RCZ decode(ProtoReader protoReader) {
        RCZ rcz = new RCZ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rcz.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rcz.desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rcz.create_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        rcz.author = C69154RCc.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        rcz.music = C69156RCe.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        rcz.cha_list.add(C69160RCi.ADAPTER.decode(protoReader));
                        break;
                    case 7:
                        rcz.video = C69159RCh.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        rcz.share_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        rcz.user_digged = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 10:
                        rcz.statistics = C69234RFe.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rcz.status = RE3.ADAPTER.decode(protoReader);
                        break;
                    case 12:
                        rcz.extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rcz.rate = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 14:
                        rcz.text_extra.add(C69204REa.ADAPTER.decode(protoReader));
                        break;
                    case 15:
                        rcz.label_large = REV.ADAPTER.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        rcz.label_thumb = REV.ADAPTER.decode(protoReader);
                        break;
                    case 17:
                        rcz.is_top = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 18:
                        rcz.label_top = REV.ADAPTER.decode(protoReader);
                        break;
                    case 19:
                        rcz.share_info = C69199RDv.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        rcz.label_origin_author = REV.ADAPTER.decode(protoReader);
                        break;
                    case 21:
                        rcz.distance = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 22:
                        rcz.label_music_starter = REV.ADAPTER.decode(protoReader);
                        break;
                    case 23:
                        rcz.label_private = REV.ADAPTER.decode(protoReader);
                        break;
                    case 24:
                        rcz.video_labels.add(RH9.ADAPTER.decode(protoReader));
                        break;
                    case 25:
                        rcz.is_vr = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 26:
                        rcz.landing_page = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 27:
                        rcz.is_ads = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 28:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    case 51:
                    case 56:
                    case 60:
                    case 61:
                    case 75:
                    case 94:
                    case 100:
                    case 117:
                    case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                    case UserLevelGeckoUpdateSetting.DEFAULT /* 140 */:
                    case 144:
                    case 145:
                    case 146:
                    case 152:
                    case 153:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case 166:
                    case 175:
                    case 176:
                    case 177:
                    case 178:
                    case 179:
                    case 184:
                    case 192:
                    case 254:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 29:
                        rcz.duration = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 30:
                        rcz.aweme_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 35:
                        rcz.cmt_swt = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 36:
                        rcz.image_infos.add(C69267RGl.ADAPTER.decode(protoReader));
                        break;
                    case 37:
                        rcz.risk_infos = RGK.ADAPTER.decode(protoReader);
                        break;
                    case 38:
                        rcz.is_relieve = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 39:
                        rcz.label_friend = REV.ADAPTER.decode(protoReader);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        rcz.sort_label = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 41:
                        rcz.position.add(RHN.ADAPTER.decode(protoReader));
                        break;
                    case 42:
                        rcz.uniqid_position.add(RHN.ADAPTER.decode(protoReader));
                        break;
                    case 44:
                        rcz.author_user_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 45:
                        rcz.bodydance_score = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 46:
                        rcz.geofencing.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 47:
                        rcz.is_hash_tag = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                        rcz.is_pgcshow = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case C61447O9r.LJIIJ:
                        rcz.region = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 50:
                        rcz.video_text.add(RH6.ADAPTER.decode(protoReader));
                        break;
                    case 52:
                        rcz.sp_sticker = RGZ.ADAPTER.decode(protoReader);
                        break;
                    case 53:
                        rcz.ad_schedule = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 54:
                        rcz.collect_stat = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 55:
                        rcz.label_top_text.add(RH6.ADAPTER.decode(protoReader));
                        break;
                    case 57:
                        rcz.stickers = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 58:
                        rcz.forward_item = RCZ.ADAPTER.decode(protoReader);
                        break;
                    case 59:
                        rcz.forward_comment_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case BaseNotice.CREATOR /* 62 */:
                        rcz.forward_item_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 63:
                        rcz.group_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 64:
                        rcz.pre_forward_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 65:
                        rcz.prevent_download = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 66:
                        rcz.nickname_position.add(RHN.ADAPTER.decode(protoReader));
                        break;
                    case 67:
                        rcz.challenge_position.add(RHN.ADAPTER.decode(protoReader));
                        break;
                    case 68:
                        rcz.item_comment_settings = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 69:
                        rcz.descendants = RMT.ADAPTER.decode(protoReader);
                        break;
                    case 70:
                        rcz.raw_ad_data = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 71:
                        rcz.game_info = RN3.ADAPTER.decode(protoReader);
                        break;
                    case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                        rcz.micro_app_info = RFJ.ADAPTER.decode(protoReader);
                        break;
                    case 73:
                        rcz.with_promotional_music = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 74:
                        rcz.link_ad_data = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 76:
                        rcz.gesture_red_packet = REM.ADAPTER.decode(protoReader);
                        break;
                    case 77:
                        rcz.activity_pendant = REM.ADAPTER.decode(protoReader);
                        break;
                    case 78:
                        rcz.sticker_detail = RD1.ADAPTER.decode(protoReader);
                        break;
                    case 79:
                        rcz.long_video.add(RG3.ADAPTER.decode(protoReader));
                        break;
                    case 80:
                        rcz.item_duet = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 81:
                        rcz.item_react = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 82:
                        rcz.hot_info = C69245RFp.ADAPTER.decode(protoReader);
                        break;
                    case 83:
                        rcz.star_atlas_order_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 84:
                        rcz.label_music_starter_text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                        rcz.without_watermark = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 86:
                        rcz.preload = C69244RFo.ADAPTER.decode(protoReader);
                        break;
                    case 87:
                        rcz.star_recommend_tag = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 88:
                        rcz.ad_order_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 89:
                        rcz.open_platform_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 90:
                        rcz.star_atlas_info = RPY.ADAPTER.decode(protoReader);
                        break;
                    case 91:
                        rcz.desc_language = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 92:
                        rcz.floating_card_content = RFU.ADAPTER.decode(protoReader);
                        break;
                    case 93:
                        rcz.interaction_stickers.add(RD8.ADAPTER.decode(protoReader));
                        break;
                    case 95:
                        rcz.ad_link_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 96:
                        rcz.take_down_reason = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 97:
                        rcz.take_down_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 98:
                        rcz.simple_promotions = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 99:
                        rcz.misc_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 101:
                        rcz.origin_comment_ids.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 102:
                        rcz.commerce_config_data.add(RHY.ADAPTER.decode(protoReader));
                        break;
                    case 103:
                        rcz.commerce_sticker_info = RGV.ADAPTER.decode(protoReader);
                        break;
                    case 104:
                        rcz.enable_top_view = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 105:
                        rcz.distribute_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 106:
                        rcz.video_control = C69235RFf.ADAPTER.decode(protoReader);
                        break;
                    case 107:
                        rcz.is_effect_designer = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 108:
                        rcz.ad_aweme_source = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 109:
                        rcz.aweme_control = RH2.ADAPTER.decode(protoReader);
                        break;
                    case 110:
                        rcz.has_vs_entry = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 111:
                        rcz.anchor = RG4.ADAPTER.decode(protoReader);
                        break;
                    case 112:
                        rcz.feed_relation_label = RG9.ADAPTER.decode(protoReader);
                        break;
                    case 113:
                        rcz.mix_info = C69228REy.ADAPTER.decode(protoReader);
                        break;
                    case 114:
                        rcz.simple_shop_seeding = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 115:
                        rcz.hot_list = RGO.ADAPTER.decode(protoReader);
                        break;
                    case 116:
                        rcz.commerce_info = C69185RDh.ADAPTER.decode(protoReader);
                        break;
                    case 118:
                        rcz.banner_tip = C69279RGx.ADAPTER.decode(protoReader);
                        break;
                    case 119:
                        rcz.acl_info = C69213REj.ADAPTER.decode(protoReader);
                        break;
                    case 121:
                        rcz.anchor_info = C69243RFn.ADAPTER.decode(protoReader);
                        break;
                    case 122:
                        rcz.vpa_info = C69466ROc.ADAPTER.decode(protoReader);
                        break;
                    case 123:
                        rcz.cny_info = RGT.ADAPTER.decode(protoReader);
                        break;
                    case 124:
                        rcz.is_familiar = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 125:
                        rcz.need_vs_entry = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 126:
                        rcz.cell_room = RFH.ADAPTER.decode(protoReader);
                        break;
                    case 127:
                        rcz.live_reason = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 128:
                        rcz.video_feed_tag = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 129:
                        rcz.mask_info = C69242RFm.ADAPTER.decode(protoReader);
                        break;
                    case 130:
                        rcz.link_match = RGD.ADAPTER.decode(protoReader);
                        break;
                    case 131:
                        rcz.video_reply_info = C69254RFy.ADAPTER.decode(protoReader);
                        break;
                    case 132:
                        rcz.anchors.add(RDH.ADAPTER.decode(protoReader));
                        break;
                    case 133:
                        rcz.hybrid_label.add(RGW.ADAPTER.decode(protoReader));
                        break;
                    case 134:
                        rcz.relation_recommend_info = RH5.ADAPTER.decode(protoReader);
                        break;
                    case 135:
                        rcz.user_profile_init_info = C69396RLk.ADAPTER.decode(protoReader);
                        break;
                    case 136:
                        rcz.with_survey = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 137:
                        rcz.dou_discount_mix_info = C69245RFp.ADAPTER.decode(protoReader);
                        break;
                    case 138:
                        rcz.aweme_acl = C69213REj.ADAPTER.decode(protoReader);
                        break;
                    case 139:
                        rcz.activity = RHL.ADAPTER.decode(protoReader);
                        break;
                    case 141:
                        rcz.is_story = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 142:
                        rcz.vs_entry = RP3.ADAPTER.decode(protoReader);
                        break;
                    case 143:
                        rcz.item_stitch = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 147:
                        rcz.show_sticker_guide = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 148:
                        rcz.story_ttl = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 149:
                        rcz.is_horizontal = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 150:
                        rcz.geofencing_regions.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 151:
                        rcz.city = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 154:
                        rcz.mutual_relation_tmp = RHS.ADAPTER.decode(protoReader);
                        break;
                    case 160:
                        rcz.anchors_extras = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 161:
                        rcz.allow_gift = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 162:
                        rcz.mutual_relation = RHS.ADAPTER.decode(protoReader);
                        break;
                    case 163:
                        rcz.mask_infos.add(C69242RFm.ADAPTER.decode(protoReader));
                        break;
                    case 164:
                        rcz.boost_tag_info = RMN.ADAPTER.decode(protoReader);
                        break;
                    case 165:
                        rcz.bottom_bar = C69372RKm.ADAPTER.decode(protoReader);
                        break;
                    case 167:
                        rcz.playlist_info = RKU.ADAPTER.decode(protoReader);
                        break;
                    case 168:
                        rcz.sound_exemption = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 169:
                        rcz.stitch = C69497RPh.ADAPTER.decode(protoReader);
                        break;
                    case 170:
                        rcz.playlist_blocked = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 171:
                        rcz.part_n = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 172:
                        rcz.green_screen_materials.add(RGY.ADAPTER.decode(protoReader));
                        break;
                    case 173:
                        rcz.stitch_permission = C69469ROf.ADAPTER.decode(protoReader);
                        break;
                    case 174:
                        rcz.trending_bar = RGI.ADAPTER.decode(protoReader);
                        break;
                    case 180:
                        rcz.user_story = REC.ADAPTER.decode(protoReader);
                        break;
                    case 181:
                        rcz.story_metadata = RGJ.ADAPTER.decode(protoReader);
                        break;
                    case 182:
                        rcz.interact_permission = RG2.ADAPTER.decode(protoReader);
                        break;
                    case 183:
                        rcz.item_distribute_source = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 185:
                        rcz.question_list.add(RGX.ADAPTER.decode(protoReader));
                        break;
                    case 186:
                        rcz.audio = RGC.ADAPTER.decode(protoReader);
                        break;
                    case 187:
                        rcz.upvote_reason = RFR.ADAPTER.decode(protoReader);
                        break;
                    case 188:
                        rcz.deduplication_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 189:
                        rcz.interaction_tag_info = RG8.ADAPTER.decode(protoReader);
                        break;
                    case 190:
                        rcz.content_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 191:
                        rcz.content_desc_extra.add(C69204REa.ADAPTER.decode(protoReader));
                        break;
                    case 193:
                        rcz.duet_info = C69414RMc.ADAPTER.decode(protoReader);
                        break;
                    case 194:
                        rcz.extra_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 195:
                        rcz.item_source_category = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 196:
                        rcz.enable_pos_adjust = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 197:
                        rcz.enable_ad_drop = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 198:
                        rcz.pred_playtime = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 199:
                        rcz.gap_list.add(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 200:
                        rcz.is_client_cache = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 201:
                        rcz.follow_up_publish_from_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 202:
                        rcz.trending_bar_fyp = RGH.ADAPTER.decode(protoReader);
                        break;
                    case 203:
                        rcz.music_dsp_info = C69251RFv.ADAPTER.decode(protoReader);
                        break;
                    case 204:
                        rcz.disable_search_trending_bar = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 205:
                        rcz.image_post_info = RFQ.ADAPTER.decode(protoReader);
                        break;
                    case 206:
                        rcz.suggest_words = C69264RGi.ADAPTER.decode(protoReader);
                        break;
                    case 207:
                        rcz.GroupIdList = RMW.ADAPTER.decode(protoReader);
                        break;
                    case 208:
                        rcz.commercial_video_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 209:
                        rcz.allow_reuse_original_sound = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 210:
                        rcz.music_begin_time_in_ms = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 211:
                        rcz.music_end_time_in_ms = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 212:
                        rcz.retry_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 213:
                        rcz.upvote_preload = C69453RNp.ADAPTER.decode(protoReader);
                        break;
                    case 214:
                        rcz.commerce_rerank_info = C69423RMl.ADAPTER.decode(protoReader);
                        break;
                    case 215:
                        rcz.share_to_story_info = RN0.ADAPTER.decode(protoReader);
                        break;
                    case 216:
                        rcz.ad_story_video = RGR.ADAPTER.decode(protoReader);
                        break;
                    case 217:
                        rcz.nearby_info = C69420RMi.ADAPTER.decode(protoReader);
                        break;
                    case 218:
                        rcz.branded_content_accounts.add(C69154RCc.ADAPTER.decode(protoReader));
                        break;
                    case 219:
                        rcz.rec_reason = RFX.ADAPTER.decode(protoReader);
                        break;
                    case 220:
                        rcz.should_add_creator_tts_watermark_when_downloading = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 221:
                        rcz.poi_data = REN.ADAPTER.decode(protoReader);
                        break;
                    case 222:
                        rcz.is_description_translatable = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 223:
                        rcz.now_posts = C69167RCp.ADAPTER.decode(protoReader);
                        break;
                    case 224:
                        rcz.podcast_info = RDU.ADAPTER.decode(protoReader);
                        break;
                    case 225:
                        rcz.follow_up_first_item_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 226:
                        rcz.follow_up_item_id_groups = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 227:
                        rcz.story_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 228:
                        rcz.is_text_sticker_translatable = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 229:
                        rcz.text_sticker_major_lang = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 230:
                        rcz.ttm_info = C69281RGz.ADAPTER.decode(protoReader);
                        break;
                    case 231:
                        rcz.edit_post_permission = RKQ.ADAPTER.decode(protoReader);
                        break;
                    case 232:
                        rcz.original_client_text = C69256RGa.ADAPTER.decode(protoReader);
                        break;
                    case 233:
                        rcz.music_selected_from = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 234:
                        rcz.tts_voice_ids.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 235:
                        rcz.reference_tts_voice_ids.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 236:
                        rcz.voice_filter_ids.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 237:
                        rcz.reference_voice_filter_ids.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 238:
                        rcz.music_title_style = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 239:
                        rcz.promote = C69260RGe.ADAPTER.decode(protoReader);
                        break;
                    case 240:
                        rcz.animated_image_info = C69472ROi.ADAPTER.decode(protoReader);
                        break;
                    case 241:
                        rcz.comment_config = RG6.ADAPTER.decode(protoReader);
                        break;
                    case 242:
                        rcz.survey_key = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 243:
                        rcz.trans_params = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 244:
                        rcz.animated_btn = C69263RGh.ADAPTER.decode(protoReader);
                        break;
                    case 245:
                        rcz.survey_info.add(C69276RGu.ADAPTER.decode(protoReader));
                        break;
                    case 246:
                        rcz.added_sound_music_info = C69156RCe.ADAPTER.decode(protoReader);
                        break;
                    case 247:
                        rcz.origin_volume = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 248:
                        rcz.music_volume = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 249:
                        rcz.support_danmaku = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case LiveCoverMinSizeSetting.DEFAULT /* 250 */:
                        rcz.has_danmaku = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 251:
                        rcz.real_survey_info = C69276RGu.ADAPTER.decode(protoReader);
                        break;
                    case 252:
                        rcz.card = C69375RKp.ADAPTER.decode(protoReader);
                        break;
                    case 253:
                        rcz.ttec_suggest_words = C69265RGj.ADAPTER.decode(protoReader);
                        break;
                    case 255:
                        rcz.content_original_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 256:
                        rcz.shoot_tab_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 257:
                        rcz.content_type = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 258:
                        rcz.content_size_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 259:
                        rcz.is_tiktok_story = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 260:
                        rcz.is_sub_only_video = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 261:
                        rcz.is_nff_or_nr = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 262:
                        rcz.podcast_full_episode_item = RCZ.ADAPTER.decode(protoReader);
                        break;
                    case 263:
                        rcz.parameterized_speed = ProtoAdapter.FLOAT.decode(protoReader);
                        break;
                    case 264:
                        rcz.operator_boost_info.add(RHF.ADAPTER.decode(protoReader));
                        break;
                    case 265:
                        rcz.filter_unfriendly_user_comments = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 266:
                        rcz.filter_stranger_comments = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 267:
                        rcz.is_story_to_normal = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 268:
                        rcz.fake_landscape_video_info = C69262RGg.ADAPTER.decode(protoReader);
                        break;
                    case 269:
                        rcz.main_arch_common = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 270:
                        rcz.batch_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 271:
                        rcz.batch_index = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 272:
                        rcz.aigc_info = C69456RNs.ADAPTER.decode(protoReader);
                        break;
                    case 273:
                        rcz.ttt_product_recall_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 274:
                        rcz.related_live = C69387RLb.ADAPTER.decode(protoReader);
                        break;
                    case 275:
                        rcz.share_story_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 276:
                        rcz.add_yours_recommendation = RMZ.ADAPTER.decode(protoReader);
                        break;
                    case 277:
                        rcz.banners.add(RP6.ADAPTER.decode(protoReader));
                        break;
                    case 278:
                        rcz.picked_users.add(C69154RCc.ADAPTER.decode(protoReader));
                        break;
                    case 279:
                        rcz.standard_component_info = ROW.ADAPTER.decode(protoReader);
                        break;
                    case 280:
                        rcz.is_comment_post_video = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 281:
                        rcz.comment_post_video = ROQ.ADAPTER.decode(protoReader);
                        break;
                    case 282:
                        rcz.has_promote_entry = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 283:
                        rcz.promote_toast = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 284:
                        rcz.promote_toast_key = ProtoAdapter.STRING.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rcz;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RCZ rcz) {
        RCZ rcz2 = rcz;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, rcz2.desc) + protoAdapter.encodedSizeWithTag(1, rcz2.aweme_id);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, rcz2.create_time) + encodedSizeWithTag;
        ProtoAdapter<C69154RCc> protoAdapter3 = C69154RCc.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(4, rcz2.author) + encodedSizeWithTag2;
        ProtoAdapter<C69156RCe> protoAdapter4 = C69156RCe.ADAPTER;
        int encodedSizeWithTag4 = protoAdapter.encodedSizeWithTag(8, rcz2.share_url) + C69159RCh.ADAPTER.encodedSizeWithTag(7, rcz2.video) + C69160RCi.ADAPTER.asRepeated().encodedSizeWithTag(6, rcz2.cha_list) + protoAdapter4.encodedSizeWithTag(5, rcz2.music) + encodedSizeWithTag3;
        ProtoAdapter<Integer> protoAdapter5 = ProtoAdapter.INT32;
        int encodedSizeWithTag5 = protoAdapter5.encodedSizeWithTag(13, rcz2.rate) + protoAdapter.encodedSizeWithTag(12, rcz2.extra) + RE3.ADAPTER.encodedSizeWithTag(11, rcz2.status) + C69234RFe.ADAPTER.encodedSizeWithTag(10, rcz2.statistics) + protoAdapter5.encodedSizeWithTag(9, rcz2.user_digged) + encodedSizeWithTag4;
        ProtoAdapter<C69204REa> protoAdapter6 = C69204REa.ADAPTER;
        int encodedSizeWithTag6 = protoAdapter6.asRepeated().encodedSizeWithTag(14, rcz2.text_extra) + encodedSizeWithTag5;
        ProtoAdapter<REV> protoAdapter7 = REV.ADAPTER;
        int encodedSizeWithTag7 = RH9.ADAPTER.asRepeated().encodedSizeWithTag(24, rcz2.video_labels) + protoAdapter7.encodedSizeWithTag(23, rcz2.label_private) + protoAdapter7.encodedSizeWithTag(22, rcz2.label_music_starter) + protoAdapter.encodedSizeWithTag(21, rcz2.distance) + protoAdapter7.encodedSizeWithTag(20, rcz2.label_origin_author) + C69199RDv.ADAPTER.encodedSizeWithTag(19, rcz2.share_info) + protoAdapter7.encodedSizeWithTag(18, rcz2.label_top) + protoAdapter5.encodedSizeWithTag(17, rcz2.is_top) + protoAdapter7.encodedSizeWithTag(16, rcz2.label_thumb) + protoAdapter7.encodedSizeWithTag(15, rcz2.label_large) + encodedSizeWithTag6;
        ProtoAdapter<Boolean> protoAdapter8 = ProtoAdapter.BOOL;
        int encodedSizeWithTag8 = protoAdapter.encodedSizeWithTag(40, rcz2.sort_label) + protoAdapter7.encodedSizeWithTag(39, rcz2.label_friend) + protoAdapter8.encodedSizeWithTag(38, rcz2.is_relieve) + RGK.ADAPTER.encodedSizeWithTag(37, rcz2.risk_infos) + C69267RGl.ADAPTER.asRepeated().encodedSizeWithTag(36, rcz2.image_infos) + protoAdapter8.encodedSizeWithTag(35, rcz2.cmt_swt) + protoAdapter5.encodedSizeWithTag(30, rcz2.aweme_type) + protoAdapter5.encodedSizeWithTag(29, rcz2.duration) + protoAdapter8.encodedSizeWithTag(27, rcz2.is_ads) + protoAdapter.encodedSizeWithTag(26, rcz2.landing_page) + protoAdapter8.encodedSizeWithTag(25, rcz2.is_vr) + encodedSizeWithTag7;
        ProtoAdapter<RHN> protoAdapter9 = RHN.ADAPTER;
        int encodedSizeWithTag9 = protoAdapter.encodedSizeWithTag(49, rcz2.region) + protoAdapter8.encodedSizeWithTag(48, rcz2.is_pgcshow) + protoAdapter5.encodedSizeWithTag(47, rcz2.is_hash_tag) + protoAdapter.asRepeated().encodedSizeWithTag(46, rcz2.geofencing) + protoAdapter5.encodedSizeWithTag(45, rcz2.bodydance_score) + protoAdapter2.encodedSizeWithTag(44, rcz2.author_user_id) + protoAdapter9.asRepeated().encodedSizeWithTag(42, rcz2.uniqid_position) + protoAdapter9.asRepeated().encodedSizeWithTag(41, rcz2.position) + encodedSizeWithTag8;
        ProtoAdapter<RH6> protoAdapter10 = RH6.ADAPTER;
        int encodedSizeWithTag10 = protoAdapter.encodedSizeWithTag(57, rcz2.stickers) + protoAdapter10.asRepeated().encodedSizeWithTag(55, rcz2.label_top_text) + protoAdapter5.encodedSizeWithTag(54, rcz2.collect_stat) + protoAdapter.encodedSizeWithTag(53, rcz2.ad_schedule) + RGZ.ADAPTER.encodedSizeWithTag(52, rcz2.sp_sticker) + protoAdapter10.asRepeated().encodedSizeWithTag(50, rcz2.video_text) + encodedSizeWithTag9;
        ProtoAdapter<RCZ> protoAdapter11 = RCZ.ADAPTER;
        int encodedSizeWithTag11 = protoAdapter.encodedSizeWithTag(74, rcz2.link_ad_data) + protoAdapter8.encodedSizeWithTag(73, rcz2.with_promotional_music) + RFJ.ADAPTER.encodedSizeWithTag(72, rcz2.micro_app_info) + RN3.ADAPTER.encodedSizeWithTag(71, rcz2.game_info) + protoAdapter.encodedSizeWithTag(70, rcz2.raw_ad_data) + RMT.ADAPTER.encodedSizeWithTag(69, rcz2.descendants) + protoAdapter5.encodedSizeWithTag(68, rcz2.item_comment_settings) + protoAdapter9.asRepeated().encodedSizeWithTag(67, rcz2.challenge_position) + protoAdapter9.asRepeated().encodedSizeWithTag(66, rcz2.nickname_position) + protoAdapter8.encodedSizeWithTag(65, rcz2.prevent_download) + protoAdapter.encodedSizeWithTag(64, rcz2.pre_forward_id) + protoAdapter.encodedSizeWithTag(63, rcz2.group_id) + protoAdapter.encodedSizeWithTag(62, rcz2.forward_item_id) + protoAdapter.encodedSizeWithTag(59, rcz2.forward_comment_id) + protoAdapter11.encodedSizeWithTag(58, rcz2.forward_item) + encodedSizeWithTag10;
        ProtoAdapter<REM> protoAdapter12 = REM.ADAPTER;
        int encodedSizeWithTag12 = protoAdapter5.encodedSizeWithTag(81, rcz2.item_react) + protoAdapter5.encodedSizeWithTag(80, rcz2.item_duet) + RG3.ADAPTER.asRepeated().encodedSizeWithTag(79, rcz2.long_video) + RD1.ADAPTER.encodedSizeWithTag(78, rcz2.sticker_detail) + protoAdapter12.encodedSizeWithTag(77, rcz2.activity_pendant) + protoAdapter12.encodedSizeWithTag(76, rcz2.gesture_red_packet) + encodedSizeWithTag11;
        ProtoAdapter<C69245RFp> protoAdapter13 = C69245RFp.ADAPTER;
        int encodedSizeWithTag13 = C69279RGx.ADAPTER.encodedSizeWithTag(118, rcz2.banner_tip) + C69185RDh.ADAPTER.encodedSizeWithTag(116, rcz2.commerce_info) + RGO.ADAPTER.encodedSizeWithTag(115, rcz2.hot_list) + protoAdapter.encodedSizeWithTag(114, rcz2.simple_shop_seeding) + C69228REy.ADAPTER.encodedSizeWithTag(113, rcz2.mix_info) + RG9.ADAPTER.encodedSizeWithTag(112, rcz2.feed_relation_label) + RG4.ADAPTER.encodedSizeWithTag(111, rcz2.anchor) + protoAdapter8.encodedSizeWithTag(110, rcz2.has_vs_entry) + RH2.ADAPTER.encodedSizeWithTag(109, rcz2.aweme_control) + protoAdapter5.encodedSizeWithTag(108, rcz2.ad_aweme_source) + protoAdapter5.encodedSizeWithTag(107, rcz2.is_effect_designer) + C69235RFf.ADAPTER.encodedSizeWithTag(106, rcz2.video_control) + protoAdapter5.encodedSizeWithTag(105, rcz2.distribute_type) + protoAdapter8.encodedSizeWithTag(104, rcz2.enable_top_view) + RGV.ADAPTER.encodedSizeWithTag(103, rcz2.commerce_sticker_info) + RHY.ADAPTER.asRepeated().encodedSizeWithTag(102, rcz2.commerce_config_data) + protoAdapter.asRepeated().encodedSizeWithTag(101, rcz2.origin_comment_ids) + protoAdapter.encodedSizeWithTag(99, rcz2.misc_info) + protoAdapter.encodedSizeWithTag(98, rcz2.simple_promotions) + protoAdapter.encodedSizeWithTag(97, rcz2.take_down_desc) + protoAdapter5.encodedSizeWithTag(96, rcz2.take_down_reason) + protoAdapter5.encodedSizeWithTag(95, rcz2.ad_link_type) + RD8.ADAPTER.asRepeated().encodedSizeWithTag(93, rcz2.interaction_stickers) + RFU.ADAPTER.encodedSizeWithTag(92, rcz2.floating_card_content) + protoAdapter.encodedSizeWithTag(91, rcz2.desc_language) + RPY.ADAPTER.encodedSizeWithTag(90, rcz2.star_atlas_info) + protoAdapter.encodedSizeWithTag(89, rcz2.open_platform_name) + protoAdapter.encodedSizeWithTag(88, rcz2.ad_order_id) + protoAdapter.encodedSizeWithTag(87, rcz2.star_recommend_tag) + C69244RFo.ADAPTER.encodedSizeWithTag(86, rcz2.preload) + protoAdapter8.encodedSizeWithTag(85, rcz2.without_watermark) + protoAdapter.encodedSizeWithTag(84, rcz2.label_music_starter_text) + protoAdapter2.encodedSizeWithTag(83, rcz2.star_atlas_order_id) + protoAdapter13.encodedSizeWithTag(82, rcz2.hot_info) + encodedSizeWithTag12;
        ProtoAdapter<C69213REj> protoAdapter14 = C69213REj.ADAPTER;
        int encodedSizeWithTag14 = protoAdapter.encodedSizeWithTag(128, rcz2.video_feed_tag) + protoAdapter.encodedSizeWithTag(127, rcz2.live_reason) + RFH.ADAPTER.encodedSizeWithTag(126, rcz2.cell_room) + protoAdapter8.encodedSizeWithTag(125, rcz2.need_vs_entry) + protoAdapter8.encodedSizeWithTag(124, rcz2.is_familiar) + RGT.ADAPTER.encodedSizeWithTag(123, rcz2.cny_info) + C69466ROc.ADAPTER.encodedSizeWithTag(122, rcz2.vpa_info) + C69243RFn.ADAPTER.encodedSizeWithTag(121, rcz2.anchor_info) + protoAdapter14.encodedSizeWithTag(119, rcz2.acl_info) + encodedSizeWithTag13;
        ProtoAdapter<C69242RFm> protoAdapter15 = C69242RFm.ADAPTER;
        int encodedSizeWithTag15 = protoAdapter.encodedSizeWithTag(151, rcz2.city) + protoAdapter.asRepeated().encodedSizeWithTag(150, rcz2.geofencing_regions) + protoAdapter8.encodedSizeWithTag(149, rcz2.is_horizontal) + protoAdapter5.encodedSizeWithTag(148, rcz2.story_ttl) + protoAdapter8.encodedSizeWithTag(147, rcz2.show_sticker_guide) + protoAdapter5.encodedSizeWithTag(143, rcz2.item_stitch) + RP3.ADAPTER.encodedSizeWithTag(142, rcz2.vs_entry) + protoAdapter5.encodedSizeWithTag(141, rcz2.is_story) + RHL.ADAPTER.encodedSizeWithTag(139, rcz2.activity) + protoAdapter14.encodedSizeWithTag(138, rcz2.aweme_acl) + protoAdapter13.encodedSizeWithTag(137, rcz2.dou_discount_mix_info) + protoAdapter8.encodedSizeWithTag(136, rcz2.with_survey) + C69396RLk.ADAPTER.encodedSizeWithTag(135, rcz2.user_profile_init_info) + RH5.ADAPTER.encodedSizeWithTag(134, rcz2.relation_recommend_info) + RGW.ADAPTER.asRepeated().encodedSizeWithTag(133, rcz2.hybrid_label) + RDH.ADAPTER.asRepeated().encodedSizeWithTag(132, rcz2.anchors) + C69254RFy.ADAPTER.encodedSizeWithTag(131, rcz2.video_reply_info) + RGD.ADAPTER.encodedSizeWithTag(130, rcz2.link_match) + protoAdapter15.encodedSizeWithTag(129, rcz2.mask_info) + encodedSizeWithTag14;
        ProtoAdapter<RHS> protoAdapter16 = RHS.ADAPTER;
        int encodedSizeWithTag16 = C69263RGh.ADAPTER.encodedSizeWithTag(244, rcz2.animated_btn) + protoAdapter.encodedSizeWithTag(243, rcz2.trans_params) + protoAdapter.encodedSizeWithTag(242, rcz2.survey_key) + RG6.ADAPTER.encodedSizeWithTag(241, rcz2.comment_config) + C69472ROi.ADAPTER.encodedSizeWithTag(240, rcz2.animated_image_info) + C69260RGe.ADAPTER.encodedSizeWithTag(239, rcz2.promote) + protoAdapter5.encodedSizeWithTag(238, rcz2.music_title_style) + protoAdapter.asRepeated().encodedSizeWithTag(237, rcz2.reference_voice_filter_ids) + protoAdapter.asRepeated().encodedSizeWithTag(236, rcz2.voice_filter_ids) + protoAdapter.asRepeated().encodedSizeWithTag(235, rcz2.reference_tts_voice_ids) + protoAdapter.asRepeated().encodedSizeWithTag(234, rcz2.tts_voice_ids) + protoAdapter.encodedSizeWithTag(233, rcz2.music_selected_from) + C69256RGa.ADAPTER.encodedSizeWithTag(232, rcz2.original_client_text) + RKQ.ADAPTER.encodedSizeWithTag(231, rcz2.edit_post_permission) + C69281RGz.ADAPTER.encodedSizeWithTag(230, rcz2.ttm_info) + protoAdapter.encodedSizeWithTag(229, rcz2.text_sticker_major_lang) + protoAdapter8.encodedSizeWithTag(228, rcz2.is_text_sticker_translatable) + protoAdapter5.encodedSizeWithTag(227, rcz2.story_type) + protoAdapter.encodedSizeWithTag(226, rcz2.follow_up_item_id_groups) + protoAdapter.encodedSizeWithTag(225, rcz2.follow_up_first_item_id) + RDU.ADAPTER.encodedSizeWithTag(224, rcz2.podcast_info) + C69167RCp.ADAPTER.encodedSizeWithTag(223, rcz2.now_posts) + protoAdapter8.encodedSizeWithTag(222, rcz2.is_description_translatable) + REN.ADAPTER.encodedSizeWithTag(221, rcz2.poi_data) + protoAdapter8.encodedSizeWithTag(220, rcz2.should_add_creator_tts_watermark_when_downloading) + RFX.ADAPTER.encodedSizeWithTag(219, rcz2.rec_reason) + protoAdapter3.asRepeated().encodedSizeWithTag(218, rcz2.branded_content_accounts) + C69420RMi.ADAPTER.encodedSizeWithTag(217, rcz2.nearby_info) + RGR.ADAPTER.encodedSizeWithTag(216, rcz2.ad_story_video) + RN0.ADAPTER.encodedSizeWithTag(215, rcz2.share_to_story_info) + C69423RMl.ADAPTER.encodedSizeWithTag(214, rcz2.commerce_rerank_info) + C69453RNp.ADAPTER.encodedSizeWithTag(213, rcz2.upvote_preload) + protoAdapter5.encodedSizeWithTag(212, rcz2.retry_type) + protoAdapter5.encodedSizeWithTag(211, rcz2.music_end_time_in_ms) + protoAdapter5.encodedSizeWithTag(210, rcz2.music_begin_time_in_ms) + protoAdapter8.encodedSizeWithTag(209, rcz2.allow_reuse_original_sound) + protoAdapter.encodedSizeWithTag(208, rcz2.commercial_video_info) + RMW.ADAPTER.encodedSizeWithTag(207, rcz2.GroupIdList) + C69264RGi.ADAPTER.encodedSizeWithTag(206, rcz2.suggest_words) + RFQ.ADAPTER.encodedSizeWithTag(205, rcz2.image_post_info) + protoAdapter8.encodedSizeWithTag(204, rcz2.disable_search_trending_bar) + C69251RFv.ADAPTER.encodedSizeWithTag(203, rcz2.music_dsp_info) + RGH.ADAPTER.encodedSizeWithTag(202, rcz2.trending_bar_fyp) + protoAdapter2.encodedSizeWithTag(201, rcz2.follow_up_publish_from_id) + protoAdapter8.encodedSizeWithTag(200, rcz2.is_client_cache) + protoAdapter5.asRepeated().encodedSizeWithTag(199, rcz2.gap_list) + protoAdapter5.encodedSizeWithTag(198, rcz2.pred_playtime) + protoAdapter8.encodedSizeWithTag(197, rcz2.enable_ad_drop) + protoAdapter8.encodedSizeWithTag(196, rcz2.enable_pos_adjust) + protoAdapter5.encodedSizeWithTag(195, rcz2.item_source_category) + protoAdapter.encodedSizeWithTag(194, rcz2.extra_info) + C69414RMc.ADAPTER.encodedSizeWithTag(193, rcz2.duet_info) + protoAdapter6.asRepeated().encodedSizeWithTag(191, rcz2.content_desc_extra) + protoAdapter.encodedSizeWithTag(190, rcz2.content_desc) + RG8.ADAPTER.encodedSizeWithTag(189, rcz2.interaction_tag_info) + protoAdapter5.encodedSizeWithTag(188, rcz2.deduplication_type) + RFR.ADAPTER.encodedSizeWithTag(187, rcz2.upvote_reason) + RGC.ADAPTER.encodedSizeWithTag(186, rcz2.audio) + RGX.ADAPTER.asRepeated().encodedSizeWithTag(185, rcz2.question_list) + protoAdapter.encodedSizeWithTag(183, rcz2.item_distribute_source) + RG2.ADAPTER.encodedSizeWithTag(182, rcz2.interact_permission) + RGJ.ADAPTER.encodedSizeWithTag(181, rcz2.story_metadata) + REC.ADAPTER.encodedSizeWithTag(180, rcz2.user_story) + RGI.ADAPTER.encodedSizeWithTag(174, rcz2.trending_bar) + C69469ROf.ADAPTER.encodedSizeWithTag(173, rcz2.stitch_permission) + RGY.ADAPTER.asRepeated().encodedSizeWithTag(172, rcz2.green_screen_materials) + protoAdapter.encodedSizeWithTag(171, rcz2.part_n) + protoAdapter8.encodedSizeWithTag(170, rcz2.playlist_blocked) + C69497RPh.ADAPTER.encodedSizeWithTag(169, rcz2.stitch) + protoAdapter5.encodedSizeWithTag(168, rcz2.sound_exemption) + RKU.ADAPTER.encodedSizeWithTag(167, rcz2.playlist_info) + C69372RKm.ADAPTER.encodedSizeWithTag(165, rcz2.bottom_bar) + RMN.ADAPTER.encodedSizeWithTag(164, rcz2.boost_tag_info) + protoAdapter15.asRepeated().encodedSizeWithTag(163, rcz2.mask_infos) + protoAdapter16.encodedSizeWithTag(162, rcz2.mutual_relation) + protoAdapter8.encodedSizeWithTag(161, rcz2.allow_gift) + protoAdapter.encodedSizeWithTag(160, rcz2.anchors_extras) + protoAdapter16.encodedSizeWithTag(154, rcz2.mutual_relation_tmp) + encodedSizeWithTag15;
        ProtoAdapter<C69276RGu> protoAdapter17 = C69276RGu.ADAPTER;
        return rcz2.unknownFields().size() + protoAdapter.encodedSizeWithTag(284, rcz2.promote_toast_key) + protoAdapter.encodedSizeWithTag(283, rcz2.promote_toast) + protoAdapter5.encodedSizeWithTag(282, rcz2.has_promote_entry) + ROQ.ADAPTER.encodedSizeWithTag(281, rcz2.comment_post_video) + protoAdapter8.encodedSizeWithTag(280, rcz2.is_comment_post_video) + ROW.ADAPTER.encodedSizeWithTag(279, rcz2.standard_component_info) + protoAdapter3.asRepeated().encodedSizeWithTag(278, rcz2.picked_users) + RP6.ADAPTER.asRepeated().encodedSizeWithTag(277, rcz2.banners) + RMZ.ADAPTER.encodedSizeWithTag(276, rcz2.add_yours_recommendation) + protoAdapter5.encodedSizeWithTag(275, rcz2.share_story_status) + C69387RLb.ADAPTER.encodedSizeWithTag(274, rcz2.related_live) + protoAdapter5.encodedSizeWithTag(273, rcz2.ttt_product_recall_type) + C69456RNs.ADAPTER.encodedSizeWithTag(272, rcz2.aigc_info) + protoAdapter5.encodedSizeWithTag(271, rcz2.batch_index) + protoAdapter.encodedSizeWithTag(270, rcz2.batch_id) + protoAdapter.encodedSizeWithTag(269, rcz2.main_arch_common) + C69262RGg.ADAPTER.encodedSizeWithTag(268, rcz2.fake_landscape_video_info) + protoAdapter8.encodedSizeWithTag(267, rcz2.is_story_to_normal) + protoAdapter8.encodedSizeWithTag(266, rcz2.filter_stranger_comments) + protoAdapter8.encodedSizeWithTag(265, rcz2.filter_unfriendly_user_comments) + RHF.ADAPTER.asRepeated().encodedSizeWithTag(264, rcz2.operator_boost_info) + ProtoAdapter.FLOAT.encodedSizeWithTag(263, rcz2.parameterized_speed) + protoAdapter11.encodedSizeWithTag(262, rcz2.podcast_full_episode_item) + protoAdapter8.encodedSizeWithTag(261, rcz2.is_nff_or_nr) + protoAdapter8.encodedSizeWithTag(260, rcz2.is_sub_only_video) + protoAdapter8.encodedSizeWithTag(259, rcz2.is_tiktok_story) + protoAdapter5.encodedSizeWithTag(258, rcz2.content_size_type) + protoAdapter.encodedSizeWithTag(257, rcz2.content_type) + protoAdapter.encodedSizeWithTag(256, rcz2.shoot_tab_name) + protoAdapter5.encodedSizeWithTag(255, rcz2.content_original_type) + C69265RGj.ADAPTER.encodedSizeWithTag(253, rcz2.ttec_suggest_words) + C69375RKp.ADAPTER.encodedSizeWithTag(252, rcz2.card) + protoAdapter17.encodedSizeWithTag(251, rcz2.real_survey_info) + protoAdapter8.encodedSizeWithTag(LiveCoverMinSizeSetting.DEFAULT, rcz2.has_danmaku) + protoAdapter8.encodedSizeWithTag(249, rcz2.support_danmaku) + protoAdapter.encodedSizeWithTag(248, rcz2.music_volume) + protoAdapter.encodedSizeWithTag(247, rcz2.origin_volume) + protoAdapter4.encodedSizeWithTag(246, rcz2.added_sound_music_info) + protoAdapter17.asRepeated().encodedSizeWithTag(245, rcz2.survey_info) + encodedSizeWithTag16;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RCZ rcz) {
        RCZ rcz2 = rcz;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rcz2.aweme_id);
        protoAdapter.encodeWithTag(protoWriter, 2, rcz2.desc);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, rcz2.create_time);
        ProtoAdapter<C69154RCc> protoAdapter3 = C69154RCc.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 4, rcz2.author);
        ProtoAdapter<C69156RCe> protoAdapter4 = C69156RCe.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 5, rcz2.music);
        C69160RCi.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, rcz2.cha_list);
        C69159RCh.ADAPTER.encodeWithTag(protoWriter, 7, rcz2.video);
        protoAdapter.encodeWithTag(protoWriter, 8, rcz2.share_url);
        ProtoAdapter<Integer> protoAdapter5 = ProtoAdapter.INT32;
        protoAdapter5.encodeWithTag(protoWriter, 9, rcz2.user_digged);
        C69234RFe.ADAPTER.encodeWithTag(protoWriter, 10, rcz2.statistics);
        RE3.ADAPTER.encodeWithTag(protoWriter, 11, rcz2.status);
        protoAdapter.encodeWithTag(protoWriter, 12, rcz2.extra);
        protoAdapter5.encodeWithTag(protoWriter, 13, rcz2.rate);
        ProtoAdapter<C69204REa> protoAdapter6 = C69204REa.ADAPTER;
        protoAdapter6.asRepeated().encodeWithTag(protoWriter, 14, rcz2.text_extra);
        ProtoAdapter<REV> protoAdapter7 = REV.ADAPTER;
        protoAdapter7.encodeWithTag(protoWriter, 15, rcz2.label_large);
        protoAdapter7.encodeWithTag(protoWriter, 16, rcz2.label_thumb);
        protoAdapter5.encodeWithTag(protoWriter, 17, rcz2.is_top);
        protoAdapter7.encodeWithTag(protoWriter, 18, rcz2.label_top);
        C69199RDv.ADAPTER.encodeWithTag(protoWriter, 19, rcz2.share_info);
        protoAdapter7.encodeWithTag(protoWriter, 20, rcz2.label_origin_author);
        protoAdapter.encodeWithTag(protoWriter, 21, rcz2.distance);
        protoAdapter7.encodeWithTag(protoWriter, 22, rcz2.label_music_starter);
        protoAdapter7.encodeWithTag(protoWriter, 23, rcz2.label_private);
        RH9.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, rcz2.video_labels);
        ProtoAdapter<Boolean> protoAdapter8 = ProtoAdapter.BOOL;
        protoAdapter8.encodeWithTag(protoWriter, 25, rcz2.is_vr);
        protoAdapter.encodeWithTag(protoWriter, 26, rcz2.landing_page);
        protoAdapter8.encodeWithTag(protoWriter, 27, rcz2.is_ads);
        protoAdapter5.encodeWithTag(protoWriter, 29, rcz2.duration);
        protoAdapter5.encodeWithTag(protoWriter, 30, rcz2.aweme_type);
        protoAdapter8.encodeWithTag(protoWriter, 35, rcz2.cmt_swt);
        C69267RGl.ADAPTER.asRepeated().encodeWithTag(protoWriter, 36, rcz2.image_infos);
        RGK.ADAPTER.encodeWithTag(protoWriter, 37, rcz2.risk_infos);
        protoAdapter8.encodeWithTag(protoWriter, 38, rcz2.is_relieve);
        protoAdapter7.encodeWithTag(protoWriter, 39, rcz2.label_friend);
        protoAdapter.encodeWithTag(protoWriter, 40, rcz2.sort_label);
        ProtoAdapter<RHN> protoAdapter9 = RHN.ADAPTER;
        protoAdapter9.asRepeated().encodeWithTag(protoWriter, 41, rcz2.position);
        protoAdapter9.asRepeated().encodeWithTag(protoWriter, 42, rcz2.uniqid_position);
        protoAdapter2.encodeWithTag(protoWriter, 44, rcz2.author_user_id);
        protoAdapter5.encodeWithTag(protoWriter, 45, rcz2.bodydance_score);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 46, rcz2.geofencing);
        protoAdapter5.encodeWithTag(protoWriter, 47, rcz2.is_hash_tag);
        protoAdapter8.encodeWithTag(protoWriter, 48, rcz2.is_pgcshow);
        protoAdapter.encodeWithTag(protoWriter, 49, rcz2.region);
        ProtoAdapter<RH6> protoAdapter10 = RH6.ADAPTER;
        protoAdapter10.asRepeated().encodeWithTag(protoWriter, 50, rcz2.video_text);
        RGZ.ADAPTER.encodeWithTag(protoWriter, 52, rcz2.sp_sticker);
        protoAdapter.encodeWithTag(protoWriter, 53, rcz2.ad_schedule);
        protoAdapter5.encodeWithTag(protoWriter, 54, rcz2.collect_stat);
        protoAdapter10.asRepeated().encodeWithTag(protoWriter, 55, rcz2.label_top_text);
        protoAdapter.encodeWithTag(protoWriter, 57, rcz2.stickers);
        ProtoAdapter<RCZ> protoAdapter11 = RCZ.ADAPTER;
        protoAdapter11.encodeWithTag(protoWriter, 58, rcz2.forward_item);
        protoAdapter.encodeWithTag(protoWriter, 59, rcz2.forward_comment_id);
        protoAdapter.encodeWithTag(protoWriter, 62, rcz2.forward_item_id);
        protoAdapter.encodeWithTag(protoWriter, 63, rcz2.group_id);
        protoAdapter.encodeWithTag(protoWriter, 64, rcz2.pre_forward_id);
        protoAdapter8.encodeWithTag(protoWriter, 65, rcz2.prevent_download);
        protoAdapter9.asRepeated().encodeWithTag(protoWriter, 66, rcz2.nickname_position);
        protoAdapter9.asRepeated().encodeWithTag(protoWriter, 67, rcz2.challenge_position);
        protoAdapter5.encodeWithTag(protoWriter, 68, rcz2.item_comment_settings);
        RMT.ADAPTER.encodeWithTag(protoWriter, 69, rcz2.descendants);
        protoAdapter.encodeWithTag(protoWriter, 70, rcz2.raw_ad_data);
        RN3.ADAPTER.encodeWithTag(protoWriter, 71, rcz2.game_info);
        RFJ.ADAPTER.encodeWithTag(protoWriter, 72, rcz2.micro_app_info);
        protoAdapter8.encodeWithTag(protoWriter, 73, rcz2.with_promotional_music);
        protoAdapter.encodeWithTag(protoWriter, 74, rcz2.link_ad_data);
        ProtoAdapter<REM> protoAdapter12 = REM.ADAPTER;
        protoAdapter12.encodeWithTag(protoWriter, 76, rcz2.gesture_red_packet);
        protoAdapter12.encodeWithTag(protoWriter, 77, rcz2.activity_pendant);
        RD1.ADAPTER.encodeWithTag(protoWriter, 78, rcz2.sticker_detail);
        RG3.ADAPTER.asRepeated().encodeWithTag(protoWriter, 79, rcz2.long_video);
        protoAdapter5.encodeWithTag(protoWriter, 80, rcz2.item_duet);
        protoAdapter5.encodeWithTag(protoWriter, 81, rcz2.item_react);
        ProtoAdapter<C69245RFp> protoAdapter13 = C69245RFp.ADAPTER;
        protoAdapter13.encodeWithTag(protoWriter, 82, rcz2.hot_info);
        protoAdapter2.encodeWithTag(protoWriter, 83, rcz2.star_atlas_order_id);
        protoAdapter.encodeWithTag(protoWriter, 84, rcz2.label_music_starter_text);
        protoAdapter8.encodeWithTag(protoWriter, 85, rcz2.without_watermark);
        C69244RFo.ADAPTER.encodeWithTag(protoWriter, 86, rcz2.preload);
        protoAdapter.encodeWithTag(protoWriter, 87, rcz2.star_recommend_tag);
        protoAdapter.encodeWithTag(protoWriter, 88, rcz2.ad_order_id);
        protoAdapter.encodeWithTag(protoWriter, 89, rcz2.open_platform_name);
        RPY.ADAPTER.encodeWithTag(protoWriter, 90, rcz2.star_atlas_info);
        protoAdapter.encodeWithTag(protoWriter, 91, rcz2.desc_language);
        RFU.ADAPTER.encodeWithTag(protoWriter, 92, rcz2.floating_card_content);
        RD8.ADAPTER.asRepeated().encodeWithTag(protoWriter, 93, rcz2.interaction_stickers);
        protoAdapter5.encodeWithTag(protoWriter, 95, rcz2.ad_link_type);
        protoAdapter5.encodeWithTag(protoWriter, 96, rcz2.take_down_reason);
        protoAdapter.encodeWithTag(protoWriter, 97, rcz2.take_down_desc);
        protoAdapter.encodeWithTag(protoWriter, 98, rcz2.simple_promotions);
        protoAdapter.encodeWithTag(protoWriter, 99, rcz2.misc_info);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 101, rcz2.origin_comment_ids);
        RHY.ADAPTER.asRepeated().encodeWithTag(protoWriter, 102, rcz2.commerce_config_data);
        RGV.ADAPTER.encodeWithTag(protoWriter, 103, rcz2.commerce_sticker_info);
        protoAdapter8.encodeWithTag(protoWriter, 104, rcz2.enable_top_view);
        protoAdapter5.encodeWithTag(protoWriter, 105, rcz2.distribute_type);
        C69235RFf.ADAPTER.encodeWithTag(protoWriter, 106, rcz2.video_control);
        protoAdapter5.encodeWithTag(protoWriter, 107, rcz2.is_effect_designer);
        protoAdapter5.encodeWithTag(protoWriter, 108, rcz2.ad_aweme_source);
        RH2.ADAPTER.encodeWithTag(protoWriter, 109, rcz2.aweme_control);
        protoAdapter8.encodeWithTag(protoWriter, 110, rcz2.has_vs_entry);
        RG4.ADAPTER.encodeWithTag(protoWriter, 111, rcz2.anchor);
        RG9.ADAPTER.encodeWithTag(protoWriter, 112, rcz2.feed_relation_label);
        C69228REy.ADAPTER.encodeWithTag(protoWriter, 113, rcz2.mix_info);
        protoAdapter.encodeWithTag(protoWriter, 114, rcz2.simple_shop_seeding);
        RGO.ADAPTER.encodeWithTag(protoWriter, 115, rcz2.hot_list);
        C69185RDh.ADAPTER.encodeWithTag(protoWriter, 116, rcz2.commerce_info);
        C69279RGx.ADAPTER.encodeWithTag(protoWriter, 118, rcz2.banner_tip);
        ProtoAdapter<C69213REj> protoAdapter14 = C69213REj.ADAPTER;
        protoAdapter14.encodeWithTag(protoWriter, 119, rcz2.acl_info);
        C69243RFn.ADAPTER.encodeWithTag(protoWriter, 121, rcz2.anchor_info);
        C69466ROc.ADAPTER.encodeWithTag(protoWriter, 122, rcz2.vpa_info);
        RGT.ADAPTER.encodeWithTag(protoWriter, 123, rcz2.cny_info);
        protoAdapter8.encodeWithTag(protoWriter, 124, rcz2.is_familiar);
        protoAdapter8.encodeWithTag(protoWriter, 125, rcz2.need_vs_entry);
        RFH.ADAPTER.encodeWithTag(protoWriter, 126, rcz2.cell_room);
        protoAdapter.encodeWithTag(protoWriter, 127, rcz2.live_reason);
        protoAdapter.encodeWithTag(protoWriter, 128, rcz2.video_feed_tag);
        ProtoAdapter<C69242RFm> protoAdapter15 = C69242RFm.ADAPTER;
        protoAdapter15.encodeWithTag(protoWriter, 129, rcz2.mask_info);
        RGD.ADAPTER.encodeWithTag(protoWriter, 130, rcz2.link_match);
        C69254RFy.ADAPTER.encodeWithTag(protoWriter, 131, rcz2.video_reply_info);
        RDH.ADAPTER.asRepeated().encodeWithTag(protoWriter, 132, rcz2.anchors);
        RGW.ADAPTER.asRepeated().encodeWithTag(protoWriter, 133, rcz2.hybrid_label);
        RH5.ADAPTER.encodeWithTag(protoWriter, 134, rcz2.relation_recommend_info);
        C69396RLk.ADAPTER.encodeWithTag(protoWriter, 135, rcz2.user_profile_init_info);
        protoAdapter8.encodeWithTag(protoWriter, 136, rcz2.with_survey);
        protoAdapter13.encodeWithTag(protoWriter, 137, rcz2.dou_discount_mix_info);
        protoAdapter14.encodeWithTag(protoWriter, 138, rcz2.aweme_acl);
        RHL.ADAPTER.encodeWithTag(protoWriter, 139, rcz2.activity);
        protoAdapter5.encodeWithTag(protoWriter, 141, rcz2.is_story);
        RP3.ADAPTER.encodeWithTag(protoWriter, 142, rcz2.vs_entry);
        protoAdapter5.encodeWithTag(protoWriter, 143, rcz2.item_stitch);
        protoAdapter8.encodeWithTag(protoWriter, 147, rcz2.show_sticker_guide);
        protoAdapter5.encodeWithTag(protoWriter, 148, rcz2.story_ttl);
        protoAdapter8.encodeWithTag(protoWriter, 149, rcz2.is_horizontal);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 150, rcz2.geofencing_regions);
        protoAdapter.encodeWithTag(protoWriter, 151, rcz2.city);
        ProtoAdapter<RHS> protoAdapter16 = RHS.ADAPTER;
        protoAdapter16.encodeWithTag(protoWriter, 154, rcz2.mutual_relation_tmp);
        protoAdapter.encodeWithTag(protoWriter, 160, rcz2.anchors_extras);
        protoAdapter8.encodeWithTag(protoWriter, 161, rcz2.allow_gift);
        protoAdapter16.encodeWithTag(protoWriter, 162, rcz2.mutual_relation);
        protoAdapter15.asRepeated().encodeWithTag(protoWriter, 163, rcz2.mask_infos);
        RMN.ADAPTER.encodeWithTag(protoWriter, 164, rcz2.boost_tag_info);
        C69372RKm.ADAPTER.encodeWithTag(protoWriter, 165, rcz2.bottom_bar);
        RKU.ADAPTER.encodeWithTag(protoWriter, 167, rcz2.playlist_info);
        protoAdapter5.encodeWithTag(protoWriter, 168, rcz2.sound_exemption);
        C69497RPh.ADAPTER.encodeWithTag(protoWriter, 169, rcz2.stitch);
        protoAdapter8.encodeWithTag(protoWriter, 170, rcz2.playlist_blocked);
        protoAdapter.encodeWithTag(protoWriter, 171, rcz2.part_n);
        RGY.ADAPTER.asRepeated().encodeWithTag(protoWriter, 172, rcz2.green_screen_materials);
        C69469ROf.ADAPTER.encodeWithTag(protoWriter, 173, rcz2.stitch_permission);
        RGI.ADAPTER.encodeWithTag(protoWriter, 174, rcz2.trending_bar);
        REC.ADAPTER.encodeWithTag(protoWriter, 180, rcz2.user_story);
        RGJ.ADAPTER.encodeWithTag(protoWriter, 181, rcz2.story_metadata);
        RG2.ADAPTER.encodeWithTag(protoWriter, 182, rcz2.interact_permission);
        protoAdapter.encodeWithTag(protoWriter, 183, rcz2.item_distribute_source);
        RGX.ADAPTER.asRepeated().encodeWithTag(protoWriter, 185, rcz2.question_list);
        RGC.ADAPTER.encodeWithTag(protoWriter, 186, rcz2.audio);
        RFR.ADAPTER.encodeWithTag(protoWriter, 187, rcz2.upvote_reason);
        protoAdapter5.encodeWithTag(protoWriter, 188, rcz2.deduplication_type);
        RG8.ADAPTER.encodeWithTag(protoWriter, 189, rcz2.interaction_tag_info);
        protoAdapter.encodeWithTag(protoWriter, 190, rcz2.content_desc);
        protoAdapter6.asRepeated().encodeWithTag(protoWriter, 191, rcz2.content_desc_extra);
        C69414RMc.ADAPTER.encodeWithTag(protoWriter, 193, rcz2.duet_info);
        protoAdapter.encodeWithTag(protoWriter, 194, rcz2.extra_info);
        protoAdapter5.encodeWithTag(protoWriter, 195, rcz2.item_source_category);
        protoAdapter8.encodeWithTag(protoWriter, 196, rcz2.enable_pos_adjust);
        protoAdapter8.encodeWithTag(protoWriter, 197, rcz2.enable_ad_drop);
        protoAdapter5.encodeWithTag(protoWriter, 198, rcz2.pred_playtime);
        protoAdapter5.asRepeated().encodeWithTag(protoWriter, 199, rcz2.gap_list);
        protoAdapter8.encodeWithTag(protoWriter, 200, rcz2.is_client_cache);
        protoAdapter2.encodeWithTag(protoWriter, 201, rcz2.follow_up_publish_from_id);
        RGH.ADAPTER.encodeWithTag(protoWriter, 202, rcz2.trending_bar_fyp);
        C69251RFv.ADAPTER.encodeWithTag(protoWriter, 203, rcz2.music_dsp_info);
        protoAdapter8.encodeWithTag(protoWriter, 204, rcz2.disable_search_trending_bar);
        RFQ.ADAPTER.encodeWithTag(protoWriter, 205, rcz2.image_post_info);
        C69264RGi.ADAPTER.encodeWithTag(protoWriter, 206, rcz2.suggest_words);
        RMW.ADAPTER.encodeWithTag(protoWriter, 207, rcz2.GroupIdList);
        protoAdapter.encodeWithTag(protoWriter, 208, rcz2.commercial_video_info);
        protoAdapter8.encodeWithTag(protoWriter, 209, rcz2.allow_reuse_original_sound);
        protoAdapter5.encodeWithTag(protoWriter, 210, rcz2.music_begin_time_in_ms);
        protoAdapter5.encodeWithTag(protoWriter, 211, rcz2.music_end_time_in_ms);
        protoAdapter5.encodeWithTag(protoWriter, 212, rcz2.retry_type);
        C69453RNp.ADAPTER.encodeWithTag(protoWriter, 213, rcz2.upvote_preload);
        C69423RMl.ADAPTER.encodeWithTag(protoWriter, 214, rcz2.commerce_rerank_info);
        RN0.ADAPTER.encodeWithTag(protoWriter, 215, rcz2.share_to_story_info);
        RGR.ADAPTER.encodeWithTag(protoWriter, 216, rcz2.ad_story_video);
        C69420RMi.ADAPTER.encodeWithTag(protoWriter, 217, rcz2.nearby_info);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 218, rcz2.branded_content_accounts);
        RFX.ADAPTER.encodeWithTag(protoWriter, 219, rcz2.rec_reason);
        protoAdapter8.encodeWithTag(protoWriter, 220, rcz2.should_add_creator_tts_watermark_when_downloading);
        REN.ADAPTER.encodeWithTag(protoWriter, 221, rcz2.poi_data);
        protoAdapter8.encodeWithTag(protoWriter, 222, rcz2.is_description_translatable);
        C69167RCp.ADAPTER.encodeWithTag(protoWriter, 223, rcz2.now_posts);
        RDU.ADAPTER.encodeWithTag(protoWriter, 224, rcz2.podcast_info);
        protoAdapter.encodeWithTag(protoWriter, 225, rcz2.follow_up_first_item_id);
        protoAdapter.encodeWithTag(protoWriter, 226, rcz2.follow_up_item_id_groups);
        protoAdapter5.encodeWithTag(protoWriter, 227, rcz2.story_type);
        protoAdapter8.encodeWithTag(protoWriter, 228, rcz2.is_text_sticker_translatable);
        protoAdapter.encodeWithTag(protoWriter, 229, rcz2.text_sticker_major_lang);
        C69281RGz.ADAPTER.encodeWithTag(protoWriter, 230, rcz2.ttm_info);
        RKQ.ADAPTER.encodeWithTag(protoWriter, 231, rcz2.edit_post_permission);
        C69256RGa.ADAPTER.encodeWithTag(protoWriter, 232, rcz2.original_client_text);
        protoAdapter.encodeWithTag(protoWriter, 233, rcz2.music_selected_from);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 234, rcz2.tts_voice_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 235, rcz2.reference_tts_voice_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 236, rcz2.voice_filter_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 237, rcz2.reference_voice_filter_ids);
        protoAdapter5.encodeWithTag(protoWriter, 238, rcz2.music_title_style);
        C69260RGe.ADAPTER.encodeWithTag(protoWriter, 239, rcz2.promote);
        C69472ROi.ADAPTER.encodeWithTag(protoWriter, 240, rcz2.animated_image_info);
        RG6.ADAPTER.encodeWithTag(protoWriter, 241, rcz2.comment_config);
        protoAdapter.encodeWithTag(protoWriter, 242, rcz2.survey_key);
        protoAdapter.encodeWithTag(protoWriter, 243, rcz2.trans_params);
        C69263RGh.ADAPTER.encodeWithTag(protoWriter, 244, rcz2.animated_btn);
        ProtoAdapter<C69276RGu> protoAdapter17 = C69276RGu.ADAPTER;
        protoAdapter17.asRepeated().encodeWithTag(protoWriter, 245, rcz2.survey_info);
        protoAdapter4.encodeWithTag(protoWriter, 246, rcz2.added_sound_music_info);
        protoAdapter.encodeWithTag(protoWriter, 247, rcz2.origin_volume);
        protoAdapter.encodeWithTag(protoWriter, 248, rcz2.music_volume);
        protoAdapter8.encodeWithTag(protoWriter, 249, rcz2.support_danmaku);
        protoAdapter8.encodeWithTag(protoWriter, LiveCoverMinSizeSetting.DEFAULT, rcz2.has_danmaku);
        protoAdapter17.encodeWithTag(protoWriter, 251, rcz2.real_survey_info);
        C69375RKp.ADAPTER.encodeWithTag(protoWriter, 252, rcz2.card);
        C69265RGj.ADAPTER.encodeWithTag(protoWriter, 253, rcz2.ttec_suggest_words);
        protoAdapter5.encodeWithTag(protoWriter, 255, rcz2.content_original_type);
        protoAdapter.encodeWithTag(protoWriter, 256, rcz2.shoot_tab_name);
        protoAdapter.encodeWithTag(protoWriter, 257, rcz2.content_type);
        protoAdapter5.encodeWithTag(protoWriter, 258, rcz2.content_size_type);
        protoAdapter8.encodeWithTag(protoWriter, 259, rcz2.is_tiktok_story);
        protoAdapter8.encodeWithTag(protoWriter, 260, rcz2.is_sub_only_video);
        protoAdapter8.encodeWithTag(protoWriter, 261, rcz2.is_nff_or_nr);
        protoAdapter11.encodeWithTag(protoWriter, 262, rcz2.podcast_full_episode_item);
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 263, rcz2.parameterized_speed);
        RHF.ADAPTER.asRepeated().encodeWithTag(protoWriter, 264, rcz2.operator_boost_info);
        protoAdapter8.encodeWithTag(protoWriter, 265, rcz2.filter_unfriendly_user_comments);
        protoAdapter8.encodeWithTag(protoWriter, 266, rcz2.filter_stranger_comments);
        protoAdapter8.encodeWithTag(protoWriter, 267, rcz2.is_story_to_normal);
        C69262RGg.ADAPTER.encodeWithTag(protoWriter, 268, rcz2.fake_landscape_video_info);
        protoAdapter.encodeWithTag(protoWriter, 269, rcz2.main_arch_common);
        protoAdapter.encodeWithTag(protoWriter, 270, rcz2.batch_id);
        protoAdapter5.encodeWithTag(protoWriter, 271, rcz2.batch_index);
        C69456RNs.ADAPTER.encodeWithTag(protoWriter, 272, rcz2.aigc_info);
        protoAdapter5.encodeWithTag(protoWriter, 273, rcz2.ttt_product_recall_type);
        C69387RLb.ADAPTER.encodeWithTag(protoWriter, 274, rcz2.related_live);
        protoAdapter5.encodeWithTag(protoWriter, 275, rcz2.share_story_status);
        RMZ.ADAPTER.encodeWithTag(protoWriter, 276, rcz2.add_yours_recommendation);
        RP6.ADAPTER.asRepeated().encodeWithTag(protoWriter, 277, rcz2.banners);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 278, rcz2.picked_users);
        ROW.ADAPTER.encodeWithTag(protoWriter, 279, rcz2.standard_component_info);
        protoAdapter8.encodeWithTag(protoWriter, 280, rcz2.is_comment_post_video);
        ROQ.ADAPTER.encodeWithTag(protoWriter, 281, rcz2.comment_post_video);
        protoAdapter5.encodeWithTag(protoWriter, 282, rcz2.has_promote_entry);
        protoAdapter.encodeWithTag(protoWriter, 283, rcz2.promote_toast);
        protoAdapter.encodeWithTag(protoWriter, 284, rcz2.promote_toast_key);
        protoWriter.writeBytes(rcz2.unknownFields());
    }
}
