package X;

import com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69558RRq extends ProtoAdapter<CheckMessagesPerUserResponseBody> {
    public C69558RRq() {
        super(FieldEncoding.LENGTH_DELIMITED, CheckMessagesPerUserResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final CheckMessagesPerUserResponseBody decode(ProtoReader protoReader) {
        C69559RRr c69559RRr = new C69559RRr();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    c69559RRr.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    c69559RRr.LIZLLL.add(InboxMessagesPerUserResponseBody.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69559RRr.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
        CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody2 = checkMessagesPerUserResponseBody;
        return checkMessagesPerUserResponseBody2.unknownFields().size() + InboxMessagesPerUserResponseBody.ADAPTER.asRepeated().encodedSizeWithTag(1, checkMessagesPerUserResponseBody2.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
    }
}
