package com.ss.android.ugc.aweme;

import X.C58096Mr6;
import X.Z8A;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes10.dex */
public class PreloadApiServiceImpl implements IPreloadApiService {
    public static IPreloadApiService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IPreloadApiService.class, false);
        if (LIZ != null) {
            return (IPreloadApiService) LIZ;
        }
        if (C58096Mr6.LJJLIIIJLJLI == null) {
            synchronized (IPreloadApiService.class) {
                if (C58096Mr6.LJJLIIIJLJLI == null) {
                    C58096Mr6.LJJLIIIJLJLI = new PreloadApiServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJLIIIJLJLI;
    }

    @Override // com.ss.android.ugc.aweme.IPreloadApiService
    public final void LIZIZ(Aweme aweme, String str) {
        Z8A z8a = Z8A.LIZIZ;
        z8a.queryUserResponse(z8a.userUrl(null, aweme.getAuthorUid(), null, 0), true, str);
    }

    @Override // com.ss.android.ugc.aweme.IPreloadApiService
    public final void LIZ(String str, String str2, String str3) {
        Z8A.LIZIZ.queryAwemeWithID(true, str, str2, 0, 0L, 20, str3, 0, 0);
    }
}
