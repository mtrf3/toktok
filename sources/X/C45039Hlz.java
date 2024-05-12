package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AqS170S0100000_4;

/* renamed from: X.Hlz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45039Hlz implements C5UD {
    public static final boolean LIZLLL() {
        C3GQ.LIZ().getClass();
        return false;
    }

    public static final boolean LJ() {
        for (Activity activity : ActivityStack.getActivityStack()) {
            if (activity instanceof MainActivity) {
                return true;
            }
        }
        return false;
    }

    public static final ActivityC45651qj LIZIZ(ActivityC45651qj activityC45651qj, boolean z) {
        if (activityC45651qj.getClass() == MainActivity.class) {
            return activityC45651qj;
        }
        for (Activity activity : ActivityStack.getActivityStack()) {
            if (activity.getClass() == MainActivity.class) {
                return (ActivityC45651qj) activity;
            }
        }
        if (z) {
            return activityC45651qj;
        }
        return null;
    }

    public static final void LIZJ(ActivityC45651qj activityC45651qj, OSZ<String, Music> osz) {
        Fragment mv0;
        com.bytedance.hox.Hox.kv0(activityC45651qj).Cv0(new Bundle(), "USER");
        if (C53765L8f.LJIIJJI() && LKR.LIZJ(activityC45651qj, "USER")) {
            mv0 = com.bytedance.hox.Hox.kv0(activityC45651qj).Ja("USER");
        } else {
            mv0 = C116694i1.LIZ(activityC45651qj).mv0();
        }
        if (mv0 != null) {
            ProfileViewModel LIZ = AFB.LIZ(mv0);
            if (osz != null) {
                LIZ.setState(new AqS170S0100000_4(osz, (OSZ<String, ? extends Music>) 956));
            } else {
                LIZ.setState(AMU.LJLIL);
            }
        }
    }
}
