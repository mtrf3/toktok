package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RJW extends ProtoAdapter<RJX> {
    public RJW() {
        super(FieldEncoding.LENGTH_DELIMITED, RJX.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RJX decode(ProtoReader protoReader) {
        RJX rjx = new RJX();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    rjx.question = C69252RFw.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rjx;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RJX rjx) {
        RJX rjx2 = rjx;
        return rjx2.unknownFields().size() + C69252RFw.ADAPTER.encodedSizeWithTag(1, rjx2.question);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RJX rjx) {
        RJX rjx2 = rjx;
        C69252RFw.ADAPTER.encodeWithTag(protoWriter, 1, rjx2.question);
        protoWriter.writeBytes(rjx2.unknownFields());
    }
}
