package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RS4 extends ProtoAdapter<GetConversationInfoListV2ResponseBody> {
    public RS4() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListV2ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConversationInfoListV2ResponseBody decode(ProtoReader protoReader) {
        RS5 rs5 = new RS5();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rs5.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rs5.LIZLLL.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rs5.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
        GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody2 = getConversationInfoListV2ResponseBody;
        return getConversationInfoListV2ResponseBody2.unknownFields().size() + ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListV2ResponseBody2.conversation_info_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
    }
}
