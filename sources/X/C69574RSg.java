package X;

import com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69574RSg extends ProtoAdapter<UpdateConversationAuditSwitchResponseBody> {
    public C69574RSg() {
        super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationAuditSwitchResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final UpdateConversationAuditSwitchResponseBody decode(ProtoReader protoReader) {
        C69575RSh c69575RSh = new C69575RSh();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c69575RSh.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c69575RSh.LJI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69575RSh.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c69575RSh.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69575RSh.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69575RSh.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UpdateConversationAuditSwitchResponseBody updateConversationAuditSwitchResponseBody) {
        UpdateConversationAuditSwitchResponseBody updateConversationAuditSwitchResponseBody2 = updateConversationAuditSwitchResponseBody;
        return updateConversationAuditSwitchResponseBody2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(4, updateConversationAuditSwitchResponseBody2.check_message) + ProtoAdapter.INT64.encodedSizeWithTag(3, updateConversationAuditSwitchResponseBody2.check_code) + ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationAuditSwitchResponseBody2.status) + ProtoAdapter.BOOL.encodedSizeWithTag(1, updateConversationAuditSwitchResponseBody2.switch_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, UpdateConversationAuditSwitchResponseBody updateConversationAuditSwitchResponseBody) {
    }
}
