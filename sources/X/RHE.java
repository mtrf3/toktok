package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RHE extends Message<RHE, RIL> {
    public static final ProtoAdapter<RHE> ADAPTER = new RF7();
    public String action;
    public Integer offline_info_type;
    public String text;

    public RHE() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHE, RIL> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHE, RIL> newBuilder2() {
        newBuilder2();
        return null;
    }
}
