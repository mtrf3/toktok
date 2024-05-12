package X;

import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OxM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63580OxM extends ProtoAdapter<SetConversationSettingInfoRequestBody> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ SetConversationSettingInfoRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63580OxM() {
        super(FieldEncoding.LENGTH_DELIMITED, SetConversationSettingInfoRequestBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) {
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody2 = setConversationSettingInfoRequestBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(3, setConversationSettingInfoRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, setConversationSettingInfoRequestBody2.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(1, setConversationSettingInfoRequestBody2.conversation_id);
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        return setConversationSettingInfoRequestBody2.unknownFields().size() + EnumC96103pu.ADAPTER.encodedSizeWithTag(7, setConversationSettingInfoRequestBody2.set_category) + protoAdapter.encodedSizeWithTag(6, setConversationSettingInfoRequestBody2.set_favorite) + protoAdapter.encodedSizeWithTag(5, setConversationSettingInfoRequestBody2.set_mute) + protoAdapter.encodedSizeWithTag(4, setConversationSettingInfoRequestBody2.set_stick_on_top) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) {
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody2 = setConversationSettingInfoRequestBody;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setConversationSettingInfoRequestBody2.conversation_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, setConversationSettingInfoRequestBody2.conversation_short_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setConversationSettingInfoRequestBody2.conversation_type);
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 4, setConversationSettingInfoRequestBody2.set_stick_on_top);
        protoAdapter.encodeWithTag(protoWriter, 5, setConversationSettingInfoRequestBody2.set_mute);
        protoAdapter.encodeWithTag(protoWriter, 6, setConversationSettingInfoRequestBody2.set_favorite);
        EnumC96103pu.ADAPTER.encodeWithTag(protoWriter, 7, setConversationSettingInfoRequestBody2.set_category);
        protoWriter.writeBytes(setConversationSettingInfoRequestBody2.unknownFields());
    }
}
