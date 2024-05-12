package X;

import com.bytedance.scalpel.protos.GCRecord;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes17.dex */
public final class YZ0 extends ProtoAdapter<GCRecord> {
    public YZ0() {
        super(FieldEncoding.LENGTH_DELIMITED, GCRecord.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final GCRecord decode(ProtoReader protoReader) {
        return new YZ1().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(GCRecord gCRecord) {
        GCRecord gCRecord2 = gCRecord;
        int encodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(1, gCRecord2.gcType);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
        return gCRecord2.unknownFields().size() + TimeStampRange.ADAPTER.encodedSizeWithTag(100, gCRecord2.timeStampRange) + TimeInfo.ADAPTER.encodedSizeWithTag(6, gCRecord2.timeInfo) + ProtoAdapter.STRING.encodedSizeWithTag(5, gCRecord2.threadName) + protoAdapter.encodedSizeWithTag(4, gCRecord2.endTime) + protoAdapter.encodedSizeWithTag(3, gCRecord2.startTime) + protoAdapter.encodedSizeWithTag(2, gCRecord2.allocSize) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, GCRecord gCRecord) {
        GCRecord gCRecord2 = gCRecord;
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, gCRecord2.gcType);
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(protoWriter, 2, gCRecord2.allocSize);
        protoAdapter.encodeWithTag(protoWriter, 3, gCRecord2.startTime);
        protoAdapter.encodeWithTag(protoWriter, 4, gCRecord2.endTime);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, gCRecord2.threadName);
        TimeInfo.ADAPTER.encodeWithTag(protoWriter, 6, gCRecord2.timeInfo);
        TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, gCRecord2.timeStampRange);
        protoWriter.writeBytes(gCRecord2.unknownFields());
    }
}
