package com.ss.android.ugc.tools.type_adapter;

import X.C65385PlN;
import X.C65393PlV;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.X1D;
import com.google.gson.TypeAdapter;
import com.google.gson.s;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BooleanAsIntTypeAdapter extends TypeAdapter<Integer> {
    @Override // com.google.gson.TypeAdapter
    public final Integer read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        EnumC65386PlO LJJIJIL = reader.LJJIJIL();
        if (LJJIJIL != null) {
            int i = C65393PlV.LIZ[LJJIJIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (Boolean.parseBoolean(reader.LJJIIZI())) {
                                return 1;
                            }
                            return 0;
                        }
                    } else {
                        try {
                            try {
                                return Integer.valueOf(reader.LJIJI());
                            } catch (NumberFormatException e) {
                                e = e;
                                throw new s(e);
                            }
                        } catch (NumberFormatException e2) {
                            e = e2;
                        }
                    }
                } else {
                    reader.LJJIIJ();
                    return null;
                }
            } else {
                if (reader.LJIILL()) {
                    return 1;
                }
                return 0;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected BOOLEAN or NUMBER but was ");
        LIZ.append(LJJIJIL);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf out, Integer num) {
        Integer num2 = num;
        o.LJIIIZ(out, "out");
        if (num2 == null) {
            out.LJIIJJI();
        } else {
            out.LJIJJ(num2);
        }
    }
}
