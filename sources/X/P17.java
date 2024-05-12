package X;

import com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes11.dex */
public final class P17 extends ProtoAdapter<GetMessageInfoByIndexV2ResponseBody> {
    public final ProtoAdapter<java.util.Map<Long, MessageInfo>> LJ;

    public P17() {
        super(FieldEncoding.LENGTH_DELIMITED, GetMessageInfoByIndexV2ResponseBody.class);
        this.LJ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, MessageInfo.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GetMessageInfoByIndexV2ResponseBody decode(ProtoReader protoReader) {
        P18 p18 = new P18();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    p18.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    p18.LIZLLL.putAll(this.LJ.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return p18.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody) {
        GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody2 = getMessageInfoByIndexV2ResponseBody;
        return getMessageInfoByIndexV2ResponseBody2.unknownFields().size() + this.LJ.encodedSizeWithTag(1, getMessageInfoByIndexV2ResponseBody2.infos);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody) {
    }
}
