package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69157RCf extends ProtoAdapter<C69160RCi> {
    public C69157RCf() {
        super(FieldEncoding.LENGTH_DELIMITED, C69160RCi.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69160RCi decode(ProtoReader protoReader) {
        C69160RCi c69160RCi = new C69160RCi();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69160RCi.cid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69160RCi.cha_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69160RCi.desc = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69160RCi.schema = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c69160RCi.author = C69154RCc.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69160RCi.user_count = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        c69160RCi.share_info = C69199RDv.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69160RCi.connect_music.add(C69156RCe.ADAPTER.decode(protoReader));
                        break;
                    case 9:
                        c69160RCi.type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 10:
                    case 30:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69160RCi.sub_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 12:
                        c69160RCi.background_image_url = REV.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69160RCi.sticker_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        c69160RCi.link_text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 15:
                        c69160RCi.link_action = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69160RCi.is_pgcshow = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 17:
                        c69160RCi.collect_stat = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 18:
                        c69160RCi.cover_item = REV.ADAPTER.decode(protoReader);
                        break;
                    case 19:
                        c69160RCi.is_challenge = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 20:
                        c69160RCi.view_count = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 21:
                        c69160RCi.disclaimer = RNC.ADAPTER.decode(protoReader);
                        break;
                    case 22:
                        c69160RCi.allow_upload_cover = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 23:
                        c69160RCi.is_commerce = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 24:
                        c69160RCi.category_cover_info = C69484ROu.ADAPTER.decode(protoReader);
                        break;
                    case 25:
                        c69160RCi.hashtag_profile = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 26:
                        c69160RCi.cover_photo = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 27:
                        c69160RCi.is_hot_search = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 28:
                        c69160RCi.link_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 29:
                        c69160RCi.announcement_info = RNO.ADAPTER.decode(protoReader);
                        break;
                    case 31:
                        c69160RCi.module_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 32:
                        c69160RCi.profile_tag = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 33:
                        c69160RCi.cha_attrs.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 34:
                        c69160RCi.button = RL1.ADAPTER.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69160RCi;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69160RCi c69160RCi) {
        C69160RCi c69160RCi2 = c69160RCi;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = C69154RCc.ADAPTER.encodedSizeWithTag(5, c69160RCi2.author) + protoAdapter.encodedSizeWithTag(4, c69160RCi2.schema) + protoAdapter.encodedSizeWithTag(3, c69160RCi2.desc) + protoAdapter.encodedSizeWithTag(2, c69160RCi2.cha_name) + protoAdapter.encodedSizeWithTag(1, c69160RCi2.cid);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(11, c69160RCi2.sub_type) + protoAdapter2.encodedSizeWithTag(9, c69160RCi2.type) + C69156RCe.ADAPTER.asRepeated().encodedSizeWithTag(8, c69160RCi2.connect_music) + C69199RDv.ADAPTER.encodedSizeWithTag(7, c69160RCi2.share_info) + protoAdapter2.encodedSizeWithTag(6, c69160RCi2.user_count) + encodedSizeWithTag;
        ProtoAdapter<REV> protoAdapter3 = REV.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(15, c69160RCi2.link_action) + protoAdapter.encodedSizeWithTag(14, c69160RCi2.link_text) + protoAdapter.encodedSizeWithTag(13, c69160RCi2.sticker_id) + protoAdapter3.encodedSizeWithTag(12, c69160RCi2.background_image_url) + encodedSizeWithTag2;
        ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
        return c69160RCi2.unknownFields().size() + RL1.ADAPTER.encodedSizeWithTag(34, c69160RCi2.button) + protoAdapter.asRepeated().encodedSizeWithTag(33, c69160RCi2.cha_attrs) + protoAdapter.encodedSizeWithTag(32, c69160RCi2.profile_tag) + protoAdapter2.encodedSizeWithTag(31, c69160RCi2.module_type) + RNO.ADAPTER.encodedSizeWithTag(29, c69160RCi2.announcement_info) + protoAdapter2.encodedSizeWithTag(28, c69160RCi2.link_type) + protoAdapter2.encodedSizeWithTag(27, c69160RCi2.is_hot_search) + protoAdapter.encodedSizeWithTag(26, c69160RCi2.cover_photo) + protoAdapter.encodedSizeWithTag(25, c69160RCi2.hashtag_profile) + C69484ROu.ADAPTER.encodedSizeWithTag(24, c69160RCi2.category_cover_info) + protoAdapter4.encodedSizeWithTag(23, c69160RCi2.is_commerce) + protoAdapter4.encodedSizeWithTag(22, c69160RCi2.allow_upload_cover) + RNC.ADAPTER.encodedSizeWithTag(21, c69160RCi2.disclaimer) + ProtoAdapter.INT64.encodedSizeWithTag(20, c69160RCi2.view_count) + protoAdapter2.encodedSizeWithTag(19, c69160RCi2.is_challenge) + protoAdapter3.encodedSizeWithTag(18, c69160RCi2.cover_item) + protoAdapter2.encodedSizeWithTag(17, c69160RCi2.collect_stat) + protoAdapter4.encodedSizeWithTag(16, c69160RCi2.is_pgcshow) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69160RCi c69160RCi) {
        C69160RCi c69160RCi2 = c69160RCi;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69160RCi2.cid);
        protoAdapter.encodeWithTag(protoWriter, 2, c69160RCi2.cha_name);
        protoAdapter.encodeWithTag(protoWriter, 3, c69160RCi2.desc);
        protoAdapter.encodeWithTag(protoWriter, 4, c69160RCi2.schema);
        C69154RCc.ADAPTER.encodeWithTag(protoWriter, 5, c69160RCi2.author);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 6, c69160RCi2.user_count);
        C69199RDv.ADAPTER.encodeWithTag(protoWriter, 7, c69160RCi2.share_info);
        C69156RCe.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, c69160RCi2.connect_music);
        protoAdapter2.encodeWithTag(protoWriter, 9, c69160RCi2.type);
        protoAdapter2.encodeWithTag(protoWriter, 11, c69160RCi2.sub_type);
        ProtoAdapter<REV> protoAdapter3 = REV.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 12, c69160RCi2.background_image_url);
        protoAdapter.encodeWithTag(protoWriter, 13, c69160RCi2.sticker_id);
        protoAdapter.encodeWithTag(protoWriter, 14, c69160RCi2.link_text);
        protoAdapter.encodeWithTag(protoWriter, 15, c69160RCi2.link_action);
        ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
        protoAdapter4.encodeWithTag(protoWriter, 16, c69160RCi2.is_pgcshow);
        protoAdapter2.encodeWithTag(protoWriter, 17, c69160RCi2.collect_stat);
        protoAdapter3.encodeWithTag(protoWriter, 18, c69160RCi2.cover_item);
        protoAdapter2.encodeWithTag(protoWriter, 19, c69160RCi2.is_challenge);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, c69160RCi2.view_count);
        RNC.ADAPTER.encodeWithTag(protoWriter, 21, c69160RCi2.disclaimer);
        protoAdapter4.encodeWithTag(protoWriter, 22, c69160RCi2.allow_upload_cover);
        protoAdapter4.encodeWithTag(protoWriter, 23, c69160RCi2.is_commerce);
        C69484ROu.ADAPTER.encodeWithTag(protoWriter, 24, c69160RCi2.category_cover_info);
        protoAdapter.encodeWithTag(protoWriter, 25, c69160RCi2.hashtag_profile);
        protoAdapter.encodeWithTag(protoWriter, 26, c69160RCi2.cover_photo);
        protoAdapter2.encodeWithTag(protoWriter, 27, c69160RCi2.is_hot_search);
        protoAdapter2.encodeWithTag(protoWriter, 28, c69160RCi2.link_type);
        RNO.ADAPTER.encodeWithTag(protoWriter, 29, c69160RCi2.announcement_info);
        protoAdapter2.encodeWithTag(protoWriter, 31, c69160RCi2.module_type);
        protoAdapter.encodeWithTag(protoWriter, 32, c69160RCi2.profile_tag);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 33, c69160RCi2.cha_attrs);
        RL1.ADAPTER.encodeWithTag(protoWriter, 34, c69160RCi2.button);
        protoWriter.writeBytes(c69160RCi2.unknownFields());
    }
}
