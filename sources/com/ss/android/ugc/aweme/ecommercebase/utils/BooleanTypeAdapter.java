package com.ss.android.ugc.aweme.ecommercebase.utils;

import X.C36746EbW;
import X.C65385PlN;
import X.C65396PlY;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.X1D;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BooleanTypeAdapter extends TypeAdapter<Boolean> {
    @Override // com.google.gson.TypeAdapter
    public final Boolean read(C65385PlN in) {
        int i;
        o.LJIIIZ(in, "in");
        EnumC65386PlO LJJIJIL = in.LJJIJIL();
        if (LJJIJIL == null) {
            i = -1;
        } else {
            i = C65396PlY.LIZ[LJJIJIL.ordinal()];
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    String LJJIIZI = in.LJJIIZI();
                    if (!ujb.o.LJJJJIZL(LJJIIZI, "null", true)) {
                        return Boolean.valueOf(Boolean.parseBoolean(LJJIIZI));
                    }
                } else {
                    boolean z2 = false;
                    try {
                        if (in.LJIJI() == 0) {
                            z = false;
                        }
                        z2 = z;
                    } catch (NumberFormatException unused) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Expected a boolean or int but was ");
                        LIZ.append(in.LJIJ());
                        C36746EbW.LIZ(6, X1D.LIZIZ(LIZ));
                    }
                    return Boolean.valueOf(z2);
                }
            } else {
                in.LJJIIJ();
            }
            return null;
        }
        return Boolean.valueOf(in.LJIILL());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf out, Boolean bool) {
        Boolean bool2 = bool;
        o.LJIIIZ(out, "out");
        if (bool2 == null) {
            out.LJIIJJI();
        } else {
            out.LJJIII(bool2.booleanValue());
        }
    }
}
