package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody;
import com.bytedance.im.core.proto.MessagesCheckInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RTr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69611RTr extends ProtoAdapter<GetMessagesCheckInfoInConversationResponseBody> {
    public C69611RTr() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessagesCheckInfoInConversationResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetMessagesCheckInfoInConversationResponseBody decode(ProtoReader protoReader) {
        C69612RTs c69612RTs = new C69612RTs();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 4) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c69612RTs.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c69612RTs.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c69612RTs.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69612RTs.LIZLLL.add(MessagesCheckInfo.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69612RTs.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) {
        GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody2 = getMessagesCheckInfoInConversationResponseBody;
        return getMessagesCheckInfoInConversationResponseBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(4, getMessagesCheckInfoInConversationResponseBody2.cursor_reverse_next) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessagesCheckInfoInConversationResponseBody2.real_msg_total_count) + MessagesCheckInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessagesCheckInfoInConversationResponseBody2.msgs_checkinfo_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) {
    }
}
