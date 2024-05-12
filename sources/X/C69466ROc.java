package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.ROc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69466ROc extends Message<C69466ROc, C69467ROd> {
    public static final ProtoAdapter<C69466ROc> ADAPTER = new C69465ROb();
    public Integer show_info_bar_type;
    public Boolean show_opt_out_button;

    public C69466ROc() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69466ROc, C69467ROd> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69466ROc, C69467ROd> newBuilder2() {
        newBuilder2();
        return null;
    }
}
