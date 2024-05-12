package X;

import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.im.core.proto.GetConversationAuditListResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RRu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69562RRu extends ProtoAdapter<GetConversationAuditListResponseBody> {
    public C69562RRu() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationAuditListResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConversationAuditListResponseBody decode(ProtoReader protoReader) {
        C69563RRv c69563RRv = new C69563RRv();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c69563RRv.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c69563RRv.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c69563RRv.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c69563RRv.LIZLLL.add(ConversationApplyInfo.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69563RRv.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationAuditListResponseBody getConversationAuditListResponseBody) {
        GetConversationAuditListResponseBody getConversationAuditListResponseBody2 = getConversationAuditListResponseBody;
        return getConversationAuditListResponseBody2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(3, getConversationAuditListResponseBody2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(2, getConversationAuditListResponseBody2.next_cursor) + ConversationApplyInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationAuditListResponseBody2.apply_info_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConversationAuditListResponseBody getConversationAuditListResponseBody) {
    }
}
