package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RHa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69282RHa extends Message<C69282RHa, C69354RJu> {
    public static final ProtoAdapter<C69282RHa> ADAPTER = new C69283RHb();
    public String btn_text;
    public Integer module_type;
    public C69368RKi pop_window;
    public String url;

    public C69282RHa() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69282RHa, C69354RJu> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69282RHa, C69354RJu> newBuilder2() {
        newBuilder2();
        return null;
    }
}
