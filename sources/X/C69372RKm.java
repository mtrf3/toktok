package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RKm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69372RKm extends Message<C69372RKm, C69373RKn> {
    public static final ProtoAdapter<C69372RKm> ADAPTER = new C69371RKl();
    public String content;
    public REV icon;
    public Integer type;

    public C69372RKm() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69372RKm, C69373RKn> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69372RKm, C69373RKn> newBuilder2() {
        newBuilder2();
        return null;
    }
}
