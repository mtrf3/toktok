package X;

import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.IWb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46741IWb implements InterfaceC46853Ia9 {
    public final /* synthetic */ C46740IWa LJLIL;

    public C46741IWb(C46740IWa c46740IWa) {
        this.LJLIL = c46740IWa;
    }

    @Override // X.InterfaceC46853Ia9
    public final void onVideoEngineInfos(C47620ImW c47620ImW) {
        Object obj;
        long j;
        String sourceId = this.LJLIL.LJLILLLLZI.getSourceId();
        int i = 0;
        if (this.LJLIL.LJLJLLL != null && c47620ImW != null && "firstframe_split".equals(c47620ImW.LIZ)) {
            String str = c47620ImW.LJFF;
            Object obj2 = c47620ImW.LIZJ;
            if (obj2 != null && (obj2 instanceof JSONObject)) {
                C46543IOl c46543IOl = this.LJLIL.LJLJLLL;
                c46543IOl.getClass();
                try {
                    synchronized (c46543IOl.LIZ) {
                        if (!TextUtils.isEmpty(str)) {
                            if (c46543IOl.LIZJ.size() > 5) {
                                c46543IOl.LIZJ.remove(0);
                            }
                            c46543IOl.LIZJ.add(new Pair<>(str, obj2));
                        }
                    }
                } catch (Exception e) {
                    if (C46982IcE.LIZIZ() != null && C46982IcE.LIZIZ().isDebug()) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        if (this.LJLIL.LJLJLLL != null && c47620ImW != null && !TextUtils.isEmpty(sourceId)) {
            if ("outsyncStartInfos".equals(c47620ImW.LIZ) || "outsyncEndInfos".equals(c47620ImW.LIZ)) {
                C46740IWa c46740IWa = this.LJLIL;
                if (!c46740IWa.LJLJLJ) {
                    return;
                }
                if (!TextUtils.equals(c46740IWa.LJLJJL, sourceId)) {
                    C46740IWa c46740IWa2 = this.LJLIL;
                    c46740IWa2.LJLJJL = sourceId;
                    c46740IWa2.LJLJJLL = new HashMap();
                }
                if (this.LJLIL.LJLJJLL == null) {
                    return;
                }
                if ("outsyncStartInfos".equals(c47620ImW.LIZ)) {
                    Object obj3 = c47620ImW.LIZJ;
                    if (obj3 != null && (obj3 instanceof java.util.Map)) {
                        this.LJLIL.LJLJL = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                if (!"outsyncEndInfos".equals(c47620ImW.LIZ) || (obj = c47620ImW.LIZJ) == null || !(obj instanceof java.util.Map)) {
                    return;
                }
                java.util.Map map = (java.util.Map) obj;
                if (this.LJLIL.LJLJJLL.isEmpty()) {
                    this.LJLIL.LJLJJLL.put("min_out_sync_begin_pos", map.get("begin_pos"));
                }
                if (this.LJLIL.LJLJJLL.get("min_out_sync_end_pos") == null) {
                    this.LJLIL.LJLJJLL.put("min_out_sync_end_pos", map.get("end_pos"));
                }
                if (this.LJLIL.LJLJJLL.get("out_sync_video_origin_fps") == null) {
                    this.LJLIL.LJLJJLL.put("out_sync_video_origin_fps", map.get("container_fps"));
                }
                if (this.LJLIL.LJLJJLL.get("out_sync_video_render_fps") == null) {
                    this.LJLIL.LJLJJLL.put("out_sync_video_render_fps", map.get("video_out_fps"));
                }
                if (this.LJLIL.LJLJJLL.get("out_sync_total_count") instanceof Integer) {
                    i = ((Integer) this.LJLIL.LJLJJLL.get("out_sync_total_count")).intValue();
                }
                this.LJLIL.LJLJJLL.put("out_sync_total_count", Integer.valueOf(i + 1));
                C46740IWa c46740IWa3 = this.LJLIL;
                if (c46740IWa3.LJLJL >= 0) {
                    if (c46740IWa3.LJLJJLL.get("out_sync_total_duration") instanceof Long) {
                        j = ((Long) this.LJLIL.LJLJJLL.get("out_sync_total_duration")).longValue();
                    } else {
                        j = 0;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    C46740IWa c46740IWa4 = this.LJLIL;
                    long j2 = currentTimeMillis - c46740IWa4.LJLJL;
                    c46740IWa4.LJLJL = -1L;
                    if (j2 > 0) {
                        c46740IWa4.LJLJJLL.put("out_sync_total_duration", Long.valueOf(j + j2));
                    }
                }
                if (this.LJLIL.LJLJJLL.get("out_sync_max_decode_time") == null && (map.get("decode_time") instanceof Long)) {
                    this.LJLIL.LJLJJLL.put("out_sync_max_decode_time", map.get("decode_time"));
                } else if (this.LJLIL.LJLJJLL.get("out_sync_max_decode_time") instanceof Long) {
                    long longValue = ((Long) this.LJLIL.LJLJJLL.get("out_sync_max_decode_time")).longValue();
                    if ((map.get("decode_time") instanceof Long) && ((Long) map.get("decode_time")).longValue() > longValue) {
                        this.LJLIL.LJLJJLL.put("out_sync_max_decode_time", map.get("decode_time"));
                    }
                }
                if (this.LJLIL.LJLJJLL.get("out_sync_clock_diff") == null && (map.get("clock_diff") instanceof Long)) {
                    this.LJLIL.LJLJJLL.put("out_sync_clock_diff", map.get("clock_diff"));
                } else if (this.LJLIL.LJLJJLL.get("out_sync_clock_diff") instanceof Long) {
                    long longValue2 = ((Long) this.LJLIL.LJLJJLL.get("out_sync_clock_diff")).longValue();
                    if ((map.get("clock_diff") instanceof Long) && ((Long) map.get("clock_diff")).longValue() < longValue2) {
                        this.LJLIL.LJLJJLL.put("out_sync_clock_diff", map.get("clock_diff"));
                    }
                }
                if (this.LJLIL.LJLJJLL.get("out_sync_video_total_drop_count") == null && (map.get("render_drop_cnt") instanceof Integer)) {
                    this.LJLIL.LJLJJLL.put("out_sync_video_total_drop_count", map.get("render_drop_cnt"));
                } else if (this.LJLIL.LJLJJLL.get("out_sync_video_total_drop_count") instanceof Integer) {
                    int intValue = ((Integer) this.LJLIL.LJLJJLL.get("out_sync_video_total_drop_count")).intValue();
                    if (map.get("render_drop_cnt") instanceof Integer) {
                        this.LJLIL.LJLJJLL.put("out_sync_video_total_drop_count", Integer.valueOf(((Integer) map.get("render_drop_cnt")).intValue() + intValue));
                    }
                }
                C46740IWa c46740IWa5 = this.LJLIL;
                c46740IWa5.LJLJLLL.LIZIZ(sourceId, c46740IWa5.LJLJJLL);
            }
        }
    }
}
