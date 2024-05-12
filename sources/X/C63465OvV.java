package X;

import com.bytedance.im.core.proto.GetCmdMessageReqBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.OvV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63465OvV extends ProtoAdapter<GetCmdMessageReqBody> {
    public C63465OvV() {
        super(FieldEncoding.LENGTH_DELIMITED, GetCmdMessageReqBody.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetCmdMessageReqBody decode(ProtoReader protoReader) {
        C63464OvU c63464OvU = new C63464OvU();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            c63464OvU.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c63464OvU.LJFF = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c63464OvU.LJ = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c63464OvU.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63464OvU.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetCmdMessageReqBody getCmdMessageReqBody) {
        GetCmdMessageReqBody getCmdMessageReqBody2 = getCmdMessageReqBody;
        return getCmdMessageReqBody2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(3, getCmdMessageReqBody2.new_user) + ProtoAdapter.STRING.encodedSizeWithTag(2, getCmdMessageReqBody2.source) + ProtoAdapter.INT64.encodedSizeWithTag(1, getCmdMessageReqBody2.cmd_index);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GetCmdMessageReqBody getCmdMessageReqBody) {
        GetCmdMessageReqBody getCmdMessageReqBody2 = getCmdMessageReqBody;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getCmdMessageReqBody2.cmd_index);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getCmdMessageReqBody2.source);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getCmdMessageReqBody2.new_user);
        protoWriter.writeBytes(getCmdMessageReqBody2.unknownFields());
    }
}
