package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.StrangerNewMessageNotify;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RS0 extends ProtoAdapter<StrangerNewMessageNotify> {
    public RS0() {
        super(FieldEncoding.LENGTH_DELIMITED, StrangerNewMessageNotify.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final StrangerNewMessageNotify decode(ProtoReader protoReader) {
        RS1 rs1 = new RS1();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rs1.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rs1.LIZLLL = MessageBody.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rs1.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(StrangerNewMessageNotify strangerNewMessageNotify) {
        StrangerNewMessageNotify strangerNewMessageNotify2 = strangerNewMessageNotify;
        return strangerNewMessageNotify2.unknownFields().size() + MessageBody.ADAPTER.encodedSizeWithTag(2, strangerNewMessageNotify2.message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, StrangerNewMessageNotify strangerNewMessageNotify) {
        StrangerNewMessageNotify strangerNewMessageNotify2 = strangerNewMessageNotify;
        MessageBody.ADAPTER.encodeWithTag(protoWriter, 2, strangerNewMessageNotify2.message);
        protoWriter.writeBytes(strangerNewMessageNotify2.unknownFields());
    }
}
