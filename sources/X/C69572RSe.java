package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RSe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69572RSe extends ProtoAdapter<PreviewerGetConversationInfoListResponseBody> {
    public C69572RSe() {
        super(FieldEncoding.LENGTH_DELIMITED, PreviewerGetConversationInfoListResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final PreviewerGetConversationInfoListResponseBody decode(ProtoReader protoReader) {
        C69573RSf c69573RSf = new C69573RSf();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                c69573RSf.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c69573RSf.LJI = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c69573RSf.LJFF = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c69573RSf.LJ = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69573RSf.LIZLLL.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69573RSf.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody) {
        PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody2 = previewerGetConversationInfoListResponseBody;
        return previewerGetConversationInfoListResponseBody2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(4, previewerGetConversationInfoListResponseBody2.check_message) + ProtoAdapter.INT64.encodedSizeWithTag(3, previewerGetConversationInfoListResponseBody2.check_code) + ProtoAdapter.INT32.encodedSizeWithTag(2, previewerGetConversationInfoListResponseBody2.status) + ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerGetConversationInfoListResponseBody2.conversation_info_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody) {
    }
}
