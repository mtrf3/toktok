package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RNE extends ProtoAdapter<RNF> {
    public RNE() {
        super(FieldEncoding.LENGTH_DELIMITED, RNF.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RNF decode(ProtoReader protoReader) {
        RNF rnf = new RNF();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rnf.link = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rnf.keyword = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rnf;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RNF rnf) {
        RNF rnf2 = rnf;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rnf2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rnf2.link) + protoAdapter.encodedSizeWithTag(1, rnf2.keyword);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RNF rnf) {
        RNF rnf2 = rnf;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rnf2.keyword);
        protoAdapter.encodeWithTag(protoWriter, 2, rnf2.link);
        protoWriter.writeBytes(rnf2.unknownFields());
    }
}
