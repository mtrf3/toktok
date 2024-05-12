package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69259RGd extends Message<C69259RGd, C69307RHz> {
    public static final ProtoAdapter<C69259RGd> ADAPTER = new REQ();
    public String description;
    public Long id;
    public String name;
    public Boolean should_show;
    public String url;

    public C69259RGd() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69259RGd, C69307RHz> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69259RGd, C69307RHz> newBuilder2() {
        newBuilder2();
        return null;
    }
}
