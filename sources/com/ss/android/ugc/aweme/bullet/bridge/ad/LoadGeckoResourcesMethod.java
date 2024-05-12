package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C78886Uxe;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.NHG;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LoadGeckoResourcesMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadGeckoResourcesMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "loadGeckoResources";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (params.has("channels")) {
            JSONArray optJSONArray = params.optJSONArray("channels");
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                o.LJIIIIZZ(optString, "jsonArray.optString(i)");
                arrayList.add(optString);
            }
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI != null) {
                LJJI.LJI();
                NHG.LIZ.LJIILL(null, C78886Uxe.LJJLIIIJL(arrayList));
            }
        }
    }
}
