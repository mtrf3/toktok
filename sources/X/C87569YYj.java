package X;

import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYj, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87569YYj extends ProtoAdapter<UpsertConversationSettingExtInfoResponseBody> {
    public C87569YYj() {
        super(FieldEncoding.LENGTH_DELIMITED, UpsertConversationSettingExtInfoResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final UpsertConversationSettingExtInfoResponseBody decode(ProtoReader protoReader) {
        C87570YYk c87570YYk = new C87570YYk();
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
                                    c87570YYk.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c87570YYk.LJII = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c87570YYk.LJI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c87570YYk.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c87570YYk.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c87570YYk.LIZLLL = ConversationSettingInfo.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c87570YYk.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
        UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody2 = upsertConversationSettingExtInfoResponseBody;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(3, upsertConversationSettingExtInfoResponseBody2.check_code) + ProtoAdapter.INT32.encodedSizeWithTag(2, upsertConversationSettingExtInfoResponseBody2.status) + ConversationSettingInfo.ADAPTER.encodedSizeWithTag(1, upsertConversationSettingExtInfoResponseBody2.setting_info);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return upsertConversationSettingExtInfoResponseBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, upsertConversationSettingExtInfoResponseBody2.extra_info) + protoAdapter.encodedSizeWithTag(4, upsertConversationSettingExtInfoResponseBody2.check_message) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
    }
}
