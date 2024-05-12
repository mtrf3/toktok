package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4A extends ProtoAdapter<C79132V3w> {
    public V4A() {
        super(FieldEncoding.LENGTH_DELIMITED, C79132V3w.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79132V3w decode(ProtoReader protoReader) {
        V3Y v3y = new V3Y();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 6) {
                                    if (nextTag != 200) {
                                        if (nextTag != 201) {
                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                            v3y.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            v3y.LJIIIZ = RUB.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        v3y.LJIIIIZZ = RU2.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    v3y.LJII = C63714OzW.ADAPTER.decode(protoReader);
                                }
                            } else {
                                v3y.LJI.add(V4N.ADAPTER.decode(protoReader));
                            }
                        } else {
                            v3y.LJFF = V43.ADAPTER.decode(protoReader);
                        }
                    } else {
                        v3y.LJ = RUV.ADAPTER.decode(protoReader);
                    }
                } else {
                    v3y.LIZLLL = V4Z.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v3y.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79132V3w c79132V3w) {
        C79132V3w c79132V3w2 = c79132V3w;
        return c79132V3w2.unknownFields().size() + RUB.ADAPTER.encodedSizeWithTag(201, c79132V3w2.resp_base) + RU2.ADAPTER.encodedSizeWithTag(200, c79132V3w2.req_base) + C63714OzW.ADAPTER.encodedSizeWithTag(6, c79132V3w2.link_info) + V4N.ADAPTER.asRepeated().encodedSizeWithTag(4, c79132V3w2.buttons) + V43.ADAPTER.encodedSizeWithTag(3, c79132V3w2.video) + RUV.ADAPTER.encodedSizeWithTag(2, c79132V3w2.content) + V4Z.ADAPTER.encodedSizeWithTag(1, c79132V3w2.title);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3Y, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C79132V3w redact(C79132V3w c79132V3w) {
        ?? newBuilder2 = c79132V3w.newBuilder2();
        V4Z v4z = newBuilder2.LIZLLL;
        if (v4z != null) {
            newBuilder2.LIZLLL = V4Z.ADAPTER.redact(v4z);
        }
        RUV ruv = newBuilder2.LJ;
        if (ruv != null) {
            newBuilder2.LJ = RUV.ADAPTER.redact(ruv);
        }
        V43 v43 = newBuilder2.LJFF;
        if (v43 != null) {
            newBuilder2.LJFF = V43.ADAPTER.redact(v43);
        }
        C63685Oz3.LJIIIZ(newBuilder2.LJI, V4N.ADAPTER);
        C63714OzW c63714OzW = newBuilder2.LJII;
        if (c63714OzW != null) {
            newBuilder2.LJII = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        RU2 ru2 = newBuilder2.LJIIIIZZ;
        if (ru2 != null) {
            newBuilder2.LJIIIIZZ = RU2.ADAPTER.redact(ru2);
        }
        RUB rub = newBuilder2.LJIIIZ;
        if (rub != null) {
            newBuilder2.LJIIIZ = RUB.ADAPTER.redact(rub);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C79132V3w c79132V3w) {
        C79132V3w c79132V3w2 = c79132V3w;
        V4Z.ADAPTER.encodeWithTag(protoWriter, 1, c79132V3w2.title);
        RUV.ADAPTER.encodeWithTag(protoWriter, 2, c79132V3w2.content);
        V43.ADAPTER.encodeWithTag(protoWriter, 3, c79132V3w2.video);
        V4N.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c79132V3w2.buttons);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 6, c79132V3w2.link_info);
        RU2.ADAPTER.encodeWithTag(protoWriter, 200, c79132V3w2.req_base);
        RUB.ADAPTER.encodeWithTag(protoWriter, 201, c79132V3w2.resp_base);
        protoWriter.writeBytes(c79132V3w2.unknownFields());
    }
}
