package com.ss.android.ugc.aweme.ecomsearch.ui;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.RouteIntent;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class EcSearchStartProxyFragment extends Fragment {
    public static final /* synthetic */ int LJLJI = 0;
    public RouteIntent LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
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
