package com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.log;

import X.C188727au;
import X.C73318Sq2;
import X.C73849Syb;
import X.C78920UyC;
import X.FMX;
import android.net.Uri;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes8.dex */
public final class PdpLogHelper implements GenericLifecycleObserver {
    public final C73849Syb<Integer> LJLIL = new C73849Syb<>();
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void dispose() {
        this.LJLILLLLZI.dispose();
    }

    public static void LIZ(int i, long j) {
        String str;
        String queryParameter;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - j)) / 1000.0f;
        C188727au LIZJ = C78920UyC.LIZJ(i, "success");
        LIZJ.LJIIIZ("load_time", String.valueOf(currentTimeMillis));
        LIZJ.LJIIIZ("schema_url", "");
        Uri parse = UriProtector.parse(null);
        if (parse != null) {
            str = UriProtector.getQueryParameter(parse, "channel");
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            LIZJ.LJI("channel", str);
        }
        Uri parse2 = UriProtector.parse(null);
        if (parse2 != null && (queryParameter = UriProtector.getQueryParameter(parse2, "bundle")) != null && queryParameter.length() != 0 && queryParameter != null) {
            LIZJ.LJI("bundle", queryParameter);
        }
        FMX.LJIIL("ttmp_oc_anchor_pdp_load", LIZJ.LIZ);
    }
}
