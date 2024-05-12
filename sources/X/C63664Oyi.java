package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Oyi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63664Oyi extends ProtoAdapter<GetMessagesCheckInfoV2RequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ GetMessagesCheckInfoV2RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63664Oyi() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessagesCheckInfoV2RequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody) {
        GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody2 = getMessagesCheckInfoV2RequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return getMessagesCheckInfoV2RequestBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(5, getMessagesCheckInfoV2RequestBody2.limit) + protoAdapter.encodedSizeWithTag(4, getMessagesCheckInfoV2RequestBody2.cursor) + EnumC63506OwA.ADAPTER.encodedSizeWithTag(3, getMessagesCheckInfoV2RequestBody2.conv_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, getMessagesCheckInfoV2RequestBody2.conv_id) + protoAdapter.encodedSizeWithTag(1, getMessagesCheckInfoV2RequestBody2.conv_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody) {
        GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody2 = getMessagesCheckInfoV2RequestBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, getMessagesCheckInfoV2RequestBody2.conv_short_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getMessagesCheckInfoV2RequestBody2.conv_id);
        EnumC63506OwA.ADAPTER.encodeWithTag(protoWriter, 3, getMessagesCheckInfoV2RequestBody2.conv_type);
        protoAdapter.encodeWithTag(protoWriter, 4, getMessagesCheckInfoV2RequestBody2.cursor);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getMessagesCheckInfoV2RequestBody2.limit);
        protoWriter.writeBytes(getMessagesCheckInfoV2RequestBody2.unknownFields());
    }
}
