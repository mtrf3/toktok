package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P02 extends ProtoAdapter<MessageInfo> {
    public P02() {
        super(FieldEncoding.LENGTH_DELIMITED, MessageInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessageInfo decode(ProtoReader protoReader) {
        P03 p03 = new P03();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        p03.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        p03.LJ = MessageBody.ADAPTER.decode(protoReader);
                    }
                } else {
                    try {
                        p03.LIZLLL = EnumC109604Rw.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        p03.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p03.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessageInfo messageInfo) {
        MessageInfo messageInfo2 = messageInfo;
        return messageInfo2.unknownFields().size() + MessageBody.ADAPTER.encodedSizeWithTag(2, messageInfo2.body) + EnumC109604Rw.ADAPTER.encodedSizeWithTag(1, messageInfo2.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessageInfo messageInfo) {
        MessageInfo messageInfo2 = messageInfo;
        EnumC109604Rw.ADAPTER.encodeWithTag(protoWriter, 1, messageInfo2.status);
        MessageBody.ADAPTER.encodeWithTag(protoWriter, 2, messageInfo2.body);
        protoWriter.writeBytes(messageInfo2.unknownFields());
    }
}
