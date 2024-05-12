package com.bytedance.android.livesdkapi.business;

import X.InterfaceC06390Mx;
import Y.AObjectS47S0101000_2;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IAdLiveHelperService extends InterfaceC06390Mx {
    void Df0(Uri uri, EnterRoomConfig enterRoomConfig);

    void Pu0(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, long j);

    void Tg0(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, AObjectS47S0101000_2 aObjectS47S0101000_2);

    void ik(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2);
}
