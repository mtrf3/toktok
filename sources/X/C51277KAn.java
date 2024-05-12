package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* renamed from: X.KAn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51277KAn {
    public static void LIZ(Context context, SearchResultParam searchResultParam, C50948Jz6 c50948Jz6, Bundle bundle, C50652JuK c50652JuK, RouteIntent routeIntent) {
        o.LJIIIZ(context, "context");
        Intent intent = new Intent();
        intent.putExtra("searchParam", searchResultParam);
        intent.putExtra("search_enter_param", c50948Jz6);
        intent.putExtra("search_context_source", c50652JuK);
        intent.setClass(context, EcSearchResultActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (context instanceof ActivityC45651qj) {
            C51301KBl.LIZ((ActivityC45651qj) context, intent, bundle, routeIntent);
            return;
        }
        if (bundle != null && Build.VERSION.SDK_INT < 30) {
            if (KBH.LIZ(intent) || K08.LIZ(intent)) {
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
