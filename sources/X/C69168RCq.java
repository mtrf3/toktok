package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RCq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69168RCq extends ProtoAdapter<C69174RCw> {
    public C69168RCq() {
        super(FieldEncoding.LENGTH_DELIMITED, C69174RCw.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69174RCw decode(ProtoReader protoReader) {
        C69174RCw c69174RCw = new C69174RCw();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69174RCw.play_addr = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 2:
                        c69174RCw.cover = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 3:
                        c69174RCw.height = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c69174RCw.width = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69174RCw.dynamic_cover = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        c69174RCw.origin_cover = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c69174RCw.ratio = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c69174RCw.play_addr_lowbr = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69174RCw.bit_rate.add(RGN.ADAPTER.decode(protoReader));
                        break;
                    case 10:
                        c69174RCw.duration = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69174RCw.play_addr_265 = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 12:
                        c69174RCw.is_h265 = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69174RCw.play_addr_h264 = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 14:
                        c69174RCw.cdn_url_expired = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 15:
                        c69174RCw.is_long_video = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c69174RCw.video_model = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 17:
                        c69174RCw.need_set_token = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 18:
                        c69174RCw.token_auth = RLJ.ADAPTER.decode(protoReader);
                        break;
                    case 19:
                        c69174RCw.play_addr_bytevc1 = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        c69174RCw.is_bytevc1 = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 21:
                        c69174RCw.big_thumbs.add(C69246RFq.ADAPTER.decode(protoReader));
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69174RCw;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69174RCw c69174RCw) {
        C69174RCw c69174RCw2 = c69174RCw;
        ProtoAdapter<C69214REk> protoAdapter = C69214REk.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, c69174RCw2.cover) + protoAdapter.encodedSizeWithTag(1, c69174RCw2.play_addr);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(6, c69174RCw2.origin_cover) + protoAdapter.encodedSizeWithTag(5, c69174RCw2.dynamic_cover) + protoAdapter2.encodedSizeWithTag(4, c69174RCw2.width) + protoAdapter2.encodedSizeWithTag(3, c69174RCw2.height) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        return c69174RCw2.unknownFields().size() + C69246RFq.ADAPTER.asRepeated().encodedSizeWithTag(21, c69174RCw2.big_thumbs) + protoAdapter2.encodedSizeWithTag(20, c69174RCw2.is_bytevc1) + protoAdapter.encodedSizeWithTag(19, c69174RCw2.play_addr_bytevc1) + RLJ.ADAPTER.encodedSizeWithTag(18, c69174RCw2.token_auth) + ProtoAdapter.BOOL.encodedSizeWithTag(17, c69174RCw2.need_set_token) + protoAdapter3.encodedSizeWithTag(16, c69174RCw2.video_model) + protoAdapter2.encodedSizeWithTag(15, c69174RCw2.is_long_video) + ProtoAdapter.INT64.encodedSizeWithTag(14, c69174RCw2.cdn_url_expired) + protoAdapter.encodedSizeWithTag(13, c69174RCw2.play_addr_h264) + protoAdapter2.encodedSizeWithTag(12, c69174RCw2.is_h265) + protoAdapter.encodedSizeWithTag(11, c69174RCw2.play_addr_265) + protoAdapter2.encodedSizeWithTag(10, c69174RCw2.duration) + RGN.ADAPTER.asRepeated().encodedSizeWithTag(9, c69174RCw2.bit_rate) + protoAdapter.encodedSizeWithTag(8, c69174RCw2.play_addr_lowbr) + protoAdapter3.encodedSizeWithTag(7, c69174RCw2.ratio) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69174RCw c69174RCw) {
    }
}
