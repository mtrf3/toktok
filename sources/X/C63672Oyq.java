package X;

import com.bytedance.im.core.proto.GetConversationsCheckInfoV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Oyq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63672Oyq extends ProtoAdapter<GetConversationsCheckInfoV2RequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetConversationsCheckInfoV2RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63672Oyq() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationsCheckInfoV2RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody) {
        GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody2 = getConversationsCheckInfoV2RequestBody;
        return getConversationsCheckInfoV2RequestBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(1, getConversationsCheckInfoV2RequestBody2.limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody) {
        GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody2 = getConversationsCheckInfoV2RequestBody;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getConversationsCheckInfoV2RequestBody2.limit);
        protoWriter.writeBytes(getConversationsCheckInfoV2RequestBody2.unknownFields());
    }
}
