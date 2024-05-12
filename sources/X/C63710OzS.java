package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import com.bytedance.im.core.proto.GetConversationsCheckInfoV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OzS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63710OzS extends ProtoAdapter<GetConversationsCheckInfoV2ResponseBody> {
    public C63710OzS() {
        super(FieldEncoding.LENGTH_DELIMITED, GetConversationsCheckInfoV2ResponseBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetConversationsCheckInfoV2ResponseBody decode(ProtoReader protoReader) {
        C63711OzT c63711OzT = new C63711OzT();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c63711OzT.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c63711OzT.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c63711OzT.LJ = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    c63711OzT.LIZLLL.add(ConversationCheckInfoV2.ADAPTER.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63711OzT.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody) {
        GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody2 = getConversationsCheckInfoV2ResponseBody;
        int encodedSizeWithTag = ConversationCheckInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationsCheckInfoV2ResponseBody2.conv_list);
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        return getConversationsCheckInfoV2ResponseBody2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, getConversationsCheckInfoV2ResponseBody2.is_pinned_included) + protoAdapter.encodedSizeWithTag(2, getConversationsCheckInfoV2ResponseBody2.is_demoted) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody) {
    }
}
