package com.ss.android.ugc.aweme.services;

import X.C37090Eh4;
import X.C37091Eh5;
import X.C58096Mr6;
import android.util.Pair;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;

/* loaded from: classes11.dex */
public final class MainServiceHelperImpl implements IMainServiceHelper {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper
    public Pair<Boolean, String> getBoeConfig() {
        Boolean bool;
        C37091Eh5 c37091Eh5 = C37090Eh4.LIZ;
        LocalTestApi localTestApi = c37091Eh5.LIZ;
        String str = null;
        if (localTestApi != null) {
            bool = Boolean.valueOf(localTestApi.enableBoe());
        } else {
            bool = null;
        }
        LocalTestApi localTestApi2 = c37091Eh5.LIZ;
        if (localTestApi2 != null) {
            str = localTestApi2.getBoeLane();
        }
        return new Pair<>(bool, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper
    public Pair<Boolean, String> getPpeConfig() {
        Boolean bool;
        C37091Eh5 c37091Eh5 = C37090Eh4.LIZ;
        LocalTestApi localTestApi = c37091Eh5.LIZ;
        String str = null;
        if (localTestApi != null) {
            bool = Boolean.valueOf(localTestApi.enablePpe());
        } else {
            bool = null;
        }
        LocalTestApi localTestApi2 = c37091Eh5.LIZ;
        if (localTestApi2 != null) {
            str = localTestApi2.getPPELane();
        }
        return new Pair<>(bool, str);
    }

    public static IMainServiceHelper createIMainServiceHelperbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IMainServiceHelper.class, z);
        if (LIZ != null) {
            return (IMainServiceHelper) LIZ;
        }
        if (C58096Mr6.N5 == null) {
            synchronized (IMainServiceHelper.class) {
                if (C58096Mr6.N5 == null) {
                    C58096Mr6.N5 = new MainServiceHelperImpl();
                }
            }
        }
        return C58096Mr6.N5;
    }
}
