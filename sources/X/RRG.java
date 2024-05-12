package X;

import com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RRG extends ProtoAdapter<GetStrangerUnreadCountResponseBody> {
    public RRG() {
        super(FieldEncoding.LENGTH_DELIMITED, GetStrangerUnreadCountResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetStrangerUnreadCountResponseBody decode(ProtoReader protoReader) {
        RRH rrh = new RRH();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rrh.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rrh.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rrh.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody) {
        GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody2 = getStrangerUnreadCountResponseBody;
        return getStrangerUnreadCountResponseBody2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerUnreadCountResponseBody2.user_unread_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody) {
    }
}
