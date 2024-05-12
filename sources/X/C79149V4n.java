package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.V4n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79149V4n extends ProtoAdapter<C79148V4m> {
    public C79149V4n() {
        super(FieldEncoding.LENGTH_DELIMITED, C79148V4m.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79148V4m decode(ProtoReader protoReader) {
        C79123V3n c79123V3n = new C79123V3n();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    c79123V3n.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    c79123V3n.LIZLLL = C79135V3z.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79123V3n.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79148V4m c79148V4m) {
        C79148V4m c79148V4m2 = c79148V4m;
        return c79148V4m2.unknownFields().size() + C79135V3z.ADAPTER.encodedSizeWithTag(1, c79148V4m2.placeholder);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3n, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C79148V4m redact(C79148V4m c79148V4m) {
        ?? newBuilder2 = c79148V4m.newBuilder2();
        C79135V3z c79135V3z = newBuilder2.LIZLLL;
        if (c79135V3z != null) {
            newBuilder2.LIZLLL = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C79148V4m c79148V4m) {
        C79148V4m c79148V4m2 = c79148V4m;
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 1, c79148V4m2.placeholder);
        protoWriter.writeBytes(c79148V4m2.unknownFields());
    }
}
