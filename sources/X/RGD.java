package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RGD extends Message<RGD, RJB> {
    public static final ProtoAdapter<RGD> ADAPTER = new RGE();
    public RL4 caption_anchor;
    public RNF caption_info;
    public List<RH1> match_info;
    public Integer query_limit;
    public Integer total_limit;

    public RGD() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.match_info = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGD, RJB> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGD, RJB> newBuilder2() {
        newBuilder2();
        return null;
    }
}
