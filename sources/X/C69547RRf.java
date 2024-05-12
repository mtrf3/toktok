package X;

import com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69547RRf extends ProtoAdapter<SetConversationCoreInfoRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ SetConversationCoreInfoRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C69547RRf() {
        super(FieldEncoding.LENGTH_DELIMITED, SetConversationCoreInfoRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) {
        SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody2 = setConversationCoreInfoRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(7, setConversationCoreInfoRequestBody2.notice) + protoAdapter.encodedSizeWithTag(6, setConversationCoreInfoRequestBody2.icon) + protoAdapter.encodedSizeWithTag(5, setConversationCoreInfoRequestBody2.desc) + protoAdapter.encodedSizeWithTag(4, setConversationCoreInfoRequestBody2.name) + ProtoAdapter.INT32.encodedSizeWithTag(3, setConversationCoreInfoRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, setConversationCoreInfoRequestBody2.conversation_short_id) + protoAdapter.encodedSizeWithTag(1, setConversationCoreInfoRequestBody2.conversation_id);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return setConversationCoreInfoRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(12, setConversationCoreInfoRequestBody2.ext) + protoAdapter2.encodedSizeWithTag(11, setConversationCoreInfoRequestBody2.is_notice_set) + protoAdapter2.encodedSizeWithTag(10, setConversationCoreInfoRequestBody2.is_icon_set) + protoAdapter2.encodedSizeWithTag(9, setConversationCoreInfoRequestBody2.is_desc_set) + protoAdapter2.encodedSizeWithTag(8, setConversationCoreInfoRequestBody2.is_name_set) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) {
        SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody2 = setConversationCoreInfoRequestBody;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, setConversationCoreInfoRequestBody2.conversation_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, setConversationCoreInfoRequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setConversationCoreInfoRequestBody2.conversation_type);
        protoAdapter.encodeWithTag(protoWriter, 4, setConversationCoreInfoRequestBody2.name);
        protoAdapter.encodeWithTag(protoWriter, 5, setConversationCoreInfoRequestBody2.desc);
        protoAdapter.encodeWithTag(protoWriter, 6, setConversationCoreInfoRequestBody2.icon);
        protoAdapter.encodeWithTag(protoWriter, 7, setConversationCoreInfoRequestBody2.notice);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 8, setConversationCoreInfoRequestBody2.is_name_set);
        protoAdapter2.encodeWithTag(protoWriter, 9, setConversationCoreInfoRequestBody2.is_desc_set);
        protoAdapter2.encodeWithTag(protoWriter, 10, setConversationCoreInfoRequestBody2.is_icon_set);
        protoAdapter2.encodeWithTag(protoWriter, 11, setConversationCoreInfoRequestBody2.is_notice_set);
        this.LJ.encodeWithTag(protoWriter, 12, setConversationCoreInfoRequestBody2.ext);
        protoWriter.writeBytes(setConversationCoreInfoRequestBody2.unknownFields());
    }
}
