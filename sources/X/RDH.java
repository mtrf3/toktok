package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RDH extends Message<RDH, RIT> {
    public static final ProtoAdapter<RDH> ADAPTER = new C69170RCs();
    public List<C69280RGy> actions;
    public String component_key;
    public String deep_link;
    public String description;
    public String extra;
    public Integer general_type;
    public REV icon;
    public String id;
    public Boolean is_shooting_allow;
    public String keyword;
    public String language;
    public String log_extra;
    public String most_relevant_product_id;
    public String schema;
    public REV thumbnail;
    public Integer type;
    public String universal_link;
    public String url;

    public RDH() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.actions = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RDH, RIT> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RDH, RIT> newBuilder2() {
        newBuilder2();
        return null;
    }
}
