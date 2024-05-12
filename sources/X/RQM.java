package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RQM extends ProtoAdapter<RQN> {
    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ RQN decode(ProtoReader protoReader) {
        return null;
    }

    public RQM() {
        super(FieldEncoding.LENGTH_DELIMITED, RQN.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RQN rqn) {
        return rqn.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RQN rqn) {
        protoWriter.writeBytes(rqn.unknownFields());
    }
}
