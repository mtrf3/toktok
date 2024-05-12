package X;

import com.bytedance.im.core.proto.AckConversationApplyResponseBody;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69570RSc extends ProtoAdapter<AckConversationApplyResponseBody> {
    public C69570RSc() {
        super(FieldEncoding.LENGTH_DELIMITED, AckConversationApplyResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final AckConversationApplyResponseBody decode(ProtoReader protoReader) {
        C69571RSd c69571RSd = new C69571RSd();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c69571RSd.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c69571RSd.LJI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69571RSd.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c69571RSd.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69571RSd.LIZLLL = ConversationApplyInfo.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69571RSd.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(AckConversationApplyResponseBody ackConversationApplyResponseBody) {
        AckConversationApplyResponseBody ackConversationApplyResponseBody2 = ackConversationApplyResponseBody;
        return ackConversationApplyResponseBody2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(4, ackConversationApplyResponseBody2.check_message) + ProtoAdapter.INT64.encodedSizeWithTag(3, ackConversationApplyResponseBody2.check_code) + ProtoAdapter.INT32.encodedSizeWithTag(2, ackConversationApplyResponseBody2.status) + ConversationApplyInfo.ADAPTER.encodedSizeWithTag(1, ackConversationApplyResponseBody2.apply_info);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AckConversationApplyResponseBody ackConversationApplyResponseBody) {
    }
}
