package X;

import com.bytedance.im.core.proto.GetRecentMessageReqBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63467OvX extends ProtoAdapter<GetRecentMessageReqBody> {
    public C63467OvX() {
        super(FieldEncoding.LENGTH_DELIMITED, GetRecentMessageReqBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetRecentMessageReqBody decode(ProtoReader protoReader) {
        C63466OvW c63466OvW = new C63466OvW();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c63466OvW.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c63466OvW.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c63466OvW.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c63466OvW.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63466OvW.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetRecentMessageReqBody getRecentMessageReqBody) {
        GetRecentMessageReqBody getRecentMessageReqBody2 = getRecentMessageReqBody;
        return getRecentMessageReqBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(3, getRecentMessageReqBody2.new_user) + ProtoAdapter.STRING.encodedSizeWithTag(2, getRecentMessageReqBody2.source) + ProtoAdapter.INT64.encodedSizeWithTag(1, getRecentMessageReqBody2.conversation_version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetRecentMessageReqBody getRecentMessageReqBody) {
        GetRecentMessageReqBody getRecentMessageReqBody2 = getRecentMessageReqBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getRecentMessageReqBody2.conversation_version);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getRecentMessageReqBody2.source);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getRecentMessageReqBody2.new_user);
        protoWriter.writeBytes(getRecentMessageReqBody2.unknownFields());
    }
}
