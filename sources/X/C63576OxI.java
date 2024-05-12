package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OxI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63576OxI extends ProtoAdapter<ReferenceInfo> {
    public C63576OxI() {
        super(FieldEncoding.LENGTH_DELIMITED, ReferenceInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ReferenceInfo decode(ProtoReader protoReader) {
        C63577OxJ c63577OxJ = new C63577OxJ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c63577OxJ.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        c63577OxJ.LJ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c63577OxJ.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        try {
                            c63577OxJ.LJI = EnumC109604Rw.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c63577OxJ.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 5:
                        c63577OxJ.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c63577OxJ.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        c63577OxJ.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 8:
                        c63577OxJ.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        c63577OxJ.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63577OxJ.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63577OxJ.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ReferenceInfo referenceInfo) {
        ReferenceInfo referenceInfo2 = referenceInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, referenceInfo2.referenced_message_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return referenceInfo2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(9, referenceInfo2.fallback_text) + protoAdapter2.encodedSizeWithTag(8, referenceInfo2.referenced_message_scene) + protoAdapter.encodedSizeWithTag(7, referenceInfo2.sender) + protoAdapter.encodedSizeWithTag(6, referenceInfo2.root_message_conv_index) + protoAdapter.encodedSizeWithTag(5, referenceInfo2.root_message_id) + EnumC109604Rw.ADAPTER.encodedSizeWithTag(4, referenceInfo2.referenced_message_status) + protoAdapter.encodedSizeWithTag(3, referenceInfo2.ref_message_type) + protoAdapter2.encodedSizeWithTag(2, referenceInfo2.hint) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ReferenceInfo referenceInfo) {
        ReferenceInfo referenceInfo2 = referenceInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, referenceInfo2.referenced_message_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, referenceInfo2.hint);
        protoAdapter.encodeWithTag(protoWriter, 3, referenceInfo2.ref_message_type);
        EnumC109604Rw.ADAPTER.encodeWithTag(protoWriter, 4, referenceInfo2.referenced_message_status);
        protoAdapter.encodeWithTag(protoWriter, 5, referenceInfo2.root_message_id);
        protoAdapter.encodeWithTag(protoWriter, 6, referenceInfo2.root_message_conv_index);
        protoAdapter.encodeWithTag(protoWriter, 7, referenceInfo2.sender);
        protoAdapter2.encodeWithTag(protoWriter, 8, referenceInfo2.referenced_message_scene);
        protoAdapter2.encodeWithTag(protoWriter, 9, referenceInfo2.fallback_text);
        protoWriter.writeBytes(referenceInfo2.unknownFields());
    }
}
