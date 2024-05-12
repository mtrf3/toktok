package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
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

/* renamed from: X.RCb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69153RCb extends ProtoAdapter<C69154RCc> {
    public C69153RCb() {
        super(FieldEncoding.LENGTH_DELIMITED, C69154RCc.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69154RCc decode(ProtoReader protoReader) {
        C69154RCc c69154RCc = new C69154RCc();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69154RCc.uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69154RCc.short_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69154RCc.nickname = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69154RCc.gender = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69154RCc.signature = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c69154RCc.avatar_larger = REV.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c69154RCc.avatar_thumb = REV.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69154RCc.avatar_medium = REV.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69154RCc.birthday = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    case 19:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 50:
                    case 51:
                    case 52:
                    case 57:
                    case 60:
                    case 63:
                    case 66:
                    case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                    case 90:
                    case 95:
                    case 96:
                    case 100:
                    case 104:
                    case 117:
                    case 118:
                    case 125:
                    case 129:
                    case 154:
                    case 155:
                    case 156:
                    case 157:
                    case 159:
                    case 166:
                    case 188:
                    case 193:
                    case 194:
                    case 201:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 12:
                        c69154RCc.follow_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69154RCc.aweme_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 14:
                        c69154RCc.following_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 15:
                        c69154RCc.follower_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69154RCc.favoriting_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 17:
                        c69154RCc.total_favorited = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 18:
                        c69154RCc.is_block = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 20:
                        c69154RCc.hide_search = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 25:
                        c69154RCc.custom_verify = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 26:
                        c69154RCc.unique_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 27:
                        c69154RCc.bind_phone = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 28:
                        c69154RCc.special_lock = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 29:
                        c69154RCc.need_recommend = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 36:
                        c69154RCc.recommend_reason = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 37:
                        c69154RCc.has_facebook_token = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 38:
                        c69154RCc.has_twitter_token = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 39:
                        c69154RCc.fb_expire_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        c69154RCc.tw_expire_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 41:
                        c69154RCc.has_youtube_token = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 42:
                        c69154RCc.youtube_expire_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                        c69154RCc.room_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 44:
                        c69154RCc.live_verify = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 45:
                        c69154RCc.authority_status = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 46:
                        c69154RCc.verify_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 47:
                        c69154RCc.shield_follow_notice = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                        c69154RCc.shield_digg_notice = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case C61447O9r.LJIIJ:
                        c69154RCc.shield_comment_notice = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 53:
                        c69154RCc.share_info = C69199RDv.ADAPTER.decode(protoReader);
                        break;
                    case 54:
                        c69154RCc.with_commerce_entry = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 55:
                        c69154RCc.verification_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 56:
                        c69154RCc.original_musician = C69261RGf.ADAPTER.decode(protoReader);
                        break;
                    case 58:
                        c69154RCc.enterprise_verify_reason = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 59:
                        c69154RCc.is_ad_fake = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 61:
                        c69154RCc.mplatform_followers_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case BaseNotice.CREATOR /* 62 */:
                        c69154RCc.followers_detail.add(RGP.ADAPTER.decode(protoReader));
                        break;
                    case 64:
                        c69154RCc.region = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 65:
                        c69154RCc.account_region = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 67:
                        c69154RCc.commerce_user_level = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 68:
                        c69154RCc.commerce_info = RFV.ADAPTER.decode(protoReader);
                        break;
                    case 69:
                        c69154RCc.live_agreement = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 70:
                        c69154RCc.platform_sync_info.add(RHH.ADAPTER.decode(protoReader));
                        break;
                    case 71:
                        c69154RCc.with_shop_entry = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                        c69154RCc.is_discipline_member = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 73:
                        c69154RCc.secret = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 74:
                        c69154RCc.has_orders = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 75:
                        c69154RCc.prevent_download = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 76:
                        c69154RCc.show_image_bubble = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 77:
                        c69154RCc.geofencing.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 78:
                        c69154RCc.unique_id_modify_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 79:
                        c69154RCc.video_icon = REV.ADAPTER.decode(protoReader);
                        break;
                    case 80:
                        c69154RCc.ins_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 81:
                        c69154RCc.google_account = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 82:
                        c69154RCc.youtube_channel_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 83:
                        c69154RCc.youtube_channel_title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 84:
                        c69154RCc.apple_account = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 86:
                        c69154RCc.with_fusion_shop_entry = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 87:
                        c69154RCc.is_phone_binded = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 88:
                        c69154RCc.login_platform = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 89:
                        c69154RCc.accept_private_policy = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 91:
                        c69154RCc.twitter_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 92:
                        c69154RCc.twitter_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 93:
                        c69154RCc.user_canceled = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 94:
                        c69154RCc.has_email = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 97:
                        c69154RCc.live_agreement_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 98:
                        c69154RCc.register_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 99:
                        c69154RCc.status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 101:
                        c69154RCc.create_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 102:
                        c69154RCc.avatar_uri = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 103:
                        c69154RCc.follower_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 105:
                        c69154RCc.comment_setting = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 106:
                        c69154RCc.duet_setting = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 107:
                        c69154RCc.reflow_page_gid = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 108:
                        c69154RCc.reflow_page_uid = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 109:
                        c69154RCc.user_rate = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 110:
                        c69154RCc.with_new_goods = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 111:
                        c69154RCc.is_flowcard_member = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 112:
                        c69154RCc.room_cover = REV.ADAPTER.decode(protoReader);
                        break;
                    case 113:
                        c69154RCc.download_setting = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 114:
                        c69154RCc.download_prompt_ts = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 115:
                        c69154RCc.react_setting = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 116:
                        c69154RCc.live_commerce = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 119:
                        c69154RCc.country = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                        c69154RCc.province = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 121:
                        c69154RCc.city = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 122:
                        c69154RCc.cover_url.add(REV.ADAPTER.decode(protoReader));
                        break;
                    case 123:
                        c69154RCc.recommend_reason_relation = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 124:
                        c69154RCc.iso_country_code = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 126:
                        c69154RCc.district = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 127:
                        c69154RCc.language = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 128:
                        c69154RCc.room_type_tag = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 130:
                        c69154RCc.has_insights = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 131:
                        c69154RCc.remark_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 132:
                        c69154RCc.video_icon_virtual_URI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 133:
                        c69154RCc.share_qrcode_uri = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 134:
                        c69154RCc.profile_tab_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 135:
                        c69154RCc.avatar_decoration = C69378RKs.ADAPTER.decode(protoReader);
                        break;
                    case 136:
                        c69154RCc.watch_status = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 137:
                        c69154RCc.with_commerce_newbie_task = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 138:
                        c69154RCc.with_item_commerce_entry = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 139:
                        c69154RCc.star_billboard_rank = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case UserLevelGeckoUpdateSetting.DEFAULT /* 140 */:
                        c69154RCc.education = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 141:
                        c69154RCc.can_modify_school_info = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 142:
                        c69154RCc.school_visible = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 143:
                        c69154RCc.avatar_pendant_larger = REV.ADAPTER.decode(protoReader);
                        break;
                    case 144:
                        c69154RCc.avatar_pendant_thumb = REV.ADAPTER.decode(protoReader);
                        break;
                    case 145:
                        c69154RCc.avatar_pendant_medium = REV.ADAPTER.decode(protoReader);
                        break;
                    case 146:
                        c69154RCc.item_list.add(C69268RGm.ADAPTER.decode(protoReader));
                        break;
                    case 147:
                        c69154RCc.user_mode = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 148:
                        c69154RCc.user_period = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 149:
                        c69154RCc.is_effect_artist = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 150:
                        c69154RCc.effect_detail = C69462RNy.ADAPTER.decode(protoReader);
                        break;
                    case 151:
                        c69154RCc.commerce_permissions = C69450RNm.ADAPTER.decode(protoReader);
                        break;
                    case 152:
                        c69154RCc.life_story_block = C69432RMu.ADAPTER.decode(protoReader);
                        break;
                    case 153:
                        c69154RCc.hide_following_follower_list = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 158:
                        c69154RCc.is_star = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 160:
                        c69154RCc.cv_level = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 161:
                        c69154RCc.creator_level = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 162:
                        c69154RCc.is_mirror = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 163:
                        c69154RCc.pr_exempt = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 164:
                        c69154RCc.type_label.add(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 165:
                        c69154RCc.avatar_decoration_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 167:
                        c69154RCc.ad_cover_url.add(REV.ADAPTER.decode(protoReader));
                        break;
                    case 168:
                        c69154RCc.ad_cover_title = RN9.ADAPTER.decode(protoReader);
                        break;
                    case 169:
                        c69154RCc.ad_order_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 170:
                        c69154RCc.r_fans_group_info = RLV.ADAPTER.decode(protoReader);
                        break;
                    case 171:
                        c69154RCc.with_commerce_enterprise_tab_entry = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 172:
                        c69154RCc.honor_info = C69447RNj.ADAPTER.decode(protoReader);
                        break;
                    case 173:
                        c69154RCc.comment_filter_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 174:
                        c69154RCc.notify_private_account = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 175:
                        c69154RCc.avatar_168x168 = REV.ADAPTER.decode(protoReader);
                        break;
                    case 176:
                        c69154RCc.avatar_300x300 = REV.ADAPTER.decode(protoReader);
                        break;
                    case 177:
                        c69154RCc.is_blocked = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 178:
                        c69154RCc.force_private_account = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 179:
                        c69154RCc.with_star_atlas_entry = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 180:
                        c69154RCc.sprint_support_user_info = RGQ.ADAPTER.decode(protoReader);
                        break;
                    case 181:
                        c69154RCc.signature_language = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 182:
                        c69154RCc.brand_info = RG0.ADAPTER.decode(protoReader);
                        break;
                    case 183:
                        c69154RCc.display_wvalantine_activity_entry = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 184:
                        c69154RCc.shop_micro_app = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 185:
                        c69154RCc.commerce_user_info = RGS.ADAPTER.decode(protoReader);
                        break;
                    case 186:
                        c69154RCc.relative_users.add(C69255RFz.ADAPTER.decode(protoReader));
                        break;
                    case 187:
                        c69154RCc.quick_shop_info = RHW.ADAPTER.decode(protoReader);
                        break;
                    case 189:
                        c69154RCc.cha_list.add(C69160RCi.ADAPTER.decode(protoReader));
                        break;
                    case 190:
                        c69154RCc.is_minor = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 191:
                        c69154RCc.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 192:
                        c69154RCc.recommend_score = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 195:
                        c69154RCc.general_permission = RH4.ADAPTER.decode(protoReader);
                        break;
                    case 196:
                        c69154RCc.birthday_hide_level = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 197:
                        c69154RCc.bio_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 198:
                        c69154RCc.bio_email = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 199:
                        c69154RCc.latest_order_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 200:
                        c69154RCc.is_pro_account = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 202:
                        c69154RCc.email = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 203:
                        c69154RCc.is_email_verified = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 204:
                        c69154RCc.bio_secure_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 205:
                        c69154RCc.collect_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 206:
                        c69154RCc.nickname_update_reminder = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 207:
                        c69154RCc.avatar_update_reminder = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 208:
                        c69154RCc.is_activity_user = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 209:
                        c69154RCc.room_data = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 210:
                        c69154RCc.video_unread_info = RMK.ADAPTER.decode(protoReader);
                        break;
                    case 211:
                        c69154RCc.is_life_style = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 212:
                        c69154RCc.stitch_setting = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 213:
                        c69154RCc.qa_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 214:
                        c69154RCc.badge_info = C69259RGd.ADAPTER.decode(protoReader);
                        break;
                    case 215:
                        c69154RCc.social_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 216:
                        c69154RCc.story_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 217:
                        c69154RCc.matched_friend = C69257RGb.ADAPTER.decode(protoReader);
                        break;
                    case 218:
                        c69154RCc.friends_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 219:
                        c69154RCc.user_now_pack_info = C69459RNv.ADAPTER.decode(protoReader);
                        break;
                    case 220:
                        c69154RCc.is_user_data_miss = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 221:
                        c69154RCc.is_in_same_note_exp_group = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 222:
                        c69154RCc.can_message_follow_status_list.add(ProtoAdapter.INT32.decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69154RCc;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69154RCc c69154RCc) {
        C69154RCc c69154RCc2 = c69154RCc;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, c69154RCc2.nickname) + protoAdapter.encodedSizeWithTag(2, c69154RCc2.short_id) + protoAdapter.encodedSizeWithTag(1, c69154RCc2.uid);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, c69154RCc2.signature) + protoAdapter2.encodedSizeWithTag(4, c69154RCc2.gender) + encodedSizeWithTag;
        ProtoAdapter<REV> protoAdapter3 = REV.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(17, c69154RCc2.total_favorited) + protoAdapter2.encodedSizeWithTag(16, c69154RCc2.favoriting_count) + protoAdapter2.encodedSizeWithTag(15, c69154RCc2.follower_count) + protoAdapter2.encodedSizeWithTag(14, c69154RCc2.following_count) + protoAdapter2.encodedSizeWithTag(13, c69154RCc2.aweme_count) + protoAdapter2.encodedSizeWithTag(12, c69154RCc2.follow_status) + protoAdapter.encodedSizeWithTag(9, c69154RCc2.birthday) + protoAdapter3.encodedSizeWithTag(8, c69154RCc2.avatar_medium) + protoAdapter3.encodedSizeWithTag(7, c69154RCc2.avatar_thumb) + protoAdapter3.encodedSizeWithTag(6, c69154RCc2.avatar_larger) + encodedSizeWithTag2;
        ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
        int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(42, c69154RCc2.youtube_expire_time) + protoAdapter4.encodedSizeWithTag(41, c69154RCc2.has_youtube_token) + protoAdapter2.encodedSizeWithTag(40, c69154RCc2.tw_expire_time) + protoAdapter2.encodedSizeWithTag(39, c69154RCc2.fb_expire_time) + protoAdapter4.encodedSizeWithTag(38, c69154RCc2.has_twitter_token) + protoAdapter4.encodedSizeWithTag(37, c69154RCc2.has_facebook_token) + protoAdapter.encodedSizeWithTag(36, c69154RCc2.recommend_reason) + protoAdapter2.encodedSizeWithTag(29, c69154RCc2.need_recommend) + protoAdapter2.encodedSizeWithTag(28, c69154RCc2.special_lock) + protoAdapter.encodedSizeWithTag(27, c69154RCc2.bind_phone) + protoAdapter.encodedSizeWithTag(26, c69154RCc2.unique_id) + protoAdapter.encodedSizeWithTag(25, c69154RCc2.custom_verify) + protoAdapter4.encodedSizeWithTag(20, c69154RCc2.hide_search) + protoAdapter4.encodedSizeWithTag(18, c69154RCc2.is_block) + encodedSizeWithTag3;
        ProtoAdapter<Long> protoAdapter5 = ProtoAdapter.INT64;
        return c69154RCc2.unknownFields().size() + protoAdapter2.asRepeated().encodedSizeWithTag(222, c69154RCc2.can_message_follow_status_list) + protoAdapter4.encodedSizeWithTag(221, c69154RCc2.is_in_same_note_exp_group) + protoAdapter4.encodedSizeWithTag(220, c69154RCc2.is_user_data_miss) + C69459RNv.ADAPTER.encodedSizeWithTag(219, c69154RCc2.user_now_pack_info) + protoAdapter2.encodedSizeWithTag(218, c69154RCc2.friends_status) + C69257RGb.ADAPTER.encodedSizeWithTag(217, c69154RCc2.matched_friend) + protoAdapter2.encodedSizeWithTag(216, c69154RCc2.story_status) + protoAdapter.encodedSizeWithTag(215, c69154RCc2.social_info) + C69259RGd.ADAPTER.encodedSizeWithTag(214, c69154RCc2.badge_info) + protoAdapter2.encodedSizeWithTag(213, c69154RCc2.qa_status) + protoAdapter2.encodedSizeWithTag(212, c69154RCc2.stitch_setting) + protoAdapter4.encodedSizeWithTag(211, c69154RCc2.is_life_style) + RMK.ADAPTER.encodedSizeWithTag(210, c69154RCc2.video_unread_info) + protoAdapter.encodedSizeWithTag(209, c69154RCc2.room_data) + protoAdapter4.encodedSizeWithTag(208, c69154RCc2.is_activity_user) + protoAdapter4.encodedSizeWithTag(207, c69154RCc2.avatar_update_reminder) + protoAdapter4.encodedSizeWithTag(206, c69154RCc2.nickname_update_reminder) + protoAdapter2.encodedSizeWithTag(205, c69154RCc2.collect_count) + protoAdapter.encodedSizeWithTag(204, c69154RCc2.bio_secure_url) + protoAdapter4.encodedSizeWithTag(203, c69154RCc2.is_email_verified) + protoAdapter.encodedSizeWithTag(202, c69154RCc2.email) + protoAdapter4.encodedSizeWithTag(200, c69154RCc2.is_pro_account) + protoAdapter5.encodedSizeWithTag(199, c69154RCc2.latest_order_time) + protoAdapter.encodedSizeWithTag(198, c69154RCc2.bio_email) + protoAdapter.encodedSizeWithTag(197, c69154RCc2.bio_url) + protoAdapter2.encodedSizeWithTag(196, c69154RCc2.birthday_hide_level) + RH4.ADAPTER.encodedSizeWithTag(195, c69154RCc2.general_permission) + ProtoAdapter.DOUBLE.encodedSizeWithTag(192, c69154RCc2.recommend_score) + protoAdapter.encodedSizeWithTag(191, c69154RCc2.sec_uid) + protoAdapter4.encodedSizeWithTag(190, c69154RCc2.is_minor) + C69160RCi.ADAPTER.asRepeated().encodedSizeWithTag(189, c69154RCc2.cha_list) + RHW.ADAPTER.encodedSizeWithTag(187, c69154RCc2.quick_shop_info) + C69255RFz.ADAPTER.asRepeated().encodedSizeWithTag(186, c69154RCc2.relative_users) + RGS.ADAPTER.encodedSizeWithTag(185, c69154RCc2.commerce_user_info) + protoAdapter.encodedSizeWithTag(184, c69154RCc2.shop_micro_app) + protoAdapter4.encodedSizeWithTag(183, c69154RCc2.display_wvalantine_activity_entry) + RG0.ADAPTER.encodedSizeWithTag(182, c69154RCc2.brand_info) + protoAdapter.encodedSizeWithTag(181, c69154RCc2.signature_language) + RGQ.ADAPTER.encodedSizeWithTag(180, c69154RCc2.sprint_support_user_info) + protoAdapter4.encodedSizeWithTag(179, c69154RCc2.with_star_atlas_entry) + protoAdapter4.encodedSizeWithTag(178, c69154RCc2.force_private_account) + protoAdapter4.encodedSizeWithTag(177, c69154RCc2.is_blocked) + protoAdapter3.encodedSizeWithTag(176, c69154RCc2.avatar_300x300) + protoAdapter3.encodedSizeWithTag(175, c69154RCc2.avatar_168x168) + protoAdapter2.encodedSizeWithTag(174, c69154RCc2.notify_private_account) + protoAdapter2.encodedSizeWithTag(173, c69154RCc2.comment_filter_status) + C69447RNj.ADAPTER.encodedSizeWithTag(172, c69154RCc2.honor_info) + protoAdapter4.encodedSizeWithTag(171, c69154RCc2.with_commerce_enterprise_tab_entry) + RLV.ADAPTER.encodedSizeWithTag(170, c69154RCc2.r_fans_group_info) + protoAdapter.encodedSizeWithTag(169, c69154RCc2.ad_order_id) + RN9.ADAPTER.encodedSizeWithTag(168, c69154RCc2.ad_cover_title) + protoAdapter3.asRepeated().encodedSizeWithTag(167, c69154RCc2.ad_cover_url) + protoAdapter5.encodedSizeWithTag(165, c69154RCc2.avatar_decoration_id) + protoAdapter5.asRepeated().encodedSizeWithTag(164, c69154RCc2.type_label) + protoAdapter2.encodedSizeWithTag(163, c69154RCc2.pr_exempt) + protoAdapter4.encodedSizeWithTag(162, c69154RCc2.is_mirror) + protoAdapter2.encodedSizeWithTag(161, c69154RCc2.creator_level) + protoAdapter.encodedSizeWithTag(160, c69154RCc2.cv_level) + protoAdapter4.encodedSizeWithTag(158, c69154RCc2.is_star) + protoAdapter2.encodedSizeWithTag(153, c69154RCc2.hide_following_follower_list) + C69432RMu.ADAPTER.encodedSizeWithTag(152, c69154RCc2.life_story_block) + C69450RNm.ADAPTER.encodedSizeWithTag(151, c69154RCc2.commerce_permissions) + C69462RNy.ADAPTER.encodedSizeWithTag(150, c69154RCc2.effect_detail) + protoAdapter4.encodedSizeWithTag(149, c69154RCc2.is_effect_artist) + protoAdapter2.encodedSizeWithTag(148, c69154RCc2.user_period) + protoAdapter2.encodedSizeWithTag(147, c69154RCc2.user_mode) + C69268RGm.ADAPTER.asRepeated().encodedSizeWithTag(146, c69154RCc2.item_list) + protoAdapter3.encodedSizeWithTag(145, c69154RCc2.avatar_pendant_medium) + protoAdapter3.encodedSizeWithTag(144, c69154RCc2.avatar_pendant_thumb) + protoAdapter3.encodedSizeWithTag(143, c69154RCc2.avatar_pendant_larger) + protoAdapter2.encodedSizeWithTag(142, c69154RCc2.school_visible) + protoAdapter4.encodedSizeWithTag(141, c69154RCc2.can_modify_school_info) + protoAdapter2.encodedSizeWithTag(UserLevelGeckoUpdateSetting.DEFAULT, c69154RCc2.education) + protoAdapter2.encodedSizeWithTag(139, c69154RCc2.star_billboard_rank) + protoAdapter4.encodedSizeWithTag(138, c69154RCc2.with_item_commerce_entry) + protoAdapter4.encodedSizeWithTag(137, c69154RCc2.with_commerce_newbie_task) + protoAdapter4.encodedSizeWithTag(136, c69154RCc2.watch_status) + C69378RKs.ADAPTER.encodedSizeWithTag(135, c69154RCc2.avatar_decoration) + protoAdapter2.encodedSizeWithTag(134, c69154RCc2.profile_tab_type) + protoAdapter.encodedSizeWithTag(133, c69154RCc2.share_qrcode_uri) + protoAdapter.encodedSizeWithTag(132, c69154RCc2.video_icon_virtual_URI) + protoAdapter.encodedSizeWithTag(131, c69154RCc2.remark_name) + protoAdapter4.encodedSizeWithTag(130, c69154RCc2.has_insights) + protoAdapter.encodedSizeWithTag(128, c69154RCc2.room_type_tag) + protoAdapter.encodedSizeWithTag(127, c69154RCc2.language) + protoAdapter.encodedSizeWithTag(126, c69154RCc2.district) + protoAdapter.encodedSizeWithTag(124, c69154RCc2.iso_country_code) + protoAdapter.encodedSizeWithTag(123, c69154RCc2.recommend_reason_relation) + protoAdapter3.asRepeated().encodedSizeWithTag(122, c69154RCc2.cover_url) + protoAdapter.encodedSizeWithTag(121, c69154RCc2.city) + protoAdapter.encodedSizeWithTag(LiveTryModeCountDownThresholdSetting.DEFAULT, c69154RCc2.province) + protoAdapter.encodedSizeWithTag(119, c69154RCc2.country) + protoAdapter4.encodedSizeWithTag(116, c69154RCc2.live_commerce) + protoAdapter2.encodedSizeWithTag(115, c69154RCc2.react_setting) + protoAdapter5.encodedSizeWithTag(114, c69154RCc2.download_prompt_ts) + protoAdapter2.encodedSizeWithTag(113, c69154RCc2.download_setting) + protoAdapter3.encodedSizeWithTag(112, c69154RCc2.room_cover) + protoAdapter4.encodedSizeWithTag(111, c69154RCc2.is_flowcard_member) + protoAdapter4.encodedSizeWithTag(110, c69154RCc2.with_new_goods) + protoAdapter2.encodedSizeWithTag(109, c69154RCc2.user_rate) + protoAdapter5.encodedSizeWithTag(108, c69154RCc2.reflow_page_uid) + protoAdapter5.encodedSizeWithTag(107, c69154RCc2.reflow_page_gid) + protoAdapter2.encodedSizeWithTag(106, c69154RCc2.duet_setting) + protoAdapter2.encodedSizeWithTag(105, c69154RCc2.comment_setting) + protoAdapter2.encodedSizeWithTag(103, c69154RCc2.follower_status) + protoAdapter.encodedSizeWithTag(102, c69154RCc2.avatar_uri) + protoAdapter5.encodedSizeWithTag(101, c69154RCc2.create_time) + protoAdapter2.encodedSizeWithTag(99, c69154RCc2.status) + protoAdapter5.encodedSizeWithTag(98, c69154RCc2.register_time) + protoAdapter2.encodedSizeWithTag(97, c69154RCc2.live_agreement_time) + protoAdapter4.encodedSizeWithTag(94, c69154RCc2.has_email) + protoAdapter4.encodedSizeWithTag(93, c69154RCc2.user_canceled) + protoAdapter.encodedSizeWithTag(92, c69154RCc2.twitter_name) + protoAdapter.encodedSizeWithTag(91, c69154RCc2.twitter_id) + protoAdapter4.encodedSizeWithTag(89, c69154RCc2.accept_private_policy) + protoAdapter2.encodedSizeWithTag(88, c69154RCc2.login_platform) + protoAdapter4.encodedSizeWithTag(87, c69154RCc2.is_phone_binded) + protoAdapter4.encodedSizeWithTag(86, c69154RCc2.with_fusion_shop_entry) + protoAdapter2.encodedSizeWithTag(84, c69154RCc2.apple_account) + protoAdapter.encodedSizeWithTag(83, c69154RCc2.youtube_channel_title) + protoAdapter.encodedSizeWithTag(82, c69154RCc2.youtube_channel_id) + protoAdapter.encodedSizeWithTag(81, c69154RCc2.google_account) + protoAdapter.encodedSizeWithTag(80, c69154RCc2.ins_id) + protoAdapter3.encodedSizeWithTag(79, c69154RCc2.video_icon) + protoAdapter2.encodedSizeWithTag(78, c69154RCc2.unique_id_modify_time) + protoAdapter.asRepeated().encodedSizeWithTag(77, c69154RCc2.geofencing) + protoAdapter4.encodedSizeWithTag(76, c69154RCc2.show_image_bubble) + protoAdapter4.encodedSizeWithTag(75, c69154RCc2.prevent_download) + protoAdapter4.encodedSizeWithTag(74, c69154RCc2.has_orders) + protoAdapter2.encodedSizeWithTag(73, c69154RCc2.secret) + protoAdapter4.encodedSizeWithTag(72, c69154RCc2.is_discipline_member) + protoAdapter4.encodedSizeWithTag(71, c69154RCc2.with_shop_entry) + RHH.ADAPTER.asRepeated().encodedSizeWithTag(70, c69154RCc2.platform_sync_info) + protoAdapter2.encodedSizeWithTag(69, c69154RCc2.live_agreement) + RFV.ADAPTER.encodedSizeWithTag(68, c69154RCc2.commerce_info) + protoAdapter2.encodedSizeWithTag(67, c69154RCc2.commerce_user_level) + protoAdapter.encodedSizeWithTag(65, c69154RCc2.account_region) + protoAdapter.encodedSizeWithTag(64, c69154RCc2.region) + RGP.ADAPTER.asRepeated().encodedSizeWithTag(62, c69154RCc2.followers_detail) + protoAdapter2.encodedSizeWithTag(61, c69154RCc2.mplatform_followers_count) + protoAdapter4.encodedSizeWithTag(59, c69154RCc2.is_ad_fake) + protoAdapter.encodedSizeWithTag(58, c69154RCc2.enterprise_verify_reason) + C69261RGf.ADAPTER.encodedSizeWithTag(56, c69154RCc2.original_musician) + protoAdapter2.encodedSizeWithTag(55, c69154RCc2.verification_type) + protoAdapter4.encodedSizeWithTag(54, c69154RCc2.with_commerce_entry) + C69199RDv.ADAPTER.encodedSizeWithTag(53, c69154RCc2.share_info) + protoAdapter2.encodedSizeWithTag(49, c69154RCc2.shield_comment_notice) + protoAdapter2.encodedSizeWithTag(48, c69154RCc2.shield_digg_notice) + protoAdapter2.encodedSizeWithTag(47, c69154RCc2.shield_follow_notice) + protoAdapter.encodedSizeWithTag(46, c69154RCc2.verify_info) + protoAdapter5.encodedSizeWithTag(45, c69154RCc2.authority_status) + protoAdapter2.encodedSizeWithTag(44, c69154RCc2.live_verify) + protoAdapter5.encodedSizeWithTag(43, c69154RCc2.room_id) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69154RCc c69154RCc) {
        C69154RCc c69154RCc2 = c69154RCc;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69154RCc2.uid);
        protoAdapter.encodeWithTag(protoWriter, 2, c69154RCc2.short_id);
        protoAdapter.encodeWithTag(protoWriter, 3, c69154RCc2.nickname);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 4, c69154RCc2.gender);
        protoAdapter.encodeWithTag(protoWriter, 5, c69154RCc2.signature);
        ProtoAdapter<REV> protoAdapter3 = REV.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 6, c69154RCc2.avatar_larger);
        protoAdapter3.encodeWithTag(protoWriter, 7, c69154RCc2.avatar_thumb);
        protoAdapter3.encodeWithTag(protoWriter, 8, c69154RCc2.avatar_medium);
        protoAdapter.encodeWithTag(protoWriter, 9, c69154RCc2.birthday);
        protoAdapter2.encodeWithTag(protoWriter, 12, c69154RCc2.follow_status);
        protoAdapter2.encodeWithTag(protoWriter, 13, c69154RCc2.aweme_count);
        protoAdapter2.encodeWithTag(protoWriter, 14, c69154RCc2.following_count);
        protoAdapter2.encodeWithTag(protoWriter, 15, c69154RCc2.follower_count);
        protoAdapter2.encodeWithTag(protoWriter, 16, c69154RCc2.favoriting_count);
        protoAdapter2.encodeWithTag(protoWriter, 17, c69154RCc2.total_favorited);
        ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
        protoAdapter4.encodeWithTag(protoWriter, 18, c69154RCc2.is_block);
        protoAdapter4.encodeWithTag(protoWriter, 20, c69154RCc2.hide_search);
        protoAdapter.encodeWithTag(protoWriter, 25, c69154RCc2.custom_verify);
        protoAdapter.encodeWithTag(protoWriter, 26, c69154RCc2.unique_id);
        protoAdapter.encodeWithTag(protoWriter, 27, c69154RCc2.bind_phone);
        protoAdapter2.encodeWithTag(protoWriter, 28, c69154RCc2.special_lock);
        protoAdapter2.encodeWithTag(protoWriter, 29, c69154RCc2.need_recommend);
        protoAdapter.encodeWithTag(protoWriter, 36, c69154RCc2.recommend_reason);
        protoAdapter4.encodeWithTag(protoWriter, 37, c69154RCc2.has_facebook_token);
        protoAdapter4.encodeWithTag(protoWriter, 38, c69154RCc2.has_twitter_token);
        protoAdapter2.encodeWithTag(protoWriter, 39, c69154RCc2.fb_expire_time);
        protoAdapter2.encodeWithTag(protoWriter, 40, c69154RCc2.tw_expire_time);
        protoAdapter4.encodeWithTag(protoWriter, 41, c69154RCc2.has_youtube_token);
        protoAdapter2.encodeWithTag(protoWriter, 42, c69154RCc2.youtube_expire_time);
        ProtoAdapter<Long> protoAdapter5 = ProtoAdapter.INT64;
        protoAdapter5.encodeWithTag(protoWriter, 43, c69154RCc2.room_id);
        protoAdapter2.encodeWithTag(protoWriter, 44, c69154RCc2.live_verify);
        protoAdapter5.encodeWithTag(protoWriter, 45, c69154RCc2.authority_status);
        protoAdapter.encodeWithTag(protoWriter, 46, c69154RCc2.verify_info);
        protoAdapter2.encodeWithTag(protoWriter, 47, c69154RCc2.shield_follow_notice);
        protoAdapter2.encodeWithTag(protoWriter, 48, c69154RCc2.shield_digg_notice);
        protoAdapter2.encodeWithTag(protoWriter, 49, c69154RCc2.shield_comment_notice);
        C69199RDv.ADAPTER.encodeWithTag(protoWriter, 53, c69154RCc2.share_info);
        protoAdapter4.encodeWithTag(protoWriter, 54, c69154RCc2.with_commerce_entry);
        protoAdapter2.encodeWithTag(protoWriter, 55, c69154RCc2.verification_type);
        C69261RGf.ADAPTER.encodeWithTag(protoWriter, 56, c69154RCc2.original_musician);
        protoAdapter.encodeWithTag(protoWriter, 58, c69154RCc2.enterprise_verify_reason);
        protoAdapter4.encodeWithTag(protoWriter, 59, c69154RCc2.is_ad_fake);
        protoAdapter2.encodeWithTag(protoWriter, 61, c69154RCc2.mplatform_followers_count);
        RGP.ADAPTER.asRepeated().encodeWithTag(protoWriter, 62, c69154RCc2.followers_detail);
        protoAdapter.encodeWithTag(protoWriter, 64, c69154RCc2.region);
        protoAdapter.encodeWithTag(protoWriter, 65, c69154RCc2.account_region);
        protoAdapter2.encodeWithTag(protoWriter, 67, c69154RCc2.commerce_user_level);
        RFV.ADAPTER.encodeWithTag(protoWriter, 68, c69154RCc2.commerce_info);
        protoAdapter2.encodeWithTag(protoWriter, 69, c69154RCc2.live_agreement);
        RHH.ADAPTER.asRepeated().encodeWithTag(protoWriter, 70, c69154RCc2.platform_sync_info);
        protoAdapter4.encodeWithTag(protoWriter, 71, c69154RCc2.with_shop_entry);
        protoAdapter4.encodeWithTag(protoWriter, 72, c69154RCc2.is_discipline_member);
        protoAdapter2.encodeWithTag(protoWriter, 73, c69154RCc2.secret);
        protoAdapter4.encodeWithTag(protoWriter, 74, c69154RCc2.has_orders);
        protoAdapter4.encodeWithTag(protoWriter, 75, c69154RCc2.prevent_download);
        protoAdapter4.encodeWithTag(protoWriter, 76, c69154RCc2.show_image_bubble);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 77, c69154RCc2.geofencing);
        protoAdapter2.encodeWithTag(protoWriter, 78, c69154RCc2.unique_id_modify_time);
        protoAdapter3.encodeWithTag(protoWriter, 79, c69154RCc2.video_icon);
        protoAdapter.encodeWithTag(protoWriter, 80, c69154RCc2.ins_id);
        protoAdapter.encodeWithTag(protoWriter, 81, c69154RCc2.google_account);
        protoAdapter.encodeWithTag(protoWriter, 82, c69154RCc2.youtube_channel_id);
        protoAdapter.encodeWithTag(protoWriter, 83, c69154RCc2.youtube_channel_title);
        protoAdapter2.encodeWithTag(protoWriter, 84, c69154RCc2.apple_account);
        protoAdapter4.encodeWithTag(protoWriter, 86, c69154RCc2.with_fusion_shop_entry);
        protoAdapter4.encodeWithTag(protoWriter, 87, c69154RCc2.is_phone_binded);
        protoAdapter2.encodeWithTag(protoWriter, 88, c69154RCc2.login_platform);
        protoAdapter4.encodeWithTag(protoWriter, 89, c69154RCc2.accept_private_policy);
        protoAdapter.encodeWithTag(protoWriter, 91, c69154RCc2.twitter_id);
        protoAdapter.encodeWithTag(protoWriter, 92, c69154RCc2.twitter_name);
        protoAdapter4.encodeWithTag(protoWriter, 93, c69154RCc2.user_canceled);
        protoAdapter4.encodeWithTag(protoWriter, 94, c69154RCc2.has_email);
        protoAdapter2.encodeWithTag(protoWriter, 97, c69154RCc2.live_agreement_time);
        protoAdapter5.encodeWithTag(protoWriter, 98, c69154RCc2.register_time);
        protoAdapter2.encodeWithTag(protoWriter, 99, c69154RCc2.status);
        protoAdapter5.encodeWithTag(protoWriter, 101, c69154RCc2.create_time);
        protoAdapter.encodeWithTag(protoWriter, 102, c69154RCc2.avatar_uri);
        protoAdapter2.encodeWithTag(protoWriter, 103, c69154RCc2.follower_status);
        protoAdapter2.encodeWithTag(protoWriter, 105, c69154RCc2.comment_setting);
        protoAdapter2.encodeWithTag(protoWriter, 106, c69154RCc2.duet_setting);
        protoAdapter5.encodeWithTag(protoWriter, 107, c69154RCc2.reflow_page_gid);
        protoAdapter5.encodeWithTag(protoWriter, 108, c69154RCc2.reflow_page_uid);
        protoAdapter2.encodeWithTag(protoWriter, 109, c69154RCc2.user_rate);
        protoAdapter4.encodeWithTag(protoWriter, 110, c69154RCc2.with_new_goods);
        protoAdapter4.encodeWithTag(protoWriter, 111, c69154RCc2.is_flowcard_member);
        protoAdapter3.encodeWithTag(protoWriter, 112, c69154RCc2.room_cover);
        protoAdapter2.encodeWithTag(protoWriter, 113, c69154RCc2.download_setting);
        protoAdapter5.encodeWithTag(protoWriter, 114, c69154RCc2.download_prompt_ts);
        protoAdapter2.encodeWithTag(protoWriter, 115, c69154RCc2.react_setting);
        protoAdapter4.encodeWithTag(protoWriter, 116, c69154RCc2.live_commerce);
        protoAdapter.encodeWithTag(protoWriter, 119, c69154RCc2.country);
        protoAdapter.encodeWithTag(protoWriter, LiveTryModeCountDownThresholdSetting.DEFAULT, c69154RCc2.province);
        protoAdapter.encodeWithTag(protoWriter, 121, c69154RCc2.city);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 122, c69154RCc2.cover_url);
        protoAdapter.encodeWithTag(protoWriter, 123, c69154RCc2.recommend_reason_relation);
        protoAdapter.encodeWithTag(protoWriter, 124, c69154RCc2.iso_country_code);
        protoAdapter.encodeWithTag(protoWriter, 126, c69154RCc2.district);
        protoAdapter.encodeWithTag(protoWriter, 127, c69154RCc2.language);
        protoAdapter.encodeWithTag(protoWriter, 128, c69154RCc2.room_type_tag);
        protoAdapter4.encodeWithTag(protoWriter, 130, c69154RCc2.has_insights);
        protoAdapter.encodeWithTag(protoWriter, 131, c69154RCc2.remark_name);
        protoAdapter.encodeWithTag(protoWriter, 132, c69154RCc2.video_icon_virtual_URI);
        protoAdapter.encodeWithTag(protoWriter, 133, c69154RCc2.share_qrcode_uri);
        protoAdapter2.encodeWithTag(protoWriter, 134, c69154RCc2.profile_tab_type);
        C69378RKs.ADAPTER.encodeWithTag(protoWriter, 135, c69154RCc2.avatar_decoration);
        protoAdapter4.encodeWithTag(protoWriter, 136, c69154RCc2.watch_status);
        protoAdapter4.encodeWithTag(protoWriter, 137, c69154RCc2.with_commerce_newbie_task);
        protoAdapter4.encodeWithTag(protoWriter, 138, c69154RCc2.with_item_commerce_entry);
        protoAdapter2.encodeWithTag(protoWriter, 139, c69154RCc2.star_billboard_rank);
        protoAdapter2.encodeWithTag(protoWriter, UserLevelGeckoUpdateSetting.DEFAULT, c69154RCc2.education);
        protoAdapter4.encodeWithTag(protoWriter, 141, c69154RCc2.can_modify_school_info);
        protoAdapter2.encodeWithTag(protoWriter, 142, c69154RCc2.school_visible);
        protoAdapter3.encodeWithTag(protoWriter, 143, c69154RCc2.avatar_pendant_larger);
        protoAdapter3.encodeWithTag(protoWriter, 144, c69154RCc2.avatar_pendant_thumb);
        protoAdapter3.encodeWithTag(protoWriter, 145, c69154RCc2.avatar_pendant_medium);
        C69268RGm.ADAPTER.asRepeated().encodeWithTag(protoWriter, 146, c69154RCc2.item_list);
        protoAdapter2.encodeWithTag(protoWriter, 147, c69154RCc2.user_mode);
        protoAdapter2.encodeWithTag(protoWriter, 148, c69154RCc2.user_period);
        protoAdapter4.encodeWithTag(protoWriter, 149, c69154RCc2.is_effect_artist);
        C69462RNy.ADAPTER.encodeWithTag(protoWriter, 150, c69154RCc2.effect_detail);
        C69450RNm.ADAPTER.encodeWithTag(protoWriter, 151, c69154RCc2.commerce_permissions);
        C69432RMu.ADAPTER.encodeWithTag(protoWriter, 152, c69154RCc2.life_story_block);
        protoAdapter2.encodeWithTag(protoWriter, 153, c69154RCc2.hide_following_follower_list);
        protoAdapter4.encodeWithTag(protoWriter, 158, c69154RCc2.is_star);
        protoAdapter.encodeWithTag(protoWriter, 160, c69154RCc2.cv_level);
        protoAdapter2.encodeWithTag(protoWriter, 161, c69154RCc2.creator_level);
        protoAdapter4.encodeWithTag(protoWriter, 162, c69154RCc2.is_mirror);
        protoAdapter2.encodeWithTag(protoWriter, 163, c69154RCc2.pr_exempt);
        protoAdapter5.asRepeated().encodeWithTag(protoWriter, 164, c69154RCc2.type_label);
        protoAdapter5.encodeWithTag(protoWriter, 165, c69154RCc2.avatar_decoration_id);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 167, c69154RCc2.ad_cover_url);
        RN9.ADAPTER.encodeWithTag(protoWriter, 168, c69154RCc2.ad_cover_title);
        protoAdapter.encodeWithTag(protoWriter, 169, c69154RCc2.ad_order_id);
        RLV.ADAPTER.encodeWithTag(protoWriter, 170, c69154RCc2.r_fans_group_info);
        protoAdapter4.encodeWithTag(protoWriter, 171, c69154RCc2.with_commerce_enterprise_tab_entry);
        C69447RNj.ADAPTER.encodeWithTag(protoWriter, 172, c69154RCc2.honor_info);
        protoAdapter2.encodeWithTag(protoWriter, 173, c69154RCc2.comment_filter_status);
        protoAdapter2.encodeWithTag(protoWriter, 174, c69154RCc2.notify_private_account);
        protoAdapter3.encodeWithTag(protoWriter, 175, c69154RCc2.avatar_168x168);
        protoAdapter3.encodeWithTag(protoWriter, 176, c69154RCc2.avatar_300x300);
        protoAdapter4.encodeWithTag(protoWriter, 177, c69154RCc2.is_blocked);
        protoAdapter4.encodeWithTag(protoWriter, 178, c69154RCc2.force_private_account);
        protoAdapter4.encodeWithTag(protoWriter, 179, c69154RCc2.with_star_atlas_entry);
        RGQ.ADAPTER.encodeWithTag(protoWriter, 180, c69154RCc2.sprint_support_user_info);
        protoAdapter.encodeWithTag(protoWriter, 181, c69154RCc2.signature_language);
        RG0.ADAPTER.encodeWithTag(protoWriter, 182, c69154RCc2.brand_info);
        protoAdapter4.encodeWithTag(protoWriter, 183, c69154RCc2.display_wvalantine_activity_entry);
        protoAdapter.encodeWithTag(protoWriter, 184, c69154RCc2.shop_micro_app);
        RGS.ADAPTER.encodeWithTag(protoWriter, 185, c69154RCc2.commerce_user_info);
        C69255RFz.ADAPTER.asRepeated().encodeWithTag(protoWriter, 186, c69154RCc2.relative_users);
        RHW.ADAPTER.encodeWithTag(protoWriter, 187, c69154RCc2.quick_shop_info);
        C69160RCi.ADAPTER.asRepeated().encodeWithTag(protoWriter, 189, c69154RCc2.cha_list);
        protoAdapter4.encodeWithTag(protoWriter, 190, c69154RCc2.is_minor);
        protoAdapter.encodeWithTag(protoWriter, 191, c69154RCc2.sec_uid);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 192, c69154RCc2.recommend_score);
        RH4.ADAPTER.encodeWithTag(protoWriter, 195, c69154RCc2.general_permission);
        protoAdapter2.encodeWithTag(protoWriter, 196, c69154RCc2.birthday_hide_level);
        protoAdapter.encodeWithTag(protoWriter, 197, c69154RCc2.bio_url);
        protoAdapter.encodeWithTag(protoWriter, 198, c69154RCc2.bio_email);
        protoAdapter5.encodeWithTag(protoWriter, 199, c69154RCc2.latest_order_time);
        protoAdapter4.encodeWithTag(protoWriter, 200, c69154RCc2.is_pro_account);
        protoAdapter.encodeWithTag(protoWriter, 202, c69154RCc2.email);
        protoAdapter4.encodeWithTag(protoWriter, 203, c69154RCc2.is_email_verified);
        protoAdapter.encodeWithTag(protoWriter, 204, c69154RCc2.bio_secure_url);
        protoAdapter2.encodeWithTag(protoWriter, 205, c69154RCc2.collect_count);
        protoAdapter4.encodeWithTag(protoWriter, 206, c69154RCc2.nickname_update_reminder);
        protoAdapter4.encodeWithTag(protoWriter, 207, c69154RCc2.avatar_update_reminder);
        protoAdapter4.encodeWithTag(protoWriter, 208, c69154RCc2.is_activity_user);
        protoAdapter.encodeWithTag(protoWriter, 209, c69154RCc2.room_data);
        RMK.ADAPTER.encodeWithTag(protoWriter, 210, c69154RCc2.video_unread_info);
        protoAdapter4.encodeWithTag(protoWriter, 211, c69154RCc2.is_life_style);
        protoAdapter2.encodeWithTag(protoWriter, 212, c69154RCc2.stitch_setting);
        protoAdapter2.encodeWithTag(protoWriter, 213, c69154RCc2.qa_status);
        C69259RGd.ADAPTER.encodeWithTag(protoWriter, 214, c69154RCc2.badge_info);
        protoAdapter.encodeWithTag(protoWriter, 215, c69154RCc2.social_info);
        protoAdapter2.encodeWithTag(protoWriter, 216, c69154RCc2.story_status);
        C69257RGb.ADAPTER.encodeWithTag(protoWriter, 217, c69154RCc2.matched_friend);
        protoAdapter2.encodeWithTag(protoWriter, 218, c69154RCc2.friends_status);
        C69459RNv.ADAPTER.encodeWithTag(protoWriter, 219, c69154RCc2.user_now_pack_info);
        protoAdapter4.encodeWithTag(protoWriter, 220, c69154RCc2.is_user_data_miss);
        protoAdapter4.encodeWithTag(protoWriter, 221, c69154RCc2.is_in_same_note_exp_group);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 222, c69154RCc2.can_message_follow_status_list);
        protoWriter.writeBytes(c69154RCc2.unknownFields());
    }
}
