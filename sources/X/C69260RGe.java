package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69260RGe extends Message<C69260RGe, RI6> {
    public static final ProtoAdapter<C69260RGe> ADAPTER = new RER();
    public Boolean is_promote_ad_label;
    public Integer label_click;
    public String label_color;
    public Integer label_icon;
    public String label_text;

    public C69260RGe() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69260RGe, RI6> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69260RGe, RI6> newBuilder2() {
        newBuilder2();
        return null;
    }
}
