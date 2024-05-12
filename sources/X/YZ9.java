package X;

import com.bytedance.scalpel.protos.LockInfo;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YZ9 extends ProtoAdapter<LockInfo> {
    public YZ9() {
        super(FieldEncoding.LENGTH_DELIMITED, LockInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final LockInfo decode(ProtoReader protoReader) {
        return new YZA().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(LockInfo lockInfo) {
        LockInfo lockInfo2 = lockInfo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return lockInfo2.unknownFields().size() + TimeStampRange.ADAPTER.encodedSizeWithTag(100, lockInfo2.timeStampRange) + MethodStack.ADAPTER.encodedSizeWithTag(6, lockInfo2.stack) + protoAdapter.encodedSizeWithTag(5, lockInfo2.extra) + TimeInfo.ADAPTER.encodedSizeWithTag(4, lockInfo2.timeInfo) + protoAdapter.encodedSizeWithTag(3, lockInfo2.ownerStack) + protoAdapter.encodedSizeWithTag(2, lockInfo2.ownerThread) + protoAdapter.encodedSizeWithTag(1, lockInfo2.waiterStack);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, LockInfo lockInfo) {
        LockInfo lockInfo2 = lockInfo;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, lockInfo2.waiterStack);
        protoAdapter.encodeWithTag(protoWriter, 2, lockInfo2.ownerThread);
        protoAdapter.encodeWithTag(protoWriter, 3, lockInfo2.ownerStack);
        TimeInfo.ADAPTER.encodeWithTag(protoWriter, 4, lockInfo2.timeInfo);
        protoAdapter.encodeWithTag(protoWriter, 5, lockInfo2.extra);
        MethodStack.ADAPTER.encodeWithTag(protoWriter, 6, lockInfo2.stack);
        TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, lockInfo2.timeStampRange);
        protoWriter.writeBytes(lockInfo2.unknownFields());
    }
}
