package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RLh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69393RLh extends Message<C69393RLh, C69394RLi> {
    public static final ProtoAdapter<C69393RLh> ADAPTER = new C69392RLg();
    public String backup_url;
    public String fallback_url;
    public String main_url;

    public C69393RLh() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69393RLh, C69394RLi> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69393RLh, C69394RLi> newBuilder2() {
        newBuilder2();
        return null;
    }
}
