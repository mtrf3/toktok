package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69186RDi extends ProtoAdapter<RGA> {
    public C69186RDi() {
        super(FieldEncoding.LENGTH_DELIMITED, RGA.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGA decode(ProtoReader protoReader) {
        RGA rga = new RGA();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rga.lang = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rga.language_id = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        rga.voice_type = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rga.play_addr = REV.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        rga.volume_info = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rga.bit_rate = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        rga.language_code = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rga;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGA rga) {
        RGA rga2 = rga;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rga2.unknownFields().size() + protoAdapter.encodedSizeWithTag(7, rga2.language_code) + ProtoAdapter.INT32.encodedSizeWithTag(6, rga2.bit_rate) + protoAdapter.encodedSizeWithTag(5, rga2.volume_info) + REV.ADAPTER.encodedSizeWithTag(4, rga2.play_addr) + protoAdapter.encodedSizeWithTag(3, rga2.voice_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, rga2.language_id) + protoAdapter.encodedSizeWithTag(1, rga2.lang);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGA rga) {
        RGA rga2 = rga;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rga2.lang);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, rga2.language_id);
        protoAdapter.encodeWithTag(protoWriter, 3, rga2.voice_type);
        REV.ADAPTER.encodeWithTag(protoWriter, 4, rga2.play_addr);
        protoAdapter.encodeWithTag(protoWriter, 5, rga2.volume_info);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, rga2.bit_rate);
        protoAdapter.encodeWithTag(protoWriter, 7, rga2.language_code);
        protoWriter.writeBytes(rga2.unknownFields());
    }
}
