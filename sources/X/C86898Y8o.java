package X;

import android.view.View;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Y8o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86898Y8o {
    public final AwemePagerVM LIZ;

    public void LIZ(C79236V7w c79236V7w, View view) {
        throw null;
    }

    public void LIZJ(C78856UxA c78856UxA, int i) {
    }

    public void LIZLLL() {
    }

    public void LJ(C79236V7w profileTabData, int i, View view) {
        o.LJIIIZ(profileTabData, "profileTabData");
        o.LJIIIZ(view, "view");
    }

    public C86898Y8o(AwemePagerVM pagerVM) {
        o.LJIIIZ(pagerVM, "pagerVM");
        this.LIZ = pagerVM;
    }

    public static void LIZIZ(View view) {
        TuxAlertBadgeLayout tuxAlertBadgeLayout;
        if (view instanceof C55960Lxk) {
            ((C55960Lxk) view).LIZ();
        } else {
            if (!(view instanceof Y4F) || view == null || (tuxAlertBadgeLayout = (TuxAlertBadgeLayout) view.findViewById(R.id.a0h)) == null) {
                return;
            }
            tuxAlertBadgeLayout.LIZIZ();
        }
    }

    public static void LJII(View view) {
        TuxAlertBadgeLayout tuxAlertBadgeLayout;
        if (view instanceof C55960Lxk) {
            ((C55960Lxk) view).LIZIZ();
        } else {
            if (!(view instanceof Y4F) || view == null || (tuxAlertBadgeLayout = (TuxAlertBadgeLayout) view.findViewById(R.id.ky9)) == null) {
                return;
            }
            tuxAlertBadgeLayout.LIZJ();
        }
    }

    public final void LJFF(View view) {
        Y4F y4f;
        Integer num = this.LIZ.LJLJJI;
        if (num == null || num.intValue() != 1 || !(view instanceof Y4F) || (y4f = (Y4F) view) == null) {
            return;
        }
        y4f.setAdditionalSupportImageResource(R.raw.icon_lock_large_fill);
    }

    public final void LJI(int i, int i2, View view) {
        Y4F y4f;
        Integer num = this.LIZ.LJLJJI;
        if (num == null || num.intValue() != 1 || !(view instanceof Y4F) || (y4f = (Y4F) view) == null) {
            return;
        }
        TuxIconView tuxIconView = y4f.LJLJJI;
        if (tuxIconView != null) {
            C27570Aru.LJIIIZ(tuxIconView, i);
        }
        TuxIconView tuxIconView2 = y4f.LJLJJI;
        if (tuxIconView2 == null) {
            return;
        }
        C27570Aru.LJII(i2, tuxIconView2);
    }
}
