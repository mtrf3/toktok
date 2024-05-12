package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RQt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69535RQt extends ProtoAdapter<C69536RQu> {
    public C69535RQt() {
        super(FieldEncoding.LENGTH_DELIMITED, C69536RQu.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69536RQu decode(ProtoReader protoReader) {
        C69537RQv c69537RQv = new C69537RQv();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                c69537RQv.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            } else {
                protoReader.endMessage(beginMessage);
                return c69537RQv.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69536RQu c69536RQu) {
        return c69536RQu.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C69536RQu c69536RQu) {
    }
}
