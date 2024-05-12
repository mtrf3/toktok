package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4J extends ProtoAdapter<V42> {
    public V4J() {
        super(FieldEncoding.LENGTH_DELIMITED, V42.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V42 decode(ProtoReader protoReader) {
        C79115V3f c79115V3f = new C79115V3f();
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
                                            c79115V3f.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c79115V3f.LJIIIZ = RUB.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c79115V3f.LJIIIIZZ = RU2.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c79115V3f.LJII = V4L.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c79115V3f.LJI = RUF.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c79115V3f.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c79115V3f.LJ = RUF.ADAPTER.decode(protoReader);
                    }
                } else {
                    c79115V3f.LIZLLL = RUF.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79115V3f.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V42 v42) {
        V42 v422 = v42;
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        return v422.unknownFields().size() + RUB.ADAPTER.encodedSizeWithTag(201, v422.resp_base) + RU2.ADAPTER.encodedSizeWithTag(200, v422.req_base) + V4L.ADAPTER.encodedSizeWithTag(5, v422.preview_hint) + protoAdapter.encodedSizeWithTag(4, v422.query_content) + ProtoAdapter.STRING.encodedSizeWithTag(3, v422.query_message_id) + protoAdapter.encodedSizeWithTag(2, v422.interactive_notice) + protoAdapter.encodedSizeWithTag(1, v422.plain_notice);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.V3f] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V42 redact(V42 v42) {
        ?? newBuilder2 = v42.newBuilder2();
        RUF ruf = newBuilder2.LIZLLL;
        if (ruf != null) {
            newBuilder2.LIZLLL = RUF.ADAPTER.redact(ruf);
        }
        RUF ruf2 = newBuilder2.LJ;
        if (ruf2 != null) {
            newBuilder2.LJ = RUF.ADAPTER.redact(ruf2);
        }
        RUF ruf3 = newBuilder2.LJI;
        if (ruf3 != null) {
            newBuilder2.LJI = RUF.ADAPTER.redact(ruf3);
        }
        V4L v4l = newBuilder2.LJII;
        if (v4l != null) {
            newBuilder2.LJII = V4L.ADAPTER.redact(v4l);
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
    public final void encode(ProtoWriter protoWriter, V42 v42) {
        V42 v422 = v42;
        ProtoAdapter<RUF> protoAdapter = RUF.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, v422.plain_notice);
        protoAdapter.encodeWithTag(protoWriter, 2, v422.interactive_notice);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, v422.query_message_id);
        protoAdapter.encodeWithTag(protoWriter, 4, v422.query_content);
        V4L.ADAPTER.encodeWithTag(protoWriter, 5, v422.preview_hint);
        RU2.ADAPTER.encodeWithTag(protoWriter, 200, v422.req_base);
        RUB.ADAPTER.encodeWithTag(protoWriter, 201, v422.resp_base);
        protoWriter.writeBytes(v422.unknownFields());
    }
}
