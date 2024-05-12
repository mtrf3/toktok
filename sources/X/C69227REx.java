package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69227REx extends ProtoAdapter<RGN> {
    public C69227REx() {
        super(FieldEncoding.LENGTH_DELIMITED, RGN.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGN decode(ProtoReader protoReader) {
        RGN rgn = new RGN();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgn.gear_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rgn.quality_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        rgn.bit_rate = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 4:
                        rgn.play_addr = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        rgn.is_h265 = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        rgn.play_addr_265 = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        rgn.play_addr_bytevc1 = C69214REk.ADAPTER.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgn;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGN rgn) {
        RGN rgn2 = rgn;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, rgn2.gear_name);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, rgn2.bit_rate) + protoAdapter.encodedSizeWithTag(2, rgn2.quality_type) + encodedSizeWithTag;
        ProtoAdapter<C69214REk> protoAdapter2 = C69214REk.ADAPTER;
        return rgn2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(7, rgn2.play_addr_bytevc1) + protoAdapter2.encodedSizeWithTag(6, rgn2.play_addr_265) + protoAdapter.encodedSizeWithTag(5, rgn2.is_h265) + protoAdapter2.encodedSizeWithTag(4, rgn2.play_addr) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, RGN rgn) {
    }
}
