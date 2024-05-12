package X;

import com.bytedance.im.core.proto.GetStrangerConversationListRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OwZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63531OwZ extends ProtoAdapter<GetStrangerConversationListRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetStrangerConversationListRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63531OwZ() {
        super(FieldEncoding.LENGTH_DELIMITED, GetStrangerConversationListRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) {
        GetStrangerConversationListRequestBody getStrangerConversationListRequestBody2 = getStrangerConversationListRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return getStrangerConversationListRequestBody2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(4, getStrangerConversationListRequestBody2.biz_info) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getStrangerConversationListRequestBody2.show_total_unread) + protoAdapter.encodedSizeWithTag(2, getStrangerConversationListRequestBody2.count) + protoAdapter.encodedSizeWithTag(1, getStrangerConversationListRequestBody2.cursor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) {
        GetStrangerConversationListRequestBody getStrangerConversationListRequestBody2 = getStrangerConversationListRequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, getStrangerConversationListRequestBody2.cursor);
        protoAdapter.encodeWithTag(protoWriter, 2, getStrangerConversationListRequestBody2.count);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getStrangerConversationListRequestBody2.show_total_unread);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getStrangerConversationListRequestBody2.biz_info);
        protoWriter.writeBytes(getStrangerConversationListRequestBody2.unknownFields());
    }
}
