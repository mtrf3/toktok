package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RQq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69532RQq extends ProtoAdapter<C69533RQr> {
    public C69532RQq() {
        super(FieldEncoding.LENGTH_DELIMITED, C69533RQr.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69533RQr decode(ProtoReader protoReader) {
        C69534RQs c69534RQs = new C69534RQs();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                c69534RQs.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return c69534RQs.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69533RQr c69533RQr) {
        return c69533RQr.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69533RQr c69533RQr) {
    }
}
