package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.Ozm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63730Ozm extends ProtoAdapter<CreateConversationV2ResponseBody> {
    public C63730Ozm() {
        super(FieldEncoding.LENGTH_DELIMITED, CreateConversationV2ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final CreateConversationV2ResponseBody decode(ProtoReader protoReader) {
        C63731Ozn c63731Ozn = new C63731Ozn();
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
                                    c63731Ozn.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c63731Ozn.LJII = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c63731Ozn.LJI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c63731Ozn.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c63731Ozn.LJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c63731Ozn.LIZLLL = ConversationInfoV2.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63731Ozn.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(CreateConversationV2ResponseBody createConversationV2ResponseBody) {
        CreateConversationV2ResponseBody createConversationV2ResponseBody2 = createConversationV2ResponseBody;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(2, createConversationV2ResponseBody2.check_code) + ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, createConversationV2ResponseBody2.conversation);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return createConversationV2ResponseBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(5, createConversationV2ResponseBody2.status) + protoAdapter.encodedSizeWithTag(4, createConversationV2ResponseBody2.extra_info) + protoAdapter.encodedSizeWithTag(3, createConversationV2ResponseBody2.check_message) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, CreateConversationV2ResponseBody createConversationV2ResponseBody) {
    }
}
