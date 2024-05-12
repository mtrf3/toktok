package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.SearchStartProxyFragment;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.KBk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51300KBk {
    public static void LIZ(Context context, SearchResultParam param, C50948Jz6 c50948Jz6, Bundle bundle, C50652JuK c50652JuK, RouteIntent routeIntent) {
        Boolean bool;
        Intent extra;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        Intent intent = new Intent();
        intent.putExtra("searchParam", param);
        intent.putExtra("search_enter_param", c50948Jz6);
        intent.putExtra("search_context_source", c50652JuK);
        intent.setClass(context, SearchResultActivity.class);
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            bool = Boolean.valueOf(extra.getBooleanExtra("intent_from_publish", false));
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            intent.addFlags(routeIntent.getExtra().getFlags());
            intent.putExtra("intent_from_publish", bool.booleanValue());
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (context instanceof ActivityC45651qj) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) context;
            Fragment LJJJIL = activityC45651qj.getSupportFragmentManager().LJJJIL("SearchStartProxyFragment");
            int i = 1;
            if (LJJJIL == null) {
                LJJJIL = new SearchStartProxyFragment();
                FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
                C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                LIZ.LJIIIIZZ(0, 1, LJJJIL, "SearchStartProxyFragment");
                LIZ.LJII();
            }
            if (!LJJJIL.isAdded()) {
                return;
            }
            if (LJJJIL instanceof SearchStartProxyFragment) {
                ((SearchStartProxyFragment) LJJJIL).LJLIL = routeIntent;
                if (routeIntent != null && routeIntent.hasRequestCode()) {
                    i = routeIntent.getRequestCode();
                }
            }
            if (bundle != null && Build.VERSION.SDK_INT < 30) {
                if (C51302KBm.LIZ(intent)) {
                    C16880lQ.LJII(LJJJIL, intent, i);
                    return;
                } else {
                    C78598Ut0.LJIJJ(intent, LJJJIL);
                    LJJJIL.startActivityForResult(intent, i, bundle);
                    return;
                }
            }
            C16880lQ.LJII(LJJJIL, intent, i);
            return;
        }
        if (bundle != null && Build.VERSION.SDK_INT < 30) {
            if (C51302KBm.LIZ(intent) || K07.LIZ(intent)) {
                C16880lQ.LIZJ(context, intent);
                return;
            } else {
                C78598Ut0.LJIJJ(intent, context);
                context.startActivity(intent, bundle);
                return;
            }
        }
        C16880lQ.LIZJ(context, intent);
    }
}
