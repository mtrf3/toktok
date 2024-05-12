package com.ss.android.ugc.aweme.live.hostbusiness;

import X.BJL;
import X.C29054Bak;
import X.C58655N0h;
import X.C58704N2e;
import X.C59050NFm;
import X.C59411NTj;
import X.C75792yF;
import Y.AObjectS47S0101000_2;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdLiveHelperService implements IAdLiveHelperService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.business.IAdLiveHelperService
    public final void Df0(Uri uri, EnterRoomConfig enterRoomConfig) {
        AdLiveEnterRoomConfig adLiveEnterRoomConfig;
        String str;
        o.LJIIIZ(uri, "uri");
        try {
            String queryParameter = UriProtector.getQueryParameter(uri, "adLiveJson");
            if (queryParameter != null && (str = (adLiveEnterRoomConfig = (AdLiveEnterRoomConfig) C75792yF.LIZ(queryParameter, AdLiveEnterRoomConfig.class)).creativeId) != null && str.length() != 0) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                roomsData.adLiveEnterRoomConfig = adLiveEnterRoomConfig;
                boolean z = adLiveEnterRoomConfig.enterFromAd;
                roomsData.enterFromAd = z;
                if (z) {
                    C59411NTj.LIZIZ.LJIIIIZZ();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.android.livesdkapi.business.IAdLiveHelperService
    public final void Pu0(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, long j) {
        o.LJIIIZ(context, "context");
        C59050NFm.LIZIZ.LJFF(context, adLiveEnterRoomConfig, String.valueOf(j));
    }

    @Override // com.bytedance.android.livesdkapi.business.IAdLiveHelperService
    public final void Tg0(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, AObjectS47S0101000_2 aObjectS47S0101000_2) {
        o.LJIIIZ(context, "context");
        C59050NFm.LIZIZ.LJIIIZ(context, adLiveEnterRoomConfig, aObjectS47S0101000_2, aObjectS47S0101000_2);
    }

    @Override // com.bytedance.android.livesdkapi.business.IAdLiveHelperService
    public final void ik(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        AdLiveEnterRoomConfig adLiveEnterRoomConfig;
        String str3;
        BJL bjl = (BJL) DataChannelGlobal.LJLJJI.mv0(C29054Bak.class);
        if (bjl == null || (adLiveEnterRoomConfig = bjl.LJJIIZI) == null || (str3 = adLiveEnterRoomConfig.creativeId) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> LIZ = adLiveEnterRoomConfig.LIZ();
        C58655N0h LJ = C58704N2e.LJ(str, str2, str3, adLiveEnterRoomConfig.logExtra, adLiveEnterRoomConfig.groupId);
        LJ.LIZLLL(map);
        LJ.LIZ(map2);
        LJ.LIZLLL(linkedHashMap);
        LJ.LIZ(LIZ);
        LJ.LJI();
    }
}
