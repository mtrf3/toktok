package X;

import com.bytedance.im.core.proto.MessagesPerUserComboInboxTypeRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserPaginationInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRV extends ProtoAdapter<MessagesPerUserComboInboxTypeRequestBody> {
    public final ProtoAdapter<java.util.Map<Integer, MessagesPerUserPaginationInfo>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MessagesPerUserComboInboxTypeRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public RRV() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserComboInboxTypeRequestBody.class);
        this.LJ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, MessagesPerUserPaginationInfo.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesPerUserComboInboxTypeRequestBody messagesPerUserComboInboxTypeRequestBody) {
        MessagesPerUserComboInboxTypeRequestBody messagesPerUserComboInboxTypeRequestBody2 = messagesPerUserComboInboxTypeRequestBody;
        return messagesPerUserComboInboxTypeRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(2, messagesPerUserComboInboxTypeRequestBody2.pagination) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, messagesPerUserComboInboxTypeRequestBody2.inboxTypes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessagesPerUserComboInboxTypeRequestBody messagesPerUserComboInboxTypeRequestBody) {
        MessagesPerUserComboInboxTypeRequestBody messagesPerUserComboInboxTypeRequestBody2 = messagesPerUserComboInboxTypeRequestBody;
        ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 1, messagesPerUserComboInboxTypeRequestBody2.inboxTypes);
        this.LJ.encodeWithTag(protoWriter, 2, messagesPerUserComboInboxTypeRequestBody2.pagination);
        protoWriter.writeBytes(messagesPerUserComboInboxTypeRequestBody2.unknownFields());
    }
}
