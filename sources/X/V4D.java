package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4D extends ProtoAdapter<C79133V3x> {
    public V4D() {
        super(FieldEncoding.LENGTH_DELIMITED, C79133V3x.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79133V3x decode(ProtoReader protoReader) {
        V3Z v3z = new V3Z();
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
                                        v3z.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        v3z.LJIIIIZZ = RUB.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    v3z.LJII = RU2.ADAPTER.decode(protoReader);
                                }
                            } else {
                                v3z.LJI = V4L.ADAPTER.decode(protoReader);
                            }
                        } else {
                            v3z.LJFF = C63714OzW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        v3z.LJ.add(V43.ADAPTER.decode(protoReader));
                    }
                } else {
                    v3z.LIZLLL = V4R.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v3z.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79133V3x c79133V3x) {
        C79133V3x c79133V3x2 = c79133V3x;
        return c79133V3x2.unknownFields().size() + RUB.ADAPTER.encodedSizeWithTag(201, c79133V3x2.resp_base) + RU2.ADAPTER.encodedSizeWithTag(200, c79133V3x2.req_base) + V4L.ADAPTER.encodedSizeWithTag(4, c79133V3x2.preview_hint) + C63714OzW.ADAPTER.encodedSizeWithTag(3, c79133V3x2.link_info) + V43.ADAPTER.asRepeated().encodedSizeWithTag(2, c79133V3x2.videos) + V4R.ADAPTER.encodedSizeWithTag(1, c79133V3x2.title);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3Z, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C79133V3x redact(C79133V3x c79133V3x) {
        ?? newBuilder2 = c79133V3x.newBuilder2();
        V4R v4r = newBuilder2.LIZLLL;
        if (v4r != null) {
            newBuilder2.LIZLLL = V4R.ADAPTER.redact(v4r);
        }
        C63685Oz3.LJIIIZ(newBuilder2.LJ, V43.ADAPTER);
        C63714OzW c63714OzW = newBuilder2.LJFF;
        if (c63714OzW != null) {
            newBuilder2.LJFF = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        V4L v4l = newBuilder2.LJI;
        if (v4l != null) {
            newBuilder2.LJI = V4L.ADAPTER.redact(v4l);
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
    public final void encode(ProtoWriter protoWriter, C79133V3x c79133V3x) {
        C79133V3x c79133V3x2 = c79133V3x;
        V4R.ADAPTER.encodeWithTag(protoWriter, 1, c79133V3x2.title);
        V43.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c79133V3x2.videos);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 3, c79133V3x2.link_info);
        V4L.ADAPTER.encodeWithTag(protoWriter, 4, c79133V3x2.preview_hint);
        RU2.ADAPTER.encodeWithTag(protoWriter, 200, c79133V3x2.req_base);
        RUB.ADAPTER.encodeWithTag(protoWriter, 201, c79133V3x2.resp_base);
        protoWriter.writeBytes(c79133V3x2.unknownFields());
    }
}
