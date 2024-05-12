package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.839, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass839 {
    public final IDR LIZ;

    public AnonymousClass839(IDR panel) {
        o.LJIIIZ(panel, "panel");
        this.LIZ = panel;
    }

    public static boolean LIZIZ(Activity activity, Aweme aweme) {
        if (C00F.LIZ(31744, 0, "interction_share_button_whatsapp_style", true) != 0 || C80Y.LIZ(activity)) {
            return false;
        }
        if ((aweme != null && aweme.isAd()) || !C80X.LJIIJJI(aweme) || C00F.LIZ(31744, 0, "stay_home_share_guide", true) == 0) {
            return false;
        }
        return true;
    }

    public final boolean LIZ(boolean z, Aweme aweme, Activity activity, InterfaceC57312Mt interfaceC57312Mt) {
        boolean showShareStayHomeGuide;
        boolean z2;
        if ((!z || !C227768wm.LJJIIJZLJL(aweme)) && LIZIZ(activity, aweme)) {
            showShareStayHomeGuide = this.LIZ.showShareStayHomeGuide();
        } else {
            showShareStayHomeGuide = false;
        }
        if (interfaceC57312Mt != null && interfaceC57312Mt.LJIJI()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (showShareStayHomeGuide || !C80X.LIZLLL(aweme) || !C80X.LJIIIIZZ(aweme, aweme.getAid(), z2)) {
            return false;
        }
        return true;
    }
}
