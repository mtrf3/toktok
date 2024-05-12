package com.ss.android.ugc.aweme.services;

import X.C2NR;
import X.C65734Pr0;
import X.InterfaceC65753PrJ;
import X.R47;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes12.dex */
public class ProAccountService extends BaseProAccountService {
    @Override // com.ss.android.ugc.aweme.services.BaseProAccountService, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseProAccountService
    public void switchBusinessAccount(String str, final R47 r47) {
        super.switchBusinessAccount(str, r47);
        C65734Pr0.LLLLZ(AccountApiInModule.LIZIZ.switchBusinessAccount(str), new InterfaceC65753PrJ<BaseResponse>() { // from class: com.ss.android.ugc.aweme.services.ProAccountService.2
            @Override // X.InterfaceC65753PrJ
            public void onFailure(Throwable th) {
                R47 r472 = r47;
                if (r472 == null) {
                    return;
                }
                r472.onResult(14, 3, null);
            }

            @Override // X.InterfaceC65753PrJ
            public void onSuccess(BaseResponse baseResponse) {
                R47 r472 = r47;
                if (r472 == null) {
                    return;
                }
                if (baseResponse != null && baseResponse.status_code == 0) {
                    r472.onResult(14, 1, null);
                } else {
                    r472.onResult(14, 3, null);
                }
            }
        }, C2NR.LJLILLLLZI);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseProAccountService, X.R48
    public void switchProAccount(int i, String str, String str2, int i2, final R47 r47) {
        super.switchProAccount(i, str, str2, i2, r47);
        C65734Pr0.LLLLZ(AccountApiInModule.LIZIZ.switchProAccount(i, str, str2, i2), new InterfaceC65753PrJ<BaseResponse>() { // from class: com.ss.android.ugc.aweme.services.ProAccountService.1
            @Override // X.InterfaceC65753PrJ
            public void onFailure(Throwable th) {
                R47 r472 = r47;
                if (r472 == null) {
                    return;
                }
                r472.onResult(14, 3, null);
            }

            @Override // X.InterfaceC65753PrJ
            public void onSuccess(BaseResponse baseResponse) {
                R47 r472 = r47;
                if (r472 == null) {
                    return;
                }
                if (baseResponse != null && baseResponse.status_code == 0) {
                    r472.onResult(14, 1, null);
                } else {
                    r472.onResult(14, 3, null);
                }
            }
        }, C2NR.LJLILLLLZI);
    }
}
