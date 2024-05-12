package X;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;

/* loaded from: classes13.dex */
public final class RKZ extends Message<RKZ, C69361RKb> {
    public static final ProtoAdapter<RKZ> ADAPTER = new C69360RKa();
    public String DebugInfo;
    public List<RCZ> aweme_list;
    public Integer block_code;
    public List<RHB> card_insert_results;
    public C69363RKd commerce_pitaya_info;
    public REX consistency_rsp;
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
    public RMB prompt;
    public Integer refresh_clear;
    public String rid;
    public RQ5 showtime_gap_rsp_info;
    public Integer status_code;
    public String status_msg;
    public String topview_over_delivery_result;

    public RKZ() {
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<RKZ, C69361RKb> newBuilder2() {
        return null;
    }

    public RKZ(Integer num, Long l, Long l2, Integer num2, List<RCZ> list, String str, Integer num3, Integer num4, RM5 rm5, RME rme, String str2, RKX rkx, List<RCZ> list2, String str3, Integer num5, List<RCZ> list3, Boolean bool, Boolean bool2, RQ5 rq5, Boolean bool3, C69363RKd c69363RKd, String str4, String str5, List<RHB> list4, Boolean bool4, REX rex, RMB rmb) {
        this(num, l, l2, num2, list, str, num3, num4, rm5, rme, str2, rkx, list2, str3, num5, list3, bool, bool2, rq5, bool3, c69363RKd, str4, str5, list4, bool4, rex, rmb, C64537PUn.EMPTY);
    }

    public RKZ(Integer num, Long l, Long l2, Integer num2, List<RCZ> list, String str, Integer num3, Integer num4, RM5 rm5, RME rme, String str2, RKX rkx, List<RCZ> list2, String str3, Integer num5, List<RCZ> list3, Boolean bool, Boolean bool2, RQ5 rq5, Boolean bool3, C69363RKd c69363RKd, String str4, String str5, List<RHB> list4, Boolean bool4, REX rex, RMB rmb, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.status_code = num;
        this.min_cursor = l;
        this.max_cursor = l2;
        this.has_more = num2;
        this.aweme_list = C63685Oz3.LJFF("aweme_list", list);
        this.rid = str;
        this.home_model = num3;
        this.refresh_clear = num4;
        this.extra = rm5;
        this.log_pb = rme;
        this.DebugInfo = str2;
        this.guide_word = rkx;
        this.preload_ads = C63685Oz3.LJFF("preload_ads", list2);
        this.status_msg = str3;
        this.block_code = num5;
        this.preload_awemes = C63685Oz3.LJFF("preload_awemes", list3);
        this.enable_re_rank = bool;
        this.disable_adjust_for_cache = bool2;
        this.showtime_gap_rsp_info = rq5;
        this.has_ad = bool3;
        this.commerce_pitaya_info = c69363RKd;
        this.topview_over_delivery_result = str4;
        this.proactive_login_config = str5;
        this.card_insert_results = C63685Oz3.LJFF("card_insert_results", list4);
        this.is_non_personalized = bool4;
        this.consistency_rsp = rex;
        this.prompt = rmb;
    }
}
