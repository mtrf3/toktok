package X;

import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.RunnableInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YZ2 extends ProtoAdapter<RunnableInfo> {
    public YZ2() {
        super(FieldEncoding.LENGTH_DELIMITED, RunnableInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RunnableInfo decode(ProtoReader protoReader) {
        return new YZ3().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RunnableInfo runnableInfo) {
        RunnableInfo runnableInfo2 = runnableInfo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return runnableInfo2.unknownFields().size() + TimeStampRange.ADAPTER.encodedSizeWithTag(100, runnableInfo2.timeStampRange) + ProtoAdapter.BOOL.encodedSizeWithTag(6, runnableInfo2.nameismethod) + ProtoAdapter.INT32.encodedSizeWithTag(5, runnableInfo2.tag) + MethodStack.ADAPTER.encodedSizeWithTag(4, runnableInfo2.methodStack) + TimeInfo.ADAPTER.encodedSizeWithTag(3, runnableInfo2.timeInfo) + protoAdapter.encodedSizeWithTag(2, runnableInfo2.threadName) + protoAdapter.encodedSizeWithTag(1, runnableInfo2.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RunnableInfo runnableInfo) {
        RunnableInfo runnableInfo2 = runnableInfo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, runnableInfo2.name);
        protoAdapter.encodeWithTag(protoWriter, 2, runnableInfo2.threadName);
        TimeInfo.ADAPTER.encodeWithTag(protoWriter, 3, runnableInfo2.timeInfo);
        MethodStack.ADAPTER.encodeWithTag(protoWriter, 4, runnableInfo2.methodStack);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, runnableInfo2.tag);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, runnableInfo2.nameismethod);
        TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, runnableInfo2.timeStampRange);
        protoWriter.writeBytes(runnableInfo2.unknownFields());
    }
}
