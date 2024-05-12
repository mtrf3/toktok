package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RNB extends ProtoAdapter<RNC> {
    public RNB() {
        super(FieldEncoding.LENGTH_DELIMITED, RNC.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RNC decode(ProtoReader protoReader) {
        RNC rnc = new RNC();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rnc.content = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rnc.title = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rnc;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RNC rnc) {
        RNC rnc2 = rnc;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rnc2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rnc2.content) + protoAdapter.encodedSizeWithTag(1, rnc2.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RNC rnc) {
        RNC rnc2 = rnc;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rnc2.title);
        protoAdapter.encodeWithTag(protoWriter, 2, rnc2.content);
        protoWriter.writeBytes(rnc2.unknownFields());
    }
}
