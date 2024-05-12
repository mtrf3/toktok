package X;

import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.GetMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63727Ozj extends ProtoAdapter<GetMessagesResponseBody> {
    public C63727Ozj() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessagesResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetMessagesResponseBody decode(ProtoReader protoReader) {
        C63728Ozk c63728Ozk = new C63728Ozk();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63728Ozk.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c63728Ozk.LJ.add(GetMessageError.ADAPTER.decode(protoReader));
                    }
                } else {
                    c63728Ozk.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63728Ozk.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessagesResponseBody getMessagesResponseBody) {
        GetMessagesResponseBody getMessagesResponseBody2 = getMessagesResponseBody;
        return getMessagesResponseBody2.unknownFields().size() + GetMessageError.ADAPTER.asRepeated().encodedSizeWithTag(2, getMessagesResponseBody2.errors) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessagesResponseBody2.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetMessagesResponseBody getMessagesResponseBody) {
    }
}
