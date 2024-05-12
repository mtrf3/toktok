package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69175RCx extends ProtoAdapter<C69185RDh> {
    public C69175RCx() {
        super(FieldEncoding.LENGTH_DELIMITED, C69185RDh.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69185RDh decode(ProtoReader protoReader) {
        C69185RDh c69185RDh = new C69185RDh();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69185RDh.ad_auth_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        c69185RDh.ad_source = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c69185RDh.avoid_global_pendant = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 4:
                        c69185RDh.with_comment_filter_words = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 5:
                        c69185RDh.ad_style = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        c69185RDh.prevent_share = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        c69185RDh.study_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c69185RDh.is_ghost_ads = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 9:
                        c69185RDh.bc_label_test_text = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        c69185RDh.digg_show_scene = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69185RDh.adv_promotable = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 12:
                        c69185RDh.branded_content_type = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69185RDh.enable_mid_roll = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 14:
                        c69185RDh.mid_roll_request_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 15:
                        c69185RDh.mid_roll_replace_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69185RDh.disable_mid_roll_status_code = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 17:
                        c69185RDh.is_pseudo_ad = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 18:
                        c69185RDh.pseudo_ad_data = RLA.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69185RDh;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69185RDh c69185RDh) {
        C69185RDh c69185RDh2 = c69185RDh;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, c69185RDh2.ad_source) + protoAdapter.encodedSizeWithTag(1, c69185RDh2.ad_auth_status);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, c69185RDh2.prevent_share) + protoAdapter.encodedSizeWithTag(5, c69185RDh2.ad_style) + protoAdapter2.encodedSizeWithTag(4, c69185RDh2.with_comment_filter_words) + protoAdapter2.encodedSizeWithTag(3, c69185RDh2.avoid_global_pendant) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(11, c69185RDh2.adv_promotable) + protoAdapter.encodedSizeWithTag(10, c69185RDh2.digg_show_scene) + protoAdapter3.encodedSizeWithTag(9, c69185RDh2.bc_label_test_text) + protoAdapter2.encodedSizeWithTag(8, c69185RDh2.is_ghost_ads) + protoAdapter3.encodedSizeWithTag(7, c69185RDh2.study_id) + encodedSizeWithTag2;
        ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
        return c69185RDh2.unknownFields().size() + RLA.ADAPTER.encodedSizeWithTag(18, c69185RDh2.pseudo_ad_data) + protoAdapter2.encodedSizeWithTag(17, c69185RDh2.is_pseudo_ad) + protoAdapter.encodedSizeWithTag(16, c69185RDh2.disable_mid_roll_status_code) + protoAdapter4.encodedSizeWithTag(15, c69185RDh2.mid_roll_replace_time) + protoAdapter4.encodedSizeWithTag(14, c69185RDh2.mid_roll_request_time) + protoAdapter2.encodedSizeWithTag(13, c69185RDh2.enable_mid_roll) + protoAdapter4.encodedSizeWithTag(12, c69185RDh2.branded_content_type) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69185RDh c69185RDh) {
        C69185RDh c69185RDh2 = c69185RDh;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69185RDh2.ad_auth_status);
        protoAdapter.encodeWithTag(protoWriter, 2, c69185RDh2.ad_source);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, c69185RDh2.avoid_global_pendant);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69185RDh2.with_comment_filter_words);
        protoAdapter.encodeWithTag(protoWriter, 5, c69185RDh2.ad_style);
        protoAdapter2.encodeWithTag(protoWriter, 6, c69185RDh2.prevent_share);
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 7, c69185RDh2.study_id);
        protoAdapter2.encodeWithTag(protoWriter, 8, c69185RDh2.is_ghost_ads);
        protoAdapter3.encodeWithTag(protoWriter, 9, c69185RDh2.bc_label_test_text);
        protoAdapter.encodeWithTag(protoWriter, 10, c69185RDh2.digg_show_scene);
        protoAdapter2.encodeWithTag(protoWriter, 11, c69185RDh2.adv_promotable);
        ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
        protoAdapter4.encodeWithTag(protoWriter, 12, c69185RDh2.branded_content_type);
        protoAdapter2.encodeWithTag(protoWriter, 13, c69185RDh2.enable_mid_roll);
        protoAdapter4.encodeWithTag(protoWriter, 14, c69185RDh2.mid_roll_request_time);
        protoAdapter4.encodeWithTag(protoWriter, 15, c69185RDh2.mid_roll_replace_time);
        protoAdapter.encodeWithTag(protoWriter, 16, c69185RDh2.disable_mid_roll_status_code);
        protoAdapter2.encodeWithTag(protoWriter, 17, c69185RDh2.is_pseudo_ad);
        RLA.ADAPTER.encodeWithTag(protoWriter, 18, c69185RDh2.pseudo_ad_data);
        protoWriter.writeBytes(c69185RDh2.unknownFields());
    }
}
