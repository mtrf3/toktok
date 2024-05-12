package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class ROY extends ProtoAdapter<ROZ> {
    public ROY() {
        super(FieldEncoding.LENGTH_DELIMITED, ROZ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ROZ decode(ProtoReader protoReader) {
        ROZ roz = new ROZ();
        long beginMessage = protoReader.beginMessage();
        while (protoReader.nextTag() != -1) {
            C1EW.LIZJ(protoReader, protoReader);
        }
        protoReader.endMessage(beginMessage);
        return roz;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ROZ roz) {
        return roz.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ROZ roz) {
        protoWriter.writeBytes(roz.unknownFields());
    }
}
