package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* renamed from: X.RDh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69185RDh extends Message<C69185RDh, C69298RHq> {
    public static final ProtoAdapter<C69185RDh> ADAPTER = new C69175RCx();
    public Integer ad_auth_status;
    public Integer ad_source;
    public Integer ad_style;
    public Boolean adv_promotable;
    public Boolean avoid_global_pendant;
    public String bc_label_test_text;
    public Long branded_content_type;
    public Integer digg_show_scene;
    public Integer disable_mid_roll_status_code;
    public Boolean enable_mid_roll;
    public Boolean is_ghost_ads;
    public Boolean is_pseudo_ad;
    public Long mid_roll_replace_time;
    public Long mid_roll_request_time;
    public Boolean prevent_share;
    public RLA pseudo_ad_data;
    public String study_id;
    public Boolean with_comment_filter_words;

    public C69185RDh() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<C69185RDh, C69298RHq> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<C69185RDh, C69298RHq> newBuilder2() {
        newBuilder2();
        return null;
    }
}
