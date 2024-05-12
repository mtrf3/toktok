package X;

import com.bytedance.scalpel.protos.MsgInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YZ4 extends ProtoAdapter<MsgInfo> {
    public YZ4() {
        super(FieldEncoding.LENGTH_DELIMITED, MsgInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final MsgInfo decode(ProtoReader protoReader) {
        return new YZ5().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(MsgInfo msgInfo) {
        MsgInfo msgInfo2 = msgInfo;
        return msgInfo2.unknownFields().size() + TimeInfo.ADAPTER.encodedSizeWithTag(3, msgInfo2.timeInfo) + ProtoAdapter.INT32.encodedSizeWithTag(2, msgInfo2.what) + ProtoAdapter.STRING.encodedSizeWithTag(1, msgInfo2.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, MsgInfo msgInfo) {
        MsgInfo msgInfo2 = msgInfo;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, msgInfo2.name);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, msgInfo2.what);
        TimeInfo.ADAPTER.encodeWithTag(protoWriter, 3, msgInfo2.timeInfo);
        protoWriter.writeBytes(msgInfo2.unknownFields());
    }
}
