package X;

import com.bytedance.im.core.proto.AckConversationApplyRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63732Ozo extends ProtoAdapter<AckConversationApplyRequestBody> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ AckConversationApplyRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C63732Ozo() {
        super(FieldEncoding.LENGTH_DELIMITED, AckConversationApplyRequestBody.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(AckConversationApplyRequestBody ackConversationApplyRequestBody) {
        AckConversationApplyRequestBody ackConversationApplyRequestBody2 = ackConversationApplyRequestBody;
        return ackConversationApplyRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(3, ackConversationApplyRequestBody2.bizExt) + EnumC115774gX.ADAPTER.encodedSizeWithTag(2, ackConversationApplyRequestBody2.apply_status) + ProtoAdapter.INT64.encodedSizeWithTag(1, ackConversationApplyRequestBody2.apply_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, AckConversationApplyRequestBody ackConversationApplyRequestBody) {
        AckConversationApplyRequestBody ackConversationApplyRequestBody2 = ackConversationApplyRequestBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, ackConversationApplyRequestBody2.apply_id);
        EnumC115774gX.ADAPTER.encodeWithTag(protoWriter, 2, ackConversationApplyRequestBody2.apply_status);
        this.LJ.encodeWithTag(protoWriter, 3, ackConversationApplyRequestBody2.bizExt);
        protoWriter.writeBytes(ackConversationApplyRequestBody2.unknownFields());
    }
}
