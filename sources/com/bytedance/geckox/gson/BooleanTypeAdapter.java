package com.bytedance.geckox.gson;

import X.C65385PlN;
import X.C65397PlZ;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.X1D;
import com.google.gson.TypeAdapter;
import com.google.gson.n;

/* loaded from: classes12.dex */
public class BooleanTypeAdapter extends TypeAdapter<Boolean> {
    @Override // com.google.gson.TypeAdapter
    public final Boolean read(C65385PlN c65385PlN) {
        EnumC65386PlO LJJIJIL = c65385PlN.LJJIJIL();
        int i = C65397PlZ.LIZ[LJJIJIL.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (c65385PlN.LJIJI() == 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Expected BOOLEAN or NUMBER but was ");
                LIZ.append(LJJIJIL);
                throw new n(X1D.LIZIZ(LIZ));
            }
            c65385PlN.LJJIIJ();
            return null;
        }
        return Boolean.valueOf(c65385PlN.LJIILL());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 == null) {
            c65403Plf.LJIIJJI();
        } else {
            c65403Plf.LJJIII(bool2.booleanValue());
        }
    }
}
