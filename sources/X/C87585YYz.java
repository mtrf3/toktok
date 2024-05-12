package X;

import com.bytedance.scalpel.protos.BinderInfo;
import com.bytedance.scalpel.protos.GCRecord;
import com.bytedance.scalpel.protos.IoInfo;
import com.bytedance.scalpel.protos.LockInfo;
import com.bytedance.scalpel.protos.MsgInfo;
import com.bytedance.scalpel.protos.PerformanceInfo;
import com.bytedance.scalpel.protos.RunnableInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYz, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87585YYz extends ProtoAdapter<PerformanceInfo> {
    public C87585YYz() {
        super(FieldEncoding.LENGTH_DELIMITED, PerformanceInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final PerformanceInfo decode(ProtoReader protoReader) {
        return new C87584YYy().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PerformanceInfo performanceInfo) {
        PerformanceInfo performanceInfo2 = performanceInfo;
        return performanceInfo2.unknownFields().size() + IoInfo.ADAPTER.asRepeated().encodedSizeWithTag(6, performanceInfo2.ioInfoList) + RunnableInfo.ADAPTER.asRepeated().encodedSizeWithTag(5, performanceInfo2.runnableInfoList) + MsgInfo.ADAPTER.asRepeated().encodedSizeWithTag(4, performanceInfo2.msgInfoList) + LockInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, performanceInfo2.lockInfoList) + BinderInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, performanceInfo2.binderInfoList) + GCRecord.ADAPTER.asRepeated().encodedSizeWithTag(1, performanceInfo2.gcRecordList);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, PerformanceInfo performanceInfo) {
        PerformanceInfo performanceInfo2 = performanceInfo;
        GCRecord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, performanceInfo2.gcRecordList);
        BinderInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, performanceInfo2.binderInfoList);
        LockInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, performanceInfo2.lockInfoList);
        MsgInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, performanceInfo2.msgInfoList);
        RunnableInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, performanceInfo2.runnableInfoList);
        IoInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, performanceInfo2.ioInfoList);
        protoWriter.writeBytes(performanceInfo2.unknownFields());
    }
}
