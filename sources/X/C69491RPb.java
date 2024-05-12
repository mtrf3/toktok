package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RPb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69491RPb extends Message<C69491RPb, C69492RPc> {
    public static final ProtoAdapter<C69491RPb> ADAPTER = new C69490RPa();
    public REV avatar_icon;
    public String id;
    public String open_url;
    public String sub_title;
    public String title;
    public String web_url;

    public C69491RPb() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69491RPb, C69492RPc> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69491RPb, C69492RPc> newBuilder2() {
        newBuilder2();
        return null;
    }
}
