package com.ss.android.ugc.aweme.di;

import X.C58096Mr6;
import X.NO5;
import X.OCA;
import X.OCB;
import android.content.Context;
import com.ss.android.ugc.aweme.main.service.ICommerceService;

/* loaded from: classes11.dex */
public class CommerceServiceImpl implements ICommerceService {
    public final OCA LIZ = OCB.LIZ;

    public static ICommerceService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceService.class, false);
        if (LIZ != null) {
            return (ICommerceService) LIZ;
        }
        if (C58096Mr6.t == null) {
            synchronized (ICommerceService.class) {
                if (C58096Mr6.t == null) {
                    C58096Mr6.t = new CommerceServiceImpl();
                }
            }
        }
        return C58096Mr6.t;
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final void LIZIZ() {
        this.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final boolean LIZ(Context context, String str) {
        this.LIZ.getClass();
        return NO5.LJI(context, str, false);
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final boolean openAdWebUrl(Context context, String str, String str2) {
        this.LIZ.getClass();
        return NO5.LJII(context, str, str2);
    }
}
