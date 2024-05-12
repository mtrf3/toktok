package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RQz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69541RQz extends ProtoAdapter<RR0> {
    public C69541RQz() {
        super(FieldEncoding.LENGTH_DELIMITED, RR0.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RR0 decode(ProtoReader protoReader) {
        RR1 rr1 = new RR1();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                rr1.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return rr1.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RR0 rr0) {
        return rr0.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, RR0 rr0) {
    }
}
