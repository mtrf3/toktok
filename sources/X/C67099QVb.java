package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.QVb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67099QVb extends ProtoAdapter<QVZ> {
    public C67099QVb() {
        super(FieldEncoding.LENGTH_DELIMITED, QVZ.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final QVZ decode(ProtoReader protoReader) {
        C67109QVl c67109QVl = new C67109QVl();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 255) {
                    switch (nextTag) {
                        case 1:
                            try {
                                c67109QVl.LIZLLL = QVX.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                c67109QVl.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 2:
                            try {
                                c67109QVl.LJ = QW9.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                c67109QVl.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 3:
                            try {
                                c67109QVl.LJFF = EnumC67115QVr.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                c67109QVl.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 4:
                            c67109QVl.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c67109QVl.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c67109QVl.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c67109QVl.LJIIIZ.add(C67102QVe.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            try {
                                c67109QVl.LJIIJ = EnumC67116QVs.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                c67109QVl.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 9:
                            c67109QVl.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c67109QVl.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    c67109QVl.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c67109QVl.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(QVZ qvz) {
        QVZ qvz2 = qvz;
        int encodedSizeWithTag = EnumC67115QVr.ADAPTER.encodedSizeWithTag(3, qvz2.topic_type) + QW9.ADAPTER.encodedSizeWithTag(2, qvz2.bucket) + QVX.ADAPTER.encodedSizeWithTag(1, qvz2.flag);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return qvz2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(255, qvz2.req_id) + protoAdapter.encodedSizeWithTag(9, qvz2.expire_time) + EnumC67116QVs.ADAPTER.encodedSizeWithTag(8, qvz2.topic_status) + C67102QVe.ADAPTER.asRepeated().encodedSizeWithTag(7, qvz2.packets) + protoAdapter.encodedSizeWithTag(6, qvz2.new_cursor) + protoAdapter.encodedSizeWithTag(5, qvz2.ref_cursor) + protoAdapter.encodedSizeWithTag(4, qvz2.sync_id) + encodedSizeWithTag;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.QVl] */
    @Override // com.squareup.wire.ProtoAdapter
    public final QVZ redact(QVZ qvz) {
        ?? newBuilder2 = qvz.newBuilder2();
        C63685Oz3.LJIIIZ(newBuilder2.LJIIIZ, C67102QVe.ADAPTER);
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, QVZ qvz) {
        QVZ qvz2 = qvz;
        QVX.ADAPTER.encodeWithTag(protoWriter, 1, qvz2.flag);
        QW9.ADAPTER.encodeWithTag(protoWriter, 2, qvz2.bucket);
        EnumC67115QVr.ADAPTER.encodeWithTag(protoWriter, 3, qvz2.topic_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 4, qvz2.sync_id);
        protoAdapter.encodeWithTag(protoWriter, 5, qvz2.ref_cursor);
        protoAdapter.encodeWithTag(protoWriter, 6, qvz2.new_cursor);
        C67102QVe.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, qvz2.packets);
        EnumC67116QVs.ADAPTER.encodeWithTag(protoWriter, 8, qvz2.topic_status);
        protoAdapter.encodeWithTag(protoWriter, 9, qvz2.expire_time);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 255, qvz2.req_id);
        protoWriter.writeBytes(qvz2.unknownFields());
    }
}
