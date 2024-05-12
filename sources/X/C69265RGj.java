package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RGj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69265RGj extends Message<C69265RGj, RJ4> {
    public static final ProtoAdapter<C69265RGj> ADAPTER = new RFZ();
    public List<RFS> ttec_suggest_words;

    public C69265RGj() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.ttec_suggest_words = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69265RGj, RJ4> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69265RGj, RJ4> newBuilder2() {
        newBuilder2();
        return null;
    }
}
