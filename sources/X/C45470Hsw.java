package X;

import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Hsw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45470Hsw implements HO7 {
    public long LIZ;
    public final /* synthetic */ C45507HtX LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ C45498HtO LIZLLL;

    public final void LIZ() {
        boolean z;
        boolean z2;
        boolean z3;
        C45498HtO c45498HtO = this.LIZLLL;
        long j = this.LIZ;
        C45507HtX c45507HtX = this.LIZIZ;
        int i = this.LIZJ;
        if (c45498HtO.LLFZ) {
            c45498HtO.LLFFF.add(c45507HtX);
        }
        if (HOC.LIZIZ() && !c45507HtX.LJLLLLLL) {
            c45507HtX.LJLIL.setBackgroundColor(C79045V0n.LJI(R.attr.d4, c45498HtO.LJLJJL).intValue());
            c45507HtX.LJLLLLLL = true;
        }
        if (c45498HtO.LLFF && i == c45498HtO.LLD()) {
            z = true;
        } else {
            z = false;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        int i2 = c45498HtO.LJLLL;
        Long valueOf = Long.valueOf(currentTimeMillis);
        if (valueOf.longValue() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C45533Htx.LIZIZ.add(Long.valueOf(valueOf.longValue()));
        }
        if (C45533Htx.LIZLLL == 0) {
            C45533Htx.LIZLLL = System.currentTimeMillis();
        }
        C45533Htx c45533Htx = C45533Htx.LIZ;
        if (z) {
            if (c45533Htx != null && !C45533Htx.LIZJ && C45533Htx.LJ != 0) {
                C145995oB c145995oB = new C145995oB();
                c145995oB.LIZIZ(System.currentTimeMillis() - C45533Htx.LJ, "duration");
                c145995oB.LIZIZ(C45533Htx.LIZLLL - C45533Htx.LJ, "time_to_first_image");
                c145995oB.LIZ(i2, "local_media_type");
                if (C45533Htx.LJFF) {
                    C45533Htx.LJFF = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                c145995oB.LJ("cold_start", z3);
                c145995oB.LIZ(i, "size");
                GXR.LIZ("tool_performance_loaded_thumbnail_time", c145995oB.LIZ);
                C45533Htx.LIZJ = true;
            }
            if (z) {
                C44298Ha2 c44298Ha2 = G8G.LIZ;
                c44298Ha2.end(OpenAlbumPanelPerformanceMonitor.INSTANCE, "imageLoaded");
                if (c45498HtO.LLF.LJFF.isSoundSync) {
                    c44298Ha2.end("tool_performance_open_album_panel_sound_sync", "imageLoaded");
                }
                if (c45498HtO.LLF.LJFF.isUgcTemplate) {
                    c44298Ha2.end("tool_performance_open_album_panel_ugc_template", "imageLoaded");
                }
                if (c45498HtO.LLF.LJFF.isAutoCutAnchorMode) {
                    c44298Ha2.end("tool_performance_open_album_panel_autocut_anchor", "imageLoaded");
                }
                c45498HtO.LLFF = false;
            }
        }
        if (c45498HtO.LLI) {
            c45498HtO.LLI = false;
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LJI("type", "tool_performance_load_first_img_switching_tab");
            c145995oB2.LIZIZ(System.currentTimeMillis() - j, "totaltime");
            FMX.LJIIL("tool_performance_operation_cost_time", c145995oB2.LIZ);
        }
    }

    public C45470Hsw(C45498HtO c45498HtO, C45507HtX c45507HtX, int i) {
        this.LIZLLL = c45498HtO;
        this.LIZIZ = c45507HtX;
        this.LIZJ = i;
    }
}
