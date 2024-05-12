package X;

import com.bytedance.im.core.proto.CreateConversationV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ox4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63562Ox4 extends ProtoAdapter<CreateConversationV2RequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ CreateConversationV2RequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63562Ox4() {
        super(FieldEncoding.LENGTH_DELIMITED, CreateConversationV2RequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(CreateConversationV2RequestBody createConversationV2RequestBody) {
        CreateConversationV2RequestBody createConversationV2RequestBody2 = createConversationV2RequestBody;
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(3, createConversationV2RequestBody2.persistent) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, createConversationV2RequestBody2.participants) + ProtoAdapter.INT32.encodedSizeWithTag(1, createConversationV2RequestBody2.conversation_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return createConversationV2RequestBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(13, createConversationV2RequestBody2.channel) + protoAdapter.encodedSizeWithTag(12, createConversationV2RequestBody2.biz) + this.LJ.encodedSizeWithTag(11, createConversationV2RequestBody2.biz_ext) + protoAdapter.encodedSizeWithTag(8, createConversationV2RequestBody2.description) + protoAdapter.encodedSizeWithTag(7, createConversationV2RequestBody2.avatar_url) + protoAdapter.encodedSizeWithTag(6, createConversationV2RequestBody2.name) + protoAdapter.encodedSizeWithTag(4, createConversationV2RequestBody2.idempotent_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, CreateConversationV2RequestBody createConversationV2RequestBody) {
        CreateConversationV2RequestBody createConversationV2RequestBody2 = createConversationV2RequestBody;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, createConversationV2RequestBody2.conversation_type);
        ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, createConversationV2RequestBody2.participants);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, createConversationV2RequestBody2.persistent);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, createConversationV2RequestBody2.idempotent_id);
        protoAdapter.encodeWithTag(protoWriter, 6, createConversationV2RequestBody2.name);
        protoAdapter.encodeWithTag(protoWriter, 7, createConversationV2RequestBody2.avatar_url);
        protoAdapter.encodeWithTag(protoWriter, 8, createConversationV2RequestBody2.description);
        this.LJ.encodeWithTag(protoWriter, 11, createConversationV2RequestBody2.biz_ext);
        protoAdapter.encodeWithTag(protoWriter, 12, createConversationV2RequestBody2.biz);
        protoAdapter.encodeWithTag(protoWriter, 13, createConversationV2RequestBody2.channel);
        protoWriter.writeBytes(createConversationV2RequestBody2.unknownFields());
    }
}
