package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.7IH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7IH {
    public final AvoidOnResultFragment LIZ;

    public C7IH(ActivityC45651qj activityC45651qj) {
        AvoidOnResultFragment avoidOnResultFragment;
        if (activityC45651qj != null) {
            Fragment LJJJIL = activityC45651qj.getSupportFragmentManager().LJJJIL("AvoidOnResult");
            if (LJJJIL == null || (avoidOnResultFragment = (AvoidOnResultFragment) LJJJIL) == null) {
                avoidOnResultFragment = new AvoidOnResultFragment();
                FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIIIZZ(0, 1, avoidOnResultFragment, "AvoidOnResult");
                c1b3.LJI();
                supportFragmentManager.LJJIL();
            }
            this.LIZ = avoidOnResultFragment;
        }
    }
}
