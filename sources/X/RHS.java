package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RHS extends Message<RHS, RJI> {
    public static final ProtoAdapter<RHS> ADAPTER = new RHR();
    public Integer mutual_type;
    public Integer total;
    public List<RHQ> user_list;

    public RHS() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.user_list = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RHS, RJI> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RHS, RJI> newBuilder2() {
        newBuilder2();
        return null;
    }
}
