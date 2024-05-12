package X;

import com.bytedance.scalpel.protos.IoInfo;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YZ8 extends ProtoAdapter<IoInfo> {
    public YZ8() {
        super(FieldEncoding.LENGTH_DELIMITED, IoInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final IoInfo decode(ProtoReader protoReader) {
        return new YZB().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(IoInfo ioInfo) {
        IoInfo ioInfo2 = ioInfo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return ioInfo2.unknownFields().size() + TimeStampRange.ADAPTER.encodedSizeWithTag(100, ioInfo2.timeStampRange) + MethodStack.ADAPTER.encodedSizeWithTag(5, ioInfo2.stack) + TimeInfo.ADAPTER.encodedSizeWithTag(4, ioInfo2.timeInfo) + protoAdapter.encodedSizeWithTag(3, ioInfo2.threadName) + protoAdapter.encodedSizeWithTag(2, ioInfo2.ownerStack) + protoAdapter.encodedSizeWithTag(1, ioInfo2.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, IoInfo ioInfo) {
        IoInfo ioInfo2 = ioInfo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, ioInfo2.name);
        protoAdapter.encodeWithTag(protoWriter, 2, ioInfo2.ownerStack);
        protoAdapter.encodeWithTag(protoWriter, 3, ioInfo2.threadName);
        TimeInfo.ADAPTER.encodeWithTag(protoWriter, 4, ioInfo2.timeInfo);
        MethodStack.ADAPTER.encodeWithTag(protoWriter, 5, ioInfo2.stack);
        TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, ioInfo2.timeStampRange);
        protoWriter.writeBytes(ioInfo2.unknownFields());
    }
}
