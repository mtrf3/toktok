package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.TOr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74577TOr implements InterfaceC83485Wpd {
    public final ShortVideoContext LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public String LJ;
    public int LJFF;

    @Override // X.InterfaceC83485Wpd
    public final void LJIJJ() {
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJJI() {
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJJIII(String str) {
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJJIIJ(String str, String str2) {
    }

    @Override // X.InterfaceC83485Wpd
    public final void onComplete(String str) {
    }

    public final String LIZ() {
        String sessionId;
        String str;
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext == null || (sessionId = shortVideoContext.creativeInfo.getSessionId()) == null || sessionId.length() == 0) {
            this.LIZLLL = AnonymousClass629.LIZ("randomUUID().toString()");
        } else {
            ShortVideoContext shortVideoContext2 = this.LIZ;
            if (shortVideoContext2 == null || (str = shortVideoContext2.creativeInfo.getSessionId()) == null) {
                str = "";
            }
            this.LIZLLL = str;
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC83485Wpd
    public final String LJIIZILJ() {
        String LJI;
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext == null || (LJI = shortVideoContext.LJI()) == null) {
            String str = this.LIZIZ;
            if (str == null) {
                return "";
            }
            return str;
        }
        return LJI;
    }

    @Override // X.InterfaceC83485Wpd
    public final int LJJ() {
        return C00F.LIZ(31744, 100, "green_screen_tray_material_experiment", true);
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJJIIJZLJL() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIZILJ());
        c145995oB.LJI("tab_name", "giphy");
        c145995oB.LJI("enter_from", "video_shoot_page");
        FMX.LJIIL("click_gif_button", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJJIIZ() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIZILJ());
        c145995oB.LJI("enter_method", "click");
        c145995oB.LJI("enter_from", "tiktok_avatar_effect_intro_show");
        FMX.LJIIL("click_greenscreen_thumbnail", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83485Wpd
    public final String getShootWay() {
        String str;
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext == null || (str = shortVideoContext.shootWay) == null) {
            String str2 = this.LIZJ;
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        return str;
    }

    public C74577TOr(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
        this.LIZLLL = "";
        this.LJ = "";
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJIJ(java.util.Map map) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJFF(map);
        FMX.LJIIL("tool_performance_effects_image_tray", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJIL(String keyword) {
        String str;
        o.LJIIIZ(keyword, "keyword");
        C145995oB c145995oB = new C145995oB();
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext != null) {
            str = shortVideoContext.fromPropId;
        } else {
            str = null;
        }
        c145995oB.LJI("prop_id", str);
        c145995oB.LJI("creation_id", LJIIZILJ());
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("search_keyword", keyword);
        FMX.LJIIL("search_gif", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJJIIZI(C74578TOs c74578TOs) {
        String str = c74578TOs.LIZ;
        String str2 = c74578TOs.LIZIZ;
        String str3 = c74578TOs.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        LJJIFFI(str, str2, str3);
    }

    public C74577TOr(String str, String str2) {
        this(null);
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJJII(String str, boolean z) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIZILJ());
        c145995oB.LJI("prop_id", str);
        c145995oB.LIZ(z ? 1 : 0, "giphy_show");
        FMX.LJIIL("show_media_tray", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJIJI(int i, String str, String str2) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIZILJ());
        c145995oB.LIZ(i, "duration");
        c145995oB.LJI("load_type", str);
        c145995oB.LJI("search_keyword", str2);
        c145995oB.LIZ(1, "is_success");
        FMX.LJIIL("load_gif_results", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83485Wpd
    public final void LJJIFFI(String str, String str2, String str3) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIZILJ());
        c145995oB.LJI("giphy_id", str);
        c145995oB.LJI("prop_id", str2);
        c145995oB.LJI("tab_name", str3);
        FMX.LJIIL("choose_gif_content", c145995oB.LIZ);
    }
}
