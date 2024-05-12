package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.QVi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67106QVi extends ProtoAdapter<C67102QVe> {
    public C67106QVi() {
        super(FieldEncoding.LENGTH_DELIMITED, C67102QVe.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C67102QVe decode(ProtoReader protoReader) {
        C67112QVo c67112QVo = new C67112QVo();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 255) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c67112QVo.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c67112QVo.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c67112QVo.LJ = C67103QVf.ADAPTER.decode(protoReader);
                    }
                } else {
                    c67112QVo.LIZLLL = C67107QVj.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c67112QVo.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C67102QVe c67102QVe) {
        C67102QVe c67102QVe2 = c67102QVe;
        return c67102QVe2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(255, c67102QVe2.ts) + C67103QVf.ADAPTER.encodedSizeWithTag(2, c67102QVe2.payload) + C67107QVj.ADAPTER.encodedSizeWithTag(1, c67102QVe2.cursor);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.QVo, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C67102QVe redact(C67102QVe c67102QVe) {
        ?? newBuilder2 = c67102QVe.newBuilder2();
        newBuilder2.LIZLLL = C67107QVj.ADAPTER.redact(newBuilder2.LIZLLL);
        C67103QVf c67103QVf = newBuilder2.LJ;
        if (c67103QVf != null) {
            newBuilder2.LJ = C67103QVf.ADAPTER.redact(c67103QVf);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C67102QVe c67102QVe) {
        C67102QVe c67102QVe2 = c67102QVe;
        C67107QVj.ADAPTER.encodeWithTag(protoWriter, 1, c67102QVe2.cursor);
        C67103QVf.ADAPTER.encodeWithTag(protoWriter, 2, c67102QVe2.payload);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 255, c67102QVe2.ts);
        protoWriter.writeBytes(c67102QVe2.unknownFields());
    }
}
