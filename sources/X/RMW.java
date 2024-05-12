package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RMW extends Message<RMW, RMX> {
    public static final ProtoAdapter<RMW> ADAPTER = new RMV();
    public List<Long> GroupdIdList0;
    public List<Long> GroupdIdList1;

    public RMW() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.GroupdIdList0 = C63685Oz3.LJIIIIZZ();
        this.GroupdIdList1 = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RMW, RMX> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RMW, RMX> newBuilder2() {
        newBuilder2();
        return null;
    }
}
