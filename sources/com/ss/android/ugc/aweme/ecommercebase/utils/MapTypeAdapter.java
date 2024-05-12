package com.ss.android.ugc.aweme.ecommercebase.utils;

import X.C36746EbW;
import X.C65385PlN;
import X.C65392PlU;
import X.C65403Plf;
import X.C75792yF;
import X.C76800UCe;
import X.EnumC65386PlO;
import X.X1D;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class MapTypeAdapter extends TypeAdapter<Object> {
    public final TypeAdapter<Object> LIZ = C75792yF.LIZIZ().LJIIJ(Object.class);

    @Override // com.google.gson.TypeAdapter
    public final Object read(C65385PlN in) {
        o.LJIIIZ(in, "in");
        EnumC65386PlO LJJIJIL = in.LJJIJIL();
        if (LJJIJIL != null) {
            int i = C65392PlU.LIZ[LJJIJIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String string = in.LJJIIZI();
                        o.LJIIIIZZ(string, "string");
                        if (s.LJJJZ(string, '.') || s.LJJJZ(string, 'e') || s.LJJJZ(string, 'E')) {
                            return Double.valueOf(CastDoubleProtector.parseDouble(string));
                        }
                        long parseLong = CastLongProtector.parseLong(string);
                        if (-2147483648L <= parseLong && parseLong <= 2147483647L) {
                            return Integer.valueOf((int) parseLong);
                        }
                        return Long.valueOf(parseLong);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    in.LIZ();
                    while (in.LJIIJJI()) {
                        Object read = read(in);
                        if (read != null) {
                            arrayList.add(read);
                            if (C76800UCe.LIZ == null) {
                            }
                        }
                        C36746EbW.LIZ(6, "array element should not be null");
                    }
                    in.LJ();
                    return arrayList;
                }
            } else {
                HashMap hashMap = new HashMap();
                in.LIZIZ();
                while (in.LJIIJJI()) {
                    String name = in.LJJ();
                    Object read2 = read(in);
                    if (read2 != null) {
                        o.LJIIIIZZ(name, "name");
                        hashMap.put(name, read2);
                        if (C76800UCe.LIZ == null) {
                        }
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('\"');
                    LIZ.append(name);
                    LIZ.append("\" should not be null");
                    C36746EbW.LIZ(6, X1D.LIZIZ(LIZ));
                }
                in.LJFF();
                return hashMap;
            }
        }
        return this.LIZ.read(in);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, Object obj) {
        this.LIZ.write(c65403Plf, obj);
    }
}
