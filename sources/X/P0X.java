package X;

import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0X extends ProtoAdapter<ConversationBadgeCountInfo> {
    public P0X() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationBadgeCountInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationBadgeCountInfo decode(ProtoReader protoReader) {
        P0Y p0y = new P0Y();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                p0y.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                p0y.LJI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            p0y.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        p0y.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    p0y.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0y.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationBadgeCountInfo conversationBadgeCountInfo) {
        ConversationBadgeCountInfo conversationBadgeCountInfo2 = conversationBadgeCountInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return conversationBadgeCountInfo2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(4, conversationBadgeCountInfo2.conversation_id) + protoAdapter.encodedSizeWithTag(3, conversationBadgeCountInfo2.conversation_index_v2) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationBadgeCountInfo2.badge_count) + protoAdapter.encodedSizeWithTag(1, conversationBadgeCountInfo2.conversation_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationBadgeCountInfo conversationBadgeCountInfo) {
        ConversationBadgeCountInfo conversationBadgeCountInfo2 = conversationBadgeCountInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, conversationBadgeCountInfo2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationBadgeCountInfo2.badge_count);
        protoAdapter.encodeWithTag(protoWriter, 3, conversationBadgeCountInfo2.conversation_index_v2);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, conversationBadgeCountInfo2.conversation_id);
        protoWriter.writeBytes(conversationBadgeCountInfo2.unknownFields());
    }
}
