package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69576RSi extends ProtoAdapter<PreviewerMessagesInConversationResponseBody> {
    public C69576RSi() {
        super(FieldEncoding.LENGTH_DELIMITED, PreviewerMessagesInConversationResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final PreviewerMessagesInConversationResponseBody decode(ProtoReader protoReader) {
        C69577RSj c69577RSj = new C69577RSj();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69577RSj.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        c69577RSj.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c69577RSj.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 4:
                        c69577RSj.LJI = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        c69577RSj.LJII = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        c69577RSj.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69577RSj.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69577RSj.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody) {
        PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody2 = previewerMessagesInConversationResponseBody;
        int encodedSizeWithTag = MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerMessagesInConversationResponseBody2.messages);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return previewerMessagesInConversationResponseBody2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(6, previewerMessagesInConversationResponseBody2.check_message) + protoAdapter.encodedSizeWithTag(5, previewerMessagesInConversationResponseBody2.check_code) + ProtoAdapter.INT32.encodedSizeWithTag(4, previewerMessagesInConversationResponseBody2.status) + ProtoAdapter.BOOL.encodedSizeWithTag(3, previewerMessagesInConversationResponseBody2.has_more) + protoAdapter.encodedSizeWithTag(2, previewerMessagesInConversationResponseBody2.next_cursor) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody) {
    }
}
