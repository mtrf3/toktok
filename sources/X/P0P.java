package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P0P extends ProtoAdapter<GetMessageInfoByIndexV2RangeResponseBody> {
    public P0P() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessageInfoByIndexV2RangeResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetMessageInfoByIndexV2RangeResponseBody decode(ProtoReader protoReader) {
        P0Q p0q = new P0Q();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            p0q.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            p0q.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        p0q.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    p0q.LIZLLL.add(MessageInfo.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p0q.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody) {
        GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody2 = getMessageInfoByIndexV2RangeResponseBody;
        return getMessageInfoByIndexV2RangeResponseBody2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(3, getMessageInfoByIndexV2RangeResponseBody2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(2, getMessageInfoByIndexV2RangeResponseBody2.next_index_in_conversation_v2) + MessageInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessageInfoByIndexV2RangeResponseBody2.infos);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody) {
    }
}
