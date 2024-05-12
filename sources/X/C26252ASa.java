package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.o;

/* renamed from: X.ASa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26252ASa implements A7O {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.A7O
    public final void LIZ() {
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        FragmentManager childFragmentManager;
        Fragment LJJJIL2;
        ActivityC45651qj activityC45651qj = this.LIZ;
        if (activityC45651qj != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null && (LJJJIL = supportFragmentManager.LJJJIL("ManageFeedsSheet")) != null && (childFragmentManager = LJJJIL.getChildFragmentManager()) != null && (LJJJIL2 = childFragmentManager.LJJJIL("sheet_content_fragment")) != null) {
            ASQ.LJ(LJJJIL2, ASY.LIZ);
        }
    }

    public final void LJFF() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", this.LIZIZ);
        c188727au.LJIIIZ("enter_from", this.LIZJ);
        FMX.LJIIL("manage_feeds_pop_up", c188727au.LIZ);
    }

    @Override // X.A7O
    public final void LIZIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", this.LIZIZ);
        c188727au.LJIIIZ("enter_from", this.LIZJ);
        FMX.LJIIL("close_manage_feeds_pop_up", c188727au.LIZ);
    }

    @Override // X.A7O
    public final void LIZJ(boolean z) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", this.LIZIZ);
        c188727au.LJIIIZ("enter_from", this.LIZJ);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJIIIZ("value", str);
        FMX.LJIIL("switch_personalization_toggle", c188727au.LIZ);
    }

    @Override // X.A7O
    public final void LIZLLL(String link) {
        o.LJIIIZ(link, "link");
    }

    @Override // X.A7O
    public final void LJ(boolean z) {
        String str;
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        FragmentManager childFragmentManager;
        Fragment LJJJIL2;
        ActivityC45651qj activityC45651qj = this.LIZ;
        if (activityC45651qj != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null && (LJJJIL = supportFragmentManager.LJJJIL("ManageFeedsSheet")) != null && (childFragmentManager = LJJJIL.getChildFragmentManager()) != null && (LJJJIL2 = childFragmentManager.LJJJIL("sheet_content_fragment")) != null) {
            ASQ.LJ(LJJJIL2, ASZ.LIZ);
        }
        int i = 1;
        if (z == (!o.LJ(C62889OmD.LJ.getValue(), Boolean.TRUE))) {
            i = 0;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", this.LIZIZ);
        c188727au.LJIIIZ("enter_from", this.LIZJ);
        c188727au.LIZLLL(i, "flag");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJIIIZ("status", str);
        FMX.LJIIL("confirm_personalization_status_change", c188727au.LIZ);
    }

    public C26252ASa(ActivityC45651qj activityC45651qj, String str, String str2) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
