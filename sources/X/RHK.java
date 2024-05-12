package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHK extends Message<RHK, C69338RJe> {
    public static final ProtoAdapter<RHK> ADAPTER = new RFO();
    public String genus_id;
    public String genus_name;
    public String redirection_schema;
    public String species_id;
    public String species_name;

    public RHK() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHK, C69338RJe> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHK, C69338RJe> newBuilder2() {
        newBuilder2();
        return null;
    }
}
