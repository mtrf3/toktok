package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200997uh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ActivityC45651qj activityC45651qj, Fragment fragment) {
        if (activityC45651qj != null && fragment != null) {
            BottomToastVM bottomToastVM = (BottomToastVM) ViewModelProviders.of(activityC45651qj).get(BottomToastVM.class);
            bottomToastVM.gv0(fragment);
            bottomToastVM.iv0(fragment);
        }
    }

    public static void LIZIZ(C107794Kx event, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(event, "event");
        if (activityC45651qj != null && !activityC45651qj.isFinishing() && !activityC45651qj.isDestroyed()) {
            String str = event.LJLJJI;
            if (str == "now_post" || str == "now_video" || str == "now_invite" || str == "now_others_post" || str == "now_others_video_post" || str == "now_bonus_invite") {
                C31081Jw c31081Jw = new C31081Jw((BottomToastVM) ViewModelProviders.of(activityC45651qj).get(BottomToastVM.class));
                Aweme LJIJI = C4LD.LIZ.LJIJI();
                long j = 0;
                if (LJIJI != null && TextUtils.equals(event.LJLJL, LJIJI.getAid())) {
                    if (!TextUtils.isEmpty(event.LJLJLLL)) {
                        j = 500;
                    }
                    AnonymousClass922.LIZLLL(event, c31081Jw, j, LJIJI);
                    return;
                }
                AnonymousClass922.LIZLLL(event, c31081Jw, 0L, LJIJI);
            }
        }
    }
}
