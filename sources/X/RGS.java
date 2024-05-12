package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RGS extends Message<RGS, C69293RHl> {
    public static final ProtoAdapter<RGS> ADAPTER = new REP();
    public Integer ad_influencer_type;
    public Boolean has_ads_entry;
    public C69435RMx link_user_info;
    public Boolean show_star_atlas_cooperation;
    public Integer star_atlas;

    public RGS() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RGS, C69293RHl> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RGS, C69293RHl> newBuilder2() {
        newBuilder2();
        return null;
    }
}
