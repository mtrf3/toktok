package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RP8 extends ProtoAdapter<RP9> {
    public RP8() {
        super(FieldEncoding.LENGTH_DELIMITED, RP9.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RP9 decode(ProtoReader protoReader) {
        RP9 rp9 = new RP9();
        long beginMessage = protoReader.beginMessage();
        while (protoReader.nextTag() != -1) {
            C1EW.LIZJ(protoReader, protoReader);
        }
        protoReader.endMessage(beginMessage);
        return rp9;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RP9 rp9) {
        return rp9.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RP9 rp9) {
        protoWriter.writeBytes(rp9.unknownFields());
    }
}
