package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility;
import com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService;
import com.ss.android.ugc.aweme.service.protection.TooltipApplicabilityService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class LP1 implements InterfaceC54194LOs {
    public final E67 LIZ;
    public final WeakReference<Context> LIZIZ;
    public InterfaceC82683Wch LIZJ;
    public String LIZLLL = "disallow";

    @Override // X.InterfaceC54194LOs
    public final boolean shouldShow() {
        ActivityC45651qj LJJIFFI;
        NoticeAbility noticeAbility;
        if (!TooltipApplicabilityService.LJII().LJ(this.LIZ)) {
            this.LIZLLL = "disallow";
            LIZJ();
            return false;
        }
        Context context = this.LIZIZ.get();
        Boolean bool = null;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            Fragment Ja = com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).Ja("page_feed");
            if (Ja != null && (noticeAbility = (NoticeAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(Ja, null), NoticeAbility.class, null)) != null) {
                bool = Boolean.valueOf(noticeAbility.gn());
            }
            if (o.LJ(bool, Boolean.FALSE)) {
                this.LIZLLL = "disallow";
                LIZJ();
                return false;
            }
        }
        this.LIZLLL = "allow";
        LIZJ();
        return LIZLLL();
    }

    @Override // X.InterfaceC54194LOs
    public final void LIZIZ(String str) {
        FMX.LJIIL("tooltip_protection_show", LJ(str).LIZ);
    }

    public final C188727au LJ(String str) {
        ITooltipApplicabilityService LJII = TooltipApplicabilityService.LJII();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("scene_id", String.valueOf(this.LIZ.getScene()));
        c188727au.LIZLLL(LJII.LIZJ(), "user_active_days");
        c188727au.LJIIIZ("result", this.LIZLLL);
        c188727au.LIZLLL(LJII.LJI(this.LIZ), "tooltip_unlock_active_day");
        c188727au.LIZLLL(LJII.isNewUser() ? 1 : 0, "is_new_user");
        c188727au.LIZLLL(LJII.LIZ() ? 1 : 0, "is_logged_in");
        c188727au.LIZLLL(LJII.LIZLLL() ? 1 : 0, "is_new_signup_user");
        c188727au.LJIIIZ("tooltip_id", str);
        c188727au.LIZLLL(!LJII.LIZIZ() ? 1 : 0, "protection_test_group");
        return c188727au;
    }

    public final void LJFF(String str) {
        FMX.LJIIL("tooltip_protection_check", LJ(str).LIZ);
    }

    public LP1(E67 e67, WeakReference<Context> weakReference) {
        this.LIZ = e67;
        this.LIZIZ = weakReference;
    }

    public static void LJI(String str, String str2, String str3, String str4, String str5) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("position", str2);
        c188727au.LJIIIZ("content", str3);
        c188727au.LJIIIZ("product_line", str4);
        c188727au.LJIIIZ("sub_type", "");
        c188727au.LJIIIZ("tooltip_id", str5);
        FMX.LJIIL("show_tooltip", c188727au.LIZ);
    }
}
