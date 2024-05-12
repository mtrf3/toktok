package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.HbM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44380HbM implements InterfaceC82230WPa {
    public static final C44380HbM LIZ = new C44380HbM();

    @Override // X.InterfaceC82230WPa
    public final void LIZ(long j, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", i0.LJFF("tool_performance_sort_", str));
        c188727au.LJ(j, "totaltime");
        FMX.LJIIL("tool_performance_operation_cost_time", c188727au.LIZ);
    }

    @Override // X.InterfaceC82230WPa
    public final void LIZLLL(String str, boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, str);
        c188727au.LIZLLL(z ? 1 : 0, "isUiNull");
        FMX.LJIIL("filter_panel_ui_blank", c188727au.LIZ);
    }

    @Override // X.InterfaceC82230WPa
    public final void LJ(String str, String tab, String enterFrom, boolean z) {
        o.LJIIIZ(tab, "tab");
        o.LJIIIZ(enterFrom, "enterFrom");
        LIZIZ(z, str, null, tab, enterFrom);
    }

    @Override // X.InterfaceC82230WPa
    public final void LIZIZ(boolean z, String str, Throwable th, String tab, String enterFrom) {
        String str2;
        String str3;
        o.LJIIIZ(tab, "tab");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (C48331Ixz.LJ() || C48331Ixz.LIZLLL()) {
            C188727au c188727au = new C188727au();
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("status", str2);
            c188727au.LJIIIZ("enter_from", enterFrom);
            c188727au.LJIIIZ(WM7.SCENE_SERVICE, str);
            c188727au.LJIIIZ("tab", tab);
            if (z) {
                str3 = "";
            } else if (th == null || (str3 = th.getMessage()) == null) {
                str3 = "empty_error_msg";
            }
            c188727au.LJIIIZ("error_msg", str3);
            FMX.LJIIL("tool_performance_resource_request", c188727au.LIZ);
        }
    }

    @Override // X.InterfaceC82230WPa
    public final void LIZJ(String str, float f, float f2, int i, boolean z) {
        C188727au LIZLLL = KNV.LIZLLL(str, WM7.SCENE_SERVICE);
        LIZLLL.LJIIIZ(WM7.SCENE_SERVICE, str);
        LIZLLL.LIZIZ(f, "fps");
        LIZLLL.LIZIZ(f2, "duration");
        LIZLLL.LIZLLL(i, "total_frame");
        LIZLLL.LIZLLL(z ? 1 : 0, "is_first");
        FMX.LJIIL("tool_performance_fps_info", LIZLLL.LIZ);
    }
}
