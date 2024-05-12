package com.ss.android.ugc.aweme.search.entry.core.viewmodel;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.router.RouteIntent;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class SearchStartProxyFragment extends Fragment {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public RouteIntent LJLIL;

    public SearchStartProxyFragment() {
        new LinkedHashMap();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        RouteIntent routeIntent = this.LJLIL;
        if (routeIntent != null && routeIntent.getOnActivityResultCallback() != null) {
            RouteIntent routeIntent2 = this.LJLIL;
            if (routeIntent2 != null) {
                routeIntent2.getOnActivityResultCallback().onActivityResult(i, i2, intent);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }
}
