package com.ss.android.ugc.aweme.ecommerce.base.common;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceLiveDegradeExp;

/* loaded from: classes5.dex */
public final class EcommerceLiveDegradeExp implements IEcommerceLiveDegradeExp {
    public static IEcommerceLiveDegradeExp LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IEcommerceLiveDegradeExp.class, false);
        if (LIZ != null) {
            return (IEcommerceLiveDegradeExp) LIZ;
        }
        if (C58096Mr6.I == null) {
            synchronized (IEcommerceLiveDegradeExp.class) {
                if (C58096Mr6.I == null) {
                    C58096Mr6.I = new EcommerceLiveDegradeExp();
                }
            }
        }
        return C58096Mr6.I;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceLiveDegradeExp
    public final boolean LIZ() {
        EComLiveDegradeExperiment.LIZ.getClass();
        return EComLiveDegradeExperiment.LIZ().getEntranceAnimDegrade();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceLiveDegradeExp
    public final boolean LIZIZ() {
        EComLiveDegradeExperiment.LIZ.getClass();
        return EComLiveDegradeExperiment.LIZ().getEntranceAnimDegrade();
    }
}
