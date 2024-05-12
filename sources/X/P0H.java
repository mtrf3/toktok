package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0H extends ProtoAdapter<MessagesInConversationResponseBody> {
    public P0H() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesInConversationResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessagesInConversationResponseBody decode(ProtoReader protoReader) {
        P0I p0i = new P0I();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                p0i.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                p0i.LJI.add(ProtoAdapter.BYTES.decode(protoReader));
                            }
                        } else {
                            p0i.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        p0i.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    p0i.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0i.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesInConversationResponseBody messagesInConversationResponseBody) {
        MessagesInConversationResponseBody messagesInConversationResponseBody2 = messagesInConversationResponseBody;
        return messagesInConversationResponseBody2.unknownFields().size() + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(4, messagesInConversationResponseBody2.messages_pb) + ProtoAdapter.BOOL.encodedSizeWithTag(3, messagesInConversationResponseBody2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(2, messagesInConversationResponseBody2.next_cursor) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesInConversationResponseBody2.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MessagesInConversationResponseBody messagesInConversationResponseBody) {
    }
}
