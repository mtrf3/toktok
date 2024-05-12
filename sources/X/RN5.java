package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RN5 extends ProtoAdapter<RN6> {
    public RN5() {
        super(FieldEncoding.LENGTH_DELIMITED, RN6.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RN6 decode(ProtoReader protoReader) {
        RN6 rn6 = new RN6();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rn6.color = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rn6.label = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rn6;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RN6 rn6) {
        RN6 rn62 = rn6;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rn62.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rn62.color) + protoAdapter.encodedSizeWithTag(1, rn62.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RN6 rn6) {
        RN6 rn62 = rn6;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rn62.label);
        protoAdapter.encodeWithTag(protoWriter, 2, rn62.color);
        protoWriter.writeBytes(rn62.unknownFields());
    }
}
