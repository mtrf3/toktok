package X;

import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.StrangerConversation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0J extends ProtoAdapter<GetStrangerConversationListResponseBody> {
    public P0J() {
        super(FieldEncoding.LENGTH_DELIMITED, GetStrangerConversationListResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetStrangerConversationListResponseBody decode(ProtoReader protoReader) {
        P0K p0k = new P0K();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                p0k.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                p0k.LJI.add(StrangerConversation.ADAPTER.decode(protoReader));
                            }
                        } else {
                            p0k.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        p0k.LJ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    p0k.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0k.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
        GetStrangerConversationListResponseBody getStrangerConversationListResponseBody2 = getStrangerConversationListResponseBody;
        return getStrangerConversationListResponseBody2.unknownFields().size() + StrangerConversation.ADAPTER.asRepeated().encodedSizeWithTag(4, getStrangerConversationListResponseBody2.conversation_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, getStrangerConversationListResponseBody2.total_unread) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getStrangerConversationListResponseBody2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerConversationListResponseBody2.next_cursor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
    }
}
