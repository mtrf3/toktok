package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.ROx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69487ROx extends Message<C69487ROx, C69488ROy> {
    public static final ProtoAdapter<C69487ROx> ADAPTER = new C69486ROw();
    public List<String> fatal_item_ids;
    public String logid;
    public Long now;

    public C69487ROx() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.fatal_item_ids = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69487ROx, C69488ROy> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69487ROx, C69488ROy> newBuilder2() {
        newBuilder2();
        return null;
    }
}
