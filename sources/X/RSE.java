package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetUserConversationListResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSE extends ProtoAdapter<GetUserConversationListResponseBody> {
    public RSE() {
        super(FieldEncoding.LENGTH_DELIMITED, GetUserConversationListResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetUserConversationListResponseBody decode(ProtoReader protoReader) {
        RSF rsf = new RSF();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            rsf.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            rsf.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        rsf.LJ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    rsf.LIZLLL.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rsf.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetUserConversationListResponseBody getUserConversationListResponseBody) {
        GetUserConversationListResponseBody getUserConversationListResponseBody2 = getUserConversationListResponseBody;
        return getUserConversationListResponseBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(3, getUserConversationListResponseBody2.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getUserConversationListResponseBody2.has_more) + ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getUserConversationListResponseBody2.list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetUserConversationListResponseBody getUserConversationListResponseBody) {
    }
}
