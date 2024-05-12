package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RNQ extends ProtoAdapter<RNR> {
    public RNQ() {
        super(FieldEncoding.LENGTH_DELIMITED, RNR.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RNR decode(ProtoReader protoReader) {
        RNR rnr = new RNR();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rnr.data = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rnr.link = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rnr;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RNR rnr) {
        RNR rnr2 = rnr;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rnr2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rnr2.data) + protoAdapter.encodedSizeWithTag(1, rnr2.link);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RNR rnr) {
        RNR rnr2 = rnr;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rnr2.link);
        protoAdapter.encodeWithTag(protoWriter, 2, rnr2.data);
        protoWriter.writeBytes(rnr2.unknownFields());
    }
}
