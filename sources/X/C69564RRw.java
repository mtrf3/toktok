package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PullMarkMessageResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69564RRw extends ProtoAdapter<PullMarkMessageResponseBody> {
    public C69564RRw() {
        super(FieldEncoding.LENGTH_DELIMITED, PullMarkMessageResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final PullMarkMessageResponseBody decode(ProtoReader protoReader) {
        C69565RRx c69565RRx = new C69565RRx();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c69565RRx.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c69565RRx.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c69565RRx.LJ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    c69565RRx.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69565RRx.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PullMarkMessageResponseBody pullMarkMessageResponseBody) {
        PullMarkMessageResponseBody pullMarkMessageResponseBody2 = pullMarkMessageResponseBody;
        return pullMarkMessageResponseBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(3, pullMarkMessageResponseBody2.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(2, pullMarkMessageResponseBody2.has_more) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, pullMarkMessageResponseBody2.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, PullMarkMessageResponseBody pullMarkMessageResponseBody) {
    }
}
