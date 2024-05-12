package X;

import com.bytedance.im.core.proto.MessagesPerUserComboInboxTypeResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69584RSq extends ProtoAdapter<MessagesPerUserComboInboxTypeResponseBody> {
    public final ProtoAdapter<java.util.Map<Integer, MessagesPerUserResponseBody>> LJ;

    public C69584RSq() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserComboInboxTypeResponseBody.class);
        this.LJ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, MessagesPerUserResponseBody.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessagesPerUserComboInboxTypeResponseBody decode(ProtoReader protoReader) {
        C69585RSr c69585RSr = new C69585RSr();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c69585RSr.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c69585RSr.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c69585RSr.LJ.putAll(this.LJ.decode(protoReader));
                    }
                } else {
                    c69585RSr.LIZLLL.add(ProtoAdapter.INT32.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69585RSr.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesPerUserComboInboxTypeResponseBody messagesPerUserComboInboxTypeResponseBody) {
        MessagesPerUserComboInboxTypeResponseBody messagesPerUserComboInboxTypeResponseBody2 = messagesPerUserComboInboxTypeResponseBody;
        return messagesPerUserComboInboxTypeResponseBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(3, messagesPerUserComboInboxTypeResponseBody2.interval) + this.LJ.encodedSizeWithTag(2, messagesPerUserComboInboxTypeResponseBody2.messages) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, messagesPerUserComboInboxTypeResponseBody2.validInboxTypes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MessagesPerUserComboInboxTypeResponseBody messagesPerUserComboInboxTypeResponseBody) {
    }
}
