package com.ss.android.ugc.aweme.nows.service;

import X.C193697iv;
import com.ss.android.ugc.aweme.service.INowLimitService;

/* loaded from: classes4.dex */
public final class NowLimitService implements INowLimitService {
    @Override // com.ss.android.ugc.aweme.service.INowLimitService
    public final boolean LIZ() {
        return C193697iv.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.service.INowLimitService
    public final boolean LIZIZ() {
        return C193697iv.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.INowLimitService
    public final boolean LIZJ() {
        if (C193697iv.LJI() || C193697iv.LJFF() || C193697iv.LJII()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.INowLimitService
    public final boolean LIZLLL() {
        return C193697iv.LJII();
    }
}
