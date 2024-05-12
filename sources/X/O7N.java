package X;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7N {
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;

    public static O7N LIZ(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        O7N o7n = new O7N();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i = 2;
        int optInt = jSONObject.optInt("max_crash_time", 2);
        if (optInt > 0) {
            i = optInt;
        }
        o7n.LIZ = i;
        boolean z16 = true;
        jSONObject.optInt("enable_refactor_track_method", 1);
        if (jSONObject.optInt("enable_safe_cache_path") == 1) {
            z = true;
        } else {
            z = false;
        }
        o7n.LIZIZ = z;
        if (jSONObject.optInt("enable_add_show_count_for_empty_array", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        o7n.LIZJ = z2;
        if (jSONObject.optInt("enable_old_view_align", 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        o7n.LJFF = z3;
        if (jSONObject.optInt("enable_new_clean_strategy", 1) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        o7n.LIZLLL = z4;
        if (jSONObject.optInt("enable_send_event_async", 1) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        o7n.LJ = z5;
        jSONObject.optInt("enable_remove_empty_list_return", 1);
        if (jSONObject.optInt("enable_remove_default_language", 1) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        o7n.LJI = z6;
        if (jSONObject.optInt("enable_cold_launch_interval", 0) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        o7n.LJII = z7;
        if (jSONObject.optInt("enable_post_stop_video", 0) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        o7n.LJIIIIZZ = z8;
        jSONObject.optInt("enable_video_engine_release_async", 0);
        if (jSONObject.optInt("enable_pause_video_on_background", 1) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        o7n.LJIIIZ = z9;
        jSONObject.optLong("reset_count_down_timer_delay", 400L);
        jSONObject.optInt("enable_async_video_controller");
        if (jSONObject.optInt("enable_over_refactor", 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        o7n.LJIIJ = z10;
        if (jSONObject.optInt("enable_full_screen_height_adapt", 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        o7n.LJIILIIL = z11;
        if (jSONObject.optInt("enable_fix_skip_area", 1) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        o7n.LJIIL = z12;
        if (jSONObject.optInt("enable_metric", 0) == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        o7n.LJIILJJIL = z13;
        if (jSONObject.optInt("enable_adjust_stock_check", 1) == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        o7n.LJIILL = z14;
        if (jSONObject.optInt("enable_new_stock_logic", 0) == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        o7n.LJIILLIIL = z15;
        if (jSONObject.optInt("enable_modify_time_period_tag", 1) != 1) {
            z16 = false;
        }
        o7n.LJIIJJI = z16;
        return o7n;
    }
}
