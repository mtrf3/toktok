package X;

import com.bytedance.im.core.proto.BatchGetMessagesResponseBody;
import com.bytedance.im.core.proto.GetMessageByKeyError;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69580RSm extends ProtoAdapter<BatchGetMessagesResponseBody> {
    public C69580RSm() {
        super(FieldEncoding.LENGTH_DELIMITED, BatchGetMessagesResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BatchGetMessagesResponseBody decode(ProtoReader protoReader) {
        C69581RSn c69581RSn = new C69581RSn();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c69581RSn.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c69581RSn.LJ.add(GetMessageByKeyError.ADAPTER.decode(protoReader));
                    }
                } else {
                    c69581RSn.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69581RSn.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BatchGetMessagesResponseBody batchGetMessagesResponseBody) {
        BatchGetMessagesResponseBody batchGetMessagesResponseBody2 = batchGetMessagesResponseBody;
        return batchGetMessagesResponseBody2.unknownFields().size() + GetMessageByKeyError.ADAPTER.asRepeated().encodedSizeWithTag(2, batchGetMessagesResponseBody2.errors) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchGetMessagesResponseBody2.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, BatchGetMessagesResponseBody batchGetMessagesResponseBody) {
    }
}
