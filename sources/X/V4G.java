package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes14.dex */
public final class V4G extends ProtoAdapter<V44> {
    public V4G() {
        super(FieldEncoding.LENGTH_DELIMITED, V44.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V44 decode(ProtoReader protoReader) {
        C79113V3d c79113V3d = new C79113V3d();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c79113V3d.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c79113V3d.LJ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c79113V3d.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c79113V3d.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c79113V3d.LJII = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c79113V3d.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        c79113V3d.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        try {
                            c79113V3d.LJIIJ = V3G.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c79113V3d.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 9:
                        c79113V3d.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c79113V3d.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c79113V3d.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(V44 v44) {
        V44 v442 = v44;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, v442.business_id) + protoAdapter.encodedSizeWithTag(4, v442.business_type) + protoAdapter.encodedSizeWithTag(3, v442.card_template) + protoAdapter.encodedSizeWithTag(2, v442.schema) + protoAdapter.encodedSizeWithTag(1, v442.card_key);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        return v442.unknownFields().size() + protoAdapter.encodedSizeWithTag(9, v442.raw_data) + V3G.ADAPTER.encodedSizeWithTag(8, v442.ui_location_type) + protoAdapter2.encodedSizeWithTag(7, v442.default_width) + protoAdapter2.encodedSizeWithTag(6, v442.default_height) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final V44 redact(V44 v44) {
        Message.Builder<V44, C79113V3d> newBuilder2 = v44.newBuilder2();
        newBuilder2.clearUnknownFields();
        return newBuilder2.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, V44 v44) {
        V44 v442 = v44;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, v442.card_key);
        protoAdapter.encodeWithTag(protoWriter, 2, v442.schema);
        protoAdapter.encodeWithTag(protoWriter, 3, v442.card_template);
        protoAdapter.encodeWithTag(protoWriter, 4, v442.business_type);
        protoAdapter.encodeWithTag(protoWriter, 5, v442.business_id);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 6, v442.default_height);
        protoAdapter2.encodeWithTag(protoWriter, 7, v442.default_width);
        V3G.ADAPTER.encodeWithTag(protoWriter, 8, v442.ui_location_type);
        protoAdapter.encodeWithTag(protoWriter, 9, v442.raw_data);
        protoWriter.writeBytes(v442.unknownFields());
    }
}
