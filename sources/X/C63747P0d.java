package X;

import com.bytedance.im.core.proto.MarkConversationReadNotify;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.P0d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63747P0d extends ProtoAdapter<MarkConversationReadNotify> {
    public C63747P0d() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkConversationReadNotify.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MarkConversationReadNotify decode(ProtoReader protoReader) {
        C63748P0e c63748P0e = new C63748P0e();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c63748P0e.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c63748P0e.LJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 3:
                        c63748P0e.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        c63748P0e.LJI = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 5:
                        c63748P0e.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c63748P0e.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63748P0e.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63748P0e.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkConversationReadNotify markConversationReadNotify) {
        MarkConversationReadNotify markConversationReadNotify2 = markConversationReadNotify;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, markConversationReadNotify2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, markConversationReadNotify2.conversation_id);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return markConversationReadNotify2.unknownFields().size() + protoAdapter.encodedSizeWithTag(6, markConversationReadNotify2.message_id) + protoAdapter.encodedSizeWithTag(5, markConversationReadNotify2.user_id) + protoAdapter.encodedSizeWithTag(4, markConversationReadNotify2.read_index_v2) + protoAdapter.encodedSizeWithTag(3, markConversationReadNotify2.read_index) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MarkConversationReadNotify markConversationReadNotify) {
        MarkConversationReadNotify markConversationReadNotify2 = markConversationReadNotify;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markConversationReadNotify2.conversation_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markConversationReadNotify2.conversation_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, markConversationReadNotify2.read_index);
        protoAdapter.encodeWithTag(protoWriter, 4, markConversationReadNotify2.read_index_v2);
        protoAdapter.encodeWithTag(protoWriter, 5, markConversationReadNotify2.user_id);
        protoAdapter.encodeWithTag(protoWriter, 6, markConversationReadNotify2.message_id);
        protoWriter.writeBytes(markConversationReadNotify2.unknownFields());
    }
}
