package X;

import com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69560RRs extends ProtoAdapter<InboxMessagesPerUserResponseBody> {
    public C69560RRs() {
        super(FieldEncoding.LENGTH_DELIMITED, InboxMessagesPerUserResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final InboxMessagesPerUserResponseBody decode(ProtoReader protoReader) {
        C69561RRt c69561RRt = new C69561RRt();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69561RRt.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c69561RRt.LJ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    c69561RRt.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69561RRt.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody) {
        InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody2 = inboxMessagesPerUserResponseBody;
        return inboxMessagesPerUserResponseBody2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(2, inboxMessagesPerUserResponseBody2.has_more) + ProtoAdapter.INT32.encodedSizeWithTag(1, inboxMessagesPerUserResponseBody2.inbox_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody) {
    }
}
