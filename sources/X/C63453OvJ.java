package X;

import com.bytedance.im.core.proto.ModifyPropertyBody;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63453OvJ extends ProtoAdapter<ModifyPropertyBody> {
    public C63453OvJ() {
        super(FieldEncoding.LENGTH_DELIMITED, ModifyPropertyBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ModifyPropertyBody decode(ProtoReader protoReader) {
        C63451OvH c63451OvH = new C63451OvH();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c63451OvH.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c63451OvH.LJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c63451OvH.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        c63451OvH.LJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        c63451OvH.LJII = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        c63451OvH.LJIIIIZZ.add(ModifyPropertyContent.ADAPTER.decode(protoReader));
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63451OvH.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63451OvH.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ModifyPropertyBody modifyPropertyBody) {
        ModifyPropertyBody modifyPropertyBody2 = modifyPropertyBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, modifyPropertyBody2.conversation_type) + protoAdapter.encodedSizeWithTag(1, modifyPropertyBody2.conversation_id);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        return modifyPropertyBody2.unknownFields().size() + ModifyPropertyContent.ADAPTER.asRepeated().encodedSizeWithTag(6, modifyPropertyBody2.modify_property_content) + protoAdapter.encodedSizeWithTag(5, modifyPropertyBody2.client_message_id) + protoAdapter2.encodedSizeWithTag(4, modifyPropertyBody2.server_message_id) + protoAdapter2.encodedSizeWithTag(3, modifyPropertyBody2.conversation_short_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ModifyPropertyBody modifyPropertyBody) {
        ModifyPropertyBody modifyPropertyBody2 = modifyPropertyBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, modifyPropertyBody2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, modifyPropertyBody2.conversation_type);
        ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, modifyPropertyBody2.conversation_short_id);
        protoAdapter2.encodeWithTag(protoWriter, 4, modifyPropertyBody2.server_message_id);
        protoAdapter.encodeWithTag(protoWriter, 5, modifyPropertyBody2.client_message_id);
        ModifyPropertyContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, modifyPropertyBody2.modify_property_content);
        protoWriter.writeBytes(modifyPropertyBody2.unknownFields());
    }
}
