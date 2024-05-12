package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RS6 extends ProtoAdapter<GetConversationInfoListByFavoriteV2ResponseBody> {
    public RS6() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListByFavoriteV2ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConversationInfoListByFavoriteV2ResponseBody decode(ProtoReader protoReader) {
        RS7 rs7 = new RS7();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            rs7.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            rs7.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        rs7.LJ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    rs7.LIZLLL.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rs7.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody) {
        GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody2 = getConversationInfoListByFavoriteV2ResponseBody;
        return getConversationInfoListByFavoriteV2ResponseBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(3, getConversationInfoListByFavoriteV2ResponseBody2.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getConversationInfoListByFavoriteV2ResponseBody2.has_more) + ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListByFavoriteV2ResponseBody2.conversation_info_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody) {
    }
}
