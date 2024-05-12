package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.V4a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79136V4a extends ProtoAdapter<V4V> {
    public C79136V4a() {
        super(FieldEncoding.LENGTH_DELIMITED, V4V.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V4V decode(ProtoReader protoReader) {
        C79120V3k c79120V3k = new C79120V3k();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c79120V3k.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c79120V3k.LJFF = C63714OzW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c79120V3k.LJ = RUF.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79120V3k.LIZLLL = C79135V3z.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79120V3k.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V4V v4v) {
        V4V v4v2 = v4v;
        return v4v2.unknownFields().size() + C63714OzW.ADAPTER.encodedSizeWithTag(3, v4v2.link_info) + RUF.ADAPTER.encodedSizeWithTag(2, v4v2.text) + C79135V3z.ADAPTER.encodedSizeWithTag(1, v4v2.image);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3k, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V4V redact(V4V v4v) {
        ?? newBuilder2 = v4v.newBuilder2();
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
    public final void encode(ProtoWriter protoWriter, V4V v4v) {
        V4V v4v2 = v4v;
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 1, v4v2.image);
        RUF.ADAPTER.encodeWithTag(protoWriter, 2, v4v2.text);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 3, v4v2.link_info);
        protoWriter.writeBytes(v4v2.unknownFields());
    }
}
