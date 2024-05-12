package X;

import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FV4 implements LUR {
    public static final FV4 LIZ = new FV4();

    @Override // X.LUR
    public final void LIZIZ() {
        C36093EEn c36093EEn = C36093EEn.LIZ;
        X2CFragmentMainPageIcon x2CFragmentMainPageIcon = new X2CFragmentMainPageIcon();
        c36093EEn.getClass();
        X2CFragmentMainPageIcon x2CFragmentMainPageIcon2 = (X2CFragmentMainPageIcon) C36093EEn.LJFF(x2CFragmentMainPageIcon);
        if (x2CFragmentMainPageIcon2 != null) {
            java.util.Map<String, C54113LLp> map = x2CFragmentMainPageIcon2.LJLIL;
            if (map != null) {
                ((ConcurrentHashMap) map).clear();
            }
            x2CFragmentMainPageIcon2.LJLILLLLZI = null;
            x2CFragmentMainPageIcon2.LJLJI = null;
            x2CFragmentMainPageIcon2.LJLJJI = null;
        }
    }

    @Override // X.LUR
    public final void LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C36093EEn.LIZ.getClass();
        C36098EEs c36098EEs = C36093EEn.LJ;
        c36098EEs.getClass();
        ((HashMap) c36098EEs.LIZLLL).put(activity.getClass(), new WeakReference(activity));
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZ(new X2CFragmentMainPageIcon());
        FV5 fv5 = FV5.LIZIZ;
        LJIIIZ.LIZ(fv5.LIZIZ());
        LJIIIZ.LIZ(fv5.LIZ());
        LJIIIZ.LIZJ();
    }
}
