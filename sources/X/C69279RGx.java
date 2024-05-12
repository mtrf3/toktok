package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RGx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69279RGx extends Message<C69279RGx, RJN> {
    public static final ProtoAdapter<C69279RGx> ADAPTER = new C69223REt();
    public String banner_txt;
    public Integer banner_type;
    public String link_txt;
    public Integer link_type;
    public String link_url;

    public C69279RGx() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69279RGx, RJN> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69279RGx, RJN> newBuilder2() {
        newBuilder2();
        return null;
    }
}
