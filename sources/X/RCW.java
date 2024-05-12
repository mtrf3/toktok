package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.user.UserStore;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RCW {
    public static void LIZ(Activity activity) {
        if (RBW.LJLLI.LJI() && !RCX.LJLJJLL) {
            RCX rcx = RCX.LJLJL;
            boolean z = false;
            if (rcx != null && rcx.isShowing()) {
                return;
            }
            SharedPreferences sharedPreferences = UserStore.LIZLLL;
            String str = "";
            String string = sharedPreferences.getString("mandatory_2sv_nudge_period", "");
            if (string != null) {
                str = string;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (System.currentTimeMillis() > new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime()) {
                z = true;
            } else if (System.currentTimeMillis() - sharedPreferences.getLong("last_show_hpas_dialog_time", 0L) <= 86400000 || !sharedPreferences.getBoolean("mandatory_2sv", false)) {
                return;
            }
            o.LJIIIZ(activity, "activity");
            PopupManager.LJIIL(new C54937LhF((ActivityC45651qj) activity, z));
        }
    }
}
