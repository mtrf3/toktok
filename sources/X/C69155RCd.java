package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: X.RCd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69155RCd extends ProtoAdapter<C69156RCe> {
    public C69155RCd() {
        super(FieldEncoding.LENGTH_DELIMITED, C69156RCe.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69156RCe decode(ProtoReader protoReader) {
        C69156RCe c69156RCe = new C69156RCe();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69156RCe.id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        c69156RCe.id_str = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69156RCe.title = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69156RCe.author = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c69156RCe.album = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c69156RCe.cover_hd = REV.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c69156RCe.cover_large = REV.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69156RCe.cover_medium = REV.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69156RCe.cover_thumb = REV.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        c69156RCe.play_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69156RCe.schema_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 12:
                        c69156RCe.source_platform = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69156RCe.start_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 14:
                        c69156RCe.end_time = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 15:
                        c69156RCe.duration = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69156RCe.extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 17:
                        c69156RCe.user_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 18:
                        c69156RCe.position.add(RHN.ADAPTER.decode(protoReader));
                        break;
                    case 19:
                        c69156RCe.share_info = C69199RDv.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        c69156RCe.collect_stat = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 21:
                        c69156RCe.status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 22:
                        c69156RCe.offline_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 23:
                        c69156RCe.effects_data = REV.ADAPTER.decode(protoReader);
                        break;
                    case 24:
                        c69156RCe.owner_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 25:
                        c69156RCe.owner_nickname = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 26:
                        c69156RCe.use_count_desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 27:
                        c69156RCe.audio_track = REV.ADAPTER.decode(protoReader);
                        break;
                    case 28:
                        c69156RCe.bodydance_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 29:
                        c69156RCe.bodydance_challenge = C69160RCi.ADAPTER.decode(protoReader);
                        break;
                    case 30:
                        c69156RCe.is_original = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 31:
                        c69156RCe.challenge = C69160RCi.ADAPTER.decode(protoReader);
                        break;
                    case 32:
                        c69156RCe.billboard_rank = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 33:
                        c69156RCe.mid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 34:
                        c69156RCe.bodydance_challenge_id = REV.ADAPTER.decode(protoReader);
                        break;
                    case 35:
                        c69156RCe.binded_challenge_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 36:
                        c69156RCe.redirect = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 37:
                        c69156RCe.is_restricted = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 38:
                        c69156RCe.author_deleted = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 39:
                        c69156RCe.is_del_video = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        c69156RCe.is_video_self_see = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 41:
                        c69156RCe.owner_handle = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 42:
                        c69156RCe.author_position.add(RHN.ADAPTER.decode(protoReader));
                        break;
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                        c69156RCe.prevent_download = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 44:
                        c69156RCe.music_billboard_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 45:
                        c69156RCe.music_billboard_weekly_info = RP0.ADAPTER.decode(protoReader);
                        break;
                    case 46:
                        c69156RCe.category_cover_info = C69484ROu.ADAPTER.decode(protoReader);
                        break;
                    case 47:
                        c69156RCe.is_only_owner_use = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                        c69156RCe.is_video_not_recommend = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case C61447O9r.LJIIJ:
                        c69156RCe.strong_beat_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case 50:
                        c69156RCe.unshelve_countries.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 51:
                        c69156RCe.prevent_item_download_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 52:
                        c69156RCe.external_song_info.add(RHJ.ADAPTER.decode(protoReader));
                        break;
                    case 53:
                        c69156RCe.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 54:
                        c69156RCe.lyric_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 55:
                        c69156RCe.lyric_url = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 56:
                        c69156RCe.avatar_thumb = REV.ADAPTER.decode(protoReader);
                        break;
                    case 57:
                        c69156RCe.avatar_medium = REV.ADAPTER.decode(protoReader);
                        break;
                    case 58:
                        c69156RCe.avatar_large = REV.ADAPTER.decode(protoReader);
                        break;
                    case 59:
                        c69156RCe.preview_start_time = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 60:
                        c69156RCe.preview_end_time = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 61:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case BaseNotice.CREATOR /* 62 */:
                        c69156RCe.mute_share = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 63:
                        c69156RCe.is_author_artist = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 64:
                        c69156RCe.is_pgc = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 65:
                        c69156RCe.matched_pgc_sound = C69273RGr.ADAPTER.decode(protoReader);
                        break;
                    case 66:
                        c69156RCe.matched_song = RFG.ADAPTER.decode(protoReader);
                        break;
                    case 67:
                        c69156RCe.is_commerce_music = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 68:
                        c69156RCe.artists.add(REY.ADAPTER.decode(protoReader));
                        break;
                    case 69:
                        c69156RCe.duration_high_precision = RH3.ADAPTER.decode(protoReader);
                        break;
                    case 70:
                        c69156RCe.is_shooting_allow = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 71:
                        c69156RCe.ttm_music_info = C69349RJp.ADAPTER.decode(protoReader);
                        break;
                    case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                        c69156RCe.music_release_info = RMH.ADAPTER.decode(protoReader);
                        break;
                    case 73:
                        c69156RCe.tt_to_dsp_song_infos.add(RGU.ADAPTER.decode(protoReader));
                        break;
                    case 74:
                        c69156RCe.log_extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 75:
                        c69156RCe.recommend_status = ProtoAdapter.INT64.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69156RCe;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69156RCe c69156RCe) {
        C69156RCe c69156RCe2 = c69156RCe;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69156RCe2.id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, c69156RCe2.album) + protoAdapter2.encodedSizeWithTag(4, c69156RCe2.author) + protoAdapter2.encodedSizeWithTag(3, c69156RCe2.title) + protoAdapter2.encodedSizeWithTag(2, c69156RCe2.id_str) + encodedSizeWithTag;
        ProtoAdapter<REV> protoAdapter3 = REV.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(11, c69156RCe2.schema_url) + protoAdapter3.encodedSizeWithTag(10, c69156RCe2.play_url) + protoAdapter3.encodedSizeWithTag(9, c69156RCe2.cover_thumb) + protoAdapter3.encodedSizeWithTag(8, c69156RCe2.cover_medium) + protoAdapter3.encodedSizeWithTag(7, c69156RCe2.cover_large) + protoAdapter3.encodedSizeWithTag(6, c69156RCe2.cover_hd) + encodedSizeWithTag2;
        ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
        int encodedSizeWithTag4 = protoAdapter4.encodedSizeWithTag(17, c69156RCe2.user_count) + protoAdapter2.encodedSizeWithTag(16, c69156RCe2.extra) + protoAdapter4.encodedSizeWithTag(15, c69156RCe2.duration) + protoAdapter4.encodedSizeWithTag(14, c69156RCe2.end_time) + protoAdapter4.encodedSizeWithTag(13, c69156RCe2.start_time) + protoAdapter4.encodedSizeWithTag(12, c69156RCe2.source_platform) + encodedSizeWithTag3;
        ProtoAdapter<RHN> protoAdapter5 = RHN.ADAPTER;
        int encodedSizeWithTag5 = protoAdapter3.encodedSizeWithTag(28, c69156RCe2.bodydance_url) + protoAdapter3.encodedSizeWithTag(27, c69156RCe2.audio_track) + protoAdapter2.encodedSizeWithTag(26, c69156RCe2.use_count_desc) + protoAdapter2.encodedSizeWithTag(25, c69156RCe2.owner_nickname) + protoAdapter2.encodedSizeWithTag(24, c69156RCe2.owner_id) + protoAdapter3.encodedSizeWithTag(23, c69156RCe2.effects_data) + protoAdapter2.encodedSizeWithTag(22, c69156RCe2.offline_desc) + protoAdapter4.encodedSizeWithTag(21, c69156RCe2.status) + protoAdapter4.encodedSizeWithTag(20, c69156RCe2.collect_stat) + C69199RDv.ADAPTER.encodedSizeWithTag(19, c69156RCe2.share_info) + protoAdapter5.asRepeated().encodedSizeWithTag(18, c69156RCe2.position) + encodedSizeWithTag4;
        ProtoAdapter<C69160RCi> protoAdapter6 = C69160RCi.ADAPTER;
        int encodedSizeWithTag6 = protoAdapter6.encodedSizeWithTag(29, c69156RCe2.bodydance_challenge) + encodedSizeWithTag5;
        ProtoAdapter<Boolean> protoAdapter7 = ProtoAdapter.BOOL;
        int encodedSizeWithTag7 = protoAdapter3.encodedSizeWithTag(58, c69156RCe2.avatar_large) + protoAdapter3.encodedSizeWithTag(57, c69156RCe2.avatar_medium) + protoAdapter3.encodedSizeWithTag(56, c69156RCe2.avatar_thumb) + protoAdapter2.encodedSizeWithTag(55, c69156RCe2.lyric_url) + protoAdapter4.encodedSizeWithTag(54, c69156RCe2.lyric_type) + protoAdapter2.encodedSizeWithTag(53, c69156RCe2.sec_uid) + RHJ.ADAPTER.asRepeated().encodedSizeWithTag(52, c69156RCe2.external_song_info) + protoAdapter4.encodedSizeWithTag(51, c69156RCe2.prevent_item_download_status) + protoAdapter2.asRepeated().encodedSizeWithTag(50, c69156RCe2.unshelve_countries) + protoAdapter3.encodedSizeWithTag(49, c69156RCe2.strong_beat_url) + protoAdapter7.encodedSizeWithTag(48, c69156RCe2.is_video_not_recommend) + protoAdapter7.encodedSizeWithTag(47, c69156RCe2.is_only_owner_use) + C69484ROu.ADAPTER.encodedSizeWithTag(46, c69156RCe2.category_cover_info) + RP0.ADAPTER.encodedSizeWithTag(45, c69156RCe2.music_billboard_weekly_info) + protoAdapter4.encodedSizeWithTag(44, c69156RCe2.music_billboard_type) + protoAdapter7.encodedSizeWithTag(43, c69156RCe2.prevent_download) + protoAdapter5.asRepeated().encodedSizeWithTag(42, c69156RCe2.author_position) + protoAdapter2.encodedSizeWithTag(41, c69156RCe2.owner_handle) + protoAdapter7.encodedSizeWithTag(40, c69156RCe2.is_video_self_see) + protoAdapter7.encodedSizeWithTag(39, c69156RCe2.is_del_video) + protoAdapter7.encodedSizeWithTag(38, c69156RCe2.author_deleted) + protoAdapter7.encodedSizeWithTag(37, c69156RCe2.is_restricted) + protoAdapter7.encodedSizeWithTag(36, c69156RCe2.redirect) + protoAdapter.encodedSizeWithTag(35, c69156RCe2.binded_challenge_id) + protoAdapter3.encodedSizeWithTag(34, c69156RCe2.bodydance_challenge_id) + protoAdapter2.encodedSizeWithTag(33, c69156RCe2.mid) + protoAdapter4.encodedSizeWithTag(32, c69156RCe2.billboard_rank) + protoAdapter6.encodedSizeWithTag(31, c69156RCe2.challenge) + protoAdapter7.encodedSizeWithTag(30, c69156RCe2.is_original) + encodedSizeWithTag6;
        ProtoAdapter<Double> protoAdapter8 = ProtoAdapter.DOUBLE;
        return c69156RCe2.unknownFields().size() + protoAdapter.encodedSizeWithTag(75, c69156RCe2.recommend_status) + protoAdapter2.encodedSizeWithTag(74, c69156RCe2.log_extra) + RGU.ADAPTER.asRepeated().encodedSizeWithTag(73, c69156RCe2.tt_to_dsp_song_infos) + RMH.ADAPTER.encodedSizeWithTag(72, c69156RCe2.music_release_info) + C69349RJp.ADAPTER.encodedSizeWithTag(71, c69156RCe2.ttm_music_info) + protoAdapter7.encodedSizeWithTag(70, c69156RCe2.is_shooting_allow) + RH3.ADAPTER.encodedSizeWithTag(69, c69156RCe2.duration_high_precision) + REY.ADAPTER.asRepeated().encodedSizeWithTag(68, c69156RCe2.artists) + protoAdapter7.encodedSizeWithTag(67, c69156RCe2.is_commerce_music) + RFG.ADAPTER.encodedSizeWithTag(66, c69156RCe2.matched_song) + C69273RGr.ADAPTER.encodedSizeWithTag(65, c69156RCe2.matched_pgc_sound) + protoAdapter7.encodedSizeWithTag(64, c69156RCe2.is_pgc) + protoAdapter7.encodedSizeWithTag(63, c69156RCe2.is_author_artist) + protoAdapter7.encodedSizeWithTag(62, c69156RCe2.mute_share) + protoAdapter8.encodedSizeWithTag(60, c69156RCe2.preview_end_time) + protoAdapter8.encodedSizeWithTag(59, c69156RCe2.preview_start_time) + encodedSizeWithTag7;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69156RCe c69156RCe) {
        C69156RCe c69156RCe2 = c69156RCe;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, c69156RCe2.id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, c69156RCe2.id_str);
        protoAdapter2.encodeWithTag(protoWriter, 3, c69156RCe2.title);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69156RCe2.author);
        protoAdapter2.encodeWithTag(protoWriter, 5, c69156RCe2.album);
        ProtoAdapter<REV> protoAdapter3 = REV.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 6, c69156RCe2.cover_hd);
        protoAdapter3.encodeWithTag(protoWriter, 7, c69156RCe2.cover_large);
        protoAdapter3.encodeWithTag(protoWriter, 8, c69156RCe2.cover_medium);
        protoAdapter3.encodeWithTag(protoWriter, 9, c69156RCe2.cover_thumb);
        protoAdapter3.encodeWithTag(protoWriter, 10, c69156RCe2.play_url);
        protoAdapter2.encodeWithTag(protoWriter, 11, c69156RCe2.schema_url);
        ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
        protoAdapter4.encodeWithTag(protoWriter, 12, c69156RCe2.source_platform);
        protoAdapter4.encodeWithTag(protoWriter, 13, c69156RCe2.start_time);
        protoAdapter4.encodeWithTag(protoWriter, 14, c69156RCe2.end_time);
        protoAdapter4.encodeWithTag(protoWriter, 15, c69156RCe2.duration);
        protoAdapter2.encodeWithTag(protoWriter, 16, c69156RCe2.extra);
        protoAdapter4.encodeWithTag(protoWriter, 17, c69156RCe2.user_count);
        ProtoAdapter<RHN> protoAdapter5 = RHN.ADAPTER;
        protoAdapter5.asRepeated().encodeWithTag(protoWriter, 18, c69156RCe2.position);
        C69199RDv.ADAPTER.encodeWithTag(protoWriter, 19, c69156RCe2.share_info);
        protoAdapter4.encodeWithTag(protoWriter, 20, c69156RCe2.collect_stat);
        protoAdapter4.encodeWithTag(protoWriter, 21, c69156RCe2.status);
        protoAdapter2.encodeWithTag(protoWriter, 22, c69156RCe2.offline_desc);
        protoAdapter3.encodeWithTag(protoWriter, 23, c69156RCe2.effects_data);
        protoAdapter2.encodeWithTag(protoWriter, 24, c69156RCe2.owner_id);
        protoAdapter2.encodeWithTag(protoWriter, 25, c69156RCe2.owner_nickname);
        protoAdapter2.encodeWithTag(protoWriter, 26, c69156RCe2.use_count_desc);
        protoAdapter3.encodeWithTag(protoWriter, 27, c69156RCe2.audio_track);
        protoAdapter3.encodeWithTag(protoWriter, 28, c69156RCe2.bodydance_url);
        ProtoAdapter<C69160RCi> protoAdapter6 = C69160RCi.ADAPTER;
        protoAdapter6.encodeWithTag(protoWriter, 29, c69156RCe2.bodydance_challenge);
        ProtoAdapter<Boolean> protoAdapter7 = ProtoAdapter.BOOL;
        protoAdapter7.encodeWithTag(protoWriter, 30, c69156RCe2.is_original);
        protoAdapter6.encodeWithTag(protoWriter, 31, c69156RCe2.challenge);
        protoAdapter4.encodeWithTag(protoWriter, 32, c69156RCe2.billboard_rank);
        protoAdapter2.encodeWithTag(protoWriter, 33, c69156RCe2.mid);
        protoAdapter3.encodeWithTag(protoWriter, 34, c69156RCe2.bodydance_challenge_id);
        protoAdapter.encodeWithTag(protoWriter, 35, c69156RCe2.binded_challenge_id);
        protoAdapter7.encodeWithTag(protoWriter, 36, c69156RCe2.redirect);
        protoAdapter7.encodeWithTag(protoWriter, 37, c69156RCe2.is_restricted);
        protoAdapter7.encodeWithTag(protoWriter, 38, c69156RCe2.author_deleted);
        protoAdapter7.encodeWithTag(protoWriter, 39, c69156RCe2.is_del_video);
        protoAdapter7.encodeWithTag(protoWriter, 40, c69156RCe2.is_video_self_see);
        protoAdapter2.encodeWithTag(protoWriter, 41, c69156RCe2.owner_handle);
        protoAdapter5.asRepeated().encodeWithTag(protoWriter, 42, c69156RCe2.author_position);
        protoAdapter7.encodeWithTag(protoWriter, 43, c69156RCe2.prevent_download);
        protoAdapter4.encodeWithTag(protoWriter, 44, c69156RCe2.music_billboard_type);
        RP0.ADAPTER.encodeWithTag(protoWriter, 45, c69156RCe2.music_billboard_weekly_info);
        C69484ROu.ADAPTER.encodeWithTag(protoWriter, 46, c69156RCe2.category_cover_info);
        protoAdapter7.encodeWithTag(protoWriter, 47, c69156RCe2.is_only_owner_use);
        protoAdapter7.encodeWithTag(protoWriter, 48, c69156RCe2.is_video_not_recommend);
        protoAdapter3.encodeWithTag(protoWriter, 49, c69156RCe2.strong_beat_url);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 50, c69156RCe2.unshelve_countries);
        protoAdapter4.encodeWithTag(protoWriter, 51, c69156RCe2.prevent_item_download_status);
        RHJ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 52, c69156RCe2.external_song_info);
        protoAdapter2.encodeWithTag(protoWriter, 53, c69156RCe2.sec_uid);
        protoAdapter4.encodeWithTag(protoWriter, 54, c69156RCe2.lyric_type);
        protoAdapter2.encodeWithTag(protoWriter, 55, c69156RCe2.lyric_url);
        protoAdapter3.encodeWithTag(protoWriter, 56, c69156RCe2.avatar_thumb);
        protoAdapter3.encodeWithTag(protoWriter, 57, c69156RCe2.avatar_medium);
        protoAdapter3.encodeWithTag(protoWriter, 58, c69156RCe2.avatar_large);
        ProtoAdapter<Double> protoAdapter8 = ProtoAdapter.DOUBLE;
        protoAdapter8.encodeWithTag(protoWriter, 59, c69156RCe2.preview_start_time);
        protoAdapter8.encodeWithTag(protoWriter, 60, c69156RCe2.preview_end_time);
        protoAdapter7.encodeWithTag(protoWriter, 62, c69156RCe2.mute_share);
        protoAdapter7.encodeWithTag(protoWriter, 63, c69156RCe2.is_author_artist);
        protoAdapter7.encodeWithTag(protoWriter, 64, c69156RCe2.is_pgc);
        C69273RGr.ADAPTER.encodeWithTag(protoWriter, 65, c69156RCe2.matched_pgc_sound);
        RFG.ADAPTER.encodeWithTag(protoWriter, 66, c69156RCe2.matched_song);
        protoAdapter7.encodeWithTag(protoWriter, 67, c69156RCe2.is_commerce_music);
        REY.ADAPTER.asRepeated().encodeWithTag(protoWriter, 68, c69156RCe2.artists);
        RH3.ADAPTER.encodeWithTag(protoWriter, 69, c69156RCe2.duration_high_precision);
        protoAdapter7.encodeWithTag(protoWriter, 70, c69156RCe2.is_shooting_allow);
        C69349RJp.ADAPTER.encodeWithTag(protoWriter, 71, c69156RCe2.ttm_music_info);
        RMH.ADAPTER.encodeWithTag(protoWriter, 72, c69156RCe2.music_release_info);
        RGU.ADAPTER.asRepeated().encodeWithTag(protoWriter, 73, c69156RCe2.tt_to_dsp_song_infos);
        protoAdapter2.encodeWithTag(protoWriter, 74, c69156RCe2.log_extra);
        protoAdapter.encodeWithTag(protoWriter, 75, c69156RCe2.recommend_status);
        protoWriter.writeBytes(c69156RCe2.unknownFields());
    }
}
