package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYd, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87563YYd extends ProtoAdapter<SetConversationCoreInfoResponseBody> {
    public C87563YYd() {
        super(FieldEncoding.LENGTH_DELIMITED, SetConversationCoreInfoResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final SetConversationCoreInfoResponseBody decode(ProtoReader protoReader) {
        C87564YYe c87564YYe = new C87564YYe();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    c87564YYe.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c87564YYe.LJII = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c87564YYe.LJI = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c87564YYe.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c87564YYe.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c87564YYe.LIZLLL = ConversationCoreInfo.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c87564YYe.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
        SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody2 = setConversationCoreInfoResponseBody;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, setConversationCoreInfoResponseBody2.status) + ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, setConversationCoreInfoResponseBody2.conversation_core_info);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return setConversationCoreInfoResponseBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, setConversationCoreInfoResponseBody2.check_message) + ProtoAdapter.INT64.encodedSizeWithTag(4, setConversationCoreInfoResponseBody2.check_code) + protoAdapter.encodedSizeWithTag(3, setConversationCoreInfoResponseBody2.extra_info) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
    }
}
