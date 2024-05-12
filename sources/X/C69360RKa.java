package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RKa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69360RKa extends ProtoAdapter<RKZ> {
    public C69360RKa() {
        super(FieldEncoding.LENGTH_DELIMITED, RKZ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RKZ decode(ProtoReader protoReader) {
        C69361RKb c69361RKb = new C69361RKb();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69361RKb.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        c69361RKb.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c69361RKb.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        c69361RKb.LJI = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69361RKb.LJII.add(RCZ.ADAPTER.decode(protoReader));
                        break;
                    case 6:
                        c69361RKb.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        c69361RKb.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        c69361RKb.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        c69361RKb.LJIIJJI = RM5.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        c69361RKb.LJIIL = RME.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69361RKb.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 12:
                        c69361RKb.LJIILJJIL = RKX.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69361RKb.LJIILL.add(RCZ.ADAPTER.decode(protoReader));
                        break;
                    case 14:
                        c69361RKb.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 15:
                        c69361RKb.LJIIZILJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69361RKb.LJIJ.add(RCZ.ADAPTER.decode(protoReader));
                        break;
                    case 17:
                        c69361RKb.LJIJI = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 18:
                        c69361RKb.LJIJJ = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 19:
                        c69361RKb.LJIJJLI = RQ5.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        c69361RKb.LJIL = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 21:
                        c69361RKb.LJJ = C69363RKd.ADAPTER.decode(protoReader);
                        break;
                    case 22:
                        c69361RKb.LJJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 23:
                        c69361RKb.LJJIFFI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 24:
                        c69361RKb.LJJII.add(RHB.ADAPTER.decode(protoReader));
                        break;
                    case 25:
                        c69361RKb.LJJIII = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 26:
                        c69361RKb.LJJIIJ = REX.ADAPTER.decode(protoReader);
                        break;
                    case 27:
                        c69361RKb.LJJIIJZLJL = RMB.ADAPTER.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69361RKb.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69361RKb.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RKZ rkz) {
        RKZ rkz2 = rkz;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rkz2.status_code);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, rkz2.has_more) + protoAdapter2.encodedSizeWithTag(3, rkz2.max_cursor) + protoAdapter2.encodedSizeWithTag(2, rkz2.min_cursor) + encodedSizeWithTag;
        ProtoAdapter<RCZ> protoAdapter3 = RCZ.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter3.asRepeated().encodedSizeWithTag(5, rkz2.aweme_list) + encodedSizeWithTag2;
        ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
        int encodedSizeWithTag4 = protoAdapter3.asRepeated().encodedSizeWithTag(16, rkz2.preload_awemes) + protoAdapter.encodedSizeWithTag(15, rkz2.block_code) + protoAdapter4.encodedSizeWithTag(14, rkz2.status_msg) + protoAdapter3.asRepeated().encodedSizeWithTag(13, rkz2.preload_ads) + RKX.ADAPTER.encodedSizeWithTag(12, rkz2.guide_word) + protoAdapter4.encodedSizeWithTag(11, rkz2.DebugInfo) + RME.ADAPTER.encodedSizeWithTag(10, rkz2.log_pb) + RM5.ADAPTER.encodedSizeWithTag(9, rkz2.extra) + protoAdapter.encodedSizeWithTag(8, rkz2.refresh_clear) + protoAdapter.encodedSizeWithTag(7, rkz2.home_model) + protoAdapter4.encodedSizeWithTag(6, rkz2.rid) + encodedSizeWithTag3;
        ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
        return rkz2.unknownFields().size() + RMB.ADAPTER.encodedSizeWithTag(27, rkz2.prompt) + REX.ADAPTER.encodedSizeWithTag(26, rkz2.consistency_rsp) + protoAdapter5.encodedSizeWithTag(25, rkz2.is_non_personalized) + RHB.ADAPTER.asRepeated().encodedSizeWithTag(24, rkz2.card_insert_results) + protoAdapter4.encodedSizeWithTag(23, rkz2.proactive_login_config) + protoAdapter4.encodedSizeWithTag(22, rkz2.topview_over_delivery_result) + C69363RKd.ADAPTER.encodedSizeWithTag(21, rkz2.commerce_pitaya_info) + protoAdapter5.encodedSizeWithTag(20, rkz2.has_ad) + RQ5.ADAPTER.encodedSizeWithTag(19, rkz2.showtime_gap_rsp_info) + protoAdapter5.encodedSizeWithTag(18, rkz2.disable_adjust_for_cache) + protoAdapter5.encodedSizeWithTag(17, rkz2.enable_re_rank) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RKZ rkz) {
        RKZ rkz2 = rkz;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rkz2.status_code);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, rkz2.min_cursor);
        protoAdapter2.encodeWithTag(protoWriter, 3, rkz2.max_cursor);
        protoAdapter.encodeWithTag(protoWriter, 4, rkz2.has_more);
        ProtoAdapter<RCZ> protoAdapter3 = RCZ.ADAPTER;
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 5, rkz2.aweme_list);
        ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
        protoAdapter4.encodeWithTag(protoWriter, 6, rkz2.rid);
        protoAdapter.encodeWithTag(protoWriter, 7, rkz2.home_model);
        protoAdapter.encodeWithTag(protoWriter, 8, rkz2.refresh_clear);
        RM5.ADAPTER.encodeWithTag(protoWriter, 9, rkz2.extra);
        RME.ADAPTER.encodeWithTag(protoWriter, 10, rkz2.log_pb);
        protoAdapter4.encodeWithTag(protoWriter, 11, rkz2.DebugInfo);
        RKX.ADAPTER.encodeWithTag(protoWriter, 12, rkz2.guide_word);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 13, rkz2.preload_ads);
        protoAdapter4.encodeWithTag(protoWriter, 14, rkz2.status_msg);
        protoAdapter.encodeWithTag(protoWriter, 15, rkz2.block_code);
        protoAdapter3.asRepeated().encodeWithTag(protoWriter, 16, rkz2.preload_awemes);
        ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
        protoAdapter5.encodeWithTag(protoWriter, 17, rkz2.enable_re_rank);
        protoAdapter5.encodeWithTag(protoWriter, 18, rkz2.disable_adjust_for_cache);
        RQ5.ADAPTER.encodeWithTag(protoWriter, 19, rkz2.showtime_gap_rsp_info);
        protoAdapter5.encodeWithTag(protoWriter, 20, rkz2.has_ad);
        C69363RKd.ADAPTER.encodeWithTag(protoWriter, 21, rkz2.commerce_pitaya_info);
        protoAdapter4.encodeWithTag(protoWriter, 22, rkz2.topview_over_delivery_result);
        protoAdapter4.encodeWithTag(protoWriter, 23, rkz2.proactive_login_config);
        RHB.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, rkz2.card_insert_results);
        protoAdapter5.encodeWithTag(protoWriter, 25, rkz2.is_non_personalized);
        REX.ADAPTER.encodeWithTag(protoWriter, 26, rkz2.consistency_rsp);
        RMB.ADAPTER.encodeWithTag(protoWriter, 27, rkz2.prompt);
        protoWriter.writeBytes(rkz2.unknownFields());
    }
}
