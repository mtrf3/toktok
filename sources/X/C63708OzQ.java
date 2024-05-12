package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OzQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63708OzQ extends ProtoAdapter<ConversationCheckInfoV2> {
    public C63708OzQ() {
        super(FieldEncoding.LENGTH_DELIMITED, ConversationCheckInfoV2.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ConversationCheckInfoV2 decode(ProtoReader protoReader) {
        C63709OzR c63709OzR = new C63709OzR();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    c63709OzR.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c63709OzR.LJII = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c63709OzR.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            try {
                                c63709OzR.LJFF = EnumC63506OwA.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                c63709OzR.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c63709OzR.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c63709OzR.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63709OzR.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ConversationCheckInfoV2 conversationCheckInfoV2) {
        ConversationCheckInfoV2 conversationCheckInfoV22 = conversationCheckInfoV2;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return conversationCheckInfoV22.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, conversationCheckInfoV22.min_index) + ProtoAdapter.BOOL.encodedSizeWithTag(4, conversationCheckInfoV22.is_pinned) + EnumC63506OwA.ADAPTER.encodedSizeWithTag(3, conversationCheckInfoV22.conv_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, conversationCheckInfoV22.conv_id) + protoAdapter.encodedSizeWithTag(1, conversationCheckInfoV22.conv_short_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ConversationCheckInfoV2 conversationCheckInfoV2) {
        ConversationCheckInfoV2 conversationCheckInfoV22 = conversationCheckInfoV2;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, conversationCheckInfoV22.conv_short_id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, conversationCheckInfoV22.conv_id);
        EnumC63506OwA.ADAPTER.encodeWithTag(protoWriter, 3, conversationCheckInfoV22.conv_type);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, conversationCheckInfoV22.is_pinned);
        protoAdapter.encodeWithTag(protoWriter, 5, conversationCheckInfoV22.min_index);
        protoWriter.writeBytes(conversationCheckInfoV22.unknownFields());
    }
}
