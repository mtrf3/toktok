package X;

import com.bytedance.im.core.proto.GetUserConversationListRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63454OvK extends ProtoAdapter<GetUserConversationListRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetUserConversationListRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63454OvK() {
        super(FieldEncoding.LENGTH_DELIMITED, GetUserConversationListRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetUserConversationListRequestBody getUserConversationListRequestBody) {
        GetUserConversationListRequestBody getUserConversationListRequestBody2 = getUserConversationListRequestBody;
        int encodedSizeWithTag = EnumC63479Ovj.ADAPTER.encodedSizeWithTag(1, getUserConversationListRequestBody2.sort_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, getUserConversationListRequestBody2.limit) + EnumC63506OwA.ADAPTER.encodedSizeWithTag(3, getUserConversationListRequestBody2.con_type) + protoAdapter.encodedSizeWithTag(2, getUserConversationListRequestBody2.cursor) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(6, getUserConversationListRequestBody2.exclude_role) + protoAdapter2.encodedSizeWithTag(5, getUserConversationListRequestBody2.include_role) + encodedSizeWithTag2;
        ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
        return getUserConversationListRequestBody2.unknownFields().size() + protoAdapter2.asRepeated().encodedSizeWithTag(10, getUserConversationListRequestBody2.include_multiple_roles) + protoAdapter2.encodedSizeWithTag(9, getUserConversationListRequestBody2.customed_con_type) + protoAdapter3.encodedSizeWithTag(8, getUserConversationListRequestBody2.with_cold) + protoAdapter3.encodedSizeWithTag(7, getUserConversationListRequestBody2.include_removed_group) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetUserConversationListRequestBody getUserConversationListRequestBody) {
        GetUserConversationListRequestBody getUserConversationListRequestBody2 = getUserConversationListRequestBody;
        EnumC63479Ovj.ADAPTER.encodeWithTag(protoWriter, 1, getUserConversationListRequestBody2.sort_type);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, getUserConversationListRequestBody2.cursor);
        EnumC63506OwA.ADAPTER.encodeWithTag(protoWriter, 3, getUserConversationListRequestBody2.con_type);
        protoAdapter.encodeWithTag(protoWriter, 4, getUserConversationListRequestBody2.limit);
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 5, getUserConversationListRequestBody2.include_role);
        protoAdapter2.encodeWithTag(protoWriter, 6, getUserConversationListRequestBody2.exclude_role);
        ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 7, getUserConversationListRequestBody2.include_removed_group);
        protoAdapter3.encodeWithTag(protoWriter, 8, getUserConversationListRequestBody2.with_cold);
        protoAdapter2.encodeWithTag(protoWriter, 9, getUserConversationListRequestBody2.customed_con_type);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 10, getUserConversationListRequestBody2.include_multiple_roles);
        protoWriter.writeBytes(getUserConversationListRequestBody2.unknownFields());
    }
}
