package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class ROP extends ProtoAdapter<ROQ> {
    public ROP() {
        super(FieldEncoding.LENGTH_DELIMITED, ROQ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ROQ decode(ProtoReader protoReader) {
        ROQ roq = new ROQ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    roq.is_visible = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return roq;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ROQ roq) {
        ROQ roq2 = roq;
        return roq2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(1, roq2.is_visible);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ROQ roq) {
        ROQ roq2 = roq;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, roq2.is_visible);
        protoWriter.writeBytes(roq2.unknownFields());
    }
}
