package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class REN extends Message<REN, C69355RJv> {
    public static final ProtoAdapter<REN> ADAPTER = new RDG();
    public RH8 address_info;
    public String collect_info;
    public C69229REz comment_anchor;
    public String info_source;
    public RO4 nearby_tag;
    public String poi_id;
    public Boolean poi_mapkit_collect;
    public String poi_name;
    public ROT poi_review_config;
    public String poi_type;
    public C69229REz video_anchor;
    public Long video_count;

    public REN() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<REN, C69355RJv> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<REN, C69355RJv> newBuilder2() {
        newBuilder2();
        return null;
    }
}
