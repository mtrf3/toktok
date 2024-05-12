package X;

import com.bytedance.scalpel.protos.TimeInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYx, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87583YYx extends ProtoAdapter<TimeInfo> {
    public C87583YYx() {
        super(FieldEncoding.LENGTH_DELIMITED, TimeInfo.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final TimeInfo decode(ProtoReader protoReader) {
        return new C87582YYw().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(TimeInfo timeInfo) {
        TimeInfo timeInfo2 = timeInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        return timeInfo2.unknownFields().size() + protoAdapter.encodedSizeWithTag(4, timeInfo2.endCpuTime) + protoAdapter.encodedSizeWithTag(3, timeInfo2.startCpuTime) + protoAdapter.encodedSizeWithTag(2, timeInfo2.endWallTime) + protoAdapter.encodedSizeWithTag(1, timeInfo2.startWallTime);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, TimeInfo timeInfo) {
        TimeInfo timeInfo2 = timeInfo;
        ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, timeInfo2.startWallTime);
        protoAdapter.encodeWithTag(protoWriter, 2, timeInfo2.endWallTime);
        protoAdapter.encodeWithTag(protoWriter, 3, timeInfo2.startCpuTime);
        protoAdapter.encodeWithTag(protoWriter, 4, timeInfo2.endCpuTime);
        protoWriter.writeBytes(timeInfo2.unknownFields());
    }
}
