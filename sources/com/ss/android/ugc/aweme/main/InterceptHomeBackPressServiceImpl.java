package com.ss.android.ugc.aweme.main;

import X.C58096Mr6;
import X.LKH;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InterceptHomeBackPressServiceImpl implements InterceptHomeBackPressService {
    public final ArrayList<LKH> LIZ = new ArrayList<>();

    public static InterceptHomeBackPressService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(InterceptHomeBackPressService.class, false);
        if (LIZ != null) {
            return (InterceptHomeBackPressService) LIZ;
        }
        if (C58096Mr6.B2 == null) {
            synchronized (InterceptHomeBackPressService.class) {
                if (C58096Mr6.B2 == null) {
                    C58096Mr6.B2 = new InterceptHomeBackPressServiceImpl();
                }
            }
        }
        return C58096Mr6.B2;
    }

    @Override // com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService
    public final boolean LIZ() {
        Iterator<LKH> it = this.LIZ.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().LJIIJ() || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService
    public final void LIZIZ(LKH listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.remove(listener);
    }

    @Override // com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService
    public final void LIZJ(LKH listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.add(listener);
    }
}
