package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4X extends ProtoAdapter<V4R> {
    public V4X() {
        super(FieldEncoding.LENGTH_DELIMITED, V4R.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V4R decode(ProtoReader protoReader) {
        C79116V3g c79116V3g = new C79116V3g();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c79116V3g.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c79116V3g.LJI = C79141V4f.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c79116V3g.LJFF = RUF.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c79116V3g.LJ = RUF.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79116V3g.LIZLLL = C79135V3z.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79116V3g.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V4R v4r) {
        V4R v4r2 = v4r;
        int encodedSizeWithTag = C79135V3z.ADAPTER.encodedSizeWithTag(1, v4r2.image);
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        return v4r2.unknownFields().size() + C79141V4f.ADAPTER.encodedSizeWithTag(4, v4r2.button) + protoAdapter.encodedSizeWithTag(3, v4r2.subtitle) + protoAdapter.encodedSizeWithTag(2, v4r2.title) + encodedSizeWithTag;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3g, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V4R redact(V4R v4r) {
        ?? newBuilder2 = v4r.newBuilder2();
        C79135V3z c79135V3z = newBuilder2.LIZLLL;
        if (c79135V3z != null) {
            newBuilder2.LIZLLL = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        RUF ruf = newBuilder2.LJ;
        if (ruf != null) {
            newBuilder2.LJ = RUF.ADAPTER.redact(ruf);
        }
        RUF ruf2 = newBuilder2.LJFF;
        if (ruf2 != null) {
            newBuilder2.LJFF = RUF.ADAPTER.redact(ruf2);
        }
        C79141V4f c79141V4f = newBuilder2.LJI;
        if (c79141V4f != null) {
            newBuilder2.LJI = C79141V4f.ADAPTER.redact(c79141V4f);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V4R v4r) {
        V4R v4r2 = v4r;
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 1, v4r2.image);
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, v4r2.title);
        protoAdapter.encodeWithTag(protoWriter, 3, v4r2.subtitle);
        C79141V4f.ADAPTER.encodeWithTag(protoWriter, 4, v4r2.button);
        protoWriter.writeBytes(v4r2.unknownFields());
    }
}
