package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4B extends ProtoAdapter<V41> {
    public V4B() {
        super(FieldEncoding.LENGTH_DELIMITED, V41.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V41 decode(ProtoReader protoReader) {
        C79127V3r c79127V3r = new C79127V3r();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 200) {
                    if (nextTag != 201) {
                        switch (nextTag) {
                            case 1:
                                c79127V3r.LIZLLL = C79135V3z.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                c79127V3r.LJ = C79135V3z.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c79127V3r.LJFF = V4L.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c79127V3r.LJI = C63714OzW.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                c79127V3r.LJII = V4V.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c79127V3r.LJIIIIZZ = C79135V3z.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c79127V3r.LJIIIZ = C79135V3z.ADAPTER.decode(protoReader);
                                break;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c79127V3r.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        c79127V3r.LJIIJJI = RUB.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79127V3r.LJIIJ = RU2.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79127V3r.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V41 v41) {
        V41 v412 = v41;
        ProtoAdapter<C79135V3z> protoAdapter = C79135V3z.ADAPTER;
        return v412.unknownFields().size() + RUB.ADAPTER.encodedSizeWithTag(201, v412.resp_base) + RU2.ADAPTER.encodedSizeWithTag(200, v412.req_base) + protoAdapter.encodedSizeWithTag(7, v412.thumbnail_mint) + protoAdapter.encodedSizeWithTag(6, v412.image_mint) + V4V.ADAPTER.encodedSizeWithTag(5, v412.fallback) + C63714OzW.ADAPTER.encodedSizeWithTag(4, v412.link_info) + V4L.ADAPTER.encodedSizeWithTag(3, v412.preview_hint) + protoAdapter.encodedSizeWithTag(2, v412.thumbnail) + protoAdapter.encodedSizeWithTag(1, v412.image);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3r, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V41 redact(V41 v41) {
        ?? newBuilder2 = v41.newBuilder2();
        C79135V3z c79135V3z = newBuilder2.LIZLLL;
        if (c79135V3z != null) {
            newBuilder2.LIZLLL = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        C79135V3z c79135V3z2 = newBuilder2.LJ;
        if (c79135V3z2 != null) {
            newBuilder2.LJ = C79135V3z.ADAPTER.redact(c79135V3z2);
        }
        V4L v4l = newBuilder2.LJFF;
        if (v4l != null) {
            newBuilder2.LJFF = V4L.ADAPTER.redact(v4l);
        }
        C63714OzW c63714OzW = newBuilder2.LJI;
        if (c63714OzW != null) {
            newBuilder2.LJI = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        V4V v4v = newBuilder2.LJII;
        if (v4v != null) {
            newBuilder2.LJII = V4V.ADAPTER.redact(v4v);
        }
        C79135V3z c79135V3z3 = newBuilder2.LJIIIIZZ;
        if (c79135V3z3 != null) {
            newBuilder2.LJIIIIZZ = C79135V3z.ADAPTER.redact(c79135V3z3);
        }
        C79135V3z c79135V3z4 = newBuilder2.LJIIIZ;
        if (c79135V3z4 != null) {
            newBuilder2.LJIIIZ = C79135V3z.ADAPTER.redact(c79135V3z4);
        }
        RU2 ru2 = newBuilder2.LJIIJ;
        if (ru2 != null) {
            newBuilder2.LJIIJ = RU2.ADAPTER.redact(ru2);
        }
        RUB rub = newBuilder2.LJIIJJI;
        if (rub != null) {
            newBuilder2.LJIIJJI = RUB.ADAPTER.redact(rub);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V41 v41) {
        V41 v412 = v41;
        ProtoAdapter<C79135V3z> protoAdapter = C79135V3z.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, v412.image);
        protoAdapter.encodeWithTag(protoWriter, 2, v412.thumbnail);
        V4L.ADAPTER.encodeWithTag(protoWriter, 3, v412.preview_hint);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 4, v412.link_info);
        V4V.ADAPTER.encodeWithTag(protoWriter, 5, v412.fallback);
        protoAdapter.encodeWithTag(protoWriter, 6, v412.image_mint);
        protoAdapter.encodeWithTag(protoWriter, 7, v412.thumbnail_mint);
        RU2.ADAPTER.encodeWithTag(protoWriter, 200, v412.req_base);
        RUB.ADAPTER.encodeWithTag(protoWriter, 201, v412.resp_base);
        protoWriter.writeBytes(v412.unknownFields());
    }
}
