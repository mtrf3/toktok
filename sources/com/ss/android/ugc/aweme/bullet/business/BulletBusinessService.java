package com.ss.android.ugc.aweme.bullet.business;

import X.N5S;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BulletBusinessService {
    public final N5S LIZ;
    public final HashMap<Class<?>, Business> LIZIZ;

    /* loaded from: classes11.dex */
    public static class Business {
        public final N5S LIZ;

        public Business(N5S bulletBusiness) {
            o.LJIIIZ(bulletBusiness, "bulletBusiness");
            this.LIZ = bulletBusiness;
        }
    }

    public BulletBusinessService(N5S bulletBusiness) {
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.LIZ = bulletBusiness;
        this.LIZIZ = new HashMap<>();
    }
}
