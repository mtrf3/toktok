package com.ss.android.ugc.aweme.setting;

import X.C76L;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi;

/* loaded from: classes11.dex */
public final class PromoteEntryCheckServiceImpl implements IPromoteEntryCheckService {
    @Override // com.ss.android.ugc.aweme.setting.IPromoteEntryCheckService
    public final C76L LIZ(String str, long j, String str2) {
        return ((PromoteEntryCheckApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(PromoteEntryCheckApi.class)).getPromoteEntryCheck(str, "video", j, str2);
    }
}
