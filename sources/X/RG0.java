package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RG0 extends Message<RG0, C69288RHg> {
    public static final ProtoAdapter<RG0> ADAPTER = new C69190RDm();
    public Integer brand_id;
    public String brand_name;
    public Integer category_id;
    public String category_name;
    public Integer heat;
    public REV logo_url;
    public Integer rank;
    public Integer rank_diff;
    public String tag_name;

    public RG0() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RG0, C69288RHg> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RG0, C69288RHg> newBuilder2() {
        newBuilder2();
        return null;
    }
}
