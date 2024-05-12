package X;

import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P05 extends ProtoAdapter<GetMessageByIdResponseBody> {
    public P05() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessageByIdResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetMessageByIdResponseBody decode(ProtoReader protoReader) {
        P06 p06 = new P06();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    p06.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    p06.LIZLLL = MessageInfo.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p06.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessageByIdResponseBody getMessageByIdResponseBody) {
        GetMessageByIdResponseBody getMessageByIdResponseBody2 = getMessageByIdResponseBody;
        return getMessageByIdResponseBody2.unknownFields().size() + MessageInfo.ADAPTER.encodedSizeWithTag(1, getMessageByIdResponseBody2.msg_info);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetMessageByIdResponseBody getMessageByIdResponseBody) {
    }
}
