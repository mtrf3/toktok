package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RSC extends ProtoAdapter<GetConversationInfoV2ResponseBody> {
    public RSC() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoV2ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConversationInfoV2ResponseBody decode(ProtoReader protoReader) {
        RSD rsd = new RSD();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rsd.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rsd.LIZLLL = ConversationInfoV2.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rsd.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
        GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody2 = getConversationInfoV2ResponseBody;
        return getConversationInfoV2ResponseBody2.unknownFields().size() + ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, getConversationInfoV2ResponseBody2.conversation_info);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
    }
}
