package X;

import Y.AgS123S0100000_6;
import android.content.Context;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;

/* renamed from: X.EMe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36292EMe {
    public static final C36292EMe LIZIZ = new C36292EMe();
    public final LiveSDKSettingApi LIZ;

    public C36292EMe() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(Live.getLiveDomain());
        this.LIZ = (LiveSDKSettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(X1D.LIZIZ(LIZ)).create(LiveSDKSettingApi.class);
    }

    public final void LIZ(Context context) {
        HashMap hashMap = new HashMap();
        INetworkService iNetworkService = (INetworkService) CN1.LIZ(INetworkService.class);
        if (iNetworkService != null) {
            iNetworkService.fl(hashMap);
        }
        this.LIZ.querySettings(hashMap).LIZLLL(new AgS123S0100000_6(context, 26));
    }
}
