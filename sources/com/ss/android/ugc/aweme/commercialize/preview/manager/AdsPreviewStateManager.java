package com.ss.android.ugc.aweme.commercialize.preview.manager;

import X.C42952GtQ;
import X.C45336Hqm;
import X.C73318Sq2;
import X.C73849Syb;
import X.C78999UzT;
import X.O60;
import X.O61;
import X.T16;
import Y.AfS62S0100000_10;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.preview.api.AdsPreviewApi;
import java.util.List;

/* loaded from: classes11.dex */
public final class AdsPreviewStateManager implements GenericLifecycleObserver {
    public static List<String> LJLJL;
    public static List<String> LJLJLJ;
    public O61 LJLJI;
    public final C73849Syb<O60> LJLIL = new C73849Syb<>();
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();
    public String LJLJJI = "";
    public String LJLJJL = "";
    public final Keva LJLJJLL = Keva.getRepo("ads_preview_keva");

    public final void LIZ() {
        C78999UzT.LJFF(((AdsPreviewApi) C45336Hqm.LIZIZ(AdsPreviewApi.class, C42952GtQ.LIZ)).sendAdsPreviewRequest(this.LJLJJI, this.LJLJJL).LJIL(new AfS62S0100000_10(this, 8)).LJJL(T16.LIZ()).LJJJLIIL(new AfS62S0100000_10(this, 9), new AfS62S0100000_10(this, 10)), this.LJLILLLLZI);
    }

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

    public final void LIZJ(O60 o60) {
        this.LJLIL.onNext(o60);
    }

    public final void LIZIZ(List<String> list, List<String> list2) {
        boolean z;
        LJLJL = list;
        LJLJLJ = list2;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.LJLJJLL.storeLong("preview_timestamp", System.currentTimeMillis());
            this.LJLJJLL.storeStringArray("preview_adids", (String[]) list.toArray(new String[0]));
        }
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.LJLJJLL.storeLong("preview_timestamp", System.currentTimeMillis());
        this.LJLJJLL.storeStringArray("preview_cids", (String[]) list2.toArray(new String[0]));
    }
}
