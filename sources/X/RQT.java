package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQT extends ProtoAdapter<RQU> {
    public RQT() {
        super(FieldEncoding.LENGTH_DELIMITED, RQU.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RQU decode(ProtoReader protoReader) {
        RQV rqv = new RQV();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                rqv.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return rqv.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RQU rqu) {
        return rqu.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, RQU rqu) {
    }
}
