package com.ss.android.ugc.aweme.compliance.business.hideaccount;

import X.AbstractC73672Svk;
import X.C25559A1j;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface HideAccountApi {
    public static final C25559A1j LIZ = C25559A1j.LIZ;

    @E4Q("/aweme/v1/hide/list/")
    AbstractC73672Svk<HiddenAccountsResponse> fetchHiddenAccounts(@InterfaceC64989Pez("page_token") String str, @InterfaceC64989Pez("count") int i);

    @E4Q("/aweme/v1/hide/open/")
    AbstractC73672Svk<BaseResponse> hideAccount(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("source") String str2);

    @E4Q("/aweme/v1/hide/close/")
    AbstractC73672Svk<BaseResponse> unHideAccount(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("source") String str2);
}
