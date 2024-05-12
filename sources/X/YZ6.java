package X;

import com.bytedance.scalpel.protos.BinderInfo;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YZ6 extends ProtoAdapter<BinderInfo> {
    public YZ6() {
        super(FieldEncoding.LENGTH_DELIMITED, BinderInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BinderInfo decode(ProtoReader protoReader) {
        return new YZ7().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BinderInfo binderInfo) {
        BinderInfo binderInfo2 = binderInfo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return binderInfo2.unknownFields().size() + TimeStampRange.ADAPTER.encodedSizeWithTag(100, binderInfo2.timeStampRange) + MethodStack.ADAPTER.encodedSizeWithTag(6, binderInfo2.stack) + TimeInfo.ADAPTER.encodedSizeWithTag(5, binderInfo2.timeInfo) + protoAdapter.encodedSizeWithTag(4, binderInfo2.threadName) + protoAdapter.encodedSizeWithTag(3, binderInfo2.transactName) + ProtoAdapter.INT32.encodedSizeWithTag(2, binderInfo2.transactCode) + protoAdapter.encodedSizeWithTag(1, binderInfo2.interfaceName);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BinderInfo binderInfo) {
        BinderInfo binderInfo2 = binderInfo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, binderInfo2.interfaceName);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, binderInfo2.transactCode);
        protoAdapter.encodeWithTag(protoWriter, 3, binderInfo2.transactName);
        protoAdapter.encodeWithTag(protoWriter, 4, binderInfo2.threadName);
        TimeInfo.ADAPTER.encodeWithTag(protoWriter, 5, binderInfo2.timeInfo);
        MethodStack.ADAPTER.encodeWithTag(protoWriter, 6, binderInfo2.stack);
        TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, binderInfo2.timeStampRange);
        protoWriter.writeBytes(binderInfo2.unknownFields());
    }
}
