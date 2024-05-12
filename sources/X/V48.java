package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V48 extends ProtoAdapter<C79131V3v> {
    public V48() {
        super(FieldEncoding.LENGTH_DELIMITED, C79131V3v.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79131V3v decode(ProtoReader protoReader) {
        V3W v3w = new V3W();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 200) {
                    if (nextTag != 201) {
                        switch (nextTag) {
                            case 1:
                                v3w.LIZLLL = RUF.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                v3w.LJ.add(V4U.ADAPTER.decode(protoReader));
                                break;
                            case 3:
                                try {
                                    v3w.LJFF = V3T.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    v3w.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                v3w.LJI = V4L.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                v3w.LJII.add(C79129V3t.ADAPTER.decode(protoReader));
                                break;
                            case 6:
                                v3w.LJIIIIZZ.add(C63714OzW.ADAPTER.decode(protoReader));
                                break;
                            case 7:
                                v3w.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                v3w.LJIIJ.add(ProtoAdapter.INT32.decode(protoReader));
                                break;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                v3w.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        v3w.LJIIL = RUB.ADAPTER.decode(protoReader);
                    }
                } else {
                    v3w.LJIIJJI = RU2.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v3w.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79131V3v c79131V3v) {
        C79131V3v c79131V3v2 = c79131V3v;
        int encodedSizeWithTag = C63714OzW.ADAPTER.asRepeated().encodedSizeWithTag(6, c79131V3v2.link_infos) + C79129V3t.ADAPTER.asRepeated().encodedSizeWithTag(5, c79131V3v2.recommend_users) + V4L.ADAPTER.encodedSizeWithTag(4, c79131V3v2.preview_hint) + V3T.ADAPTER.encodedSizeWithTag(3, c79131V3v2.answer_status) + V4U.ADAPTER.asRepeated().encodedSizeWithTag(2, c79131V3v2.recommend_items) + RUF.ADAPTER.encodedSizeWithTag(1, c79131V3v2.answer);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c79131V3v2.unknownFields().size() + RUB.ADAPTER.encodedSizeWithTag(201, c79131V3v2.resp_base) + RU2.ADAPTER.encodedSizeWithTag(200, c79131V3v2.req_base) + protoAdapter.asRepeated().encodedSizeWithTag(8, c79131V3v2.content_types) + protoAdapter.encodedSizeWithTag(7, c79131V3v2.card_type) + encodedSizeWithTag;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V3W, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C79131V3v redact(C79131V3v c79131V3v) {
        ?? newBuilder2 = c79131V3v.newBuilder2();
        RUF ruf = newBuilder2.LIZLLL;
        if (ruf != null) {
            newBuilder2.LIZLLL = RUF.ADAPTER.redact(ruf);
        }
        C63685Oz3.LJIIIZ(newBuilder2.LJ, V4U.ADAPTER);
        V4L v4l = newBuilder2.LJI;
        if (v4l != null) {
            newBuilder2.LJI = V4L.ADAPTER.redact(v4l);
        }
        C63685Oz3.LJIIIZ(newBuilder2.LJII, C79129V3t.ADAPTER);
        C63685Oz3.LJIIIZ(newBuilder2.LJIIIIZZ, C63714OzW.ADAPTER);
        RU2 ru2 = newBuilder2.LJIIJJI;
        if (ru2 != null) {
            newBuilder2.LJIIJJI = RU2.ADAPTER.redact(ru2);
        }
        RUB rub = newBuilder2.LJIIL;
        if (rub != null) {
            newBuilder2.LJIIL = RUB.ADAPTER.redact(rub);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C79131V3v c79131V3v) {
        C79131V3v c79131V3v2 = c79131V3v;
        RUF.ADAPTER.encodeWithTag(protoWriter, 1, c79131V3v2.answer);
        V4U.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c79131V3v2.recommend_items);
        V3T.ADAPTER.encodeWithTag(protoWriter, 3, c79131V3v2.answer_status);
        V4L.ADAPTER.encodeWithTag(protoWriter, 4, c79131V3v2.preview_hint);
        C79129V3t.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c79131V3v2.recommend_users);
        C63714OzW.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, c79131V3v2.link_infos);
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 7, c79131V3v2.card_type);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 8, c79131V3v2.content_types);
        RU2.ADAPTER.encodeWithTag(protoWriter, 200, c79131V3v2.req_base);
        RUB.ADAPTER.encodeWithTag(protoWriter, 201, c79131V3v2.resp_base);
        protoWriter.writeBytes(c79131V3v2.unknownFields());
    }
}
