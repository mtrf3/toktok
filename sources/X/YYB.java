package X;

import com.bytedance.im.core.proto.BatchMarkConversationReadResponseBody;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YYB extends ProtoAdapter<BatchMarkConversationReadResponseBody> {
    public YYB() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchMarkConversationReadResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BatchMarkConversationReadResponseBody decode(ProtoReader protoReader) {
        YYC yyc = new YYC();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    yyc.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    yyc.LIZLLL.add(MarkConversationReadRequestBody.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return yyc.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody) {
        BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody2 = batchMarkConversationReadResponseBody;
        return batchMarkConversationReadResponseBody2.unknownFields().size() + MarkConversationReadRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchMarkConversationReadResponseBody2.failed_requests);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody) {
    }
}
