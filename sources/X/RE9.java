package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RE9 extends ProtoAdapter<RGY> {
    public RE9() {
        super(FieldEncoding.LENGTH_DELIMITED, RGY.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGY decode(ProtoReader protoReader) {
        RGY rgy = new RGY();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rgy.type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        rgy.start_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        rgy.end_time = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        rgy.resource_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rgy.author_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        rgy.effect_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgy;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGY rgy) {
        RGY rgy2 = rgy;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, rgy2.type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, rgy2.end_time) + protoAdapter.encodedSizeWithTag(2, rgy2.start_time) + encodedSizeWithTag;
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return rgy2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(6, rgy2.effect_id) + protoAdapter2.encodedSizeWithTag(5, rgy2.author_name) + protoAdapter2.encodedSizeWithTag(4, rgy2.resource_id) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGY rgy) {
        RGY rgy2 = rgy;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rgy2.type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, rgy2.start_time);
        protoAdapter.encodeWithTag(protoWriter, 3, rgy2.end_time);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, rgy2.resource_id);
        protoAdapter2.encodeWithTag(protoWriter, 5, rgy2.author_name);
        protoAdapter2.encodeWithTag(protoWriter, 6, rgy2.effect_id);
        protoWriter.writeBytes(rgy2.unknownFields());
    }
}
