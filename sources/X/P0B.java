package X;

import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0B extends ProtoAdapter<GetRecentMessageRespBody> {
    public P0B() {
        super(FieldEncoding.LENGTH_DELIMITED, GetRecentMessageRespBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetRecentMessageRespBody decode(ProtoReader protoReader) {
        P0C p0c = new P0C();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            p0c.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            p0c.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        p0c.LJ.add(ConversationRecentMessage.ADAPTER.decode(protoReader));
                    }
                } else {
                    p0c.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0c.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetRecentMessageRespBody getRecentMessageRespBody) {
        GetRecentMessageRespBody getRecentMessageRespBody2 = getRecentMessageRespBody;
        return getRecentMessageRespBody2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(3, getRecentMessageRespBody2.has_more) + ConversationRecentMessage.ADAPTER.asRepeated().encodedSizeWithTag(2, getRecentMessageRespBody2.messages) + ProtoAdapter.INT64.encodedSizeWithTag(1, getRecentMessageRespBody2.next_conversation_version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetRecentMessageRespBody getRecentMessageRespBody) {
        GetRecentMessageRespBody getRecentMessageRespBody2 = getRecentMessageRespBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getRecentMessageRespBody2.next_conversation_version);
        ConversationRecentMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getRecentMessageRespBody2.messages);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getRecentMessageRespBody2.has_more);
        protoWriter.writeBytes(getRecentMessageRespBody2.unknownFields());
    }
}
