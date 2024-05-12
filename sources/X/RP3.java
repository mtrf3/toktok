package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RP3 extends Message<RP3, RP4> {
    public static final ProtoAdapter<RP3> ADAPTER = new RP2();
    public REV icon_url;
    public String sub_title;
    public String text_color;
    public String title;

    public RP3() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RP3, RP4> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RP3, RP4> newBuilder2() {
        newBuilder2();
        return null;
    }
}
