package com.ss.android.ugc.trill.share.api;

import X.E8L;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ShareApi {
    public static final ShareService LIZ = (ShareService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(ShareService.class);

    /* loaded from: classes8.dex */
    public interface ShareService {
        @E8L("/aweme/v1/thrid/platform/share/")
        InterfaceC37276Ek4<AutoShare> autoShare(@InterfaceC36228EJs Map<String, String> map);
    }
}
