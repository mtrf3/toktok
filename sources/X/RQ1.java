package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQ1 extends ProtoAdapter<RQ2> {
    public RQ1() {
        super(FieldEncoding.LENGTH_DELIMITED, RQ2.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RQ2 decode(ProtoReader protoReader) {
        RQ2 rq2 = new RQ2();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rq2.status_code = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        rq2.min_cursor = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        rq2.max_cursor = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        rq2.has_more = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        rq2.aweme_list.add(RCZ.ADAPTER.decode(protoReader));
                        break;
                    case 6:
                        rq2.rid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        rq2.home_model = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        rq2.refresh_clear = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        rq2.extra = RM5.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        rq2.log_pb = RME.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 12:
                        rq2.guide_word = RKX.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rq2.preload_ads.add(RCZ.ADAPTER.decode(protoReader));
                        break;
                    case 14:
                        rq2.status_msg = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 15:
                        rq2.block_code = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        rq2.preload_awemes.add(RCZ.ADAPTER.decode(protoReader));
                        break;
                    case 17:
                        rq2.enable_re_rank = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 18:
                        rq2.disable_adjust_for_cache = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 19:
                        rq2.showtime_gap_rsp_info = RQ5.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        rq2.has_ad = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 21:
                        rq2.commerce_pitaya_info = C69363RKd.ADAPTER.decode(protoReader);
                        break;
                    case 22:
                        rq2.topview_over_delivery_result = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 23:
                        rq2.proactive_login_config = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 24:
                        rq2.card_insert_results.add(RHB.ADAPTER.decode(protoReader));
                        break;
                    case 25:
                        rq2.is_non_personalized = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rq2;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RQ2 rq2) {
        RQ2 rq22 = rq2;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rq22.status_code);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, rq22.has_more) + protoAdapter2.encodedSizeWithTag(3, rq22.max_cursor) + protoAdapter2.encodedSizeWithTag(2, rq22.min_cursor) + encodedSizeWithTag;
        ProtoAdapter<RCZ> protoAdapter3 = RCZ.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter3.asRepeated().encodedSizeWithTag(5, rq22.aweme_list) + encodedSizeWithTag2;
        ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
        int encodedSizeWithTag4 = protoAdapter3.asRepeated().encodedSizeWithTag(16, rq22.preload_awemes) + protoAdapter.encodedSizeWithTag(15, rq22.block_code) + protoAdapter4.encodedSizeWithTag(14, rq22.status_msg) + protoAdapter3.asRepeated().encodedSizeWithTag(13, rq22.preload_ads) + RKX.ADAPTER.encodedSizeWithTag(12, rq22.guide_word) + RME.ADAPTER.encodedSizeWithTag(10, rq22.log_pb) + RM5.ADAPTER.encodedSizeWithTag(9, rq22.extra) + protoAdapter.encodedSizeWithTag(8, rq22.refresh_clear) + protoAdapter.encodedSizeWithTag(7, rq22.home_model) + protoAdapter4.encodedSizeWithTag(6, rq22.rid) + encodedSizeWithTag3;
        ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
        return rq22.unknownFields().size() + protoAdapter5.encodedSizeWithTag(25, rq22.is_non_personalized) + RHB.ADAPTER.asRepeated().encodedSizeWithTag(24, rq22.card_insert_results) + protoAdapter4.encodedSizeWithTag(23, rq22.proactive_login_config) + protoAdapter4.encodedSizeWithTag(22, rq22.topview_over_delivery_result) + C69363RKd.ADAPTER.encodedSizeWithTag(21, rq22.commerce_pitaya_info) + protoAdapter5.encodedSizeWithTag(20, rq22.has_ad) + RQ5.ADAPTER.encodedSizeWithTag(19, rq22.showtime_gap_rsp_info) + protoAdapter5.encodedSizeWithTag(18, rq22.disable_adjust_for_cache) + protoAdapter5.encodedSizeWithTag(17, rq22.enable_re_rank) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RQ2 rq2) {
        RQ2 rq22 = rq2;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rq22.status_code);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, rq22.min_cursor);
        protoAdapter2.encodeWithTag(protoWriter, 3, rq22.max_cursor);
        protoAdapter.encodeWithTag(protoWriter, 4, rq22.has_more);
        ProtoAdapter<RCZ> protoAdapter3 = RCZ.ADAPTER;
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 5, rq22.aweme_list);
        ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
        protoAdapter4.encodeWithTag(protoWriter, 6, rq22.rid);
        protoAdapter.encodeWithTag(protoWriter, 7, rq22.home_model);
        protoAdapter.encodeWithTag(protoWriter, 8, rq22.refresh_clear);
        RM5.ADAPTER.encodeWithTag(protoWriter, 9, rq22.extra);
        RME.ADAPTER.encodeWithTag(protoWriter, 10, rq22.log_pb);
        RKX.ADAPTER.encodeWithTag(protoWriter, 12, rq22.guide_word);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 13, rq22.preload_ads);
        protoAdapter4.encodeWithTag(protoWriter, 14, rq22.status_msg);
        protoAdapter.encodeWithTag(protoWriter, 15, rq22.block_code);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 16, rq22.preload_awemes);
        ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
        protoAdapter5.encodeWithTag(protoWriter, 17, rq22.enable_re_rank);
        protoAdapter5.encodeWithTag(protoWriter, 18, rq22.disable_adjust_for_cache);
        RQ5.ADAPTER.encodeWithTag(protoWriter, 19, rq22.showtime_gap_rsp_info);
        protoAdapter5.encodeWithTag(protoWriter, 20, rq22.has_ad);
        C69363RKd.ADAPTER.encodeWithTag(protoWriter, 21, rq22.commerce_pitaya_info);
        protoAdapter4.encodeWithTag(protoWriter, 22, rq22.topview_over_delivery_result);
        protoAdapter4.encodeWithTag(protoWriter, 23, rq22.proactive_login_config);
        RHB.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, rq22.card_insert_results);
        protoAdapter5.encodeWithTag(protoWriter, 25, rq22.is_non_personalized);
        protoWriter.writeBytes(rq22.unknownFields());
    }
}
