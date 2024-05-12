package X;

import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSY extends ProtoAdapter<GetConversationsCheckInfoResponseBody> {
    public RSY() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationsCheckInfoResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConversationsCheckInfoResponseBody decode(ProtoReader protoReader) {
        RSZ rsz = new RSZ();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rsz.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rsz.LIZLLL.add(ConversationCheckInfo.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rsz.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) {
        GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody2 = getConversationsCheckInfoResponseBody;
        return getConversationsCheckInfoResponseBody2.unknownFields().size() + ConversationCheckInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationsCheckInfoResponseBody2.conversation_checkinfo_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) {
    }
}
