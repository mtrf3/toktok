package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RKi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69368RKi extends Message<C69368RKi, C69370RKk> {
    public static final ProtoAdapter<C69368RKi> ADAPTER = new C69367RKh();
    public List<C69366RKg> pop_content;
    public String pop_title;

    public C69368RKi() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.pop_content = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69368RKi, C69370RKk> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69368RKi, C69370RKk> newBuilder2() {
        newBuilder2();
        return null;
    }
}
