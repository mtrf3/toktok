package X;

import com.bytedance.im.core.proto.AckMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OyC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63632OyC extends ProtoAdapter<AckMessage> {
    public C63632OyC() {
        super(FieldEncoding.LENGTH_DELIMITED, AckMessage.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final AckMessage decode(ProtoReader protoReader) {
        C63634OyE c63634OyE = new C63634OyE();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c63634OyE.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c63634OyE.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 3:
                        try {
                            c63634OyE.LJFF = EnumC63179Oqt.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c63634OyE.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 4:
                        c63634OyE.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        c63634OyE.LJII = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        try {
                            c63634OyE.LJIIIIZZ = EnumC63506OwA.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            c63634OyE.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                    case 7:
                        try {
                            c63634OyE.LJIIIZ = EnumC63642OyM.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            c63634OyE.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            break;
                        }
                    case 8:
                        c63634OyE.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63634OyE.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63634OyE.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(AckMessage ackMessage) {
        AckMessage ackMessage2 = ackMessage;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, ackMessage2.server_msg_id);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return ackMessage2.unknownFields().size() + protoAdapter2.encodedSizeWithTag(8, ackMessage2.first_save_to_db) + EnumC63642OyM.ADAPTER.encodedSizeWithTag(7, ackMessage2.cmd_type) + EnumC63506OwA.ADAPTER.encodedSizeWithTag(6, ackMessage2.conv_type) + ProtoAdapter.INT32.encodedSizeWithTag(5, ackMessage2.inbox_type) + protoAdapter.encodedSizeWithTag(4, ackMessage2.scene) + EnumC63179Oqt.ADAPTER.encodedSizeWithTag(3, ackMessage2.msg_type) + protoAdapter2.encodedSizeWithTag(2, ackMessage2.is_ws) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, AckMessage ackMessage) {
        AckMessage ackMessage2 = ackMessage;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, ackMessage2.server_msg_id);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 2, ackMessage2.is_ws);
        EnumC63179Oqt.ADAPTER.encodeWithTag(protoWriter, 3, ackMessage2.msg_type);
        protoAdapter.encodeWithTag(protoWriter, 4, ackMessage2.scene);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, ackMessage2.inbox_type);
        EnumC63506OwA.ADAPTER.encodeWithTag(protoWriter, 6, ackMessage2.conv_type);
        EnumC63642OyM.ADAPTER.encodeWithTag(protoWriter, 7, ackMessage2.cmd_type);
        protoAdapter2.encodeWithTag(protoWriter, 8, ackMessage2.first_save_to_db);
        protoWriter.writeBytes(ackMessage2.unknownFields());
    }
}
