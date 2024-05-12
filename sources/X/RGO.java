package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGO extends Message<RGO, C69289RHh> {
    public static final ProtoAdapter<RGO> ADAPTER = new C69212REi();
    public String footer;
    public String header;
    public String i18n_title;
    public String image_url;
    public Integer pattern_type;
    public String schema;
    public String title;
    public Integer type;

    public RGO() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGO, C69289RHh> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGO, C69289RHh> newBuilder2() {
        newBuilder2();
        return null;
    }
}
