package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RKN extends ProtoAdapter<RKO> {
    public RKN() {
        super(FieldEncoding.LENGTH_DELIMITED, RKO.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RKO decode(ProtoReader protoReader) {
        RKO rko = new RKO();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rko.biz_status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rko.biz_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rko;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RKO rko) {
        RKO rko2 = rko;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rko2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rko2.biz_status) + protoAdapter.encodedSizeWithTag(1, rko2.biz_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RKO rko) {
        RKO rko2 = rko;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rko2.biz_type);
        protoAdapter.encodeWithTag(protoWriter, 2, rko2.biz_status);
        protoWriter.writeBytes(rko2.unknownFields());
    }
}
