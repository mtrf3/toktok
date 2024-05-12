package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RS8 extends ProtoAdapter<GetConversationInfoListByTopV2ResponseBody> {
    public RS8() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListByTopV2ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConversationInfoListByTopV2ResponseBody decode(ProtoReader protoReader) {
        RS9 rs9 = new RS9();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            rs9.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            rs9.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        rs9.LJ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    rs9.LIZLLL.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rs9.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
        GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody2 = getConversationInfoListByTopV2ResponseBody;
        return getConversationInfoListByTopV2ResponseBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(3, getConversationInfoListByTopV2ResponseBody2.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getConversationInfoListByTopV2ResponseBody2.has_more) + ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListByTopV2ResponseBody2.conversation_info_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
    }
}
