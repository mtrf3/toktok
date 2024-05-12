package com.ss.android.ugc.aweme.utils;

import X.C65385PlN;
import X.C65388PlQ;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.X1D;
import com.google.gson.TypeAdapter;
import com.google.gson.s;

/* loaded from: classes12.dex */
public class ReplaceLineEndAdapter extends TypeAdapter<String> {
    @Override // com.google.gson.TypeAdapter
    public final String read(C65385PlN c65385PlN) {
        EnumC65386PlO LJJIJIL = c65385PlN.LJJIJIL();
        int i = C65388PlQ.LIZ[LJJIJIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                String LJJIIZI = c65385PlN.LJJIIZI();
                if (LJJIIZI.contains("\r\n")) {
                    return LJJIIZI.replaceAll("\r\n", "\n");
                }
                return LJJIIZI;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("expect STRING, but got ");
            LIZ.append(LJJIJIL.name());
            LIZ.append(" at ");
            LIZ.append(c65385PlN.LJIIJ());
            throw new s(X1D.LIZIZ(LIZ));
        }
        c65385PlN.LJJIIJ();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, String str) {
        c65403Plf.LJJ(str);
    }
}
