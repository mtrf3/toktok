package X;

import com.bytedance.im.core.proto.MessagesPerUserInitComboInboxTypeRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.QDn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66643QDn extends ProtoAdapter<MessagesPerUserInitComboInboxTypeRequestBody> {
    public final ProtoAdapter<java.util.Map<Integer, Long>> LJ;

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ MessagesPerUserInitComboInboxTypeRequestBody decode(ProtoReader protoReader) {
        return null;
    }

    public C66643QDn() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserInitComboInboxTypeRequestBody.class);
        this.LJ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.INT64);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesPerUserInitComboInboxTypeRequestBody messagesPerUserInitComboInboxTypeRequestBody) {
        MessagesPerUserInitComboInboxTypeRequestBody messagesPerUserInitComboInboxTypeRequestBody2 = messagesPerUserInitComboInboxTypeRequestBody;
        return messagesPerUserInitComboInboxTypeRequestBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(2, messagesPerUserInitComboInboxTypeRequestBody2.cursors) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, messagesPerUserInitComboInboxTypeRequestBody2.inboxTypes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessagesPerUserInitComboInboxTypeRequestBody messagesPerUserInitComboInboxTypeRequestBody) {
        MessagesPerUserInitComboInboxTypeRequestBody messagesPerUserInitComboInboxTypeRequestBody2 = messagesPerUserInitComboInboxTypeRequestBody;
        ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 1, messagesPerUserInitComboInboxTypeRequestBody2.inboxTypes);
        this.LJ.encodeWithTag(protoWriter, 2, messagesPerUserInitComboInboxTypeRequestBody2.cursors);
        protoWriter.writeBytes(messagesPerUserInitComboInboxTypeRequestBody2.unknownFields());
    }
}
