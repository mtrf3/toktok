package X;

import com.bytedance.scalpel.protos.BigJankMsg;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.PerformanceInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYt, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87579YYt extends ProtoAdapter<BigJankMsg.MessageDispatch> {
    public C87579YYt() {
        super(FieldEncoding.LENGTH_DELIMITED, BigJankMsg.MessageDispatch.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final BigJankMsg.MessageDispatch decode(ProtoReader protoReader) {
        return new C87578YYs().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(BigJankMsg.MessageDispatch messageDispatch) {
        BigJankMsg.MessageDispatch messageDispatch2 = messageDispatch;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(2, messageDispatch2.intervalTime) + MethodStack.ADAPTER.asRepeated().encodedSizeWithTag(1, messageDispatch2.stacks);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return messageDispatch2.unknownFields().size() + TimeStampRange.ADAPTER.encodedSizeWithTag(100, messageDispatch2.timeStampRange) + protoAdapter.encodedSizeWithTag(6, messageDispatch2.customScene) + TimeInfo.ADAPTER.encodedSizeWithTag(5, messageDispatch2.timeInfo) + PerformanceInfo.ADAPTER.encodedSizeWithTag(4, messageDispatch2.performanceInfo) + protoAdapter.encodedSizeWithTag(3, messageDispatch2.scene) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, BigJankMsg.MessageDispatch messageDispatch) {
        BigJankMsg.MessageDispatch messageDispatch2 = messageDispatch;
        MethodStack.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messageDispatch2.stacks);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messageDispatch2.intervalTime);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, messageDispatch2.scene);
        PerformanceInfo.ADAPTER.encodeWithTag(protoWriter, 4, messageDispatch2.performanceInfo);
        TimeInfo.ADAPTER.encodeWithTag(protoWriter, 5, messageDispatch2.timeInfo);
        protoAdapter.encodeWithTag(protoWriter, 6, messageDispatch2.customScene);
        TimeStampRange.ADAPTER.encodeWithTag(protoWriter, 100, messageDispatch2.timeStampRange);
        protoWriter.writeBytes(messageDispatch2.unknownFields());
    }
}
