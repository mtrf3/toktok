package com.ss.android.ugc.aweme.feed;

import X.C2NU;
import X.C35407Dv1;
import X.C58096Mr6;
import X.C77439UaJ;
import X.C81525Vz7;
import X.C81527Vz9;
import X.C81530VzC;
import X.EF7;
import X.InterfaceC55676LtA;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.api.FeedApi;
import com.ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class FeedApiService implements IFeedApi {
    public static IFeedApi LIZ() {
        Object LIZ = C58096Mr6.LIZ(IFeedApi.class, false);
        if (LIZ != null) {
            return (IFeedApi) LIZ;
        }
        return new FeedApiService();
    }

    @Override // com.ss.android.ugc.aweme.feed.cache.IFeedApi
    public FeedItemList fetchFeedList(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, long j3, InterfaceC55676LtA interfaceC55676LtA, Bundle bundle, Boolean bool, int i5, String str5) {
        boolean z;
        C81527Vz9 c81527Vz9;
        boolean z2 = C35407Dv1.LIZ;
        EF7.LIZIZ();
        boolean z3 = false;
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        boolean z4 = z2 & z;
        if ((i == 1 || i == 0) && i3 != 8) {
            z3 = true;
        }
        if (z4 & z3) {
            c81527Vz9 = new C81527Vz9(C77439UaJ.LIZ());
            if (C35407Dv1.LIZ) {
                C81525Vz7 LIZ = C77439UaJ.LIZ();
                synchronized (LIZ) {
                    if (LIZ.LIZIZ == null) {
                        LIZ.LIZIZ = c81527Vz9;
                    }
                    ((ArrayList) LIZ.LIZ).add(c81527Vz9);
                }
            }
        } else {
            c81527Vz9 = null;
        }
        if (c81527Vz9 != null) {
            try {
                c81527Vz9.LJ();
            } catch (Throwable th) {
                if (th instanceof C81530VzC) {
                    throw th.getRealThrowable();
                }
                throw th;
            }
        }
        try {
            FeedItemList LIZ2 = FeedApi.LIZ(i, j, j2, i2, num, str, i3, i4, str2, str3, str4, interfaceC55676LtA, bundle, bool, i5, str5);
            if (c81527Vz9 != null) {
                c81527Vz9.LIZLLL();
            }
            return LIZ2;
        } catch (Throwable th2) {
            throw new C81530VzC(th2);
        }
    }
}
