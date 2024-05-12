package X;

import com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQW extends ProtoAdapter<GetConversationAuditSwitchResponseBody> {
    public RQW() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationAuditSwitchResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConversationAuditSwitchResponseBody decode(ProtoReader protoReader) {
        RQX rqx = new RQX();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    rqx.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    rqx.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rqx.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationAuditSwitchResponseBody getConversationAuditSwitchResponseBody) {
        GetConversationAuditSwitchResponseBody getConversationAuditSwitchResponseBody2 = getConversationAuditSwitchResponseBody;
        return getConversationAuditSwitchResponseBody2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(1, getConversationAuditSwitchResponseBody2.switch_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConversationAuditSwitchResponseBody getConversationAuditSwitchResponseBody) {
    }
}
