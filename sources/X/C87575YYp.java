package X;

import com.bytedance.scalpel.protos.PerfData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYp, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87575YYp extends ProtoAdapter<PerfData> {
    public C87575YYp() {
        super(FieldEncoding.LENGTH_DELIMITED, PerfData.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final PerfData decode(ProtoReader protoReader) {
        return new C87576YYq().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PerfData perfData) {
        PerfData perfData2 = perfData;
        return perfData2.unknownFields().size() + ProtoAdapter.BYTES.encodedSizeWithTag(3, perfData2.data) + ProtoAdapter.UINT32.encodedSizeWithTag(2, perfData2.dataType) + ProtoAdapter.UINT64.encodedSizeWithTag(1, perfData2.timestamp);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, PerfData perfData) {
        PerfData perfData2 = perfData;
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, perfData2.timestamp);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, perfData2.dataType);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, perfData2.data);
        protoWriter.writeBytes(perfData2.unknownFields());
    }
}
