package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQY extends ProtoAdapter<RQZ> {
    public RQY() {
        super(FieldEncoding.LENGTH_DELIMITED, RQZ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RQZ decode(ProtoReader protoReader) {
        C69516RQa c69516RQa = new C69516RQa();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                c69516RQa.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return c69516RQa.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RQZ rqz) {
        return rqz.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, RQZ rqz) {
    }
}
