package com.ss.android.ugc.aweme.app.accountsdk;

import X.C1FO;
import X.C40530FvS;
import X.C58110MrK;
import X.C58725N2z;
import com.ss.android.ugc.aweme.IAccountInitializer;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import defpackage.g0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class AccountInitializer implements IAccountInitializer {
    @Override // com.ss.android.ugc.aweme.IAccountInitializer
    public final void LIZ(AwemeHostApplication awemeHostApplication) {
        C1FO c1fo = new C1FO();
        C40530FvS c40530FvS = new C40530FvS();
        new g0();
        C58110MrK c58110MrK = new C58110MrK();
        C58725N2z.LIZ = awemeHostApplication;
        C58725N2z.LIZIZ = c1fo;
        C58725N2z.LIZJ = c40530FvS;
        C58725N2z.LIZLLL = new ConcurrentHashMap<>();
        C58725N2z.LJ = c58110MrK;
    }
}
