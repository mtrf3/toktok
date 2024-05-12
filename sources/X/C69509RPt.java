package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RPt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69509RPt extends Message<C69509RPt, C69510RPu> {
    public static final ProtoAdapter<C69509RPt> ADAPTER = new C69508RPs();
    public Integer max_lines;
    public List<C69512RPw> texts;

    public C69509RPt() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.texts = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69509RPt, C69510RPu> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69509RPt, C69510RPu> newBuilder2() {
        newBuilder2();
        return null;
    }
}
