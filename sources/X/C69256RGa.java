package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* renamed from: X.RGa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69256RGa extends Message<C69256RGa, RJ6> {
    public static final ProtoAdapter<C69256RGa> ADAPTER = new RF2();
    public String markup_text;
    public List<C69204REa> text_extra;

    public C69256RGa() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.text_extra = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69256RGa, RJ6> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69256RGa, RJ6> newBuilder2() {
        newBuilder2();
        return null;
    }
}
