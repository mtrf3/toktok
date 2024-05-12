package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4O extends ProtoAdapter<V4N> {
    public V4O() {
        super(FieldEncoding.LENGTH_DELIMITED, V4N.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V4N decode(ProtoReader protoReader) {
        C79117V3h c79117V3h = new C79117V3h();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c79117V3h.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    c79117V3h.LJI = V3D.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    c79117V3h.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c79117V3h.LJFF = C63714OzW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c79117V3h.LJ = RUF.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79117V3h.LIZLLL = RUF.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79117V3h.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V4N v4n) {
        V4N v4n2 = v4n;
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        return v4n2.unknownFields().size() + V3D.ADAPTER.encodedSizeWithTag(4, v4n2.type) + C63714OzW.ADAPTER.encodedSizeWithTag(3, v4n2.link) + protoAdapter.encodedSizeWithTag(2, v4n2.hint) + protoAdapter.encodedSizeWithTag(1, v4n2.text);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.V3h] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V4N redact(V4N v4n) {
        ?? newBuilder2 = v4n.newBuilder2();
        RUF ruf = newBuilder2.LIZLLL;
        if (ruf != null) {
            newBuilder2.LIZLLL = RUF.ADAPTER.redact(ruf);
        }
        RUF ruf2 = newBuilder2.LJ;
        if (ruf2 != null) {
            newBuilder2.LJ = RUF.ADAPTER.redact(ruf2);
        }
        C63714OzW c63714OzW = newBuilder2.LJFF;
        if (c63714OzW != null) {
            newBuilder2.LJFF = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V4N v4n) {
        V4N v4n2 = v4n;
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, v4n2.text);
        protoAdapter.encodeWithTag(protoWriter, 2, v4n2.hint);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 3, v4n2.link);
        V3D.ADAPTER.encodeWithTag(protoWriter, 4, v4n2.type);
        protoWriter.writeBytes(v4n2.unknownFields());
    }
}
