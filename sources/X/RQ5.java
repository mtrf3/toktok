package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes13.dex */
public final class RQ5 extends Message<RQ5, RP5> {
    public static final ProtoAdapter<RQ5> ADAPTER = new RQ6();
    public String adgap_delta_by_time;
    public Integer downstream_range_end;
    public Boolean enable_client_adgap_adjust;
    public Boolean enable_fast_browse;
    public Boolean enable_showtime_gap;
    public Integer fast_browse_time_threshold;
    public Integer min_gap;
    public Integer single_vid_view_time;
    public Boolean use_fast_browse_model;
    public Integer viewed_vid_num;

    public RQ5() {
        super(ADAPTER, C64537PUn.EMPTY);
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RQ5, RP5> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RQ5, RP5> newBuilder2() {
        newBuilder2();
        return null;
    }
}
