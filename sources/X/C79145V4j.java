package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.V4j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79145V4j extends ProtoAdapter<V4Z> {
    public C79145V4j() {
        super(FieldEncoding.LENGTH_DELIMITED, V4Z.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V4Z decode(ProtoReader protoReader) {
        C79122V3m c79122V3m = new C79122V3m();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c79122V3m.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c79122V3m.LJ = C79135V3z.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79122V3m.LIZLLL = RUF.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79122V3m.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V4Z v4z) {
        V4Z v4z2 = v4z;
        return v4z2.unknownFields().size() + C79135V3z.ADAPTER.encodedSizeWithTag(2, v4z2.image) + RUF.ADAPTER.encodedSizeWithTag(1, v4z2.title);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3m, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V4Z redact(V4Z v4z) {
        ?? newBuilder2 = v4z.newBuilder2();
        RUF ruf = newBuilder2.LIZLLL;
        if (ruf != null) {
            newBuilder2.LIZLLL = RUF.ADAPTER.redact(ruf);
        }
        C79135V3z c79135V3z = newBuilder2.LJ;
        if (c79135V3z != null) {
            newBuilder2.LJ = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V4Z v4z) {
        V4Z v4z2 = v4z;
        RUF.ADAPTER.encodeWithTag(protoWriter, 1, v4z2.title);
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 2, v4z2.image);
        protoWriter.writeBytes(v4z2.unknownFields());
    }
}
