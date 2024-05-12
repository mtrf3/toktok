package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RGi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69264RGi extends Message<C69264RGi, RIS> {
    public static final ProtoAdapter<C69264RGi> ADAPTER = new C69250RFu();
    public List<C69249RFt> suggest_words;

    public C69264RGi() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.suggest_words = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69264RGi, RIS> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69264RGi, RIS> newBuilder2() {
        newBuilder2();
        return null;
    }
}
