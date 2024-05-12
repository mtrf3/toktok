package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.V4d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79139V4d extends ProtoAdapter<V4U> {
    public C79139V4d() {
        super(FieldEncoding.LENGTH_DELIMITED, V4U.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V4U decode(ProtoReader protoReader) {
        C79119V3j c79119V3j = new C79119V3j();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c79119V3j.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c79119V3j.LJI = C79135V3z.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c79119V3j.LJFF = C79135V3z.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c79119V3j.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c79119V3j.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79119V3j.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V4U v4u) {
        V4U v4u2 = v4u;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, v4u2.digg_count) + protoAdapter.encodedSizeWithTag(1, v4u2.item_id);
        ProtoAdapter<C79135V3z> protoAdapter2 = C79135V3z.ADAPTER;
        return v4u2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(4, v4u2.fallback) + protoAdapter2.encodedSizeWithTag(3, v4u2.cover) + encodedSizeWithTag;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3j, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V4U redact(V4U v4u) {
        ?? newBuilder2 = v4u.newBuilder2();
        C79135V3z c79135V3z = newBuilder2.LJFF;
        if (c79135V3z != null) {
            newBuilder2.LJFF = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        C79135V3z c79135V3z2 = newBuilder2.LJI;
        if (c79135V3z2 != null) {
            newBuilder2.LJI = C79135V3z.ADAPTER.redact(c79135V3z2);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V4U v4u) {
        V4U v4u2 = v4u;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, v4u2.item_id);
        protoAdapter.encodeWithTag(protoWriter, 2, v4u2.digg_count);
        ProtoAdapter<C79135V3z> protoAdapter2 = C79135V3z.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, v4u2.cover);
        protoAdapter2.encodeWithTag(protoWriter, 4, v4u2.fallback);
        protoWriter.writeBytes(v4u2.unknownFields());
    }
}
