package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4I extends ProtoAdapter<C79135V3z> {
    public V4I() {
        super(FieldEncoding.LENGTH_DELIMITED, C79135V3z.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C79135V3z decode(ProtoReader protoReader) {
        V32 v32 = new V32();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 4) {
                            if (nextTag != 5) {
                                if (nextTag != 6) {
                                    if (nextTag != 7) {
                                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                        v32.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        try {
                                            v32.LJIIIIZZ = EnumC79091V2h.ADAPTER.decode(protoReader);
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            v32.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        }
                                    }
                                } else {
                                    v32.LJII = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                v32.LJI = C79143V4h.ADAPTER.decode(protoReader);
                            }
                        } else {
                            v32.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        v32.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    v32.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return v32.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C79135V3z c79135V3z) {
        C79135V3z c79135V3z2 = c79135V3z;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c79135V3z2.unknownFields().size() + EnumC79091V2h.ADAPTER.encodedSizeWithTag(7, c79135V3z2.fallback_icon_type) + protoAdapter.encodedSizeWithTag(6, c79135V3z2.decrypt_key) + C79143V4h.ADAPTER.encodedSizeWithTag(5, c79135V3z2.resolution) + protoAdapter.encodedSizeWithTag(4, c79135V3z2.display_name) + protoAdapter.asRepeated().encodedSizeWithTag(2, c79135V3z2.url_list) + protoAdapter.encodedSizeWithTag(1, c79135V3z2.image_id);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.V32, com.squareup.wire.Message$Builder] */
    @Override // com.squareup.wire.ProtoAdapter
    public final C79135V3z redact(C79135V3z c79135V3z) {
        ?? newBuilder2 = c79135V3z.newBuilder2();
        C79143V4h c79143V4h = newBuilder2.LJI;
        if (c79143V4h != null) {
            newBuilder2.LJI = C79143V4h.ADAPTER.redact(c79143V4h);
        }
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C79135V3z c79135V3z) {
        C79135V3z c79135V3z2 = c79135V3z;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c79135V3z2.image_id);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c79135V3z2.url_list);
        protoAdapter.encodeWithTag(protoWriter, 4, c79135V3z2.display_name);
        C79143V4h.ADAPTER.encodeWithTag(protoWriter, 5, c79135V3z2.resolution);
        protoAdapter.encodeWithTag(protoWriter, 6, c79135V3z2.decrypt_key);
        EnumC79091V2h.ADAPTER.encodeWithTag(protoWriter, 7, c79135V3z2.fallback_icon_type);
        protoWriter.writeBytes(c79135V3z2.unknownFields());
    }
}
