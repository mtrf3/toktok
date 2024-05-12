package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69257RGb extends Message<C69257RGb, C69295RHn> {
    public static final ProtoAdapter<C69257RGb> ADAPTER = new C69205REb();
    public RLY external_recommend_reason;
    public RHS mutual_struct;
    public String rec_type;
    public String recommend_reason;
    public String relation_type;

    public C69257RGb() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69257RGb, C69295RHn> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69257RGb, C69295RHn> newBuilder2() {
        newBuilder2();
        return null;
    }
}
