package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes8.dex */
public class HH2 implements HF0 {
    public static final int LIZ() {
        User curUser = HG3.LJIILL().getCurUser();
        if (curUser == null) {
            return 0;
        }
        return curUser.getFollowerCount();
    }
}
