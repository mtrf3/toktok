package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4C extends ProtoAdapter<V40> {
    public V4C() {
        super(FieldEncoding.LENGTH_DELIMITED, V40.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V40 decode(ProtoReader protoReader) {
        V31 v31 = new V31();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        v31.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        v31.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        v31.LJFF = C79135V3z.ADAPTER.decode(protoReader);
                        break;
                    case 4:
                        try {
                            v31.LJI = EnumC79091V2h.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            v31.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 5:
                        try {
                            v31.LJII = EnumC79088V2e.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            v31.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                    case 6:
                        v31.LJIIIIZZ = C63714OzW.ADAPTER.decode(protoReader);
                        break;
                    case 7:
                        v31.LJIIIZ = RU9.ADAPTER.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        v31.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v31.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V40 v40) {
        V40 v402 = v40;
        return v402.unknownFields().size() + RU9.ADAPTER.encodedSizeWithTag(7, v402.ttl) + C63714OzW.ADAPTER.encodedSizeWithTag(6, v402.link_info) + EnumC79088V2e.ADAPTER.encodedSizeWithTag(5, v402.quote_preview_icon) + EnumC79091V2h.ADAPTER.encodedSizeWithTag(4, v402.fallback_icon) + C79135V3z.ADAPTER.encodedSizeWithTag(3, v402.preview_image) + ProtoAdapter.INT64.encodedSizeWithTag(2, v402.sender_uid) + ProtoAdapter.STRING.encodedSizeWithTag(1, v402.resource_id);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V31, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final V40 redact(V40 v40) {
        ?? newBuilder2 = v40.newBuilder2();
        C79135V3z c79135V3z = newBuilder2.LJFF;
        if (c79135V3z != null) {
            newBuilder2.LJFF = C79135V3z.ADAPTER.redact(c79135V3z);
        }
        C63714OzW c63714OzW = newBuilder2.LJIIIIZZ;
        if (c63714OzW != null) {
            newBuilder2.LJIIIIZZ = C63714OzW.ADAPTER.redact(c63714OzW);
        }
        RU9 ru9 = newBuilder2.LJIIIZ;
        if (ru9 != null) {
            newBuilder2.LJIIIZ = RU9.ADAPTER.redact(ru9);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V40 v40) {
        V40 v402 = v40;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, v402.resource_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, v402.sender_uid);
        C79135V3z.ADAPTER.encodeWithTag(protoWriter, 3, v402.preview_image);
        EnumC79091V2h.ADAPTER.encodeWithTag(protoWriter, 4, v402.fallback_icon);
        EnumC79088V2e.ADAPTER.encodeWithTag(protoWriter, 5, v402.quote_preview_icon);
        C63714OzW.ADAPTER.encodeWithTag(protoWriter, 6, v402.link_info);
        RU9.ADAPTER.encodeWithTag(protoWriter, 7, v402.ttl);
        protoWriter.writeBytes(v402.unknownFields());
    }
}
