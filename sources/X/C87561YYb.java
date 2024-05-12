package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYb, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87561YYb extends ProtoAdapter<UpsertConversationCoreExtInfoResponseBody> {
    public C87561YYb() {
        super(FieldEncoding.LENGTH_DELIMITED, UpsertConversationCoreExtInfoResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final UpsertConversationCoreExtInfoResponseBody decode(ProtoReader protoReader) {
        C87562YYc c87562YYc = new C87562YYc();
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
                                    c87562YYc.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c87562YYc.LJII = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c87562YYc.LJI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c87562YYc.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c87562YYc.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c87562YYc.LIZLLL = ConversationCoreInfo.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c87562YYc.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
        UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody2 = upsertConversationCoreExtInfoResponseBody;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(3, upsertConversationCoreExtInfoResponseBody2.check_code) + ProtoAdapter.INT32.encodedSizeWithTag(2, upsertConversationCoreExtInfoResponseBody2.status) + ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, upsertConversationCoreExtInfoResponseBody2.core_info);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return upsertConversationCoreExtInfoResponseBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, upsertConversationCoreExtInfoResponseBody2.extra_info) + protoAdapter.encodedSizeWithTag(4, upsertConversationCoreExtInfoResponseBody2.check_message) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
    }
}
