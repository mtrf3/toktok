package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4K extends ProtoAdapter<V45> {
    public V4K() {
        super(FieldEncoding.LENGTH_DELIMITED, V45.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V45 decode(ProtoReader protoReader) {
        C79112V3c c79112V3c = new C79112V3c();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 200) {
                                    if (nextTag != 201) {
                                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                        c79112V3c.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c79112V3c.LJIIIIZZ = RUB.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c79112V3c.LJII = RU2.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c79112V3c.LJI = V4Y.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c79112V3c.LJFF = C79148V4m.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c79112V3c.LJ = V4L.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79112V3c.LIZLLL = C79135V3z.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79112V3c.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V45 v45) {
        V45 v452 = v45;
        return v452.unknownFields().size() + RUB.ADAPTER.encodedSizeWithTag(201, v452.resp_base) + RU2.ADAPTER.encodedSizeWithTag(200, v452.req_base) + V4Y.ADAPTER.encodedSizeWithTag(4, v452.sticker_creator_user_info) + C79148V4m.ADAPTER.encodedSizeWithTag(3, v452.fallback) + V4L.ADAPTER.encodedSizeWithTag(2, v452.preview_hint) + C79135V3z.ADAPTER.encodedSizeWithTag(1, v452.sticker);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.V3c] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V45 redact(V45 v45) {
        ?? newBuilder2 = v45.newBuilder2();
        C79135V3z c79135V3z = newBuilder2.LIZLLL;
        if (c79135V3z != null) {
            newBuilder2.LIZLLL = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        V4L v4l = newBuilder2.LJ;
        if (v4l != null) {
            newBuilder2.LJ = V4L.ADAPTER.redact(v4l);
        }
        C79148V4m c79148V4m = newBuilder2.LJFF;
        if (c79148V4m != null) {
            newBuilder2.LJFF = C79148V4m.ADAPTER.redact(c79148V4m);
        }
        V4Y v4y = newBuilder2.LJI;
        if (v4y != null) {
            newBuilder2.LJI = V4Y.ADAPTER.redact(v4y);
        }
        RU2 ru2 = newBuilder2.LJII;
        if (ru2 != null) {
            newBuilder2.LJII = RU2.ADAPTER.redact(ru2);
        }
        RUB rub = newBuilder2.LJIIIIZZ;
        if (rub != null) {
            newBuilder2.LJIIIIZZ = RUB.ADAPTER.redact(rub);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V45 v45) {
        V45 v452 = v45;
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 1, v452.sticker);
        V4L.ADAPTER.encodeWithTag(protoWriter, 2, v452.preview_hint);
        C79148V4m.ADAPTER.encodeWithTag(protoWriter, 3, v452.fallback);
        V4Y.ADAPTER.encodeWithTag(protoWriter, 4, v452.sticker_creator_user_info);
        RU2.ADAPTER.encodeWithTag(protoWriter, 200, v452.req_base);
        RUB.ADAPTER.encodeWithTag(protoWriter, 201, v452.resp_base);
        protoWriter.writeBytes(v452.unknownFields());
    }
}
