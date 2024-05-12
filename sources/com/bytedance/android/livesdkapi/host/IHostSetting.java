package com.bytedance.android.livesdkapi.host;

import X.InterfaceC06390Mx;
import X.OSJ;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface IHostSetting extends InterfaceC06390Mx {
    long IF();

    boolean Zi();

    boolean db();

    void deleteUselessExposedVids(String str);

    OSJ<Boolean, Boolean, Integer> eY(String str);

    boolean enableDonationPercentService();

    JSONObject qi();

    void setExposedVids(String str);

    void setExposedVidsByUid(String str);
}
