package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RPU extends Message<RPU, RPV> {
    public static final ProtoAdapter<RPU> ADAPTER = new RPT();
    public String species_id;
    public String species_name;
    public String species_schema;

    public RPU() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RPU, RPV> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RPU, RPV> newBuilder2() {
        newBuilder2();
        return null;
    }
}
