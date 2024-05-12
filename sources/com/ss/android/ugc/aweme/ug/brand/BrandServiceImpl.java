package com.ss.android.ugc.aweme.ug.brand;

import X.C0YP;
import X.C40362Fsk;
import X.C58096Mr6;
import X.EF7;
import X.FFL;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BrandServiceImpl implements IBrandService {
    public static IBrandService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IBrandService.class, false);
        if (LIZ != null) {
            return (IBrandService) LIZ;
        }
        if (C58096Mr6.O7 == null) {
            synchronized (IBrandService.class) {
                if (C58096Mr6.O7 == null) {
                    C58096Mr6.O7 = new BrandServiceImpl();
                }
            }
        }
        return C58096Mr6.O7;
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.IBrandService
    public final boolean LIZ() {
        if (C40362Fsk.LIZ() && C40362Fsk.LIZIZ(EF7.LIZIZ()) && o.LJ(C0YP.LIZ("ro.tran_bandwidth_alloc2_support"), "1")) {
            FFL.LJIIIZ().getClass();
            if (o.LJ(FFL.LJIILJJIL(31744, "transsonic_network_optimize_group", "v0", true), "v1")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.IBrandService
    public final boolean LIZIZ() {
        if (C40362Fsk.LIZ() && C40362Fsk.LIZIZ(EF7.LIZIZ())) {
            FFL.LJIIIZ().getClass();
            if (o.LJ(FFL.LJIILJJIL(31744, "transsonic_cpu_optimize_group", "v0", true), "v1")) {
                return true;
            }
        }
        return false;
    }
}
