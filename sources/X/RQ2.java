package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RQ2 extends Message<RQ2, RQ3> {
    public static final ProtoAdapter<RQ2> ADAPTER = new RQ1();
    public List<RCZ> aweme_list;
    public Integer block_code;
    public List<RHB> card_insert_results;
    public C69363RKd commerce_pitaya_info;
    public Boolean disable_adjust_for_cache;
    public Boolean enable_re_rank;
    public RM5 extra;
    public RKX guide_word;
    public Boolean has_ad;
    public Integer has_more;
    public Integer home_model;
    public Boolean is_non_personalized;
    public RME log_pb;
    public Long max_cursor;
    public Long min_cursor;
    public List<RCZ> preload_ads;
    public List<RCZ> preload_awemes;
    public String proactive_login_config;
    public Integer refresh_clear;
    public String rid;
    public RQ5 showtime_gap_rsp_info;
    public Integer status_code;
    public String status_msg;
    public String topview_over_delivery_result;

    public RQ2() {
        super(ADAPTER, C64537PUn.EMPTY);
        this.aweme_list = C63685Oz3.LJIIIIZZ();
        this.preload_ads = C63685Oz3.LJIIIIZZ();
        this.preload_awemes = C63685Oz3.LJIIIIZZ();
        this.card_insert_results = C63685Oz3.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RQ2, RQ3> newBuilder2() {
        return null;
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<RQ2, RQ3> newBuilder2() {
        newBuilder2();
        return null;
    }
}
