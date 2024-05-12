package com.ss.android.ugc.aweme.ug.appsflyer;

import X.AbstractC73672Svk;
import X.C76800UCe;
import X.E4Q;
import X.InterfaceC36226EJq;
import X.InterfaceC64988Pey;
import X.InterfaceC64989Pez;

/* loaded from: classes7.dex */
public interface IAppsflyerAttributionApi {
    @InterfaceC36226EJq({"x-metasec-bypass-ttnet-features:1", "x-tt-dataflow-id:AppsflyerClick"})
    @E4Q("/{packageName}?redirect=false")
    AbstractC73672Svk<C76800UCe> reportAppsflyerClick(@InterfaceC64988Pey("packageName") String str, @InterfaceC64989Pez("pid") String str2, @InterfaceC64989Pez("c") String str3, @InterfaceC64989Pez("af_cost_model") String str4, @InterfaceC64989Pez("af_click_lookback") String str5, @InterfaceC64989Pez("advertising_id") String str6);
}
