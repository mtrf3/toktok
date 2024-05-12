package com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate;

import X.C35588Dxw;
import X.C48841JEv;
import X.C58096Mr6;
import X.C78613UtF;
import X.EBU;
import X.EBV;
import X.EBW;
import X.EBX;
import X.ORZ;
import X.XKX;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ujb.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class SmartCheckIntegrateImpl implements ISmartCheckIntegrate {
    public static ISmartCheckIntegrate LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ISmartCheckIntegrate.class, false);
        if (LIZ != null) {
            return (ISmartCheckIntegrate) LIZ;
        }
        if (C58096Mr6.d0 == null) {
            synchronized (ISmartCheckIntegrate.class) {
                if (C58096Mr6.d0 == null) {
                    C58096Mr6.d0 = new SmartCheckIntegrateImpl();
                }
            }
        }
        return C58096Mr6.d0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate
    public final void init() {
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new EBU(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate
    public final boolean LIZIZ(String str) {
        if (str == null) {
            return false;
        }
        try {
            String str2 = (String) ORZ.LJLLLLLL(0, s.LJLJJL(str, new String[]{"?"}, 2, 2));
            if (str2 == null) {
                str2 = "";
            }
            if (o.LJJJJJL(str2)) {
                return false;
            }
            List<String> nativePageKeys = C35588Dxw.LIZ().getNativePageKeys();
            if ((nativePageKeys instanceof Collection) && nativePageKeys.isEmpty()) {
                return false;
            }
            Iterator<String> it = nativePageKeys.iterator();
            while (it.hasNext()) {
                if (s.LJJJLZIJ(str2, it.next(), false)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            EBX.LIZ("SmartCheck", EBW.CHECK);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate
    public final void LIZ(String str, boolean z) {
        if (str == null) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new EBV(str, z, null), 3);
    }
}
