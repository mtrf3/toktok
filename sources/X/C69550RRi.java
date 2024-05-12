package X;

import com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69550RRi extends ProtoAdapter<MarkMsgGetUnreadCountResponseBody> {
    public final ProtoAdapter<java.util.Map<Long, Long>> LJ;

    public C69550RRi() {
        super(FieldEncoding.LENGTH_DELIMITED, MarkMsgGetUnreadCountResponseBody.class);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MarkMsgGetUnreadCountResponseBody decode(ProtoReader protoReader) {
        C69551RRj c69551RRj = new C69551RRj();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c69551RRj.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c69551RRj.LJFF.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        c69551RRj.LJ.putAll(this.LJ.decode(protoReader));
                    }
                } else {
                    c69551RRj.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69551RRj.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody) {
        MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody2 = markMsgGetUnreadCountResponseBody;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return markMsgGetUnreadCountResponseBody2.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(3, markMsgGetUnreadCountResponseBody2.failed_tag_list) + this.LJ.encodedSizeWithTag(2, markMsgGetUnreadCountResponseBody2.tag_unread_count) + protoAdapter.encodedSizeWithTag(1, markMsgGetUnreadCountResponseBody2.total_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody) {
    }
}
