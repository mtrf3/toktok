package X;

import com.bytedance.scalpel.protos.PerfData;
import com.bytedance.scalpel.protos.PerfDataRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.YYn, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87573YYn extends ProtoAdapter<PerfDataRequest> {
    public C87573YYn() {
        super(FieldEncoding.LENGTH_DELIMITED, PerfDataRequest.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final PerfDataRequest decode(ProtoReader protoReader) {
        return new C87574YYo().build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(PerfDataRequest perfDataRequest) {
        PerfDataRequest perfDataRequest2 = perfDataRequest;
        return perfDataRequest2.unknownFields().size() + ProtoAdapter.UINT64.encodedSizeWithTag(2, perfDataRequest2.buildTime) + PerfData.ADAPTER.asRepeated().encodedSizeWithTag(1, perfDataRequest2.datas);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, PerfDataRequest perfDataRequest) {
        PerfDataRequest perfDataRequest2 = perfDataRequest;
        PerfData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, perfDataRequest2.datas);
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, perfDataRequest2.buildTime);
        protoWriter.writeBytes(perfDataRequest2.unknownFields());
    }
}
