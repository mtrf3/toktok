package X;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AUA {
    public static boolean LJI;
    public final Activity LIZ;
    public final View LIZIZ;
    public User LIZJ;
    public final C86184Xs4 LIZLLL;
    public final AUC LJ;
    public final APR LJFF;

    public final void LIZ() {
        VA9 va9;
        Animatable LIZ;
        if (!this.LIZ.isFinishing()) {
            APR apr = this.LJFF;
            if (apr != null) {
                apr.LJFF();
            }
            View view = this.LIZIZ;
            if (!(view instanceof C119624mk) || (va9 = (VA9) view) == null || va9.getController() == null || (LIZ = va9.getController().LIZ()) == null || !LIZ.isRunning()) {
                return;
            }
            LIZ.stop();
        }
    }

    public AUA(Activity activity, View originImage, C86184Xs4 c86184Xs4, User user, String str) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originImage, "originImage");
        this.LIZ = activity;
        this.LIZIZ = originImage;
        this.LIZJ = user;
        this.LIZLLL = c86184Xs4;
        AUC auc = new AUC(this);
        this.LJ = auc;
        DialogC72721SgP LJIILL = C4LD.LIZ.LJIILL(user, activity, auc, str);
        if (LJIILL != null) {
            LJIILL.LJLZ = new AqS154S0100000_4(this, 665);
        }
        this.LJFF = LJIILL;
    }
}
