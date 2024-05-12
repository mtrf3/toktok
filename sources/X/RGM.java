package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGM extends Message<RGM, RK9> {
    public static final ProtoAdapter<RGM> ADAPTER = new REA();
    public Integer alignment;
    public String bg_color;
    public Double source_height;
    public Double source_width;
    public String text_color;
    public String text_language;
    public Integer text_size;

    public RGM() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGM, RK9> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGM, RK9> newBuilder2() {
        newBuilder2();
        return null;
    }
}
