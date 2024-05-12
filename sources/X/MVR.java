package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MVR {
    public static final int LIZ = C17N.LJIILL(10.0d);

    public static void LIZLLL(Context context) {
        Intent intent;
        if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null && intent.getBooleanExtra("from_notification", false)) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "rule_id");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            if (!TextUtils.isEmpty(LLJJIJIIJIL)) {
                LogHelperImpl.LJIIIIZZ().LJ(LLJJIJIIJIL);
            }
        }
    }

    public static void LJ(View view) {
        view.setBackground(C04270Et.LIZIZ(view.getContext(), R.drawable.ye));
    }

    public static String LIZIZ(User user, boolean z) {
        if (user != null) {
            return C56331M8x.LIZIZ(user, true, z);
        }
        return "";
    }

    public static void LIZJ(Context context, int i) {
        Intent intent;
        if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null && intent.getBooleanExtra("from_notification", false)) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "rule_id");
            if (!TextUtils.isEmpty(LLJJIJIIJIL)) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("action_type", "click");
                c188727au.LJIIIZ("account_type", "fans");
                c188727au.LJIIIZ("client_order", String.valueOf(i));
                c188727au.LJIIIZ("rule_id", LLJJIJIIJIL);
                FMX.LJIIL("enter_personal_detail_backup_from_push", c188727au.LIZ);
            }
        }
    }

    public static void LIZ(View view, MVP type, float f) {
        o.LJIIIZ(type, "type");
        if (view == null) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        int i = MVQ.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C78897Uxp.LJJJJLI(view, null);
                return;
            } else {
                if (f <= 0.0f) {
                    f = C32151Nz.LJIIZILJ(28);
                }
                C78897Uxp.LJJJJL(view, f);
                return;
            }
        }
        view.setOnTouchListener(new MVS(c68322mC, f));
    }
}
