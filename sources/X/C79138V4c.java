package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.V4c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79138V4c extends ProtoAdapter<V4W> {
    public C79138V4c() {
        super(FieldEncoding.LENGTH_DELIMITED, V4W.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V4W decode(ProtoReader protoReader) {
        V3B v3b = new V3B();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            v3b.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            v3b.LJFF = C63714OzW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        v3b.LJ = RUF.ADAPTER.decode(protoReader);
                    }
                } else {
                    v3b.LIZLLL = C79135V3z.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v3b.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V4W v4w) {
        V4W v4w2 = v4w;
        return v4w2.unknownFields().size() + C63714OzW.ADAPTER.encodedSizeWithTag(3, v4w2.link_info) + RUF.ADAPTER.encodedSizeWithTag(2, v4w2.text) + C79135V3z.ADAPTER.encodedSizeWithTag(1, v4w2.image);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3B, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V4W redact(V4W v4w) {
        ?? newBuilder2 = v4w.newBuilder2();
        C79135V3z c79135V3z = newBuilder2.LIZLLL;
        if (c79135V3z != null) {
            newBuilder2.LIZLLL = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        RUF ruf = newBuilder2.LJ;
        if (ruf != null) {
            newBuilder2.LJ = RUF.ADAPTER.redact(ruf);
        }
        C63714OzW c63714OzW = newBuilder2.LJFF;
        if (c63714OzW != null) {
            newBuilder2.LJFF = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V4W v4w) {
        V4W v4w2 = v4w;
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 1, v4w2.image);
        RUF.ADAPTER.encodeWithTag(protoWriter, 2, v4w2.text);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 3, v4w2.link_info);
        protoWriter.writeBytes(v4w2.unknownFields());
    }
}
