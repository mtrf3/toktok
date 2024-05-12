package X;

import com.bytedance.im.core.proto.GetCmdMessageRespBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0R extends ProtoAdapter<GetCmdMessageRespBody> {
    public P0R() {
        super(FieldEncoding.LENGTH_DELIMITED, GetCmdMessageRespBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetCmdMessageRespBody decode(ProtoReader protoReader) {
        P0S p0s = new P0S();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                p0s.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                p0s.LJI = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            p0s.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        p0s.LJ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    p0s.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0s.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetCmdMessageRespBody getCmdMessageRespBody) {
        GetCmdMessageRespBody getCmdMessageRespBody2 = getCmdMessageRespBody;
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(2, getCmdMessageRespBody2.has_more) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getCmdMessageRespBody2.messages);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return getCmdMessageRespBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, getCmdMessageRespBody2.next_user_message_cursor) + protoAdapter.encodedSizeWithTag(3, getCmdMessageRespBody2.next_cmd_index) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetCmdMessageRespBody getCmdMessageRespBody) {
        GetCmdMessageRespBody getCmdMessageRespBody2 = getCmdMessageRespBody;
        MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCmdMessageRespBody2.messages);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getCmdMessageRespBody2.has_more);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, getCmdMessageRespBody2.next_cmd_index);
        protoAdapter.encodeWithTag(protoWriter, 4, getCmdMessageRespBody2.next_user_message_cursor);
        protoWriter.writeBytes(getCmdMessageRespBody2.unknownFields());
    }
}
