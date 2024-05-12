package X;

import com.bytedance.im.core.proto.MessagesPerUserInitComboInboxTypeResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69556RRo extends ProtoAdapter<MessagesPerUserInitComboInboxTypeResponseBody> {
    public final ProtoAdapter<java.util.Map<Integer, MessagesPerUserInitV2ResponseBody>> LJ;

    public C69556RRo() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserInitComboInboxTypeResponseBody.class);
        this.LJ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, MessagesPerUserInitV2ResponseBody.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessagesPerUserInitComboInboxTypeResponseBody decode(ProtoReader protoReader) {
        C69557RRp c69557RRp = new C69557RRp();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69557RRp.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c69557RRp.LJ.putAll(this.LJ.decode(protoReader));
                    }
                } else {
                    c69557RRp.LIZLLL.add(ProtoAdapter.INT32.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69557RRp.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesPerUserInitComboInboxTypeResponseBody messagesPerUserInitComboInboxTypeResponseBody) {
        MessagesPerUserInitComboInboxTypeResponseBody messagesPerUserInitComboInboxTypeResponseBody2 = messagesPerUserInitComboInboxTypeResponseBody;
        return messagesPerUserInitComboInboxTypeResponseBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(2, messagesPerUserInitComboInboxTypeResponseBody2.messages) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, messagesPerUserInitComboInboxTypeResponseBody2.inboxTypes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MessagesPerUserInitComboInboxTypeResponseBody messagesPerUserInitComboInboxTypeResponseBody) {
    }
}
