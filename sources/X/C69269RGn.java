package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69269RGn extends Message<C69269RGn, RJO> {
    public static final ProtoAdapter<C69269RGn> ADAPTER = new RFI();
    public Integer fans_level;
    public String fans_name;
    public Boolean is_fan;
    public Boolean light_up;

    public C69269RGn() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69269RGn, RJO> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69269RGn, RJO> newBuilder2() {
        newBuilder2();
        return null;
    }
}
