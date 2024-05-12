package X;

import com.bytedance.im.core.proto.BatchDeleteConversationResponseBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YY9 extends ProtoAdapter<BatchDeleteConversationResponseBody> {
    public YY9() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchDeleteConversationResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BatchDeleteConversationResponseBody decode(ProtoReader protoReader) {
        YYA yya = new YYA();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    yya.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    yya.LIZLLL.add(DeleteConversationRequestBody.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yya.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchDeleteConversationResponseBody batchDeleteConversationResponseBody) {
        BatchDeleteConversationResponseBody batchDeleteConversationResponseBody2 = batchDeleteConversationResponseBody;
        return batchDeleteConversationResponseBody2.unknownFields().size() + DeleteConversationRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchDeleteConversationResponseBody2.failed_requests);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, BatchDeleteConversationResponseBody batchDeleteConversationResponseBody) {
    }
}
