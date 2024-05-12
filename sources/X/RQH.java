package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQH extends ProtoAdapter<RQI> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ RQI decode(ProtoReader protoReader) {
        return null;
    }

    public RQH() {
        super(FieldEncoding.LENGTH_DELIMITED, RQI.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RQI rqi) {
        return rqi.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RQI rqi) {
        protoWriter.writeBytes(rqi.unknownFields());
    }
}
