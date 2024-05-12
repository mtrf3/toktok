package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class REC extends Message<REC, C69315RIh> {
    public static final ProtoAdapter<REC> ADAPTER = new RDF();
    public List<ROD> all_story_lite_metadata;
    public Boolean all_viewed;
    public Long current_position;
    public Boolean has_more_after;
    public Boolean has_more_before;
    public Boolean is_post_style;
    public Boolean is_story_guide_card;
    public Long last_story_created_at;
    public Long max_cursor;
    public Long min_cursor;
    public List<RCZ> stories;
    public Long total_count;

    public REC() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.stories = C63685Oz3.LJIIIIZZ();
        this.all_story_lite_metadata = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<REC, C69315RIh> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<REC, C69315RIh> newBuilder2() {
        newBuilder2();
        return null;
    }
}
