package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RFb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69231RFb extends ProtoAdapter<C69230RFa> {
    public C69231RFb() {
        super(FieldEncoding.LENGTH_DELIMITED, C69230RFa.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69230RFa decode(ProtoReader protoReader) {
        C69230RFa c69230RFa = new C69230RFa();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69230RFa.gear_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69230RFa.quality_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c69230RFa.bit_rate = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        c69230RFa.play_addr = REV.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case 6:
                        c69230RFa.play_addr_265 = REV.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        c69230RFa.is_bytevc1 = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        c69230RFa.play_addr_bytevc1 = REV.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69230RFa.dub_infos.add(ROG.ADAPTER.decode(protoReader));
                        break;
                    case 10:
                        c69230RFa.HDR_type = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69230RFa.HDR_bit = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 12:
                        c69230RFa.video_extra = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c69230RFa.format = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        c69230RFa.fps = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 15:
                        c69230RFa.bandwidth = ProtoAdapter.INT64.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69230RFa;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69230RFa c69230RFa) {
        C69230RFa c69230RFa2 = c69230RFa;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c69230RFa2.gear_name);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, c69230RFa2.bit_rate) + protoAdapter2.encodedSizeWithTag(2, c69230RFa2.quality_type) + encodedSizeWithTag;
        ProtoAdapter<REV> protoAdapter3 = REV.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(13, c69230RFa2.format) + protoAdapter.encodedSizeWithTag(12, c69230RFa2.video_extra) + protoAdapter.encodedSizeWithTag(11, c69230RFa2.HDR_bit) + protoAdapter.encodedSizeWithTag(10, c69230RFa2.HDR_type) + ROG.ADAPTER.asRepeated().encodedSizeWithTag(9, c69230RFa2.dub_infos) + protoAdapter3.encodedSizeWithTag(8, c69230RFa2.play_addr_bytevc1) + protoAdapter2.encodedSizeWithTag(7, c69230RFa2.is_bytevc1) + protoAdapter3.encodedSizeWithTag(6, c69230RFa2.play_addr_265) + protoAdapter3.encodedSizeWithTag(4, c69230RFa2.play_addr) + encodedSizeWithTag2;
        ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
        return c69230RFa2.unknownFields().size() + protoAdapter4.encodedSizeWithTag(15, c69230RFa2.bandwidth) + protoAdapter4.encodedSizeWithTag(14, c69230RFa2.fps) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69230RFa c69230RFa) {
        C69230RFa c69230RFa2 = c69230RFa;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69230RFa2.gear_name);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 2, c69230RFa2.quality_type);
        protoAdapter2.encodeWithTag(protoWriter, 3, c69230RFa2.bit_rate);
        ProtoAdapter<REV> protoAdapter3 = REV.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 4, c69230RFa2.play_addr);
        protoAdapter3.encodeWithTag(protoWriter, 6, c69230RFa2.play_addr_265);
        protoAdapter2.encodeWithTag(protoWriter, 7, c69230RFa2.is_bytevc1);
        protoAdapter3.encodeWithTag(protoWriter, 8, c69230RFa2.play_addr_bytevc1);
        ROG.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, c69230RFa2.dub_infos);
        protoAdapter.encodeWithTag(protoWriter, 10, c69230RFa2.HDR_type);
        protoAdapter.encodeWithTag(protoWriter, 11, c69230RFa2.HDR_bit);
        protoAdapter.encodeWithTag(protoWriter, 12, c69230RFa2.video_extra);
        protoAdapter.encodeWithTag(protoWriter, 13, c69230RFa2.format);
        ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
        protoAdapter4.encodeWithTag(protoWriter, 14, c69230RFa2.fps);
        protoAdapter4.encodeWithTag(protoWriter, 15, c69230RFa2.bandwidth);
        protoWriter.writeBytes(c69230RFa2.unknownFields());
    }
}
