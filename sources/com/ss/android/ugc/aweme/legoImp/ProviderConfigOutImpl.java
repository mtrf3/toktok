package com.ss.android.ugc.aweme.legoImp;

import X.C58096Mr6;
import X.EF7;
import android.content.Context;
import com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut;

/* loaded from: classes11.dex */
public final class ProviderConfigOutImpl implements IProviderConfigOut {
    @Override // com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut
    public final void LIZIZ() {
    }

    public static IProviderConfigOut LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IProviderConfigOut.class, false);
        if (LIZ != null) {
            return (IProviderConfigOut) LIZ;
        }
        if (C58096Mr6.i2 == null) {
            synchronized (IProviderConfigOut.class) {
                if (C58096Mr6.i2 == null) {
                    C58096Mr6.i2 = new ProviderConfigOutImpl();
                }
            }
        }
        return C58096Mr6.i2;
    }

    @Override // com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut
    public final Context getContext() {
        return EF7.LIZIZ();
    }
}
