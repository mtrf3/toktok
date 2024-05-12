package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RO3 extends ProtoAdapter<RO4> {
    public RO3() {
        super(FieldEncoding.LENGTH_DELIMITED, RO4.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RO4 decode(ProtoReader protoReader) {
        RO4 ro4 = new RO4();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    ro4.text = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return ro4;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RO4 ro4) {
        RO4 ro42 = ro4;
        return ro42.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, ro42.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RO4 ro4) {
        RO4 ro42 = ro4;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ro42.text);
        protoWriter.writeBytes(ro42.unknownFields());
    }
}
