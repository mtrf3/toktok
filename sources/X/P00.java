package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody;
import com.bytedance.im.core.proto.MessageCheckInfoV2;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P00 extends ProtoAdapter<GetMessagesCheckInfoV2ResponseBody> {
    public P00() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessagesCheckInfoV2ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetMessagesCheckInfoV2ResponseBody decode(ProtoReader protoReader) {
        P01 p01 = new P01();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                p01.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                p01.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            p01.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        p01.LJ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    p01.LIZLLL.add(MessageCheckInfoV2.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p01.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody) {
        GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody2 = getMessagesCheckInfoV2ResponseBody;
        int encodedSizeWithTag = MessageCheckInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessagesCheckInfoV2ResponseBody2.msg_list);
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        return getMessagesCheckInfoV2ResponseBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, getMessagesCheckInfoV2ResponseBody2.is_demoted) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMessagesCheckInfoV2ResponseBody2.next_cursor) + protoAdapter.encodedSizeWithTag(2, getMessagesCheckInfoV2ResponseBody2.has_more) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody) {
    }
}
