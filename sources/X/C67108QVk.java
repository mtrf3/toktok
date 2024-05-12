package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.QVk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67108QVk extends ProtoAdapter<C67107QVj> {
    public C67108QVk() {
        super(FieldEncoding.LENGTH_DELIMITED, C67107QVj.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C67107QVj decode(ProtoReader protoReader) {
        C67114QVq c67114QVq = new C67114QVq();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    c67114QVq.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    c67114QVq.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c67114QVq.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C67107QVj c67107QVj) {
        C67107QVj c67107QVj2 = c67107QVj;
        return c67107QVj2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(1, c67107QVj2.cursor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.QVq, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C67107QVj redact(C67107QVj c67107QVj) {
        ?? newBuilder2 = c67107QVj.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C67107QVj c67107QVj) {
        C67107QVj c67107QVj2 = c67107QVj;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c67107QVj2.cursor);
        protoWriter.writeBytes(c67107QVj2.unknownFields());
    }
}
