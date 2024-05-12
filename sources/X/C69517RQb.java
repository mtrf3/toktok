package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RQb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69517RQb extends ProtoAdapter<C69518RQc> {
    public C69517RQb() {
        super(FieldEncoding.LENGTH_DELIMITED, C69518RQc.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69518RQc decode(ProtoReader protoReader) {
        C69519RQd c69519RQd = new C69519RQd();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                c69519RQd.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return c69519RQd.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69518RQc c69518RQc) {
        return c69518RQc.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69518RQc c69518RQc) {
    }
}
