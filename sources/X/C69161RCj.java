package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69161RCj extends ProtoAdapter<C69167RCp> {
    public C69161RCj() {
        super(FieldEncoding.LENGTH_DELIMITED, C69167RCp.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69167RCp decode(ProtoReader protoReader) {
        C69167RCp c69167RCp = new C69167RCp();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69167RCp.back_image = REV.ADAPTER.decode(protoReader);
                        break;
                    case 2:
                        c69167RCp.back_image_thumbnail = REV.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        c69167RCp.front_image = REV.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        c69167RCp.front_image_thumbnail = REV.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        c69167RCp.fuzzy_image = REV.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69167RCp.composite_image_ltr = REV.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c69167RCp.composite_image_rtl = REV.ADAPTER.decode(protoReader);
                        break;
                    case 8:
                        c69167RCp.last_pushed_at_sec = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 9:
                        c69167RCp.fuzzy_front_image_thumbnail = REV.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        c69167RCp.fuzzy_front_image_thumbnail_with_logo = REV.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69167RCp.now_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 12:
                        c69167RCp.incompatibility_info = C69398RLm.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69167RCp.now_media_type = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        c69167RCp.composite_image_ltr_without_watermark = REV.ADAPTER.decode(protoReader);
                        break;
                    case 15:
                        c69167RCp.composite_image_rtl_without_watermark = REV.ADAPTER.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69167RCp.watermark_image_ltr = REV.ADAPTER.decode(protoReader);
                        break;
                    case 17:
                        c69167RCp.watermark_image_rtl = REV.ADAPTER.decode(protoReader);
                        break;
                    case 18:
                        c69167RCp.fuzzy_image_with_watermark = REV.ADAPTER.decode(protoReader);
                        break;
                    case 19:
                        c69167RCp.fuzzy_image_rtl_with_watermark = REV.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        c69167RCp.create_time_in_author_timezone = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 21:
                        c69167RCp.disable_interaction = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 22:
                        c69167RCp.now_post_source = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 23:
                        c69167RCp.now_interaction_control = C69258RGc.ADAPTER.decode(protoReader);
                        break;
                    case 24:
                        c69167RCp.background_music = C69156RCe.ADAPTER.decode(protoReader);
                        break;
                    case 25:
                    case 26:
                    case 27:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 28:
                        c69167RCp.attributes = C69381RKv.ADAPTER.decode(protoReader);
                        break;
                    case 29:
                        c69167RCp.content_info = ROZ.ADAPTER.decode(protoReader);
                        break;
                    case 30:
                        c69167RCp.consumption_info = RNZ.ADAPTER.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69167RCp;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69167RCp c69167RCp) {
        C69167RCp c69167RCp2 = c69167RCp;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(10, c69167RCp2.fuzzy_front_image_thumbnail_with_logo) + protoAdapter.encodedSizeWithTag(9, c69167RCp2.fuzzy_front_image_thumbnail) + ProtoAdapter.INT64.encodedSizeWithTag(8, c69167RCp2.last_pushed_at_sec) + protoAdapter.encodedSizeWithTag(7, c69167RCp2.composite_image_rtl) + protoAdapter.encodedSizeWithTag(6, c69167RCp2.composite_image_ltr) + protoAdapter.encodedSizeWithTag(5, c69167RCp2.fuzzy_image) + protoAdapter.encodedSizeWithTag(4, c69167RCp2.front_image_thumbnail) + protoAdapter.encodedSizeWithTag(3, c69167RCp2.front_image) + protoAdapter.encodedSizeWithTag(2, c69167RCp2.back_image_thumbnail) + protoAdapter.encodedSizeWithTag(1, c69167RCp2.back_image);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = C69398RLm.ADAPTER.encodedSizeWithTag(12, c69167RCp2.incompatibility_info) + protoAdapter2.encodedSizeWithTag(11, c69167RCp2.now_status) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        return c69167RCp2.unknownFields().size() + RNZ.ADAPTER.encodedSizeWithTag(30, c69167RCp2.consumption_info) + ROZ.ADAPTER.encodedSizeWithTag(29, c69167RCp2.content_info) + C69381RKv.ADAPTER.encodedSizeWithTag(28, c69167RCp2.attributes) + C69156RCe.ADAPTER.encodedSizeWithTag(24, c69167RCp2.background_music) + C69258RGc.ADAPTER.encodedSizeWithTag(23, c69167RCp2.now_interaction_control) + protoAdapter2.encodedSizeWithTag(22, c69167RCp2.now_post_source) + ProtoAdapter.BOOL.encodedSizeWithTag(21, c69167RCp2.disable_interaction) + protoAdapter3.encodedSizeWithTag(20, c69167RCp2.create_time_in_author_timezone) + protoAdapter.encodedSizeWithTag(19, c69167RCp2.fuzzy_image_rtl_with_watermark) + protoAdapter.encodedSizeWithTag(18, c69167RCp2.fuzzy_image_with_watermark) + protoAdapter.encodedSizeWithTag(17, c69167RCp2.watermark_image_rtl) + protoAdapter.encodedSizeWithTag(16, c69167RCp2.watermark_image_ltr) + protoAdapter.encodedSizeWithTag(15, c69167RCp2.composite_image_rtl_without_watermark) + protoAdapter.encodedSizeWithTag(14, c69167RCp2.composite_image_ltr_without_watermark) + protoAdapter3.encodedSizeWithTag(13, c69167RCp2.now_media_type) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69167RCp c69167RCp) {
        C69167RCp c69167RCp2 = c69167RCp;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, c69167RCp2.back_image);
        protoAdapter.encodeWithTag(protoWriter, 2, c69167RCp2.back_image_thumbnail);
        protoAdapter.encodeWithTag(protoWriter, 3, c69167RCp2.front_image);
        protoAdapter.encodeWithTag(protoWriter, 4, c69167RCp2.front_image_thumbnail);
        protoAdapter.encodeWithTag(protoWriter, 5, c69167RCp2.fuzzy_image);
        protoAdapter.encodeWithTag(protoWriter, 6, c69167RCp2.composite_image_ltr);
        protoAdapter.encodeWithTag(protoWriter, 7, c69167RCp2.composite_image_rtl);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, c69167RCp2.last_pushed_at_sec);
        protoAdapter.encodeWithTag(protoWriter, 9, c69167RCp2.fuzzy_front_image_thumbnail);
        protoAdapter.encodeWithTag(protoWriter, 10, c69167RCp2.fuzzy_front_image_thumbnail_with_logo);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 11, c69167RCp2.now_status);
        C69398RLm.ADAPTER.encodeWithTag(protoWriter, 12, c69167RCp2.incompatibility_info);
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 13, c69167RCp2.now_media_type);
        protoAdapter.encodeWithTag(protoWriter, 14, c69167RCp2.composite_image_ltr_without_watermark);
        protoAdapter.encodeWithTag(protoWriter, 15, c69167RCp2.composite_image_rtl_without_watermark);
        protoAdapter.encodeWithTag(protoWriter, 16, c69167RCp2.watermark_image_ltr);
        protoAdapter.encodeWithTag(protoWriter, 17, c69167RCp2.watermark_image_rtl);
        protoAdapter.encodeWithTag(protoWriter, 18, c69167RCp2.fuzzy_image_with_watermark);
        protoAdapter.encodeWithTag(protoWriter, 19, c69167RCp2.fuzzy_image_rtl_with_watermark);
        protoAdapter3.encodeWithTag(protoWriter, 20, c69167RCp2.create_time_in_author_timezone);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, c69167RCp2.disable_interaction);
        protoAdapter2.encodeWithTag(protoWriter, 22, c69167RCp2.now_post_source);
        C69258RGc.ADAPTER.encodeWithTag(protoWriter, 23, c69167RCp2.now_interaction_control);
        C69156RCe.ADAPTER.encodeWithTag(protoWriter, 24, c69167RCp2.background_music);
        C69381RKv.ADAPTER.encodeWithTag(protoWriter, 28, c69167RCp2.attributes);
        ROZ.ADAPTER.encodeWithTag(protoWriter, 29, c69167RCp2.content_info);
        RNZ.ADAPTER.encodeWithTag(protoWriter, 30, c69167RCp2.consumption_info);
        protoWriter.writeBytes(c69167RCp2.unknownFields());
    }
}
