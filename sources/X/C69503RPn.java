package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RPn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69503RPn extends Message<C69503RPn, C69504RPo> {
    public static final ProtoAdapter<C69503RPn> ADAPTER = new C69502RPm();
    public List<C69500RPk> actions;
    public Integer type;

    public C69503RPn() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.actions = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69503RPn, C69504RPo> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69503RPn, C69504RPo> newBuilder2() {
        newBuilder2();
        return null;
    }
}
