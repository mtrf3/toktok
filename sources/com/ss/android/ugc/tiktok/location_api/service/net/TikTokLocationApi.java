package com.ss.android.ugc.tiktok.location_api.service.net;

import X.C36922EeM;
import X.C64797Pbt;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import android.text.TextUtils;
import com.bytedance.bdlocation.network.ICustomNetworkApi;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class TikTokLocationApi implements ICustomNetworkApi {
    public static final TikTokLocationApi LIZ = new TikTokLocationApi();

    /* loaded from: classes7.dex */
    public interface RealApi {
        @E8M
        InterfaceC37276Ek4<String> doPostJson(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list, @InterfaceC30951CCt boolean z);
    }

    @Override // com.bytedance.bdlocation.network.ICustomNetworkApi
    public final C64797Pbt<String> doPost(String str, String str2, Map<String, String> map, Map<String, String> map2, List<EJ6> list, boolean z) {
        return null;
    }

    @Override // com.bytedance.bdlocation.network.ICustomNetworkApi
    public final String doPostJson(String str, String str2, Map<String, String> map, TypedOutput typedOutput, List<EJ6> list, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C36922EeM.LIZLLL(2, "TikTokLocationApi", "baseUrl or relativePath is null or empty");
            return null;
        }
        if (str != null) {
            try {
                RealApi realApi = (RealApi) RetrofitFactory.LIZLLL().create(str).create(RealApi.class);
                if (str2 != null) {
                    return realApi.doPostJson(-1, str2, map, typedOutput, list, z).execute().LIZIZ;
                }
            } catch (Exception e) {
                C36922EeM.LJFF(e);
            }
        }
        return null;
    }
}
