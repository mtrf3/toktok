package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.GKE;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AdChoiceViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<Object> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<Object> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<GKE> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJL = new MutableLiveData<>();

    public static void gv0(Context context, String url) {
        o.LJIIIZ(url, "url");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview/");
        buildRoute.withParam("url", url);
        buildRoute.open();
    }
}
