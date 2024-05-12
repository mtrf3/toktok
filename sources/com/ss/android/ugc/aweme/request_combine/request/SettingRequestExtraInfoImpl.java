package com.ss.android.ugc.aweme.request_combine.request;

import X.C10K;
import X.C58096Mr6;
import X.EIE;
import Y.ACallableS83S0200000_6;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class SettingRequestExtraInfoImpl implements ISettingRequestExtraInfo {
    public final List<EIE> LIZ = new ArrayList();

    public static ISettingRequestExtraInfo LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ISettingRequestExtraInfo.class, false);
        if (LIZ != null) {
            return (ISettingRequestExtraInfo) LIZ;
        }
        if (C58096Mr6.B4 == null) {
            synchronized (ISettingRequestExtraInfo.class) {
                if (C58096Mr6.B4 == null) {
                    C58096Mr6.B4 = new SettingRequestExtraInfoImpl();
                }
            }
        }
        return C58096Mr6.B4;
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo
    public final void LIZ(EIE eie) {
        if (!((ArrayList) this.LIZ).contains(eie)) {
            ((ArrayList) this.LIZ).add(eie);
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo
    public final void LIZIZ(Map<String, String> map) {
        C10K.LIZJ(new ACallableS83S0200000_6(this, map, 6));
    }
}
