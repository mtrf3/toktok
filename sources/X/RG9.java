package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RG9 extends Message<RG9, RJE> {
    public static final ProtoAdapter<RG9> ADAPTER = new REO();
    public String extra;
    public Integer type;
    public List<C69255RFz> user_list;

    public RG9() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.user_list = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RG9, RJE> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RG9, RJE> newBuilder2() {
        newBuilder2();
        return null;
    }
}
