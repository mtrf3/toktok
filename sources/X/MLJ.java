package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MLJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Fragment fragment, Intent intent) {
        Context context;
        Intent buildIntent;
        o.LJIIIZ(fragment, "fragment");
        if (intent == null) {
            return;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "label");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "uid");
        intent.putExtra("label", "");
        if (!TextUtils.equals(LLJJIJIIJIL, "follow_request") || (context = fragment.getContext()) == null) {
            return;
        }
        Bundle LIZJ = AnonymousClass036.LIZJ("label", LLJJIJIIJIL, "uid", LLJJIJIIJIL2);
        if (C46604IQu.LIZLLL() || C56630MKk.LIZ()) {
            buildIntent = SmartRouter.buildRoute(context, "aweme://inbox/followers").buildIntent();
        } else {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://follow_request");
            buildRoute.withParam(LIZJ);
            buildIntent = buildRoute.buildIntent();
        }
        C16880lQ.LJII(fragment, buildIntent, 1024);
    }
}
