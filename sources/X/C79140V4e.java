package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.V4e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79140V4e extends ProtoAdapter<V4Y> {
    public C79140V4e() {
        super(FieldEncoding.LENGTH_DELIMITED, V4Y.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V4Y decode(ProtoReader protoReader) {
        C79121V3l c79121V3l = new C79121V3l();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c79121V3l.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c79121V3l.LJFF = C79135V3z.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c79121V3l.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c79121V3l.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79121V3l.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V4Y v4y) {
        V4Y v4y2 = v4y;
        return v4y2.unknownFields().size() + C79135V3z.ADAPTER.encodedSizeWithTag(3, v4y2.avatar_thumb) + ProtoAdapter.STRING.encodedSizeWithTag(2, v4y2.nick_name) + ProtoAdapter.INT64.encodedSizeWithTag(1, v4y2.user_id);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3l, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V4Y redact(V4Y v4y) {
        ?? newBuilder2 = v4y.newBuilder2();
        C79135V3z c79135V3z = newBuilder2.LJFF;
        if (c79135V3z != null) {
            newBuilder2.LJFF = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V4Y v4y) {
        V4Y v4y2 = v4y;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, v4y2.user_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, v4y2.nick_name);
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 3, v4y2.avatar_thumb);
        protoWriter.writeBytes(v4y2.unknownFields());
    }
}
