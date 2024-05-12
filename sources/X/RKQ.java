package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RKQ extends Message<RKQ, RKS> {
    public static final ProtoAdapter<RKQ> ADAPTER = new RKP();
    public List<RKO> biz_permissions;

    public RKQ() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.biz_permissions = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RKQ, RKS> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RKQ, RKS> newBuilder2() {
        newBuilder2();
        return null;
    }
}
