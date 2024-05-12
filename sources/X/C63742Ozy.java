package X;

import com.bytedance.im.core.proto.MessageCheckInfoV2;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63742Ozy extends ProtoAdapter<MessageCheckInfoV2> {
    public C63742Ozy() {
        super(FieldEncoding.LENGTH_DELIMITED, MessageCheckInfoV2.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessageCheckInfoV2 decode(ProtoReader protoReader) {
        C63743Ozz c63743Ozz = new C63743Ozz();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63743Ozz.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c63743Ozz.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c63743Ozz.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63743Ozz.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessageCheckInfoV2 messageCheckInfoV2) {
        MessageCheckInfoV2 messageCheckInfoV22 = messageCheckInfoV2;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return messageCheckInfoV22.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, messageCheckInfoV22.index_in_conv) + protoAdapter.encodedSizeWithTag(1, messageCheckInfoV22.msg_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessageCheckInfoV2 messageCheckInfoV2) {
        MessageCheckInfoV2 messageCheckInfoV22 = messageCheckInfoV2;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, messageCheckInfoV22.msg_id);
        protoAdapter.encodeWithTag(protoWriter, 2, messageCheckInfoV22.index_in_conv);
        protoWriter.writeBytes(messageCheckInfoV22.unknownFields());
    }
}
