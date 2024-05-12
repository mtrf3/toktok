package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;

/* renamed from: X.49E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49E {
    public static final C5H3<C49E> LJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C49F.LJLIL);
    public boolean LIZ;
    public boolean LIZJ;
    public boolean LIZIZ = true;
    public boolean LIZLLL = true;

    public static boolean LIZ(Activity activity) {
        ActivityC45651qj activityC45651qj;
        MainBusinessAbility mainBusinessAbility;
        String str = null;
        if (activity instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) activity;
        } else {
            activityC45651qj = null;
        }
        if (activityC45651qj == null || (mainBusinessAbility = (MainBusinessAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), MainBusinessAbility.class, null)) == null || !mainBusinessAbility.s90()) {
            if (activity != null) {
                str = activity.getLocalClassName();
            }
            if (!TextUtils.equals(str, "com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity")) {
                return false;
            }
        }
        return true;
    }
}
