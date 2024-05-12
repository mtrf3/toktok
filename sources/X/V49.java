package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V49 extends ProtoAdapter<C79130V3u> {
    public V49() {
        super(FieldEncoding.LENGTH_DELIMITED, C79130V3u.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79130V3u decode(ProtoReader protoReader) {
        C79110V3a c79110V3a = new C79110V3a();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 200) {
                    if (nextTag != 201) {
                        switch (nextTag) {
                            case 1:
                                c79110V3a.LIZLLL = C79135V3z.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                c79110V3a.LJ = C79129V3t.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c79110V3a.LJFF = RUF.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c79110V3a.LJI = RUF.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                c79110V3a.LJII = RUF.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c79110V3a.LJIIIIZZ = C63714OzW.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c79110V3a.LJIIIZ = V4L.ADAPTER.decode(protoReader);
                                break;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c79110V3a.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        c79110V3a.LJIIJJI = RUB.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79110V3a.LJIIJ = RU2.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79110V3a.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79130V3u c79130V3u) {
        C79130V3u c79130V3u2 = c79130V3u;
        int encodedSizeWithTag = C79129V3t.ADAPTER.encodedSizeWithTag(2, c79130V3u2.user_info) + C79135V3z.ADAPTER.encodedSizeWithTag(1, c79130V3u2.image);
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        return c79130V3u2.unknownFields().size() + RUB.ADAPTER.encodedSizeWithTag(201, c79130V3u2.resp_base) + RU2.ADAPTER.encodedSizeWithTag(200, c79130V3u2.req_base) + V4L.ADAPTER.encodedSizeWithTag(7, c79130V3u2.preview_hint) + C63714OzW.ADAPTER.encodedSizeWithTag(6, c79130V3u2.link_info) + protoAdapter.encodedSizeWithTag(5, c79130V3u2.hint_title) + protoAdapter.encodedSizeWithTag(4, c79130V3u2.sub_title) + protoAdapter.encodedSizeWithTag(3, c79130V3u2.title) + encodedSizeWithTag;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3a, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C79130V3u redact(C79130V3u c79130V3u) {
        ?? newBuilder2 = c79130V3u.newBuilder2();
        C79135V3z c79135V3z = newBuilder2.LIZLLL;
        if (c79135V3z != null) {
            newBuilder2.LIZLLL = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        C79129V3t c79129V3t = newBuilder2.LJ;
        if (c79129V3t != null) {
            newBuilder2.LJ = C79129V3t.ADAPTER.redact(c79129V3t);
        }
        RUF ruf = newBuilder2.LJFF;
        if (ruf != null) {
            newBuilder2.LJFF = RUF.ADAPTER.redact(ruf);
        }
        RUF ruf2 = newBuilder2.LJI;
        if (ruf2 != null) {
            newBuilder2.LJI = RUF.ADAPTER.redact(ruf2);
        }
        RUF ruf3 = newBuilder2.LJII;
        if (ruf3 != null) {
            newBuilder2.LJII = RUF.ADAPTER.redact(ruf3);
        }
        C63714OzW c63714OzW = newBuilder2.LJIIIIZZ;
        if (c63714OzW != null) {
            newBuilder2.LJIIIIZZ = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        V4L v4l = newBuilder2.LJIIIZ;
        if (v4l != null) {
            newBuilder2.LJIIIZ = V4L.ADAPTER.redact(v4l);
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
    public final void encode(ProtoWriter protoWriter, C79130V3u c79130V3u) {
        C79130V3u c79130V3u2 = c79130V3u;
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 1, c79130V3u2.image);
        C79129V3t.ADAPTER.encodeWithTag(protoWriter, 2, c79130V3u2.user_info);
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, c79130V3u2.title);
        protoAdapter.encodeWithTag(protoWriter, 4, c79130V3u2.sub_title);
        protoAdapter.encodeWithTag(protoWriter, 5, c79130V3u2.hint_title);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 6, c79130V3u2.link_info);
        V4L.ADAPTER.encodeWithTag(protoWriter, 7, c79130V3u2.preview_hint);
        RU2.ADAPTER.encodeWithTag(protoWriter, 200, c79130V3u2.req_base);
        RUB.ADAPTER.encodeWithTag(protoWriter, 201, c79130V3u2.resp_base);
        protoWriter.writeBytes(c79130V3u2.unknownFields());
    }
}
