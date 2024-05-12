package X;

import com.bytedance.im.core.proto.MessagesCheckInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RTt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69613RTt extends ProtoAdapter<MessagesCheckInfo> {
    public C69613RTt() {
        super(FieldEncoding.LENGTH_DELIMITED, MessagesCheckInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MessagesCheckInfo decode(ProtoReader protoReader) {
        C69614RTu c69614RTu = new C69614RTu();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c69614RTu.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c69614RTu.LJI = ProtoAdapter.UINT32.decode(protoReader);
                            }
                        } else {
                            c69614RTu.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c69614RTu.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c69614RTu.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69614RTu.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MessagesCheckInfo messagesCheckInfo) {
        MessagesCheckInfo messagesCheckInfo2 = messagesCheckInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return messagesCheckInfo2.unknownFields().size() + ProtoAdapter.UINT32.encodedSizeWithTag(4, messagesCheckInfo2.indexes_checksum) + ProtoAdapter.INT32.encodedSizeWithTag(3, messagesCheckInfo2.msg_count) + protoAdapter.encodedSizeWithTag(2, messagesCheckInfo2.tail_msg_index) + protoAdapter.encodedSizeWithTag(1, messagesCheckInfo2.head_msg_index);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MessagesCheckInfo messagesCheckInfo) {
        MessagesCheckInfo messagesCheckInfo2 = messagesCheckInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, messagesCheckInfo2.head_msg_index);
        protoAdapter.encodeWithTag(protoWriter, 2, messagesCheckInfo2.tail_msg_index);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, messagesCheckInfo2.msg_count);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, messagesCheckInfo2.indexes_checksum);
        protoWriter.writeBytes(messagesCheckInfo2.unknownFields());
    }
}
