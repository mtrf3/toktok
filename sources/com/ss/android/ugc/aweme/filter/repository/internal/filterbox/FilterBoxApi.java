package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import X.AbstractC73638SvC;
import X.C65434PmA;
import X.E4Q;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* loaded from: classes15.dex */
public interface FilterBoxApi {
    @E4Q("effect/api/filterbox/list")
    AbstractC73638SvC<C65434PmA> listFilterBox(@InterfaceC64989Pez("access_key") String str, @InterfaceC64989Pez("sdk_version") String str2, @InterfaceC64989Pez("app_version") String str3, @InterfaceC64989Pez("region") String str4, @InterfaceC64989Pez("panel") String str5);

    @E4T("effect/api/filterbox/update")
    AbstractC73638SvC<BaseNetResponse> updateFilterBox(@InterfaceC27211Am7 UpdateFilterBoxBody updateFilterBoxBody);
}
