package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4H extends ProtoAdapter<V43> {
    public V4H() {
        super(FieldEncoding.LENGTH_DELIMITED, V43.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V43 decode(ProtoReader protoReader) {
        V33 v33 = new V33();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        v33.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        try {
                            v33.LJ = V3O.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            v33.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 3:
                        v33.LJFF = C79135V3z.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        v33.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        v33.LJII = C63714OzW.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        v33.LJIIIIZZ = C79143V4h.ADAPTER.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        v33.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v33.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V43 v43) {
        V43 v432 = v43;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return v432.unknownFields().size() + C79143V4h.ADAPTER.encodedSizeWithTag(6, v432.resolution) + C63714OzW.ADAPTER.encodedSizeWithTag(5, v432.linkInfo) + protoAdapter.encodedSizeWithTag(4, v432.video_model) + C79135V3z.ADAPTER.encodedSizeWithTag(3, v432.cover) + V3O.ADAPTER.encodedSizeWithTag(2, v432.video_type) + protoAdapter.encodedSizeWithTag(1, v432.video_id);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, X.V33] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V43 redact(V43 v43) {
        ?? newBuilder2 = v43.newBuilder2();
        C79135V3z c79135V3z = newBuilder2.LJFF;
        if (c79135V3z != null) {
            newBuilder2.LJFF = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        C63714OzW c63714OzW = newBuilder2.LJII;
        if (c63714OzW != null) {
            newBuilder2.LJII = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        C79143V4h c79143V4h = newBuilder2.LJIIIIZZ;
        if (c79143V4h != null) {
            newBuilder2.LJIIIIZZ = C79143V4h.ADAPTER.redact(c79143V4h);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V43 v43) {
        V43 v432 = v43;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, v432.video_id);
        V3O.ADAPTER.encodeWithTag(protoWriter, 2, v432.video_type);
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 3, v432.cover);
        protoAdapter.encodeWithTag(protoWriter, 4, v432.video_model);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 5, v432.linkInfo);
        C79143V4h.ADAPTER.encodeWithTag(protoWriter, 6, v432.resolution);
        protoWriter.writeBytes(v432.unknownFields());
    }
}
