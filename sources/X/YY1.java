package X;

import com.bytedance.im.core.proto.ConversationParticipantsListResponseBody;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YY1 extends ProtoAdapter<ConversationParticipantsListResponseBody> {
    public YY1() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationParticipantsListResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationParticipantsListResponseBody decode(ProtoReader protoReader) {
        YY2 yy2 = new YY2();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    yy2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    yy2.LIZLLL = ParticipantsPage.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yy2.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
        ConversationParticipantsListResponseBody conversationParticipantsListResponseBody2 = conversationParticipantsListResponseBody;
        return conversationParticipantsListResponseBody2.unknownFields().size() + ParticipantsPage.ADAPTER.encodedSizeWithTag(1, conversationParticipantsListResponseBody2.participants_page);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
    }
}
