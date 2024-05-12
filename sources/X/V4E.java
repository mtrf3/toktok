package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4E extends ProtoAdapter<C79134V3y> {
    public V4E() {
        super(FieldEncoding.LENGTH_DELIMITED, C79134V3y.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79134V3y decode(ProtoReader protoReader) {
        C79111V3b c79111V3b = new C79111V3b();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    if (nextTag != 200) {
                                        if (nextTag != 201) {
                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                            c79111V3b.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c79111V3b.LJIIIZ = RUB.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c79111V3b.LJIIIIZZ = RU2.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c79111V3b.LJII = C79129V3t.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c79111V3b.LJI = V4W.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c79111V3b.LJFF = C63714OzW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c79111V3b.LJ = V4L.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79111V3b.LIZLLL = V43.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79111V3b.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79134V3y c79134V3y) {
        C79134V3y c79134V3y2 = c79134V3y;
        return c79134V3y2.unknownFields().size() + RUB.ADAPTER.encodedSizeWithTag(201, c79134V3y2.resp_base) + RU2.ADAPTER.encodedSizeWithTag(200, c79134V3y2.req_base) + C79129V3t.ADAPTER.encodedSizeWithTag(5, c79134V3y2.user_info) + V4W.ADAPTER.encodedSizeWithTag(4, c79134V3y2.fallback) + C63714OzW.ADAPTER.encodedSizeWithTag(3, c79134V3y2.link_info) + V4L.ADAPTER.encodedSizeWithTag(2, c79134V3y2.preview_hint) + V43.ADAPTER.encodedSizeWithTag(1, c79134V3y2.video);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3b, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C79134V3y redact(C79134V3y c79134V3y) {
        ?? newBuilder2 = c79134V3y.newBuilder2();
        V43 v43 = newBuilder2.LIZLLL;
        if (v43 != null) {
            newBuilder2.LIZLLL = V43.ADAPTER.redact(v43);
        }
        V4L v4l = newBuilder2.LJ;
        if (v4l != null) {
            newBuilder2.LJ = V4L.ADAPTER.redact(v4l);
        }
        C63714OzW c63714OzW = newBuilder2.LJFF;
        if (c63714OzW != null) {
            newBuilder2.LJFF = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        V4W v4w = newBuilder2.LJI;
        if (v4w != null) {
            newBuilder2.LJI = V4W.ADAPTER.redact(v4w);
        }
        C79129V3t c79129V3t = newBuilder2.LJII;
        if (c79129V3t != null) {
            newBuilder2.LJII = C79129V3t.ADAPTER.redact(c79129V3t);
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
    public final void encode(ProtoWriter protoWriter, C79134V3y c79134V3y) {
        C79134V3y c79134V3y2 = c79134V3y;
        V43.ADAPTER.encodeWithTag(protoWriter, 1, c79134V3y2.video);
        V4L.ADAPTER.encodeWithTag(protoWriter, 2, c79134V3y2.preview_hint);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 3, c79134V3y2.link_info);
        V4W.ADAPTER.encodeWithTag(protoWriter, 4, c79134V3y2.fallback);
        C79129V3t.ADAPTER.encodeWithTag(protoWriter, 5, c79134V3y2.user_info);
        RU2.ADAPTER.encodeWithTag(protoWriter, 200, c79134V3y2.req_base);
        RUB.ADAPTER.encodeWithTag(protoWriter, 201, c79134V3y2.resp_base);
        protoWriter.writeBytes(c79134V3y2.unknownFields());
    }
}
