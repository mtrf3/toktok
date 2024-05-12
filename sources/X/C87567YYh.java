package X;

import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYh, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87567YYh extends ProtoAdapter<SetConversationSettingInfoResponseBody> {
    public C87567YYh() {
        super(FieldEncoding.LENGTH_DELIMITED, SetConversationSettingInfoResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final SetConversationSettingInfoResponseBody decode(ProtoReader protoReader) {
        C87568YYi c87568YYi = new C87568YYi();
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
                                    c87568YYi.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c87568YYi.LJII = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c87568YYi.LJI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c87568YYi.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c87568YYi.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c87568YYi.LIZLLL = ConversationSettingInfo.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c87568YYi.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody) {
        SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody2 = setConversationSettingInfoResponseBody;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(3, setConversationSettingInfoResponseBody2.check_code) + ProtoAdapter.INT32.encodedSizeWithTag(2, setConversationSettingInfoResponseBody2.status) + ConversationSettingInfo.ADAPTER.encodedSizeWithTag(1, setConversationSettingInfoResponseBody2.setting_info);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return setConversationSettingInfoResponseBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, setConversationSettingInfoResponseBody2.extra_info) + protoAdapter.encodedSizeWithTag(4, setConversationSettingInfoResponseBody2.check_message) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody) {
    }
}
