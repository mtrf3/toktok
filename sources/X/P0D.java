package X;

import com.bytedance.im.core.proto.GetStrangerMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0D extends ProtoAdapter<GetStrangerMessagesResponseBody> {
    public P0D() {
        super(FieldEncoding.LENGTH_DELIMITED, GetStrangerMessagesResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetStrangerMessagesResponseBody decode(ProtoReader protoReader) {
        P0E p0e = new P0E();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    p0e.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    p0e.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0e.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
        GetStrangerMessagesResponseBody getStrangerMessagesResponseBody2 = getStrangerMessagesResponseBody;
        return getStrangerMessagesResponseBody2.unknownFields().size() + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(3, getStrangerMessagesResponseBody2.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
    }
}
