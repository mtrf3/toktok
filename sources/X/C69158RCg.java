package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69158RCg extends ProtoAdapter<C69159RCh> {
    public C69158RCg() {
        super(FieldEncoding.LENGTH_DELIMITED, C69159RCh.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69159RCh decode(ProtoReader protoReader) {
        C69159RCh c69159RCh = new C69159RCh();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69159RCh.play_addr = REV.ADAPTER.decode(protoReader);
                        break;
                    case 2:
                        c69159RCh.cover = REV.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        c69159RCh.height = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c69159RCh.width = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69159RCh.dynamic_cover = REV.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69159RCh.origin_cover = REV.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c69159RCh.ratio = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c69159RCh.download_addr = REV.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69159RCh.has_watermark = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 10:
                        c69159RCh.play_addr_lowbr = REV.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69159RCh.bit_rate.add(C69230RFa.ADAPTER.decode(protoReader));
                        break;
                    case 12:
                        c69159RCh.new_download_addr = REV.ADAPTER.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69159RCh.duration = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 14:
                        c69159RCh.download_suffix_logo_addr = REV.ADAPTER.decode(protoReader);
                        break;
                    case 15:
                        c69159RCh.has_download_suffix_logo_addr = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69159RCh.play_addr_265 = REV.ADAPTER.decode(protoReader);
                        break;
                    case 17:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 18:
                        c69159RCh.play_addr_h264 = REV.ADAPTER.decode(protoReader);
                        break;
                    case 19:
                        c69159RCh.ui_alike_download_addr = REV.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        c69159RCh.caption_download_addr = REV.ADAPTER.decode(protoReader);
                        break;
                    case 21:
                        c69159RCh.cdn_url_expired = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 22:
                        c69159RCh.is_long_video = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 23:
                        c69159RCh.video_model = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 24:
                        c69159RCh.need_set_token = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 25:
                        c69159RCh.misc_download_addrs = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 26:
                        c69159RCh.token_auth = C69384RKy.ADAPTER.decode(protoReader);
                        break;
                    case 27:
                        c69159RCh.play_addr_bytevc1 = REV.ADAPTER.decode(protoReader);
                        break;
                    case 28:
                        c69159RCh.is_bytevc1 = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 29:
                        c69159RCh.big_thumbs.add(RED.ADAPTER.decode(protoReader));
                        break;
                    case 30:
                        c69159RCh.meta = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 31:
                        c69159RCh.cla_info = C69181RDd.ADAPTER.decode(protoReader);
                        break;
                    case 32:
                        c69159RCh.source_HDR_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 33:
                        c69159RCh.CoverTsp = ProtoAdapter.DOUBLE.decode(protoReader);
                        break;
                    case 34:
                        c69159RCh.cover_is_custom = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 35:
                        c69159RCh.bit_rate_audio.add(RH0.ADAPTER.decode(protoReader));
                        break;
                    case 36:
                        c69159RCh.format = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 37:
                        c69159RCh.fake_landscape_video_info = C69262RGg.ADAPTER.decode(protoReader);
                        break;
                    case 38:
                        c69159RCh.pillar_box_video_info = C69278RGw.ADAPTER.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69159RCh;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69159RCh c69159RCh) {
        C69159RCh c69159RCh2 = c69159RCh;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, c69159RCh2.cover) + protoAdapter.encodedSizeWithTag(1, c69159RCh2.play_addr);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(6, c69159RCh2.origin_cover) + protoAdapter.encodedSizeWithTag(5, c69159RCh2.dynamic_cover) + protoAdapter2.encodedSizeWithTag(4, c69159RCh2.width) + protoAdapter2.encodedSizeWithTag(3, c69159RCh2.height) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(8, c69159RCh2.download_addr) + protoAdapter3.encodedSizeWithTag(7, c69159RCh2.ratio) + encodedSizeWithTag2;
        ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
        return c69159RCh2.unknownFields().size() + C69278RGw.ADAPTER.encodedSizeWithTag(38, c69159RCh2.pillar_box_video_info) + C69262RGg.ADAPTER.encodedSizeWithTag(37, c69159RCh2.fake_landscape_video_info) + protoAdapter3.encodedSizeWithTag(36, c69159RCh2.format) + RH0.ADAPTER.asRepeated().encodedSizeWithTag(35, c69159RCh2.bit_rate_audio) + protoAdapter4.encodedSizeWithTag(34, c69159RCh2.cover_is_custom) + ProtoAdapter.DOUBLE.encodedSizeWithTag(33, c69159RCh2.CoverTsp) + protoAdapter2.encodedSizeWithTag(32, c69159RCh2.source_HDR_type) + C69181RDd.ADAPTER.encodedSizeWithTag(31, c69159RCh2.cla_info) + protoAdapter3.encodedSizeWithTag(30, c69159RCh2.meta) + RED.ADAPTER.asRepeated().encodedSizeWithTag(29, c69159RCh2.big_thumbs) + protoAdapter2.encodedSizeWithTag(28, c69159RCh2.is_bytevc1) + protoAdapter.encodedSizeWithTag(27, c69159RCh2.play_addr_bytevc1) + C69384RKy.ADAPTER.encodedSizeWithTag(26, c69159RCh2.token_auth) + protoAdapter3.encodedSizeWithTag(25, c69159RCh2.misc_download_addrs) + protoAdapter4.encodedSizeWithTag(24, c69159RCh2.need_set_token) + protoAdapter3.encodedSizeWithTag(23, c69159RCh2.video_model) + protoAdapter2.encodedSizeWithTag(22, c69159RCh2.is_long_video) + ProtoAdapter.INT64.encodedSizeWithTag(21, c69159RCh2.cdn_url_expired) + protoAdapter.encodedSizeWithTag(20, c69159RCh2.caption_download_addr) + protoAdapter.encodedSizeWithTag(19, c69159RCh2.ui_alike_download_addr) + protoAdapter.encodedSizeWithTag(18, c69159RCh2.play_addr_h264) + protoAdapter.encodedSizeWithTag(16, c69159RCh2.play_addr_265) + protoAdapter4.encodedSizeWithTag(15, c69159RCh2.has_download_suffix_logo_addr) + protoAdapter.encodedSizeWithTag(14, c69159RCh2.download_suffix_logo_addr) + protoAdapter2.encodedSizeWithTag(13, c69159RCh2.duration) + protoAdapter.encodedSizeWithTag(12, c69159RCh2.new_download_addr) + C69230RFa.ADAPTER.asRepeated().encodedSizeWithTag(11, c69159RCh2.bit_rate) + protoAdapter.encodedSizeWithTag(10, c69159RCh2.play_addr_lowbr) + protoAdapter4.encodedSizeWithTag(9, c69159RCh2.has_watermark) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69159RCh c69159RCh) {
        C69159RCh c69159RCh2 = c69159RCh;
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, c69159RCh2.play_addr);
        protoAdapter.encodeWithTag(protoWriter, 2, c69159RCh2.cover);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 3, c69159RCh2.height);
        protoAdapter2.encodeWithTag(protoWriter, 4, c69159RCh2.width);
        protoAdapter.encodeWithTag(protoWriter, 5, c69159RCh2.dynamic_cover);
        protoAdapter.encodeWithTag(protoWriter, 6, c69159RCh2.origin_cover);
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 7, c69159RCh2.ratio);
        protoAdapter.encodeWithTag(protoWriter, 8, c69159RCh2.download_addr);
        ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
        protoAdapter4.encodeWithTag(protoWriter, 9, c69159RCh2.has_watermark);
        protoAdapter.encodeWithTag(protoWriter, 10, c69159RCh2.play_addr_lowbr);
        C69230RFa.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, c69159RCh2.bit_rate);
        protoAdapter.encodeWithTag(protoWriter, 12, c69159RCh2.new_download_addr);
        protoAdapter2.encodeWithTag(protoWriter, 13, c69159RCh2.duration);
        protoAdapter.encodeWithTag(protoWriter, 14, c69159RCh2.download_suffix_logo_addr);
        protoAdapter4.encodeWithTag(protoWriter, 15, c69159RCh2.has_download_suffix_logo_addr);
        protoAdapter.encodeWithTag(protoWriter, 16, c69159RCh2.play_addr_265);
        protoAdapter.encodeWithTag(protoWriter, 18, c69159RCh2.play_addr_h264);
        protoAdapter.encodeWithTag(protoWriter, 19, c69159RCh2.ui_alike_download_addr);
        protoAdapter.encodeWithTag(protoWriter, 20, c69159RCh2.caption_download_addr);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, c69159RCh2.cdn_url_expired);
        protoAdapter2.encodeWithTag(protoWriter, 22, c69159RCh2.is_long_video);
        protoAdapter3.encodeWithTag(protoWriter, 23, c69159RCh2.video_model);
        protoAdapter4.encodeWithTag(protoWriter, 24, c69159RCh2.need_set_token);
        protoAdapter3.encodeWithTag(protoWriter, 25, c69159RCh2.misc_download_addrs);
        C69384RKy.ADAPTER.encodeWithTag(protoWriter, 26, c69159RCh2.token_auth);
        protoAdapter.encodeWithTag(protoWriter, 27, c69159RCh2.play_addr_bytevc1);
        protoAdapter2.encodeWithTag(protoWriter, 28, c69159RCh2.is_bytevc1);
        RED.ADAPTER.asRepeated().encodeWithTag(protoWriter, 29, c69159RCh2.big_thumbs);
        protoAdapter3.encodeWithTag(protoWriter, 30, c69159RCh2.meta);
        C69181RDd.ADAPTER.encodeWithTag(protoWriter, 31, c69159RCh2.cla_info);
        protoAdapter2.encodeWithTag(protoWriter, 32, c69159RCh2.source_HDR_type);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 33, c69159RCh2.CoverTsp);
        protoAdapter4.encodeWithTag(protoWriter, 34, c69159RCh2.cover_is_custom);
        RH0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 35, c69159RCh2.bit_rate_audio);
        protoAdapter3.encodeWithTag(protoWriter, 36, c69159RCh2.format);
        C69262RGg.ADAPTER.encodeWithTag(protoWriter, 37, c69159RCh2.fake_landscape_video_info);
        C69278RGw.ADAPTER.encodeWithTag(protoWriter, 38, c69159RCh2.pillar_box_video_info);
        protoWriter.writeBytes(c69159RCh2.unknownFields());
    }
}
