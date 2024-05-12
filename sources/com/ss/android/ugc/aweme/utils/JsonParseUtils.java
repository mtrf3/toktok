package com.ss.android.ugc.aweme.utils;

import X.C65385PlN;
import X.C65399Plb;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.X1D;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.internal.a;
import com.google.gson.m;
import com.google.gson.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class JsonParseUtils {
    public static final TypeAdapter<Boolean> LIZ = new TypeAdapter<Boolean>() { // from class: com.ss.android.ugc.aweme.utils.JsonParseUtils.1
        @Override // com.google.gson.TypeAdapter
        public final Boolean read(C65385PlN c65385PlN) {
            EnumC65386PlO LJJIJIL = c65385PlN.LJJIJIL();
            int i = C65399Plb.LIZ[LJJIJIL.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return Boolean.valueOf(Boolean.parseBoolean(c65385PlN.LJJIIZI()));
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Expected BOOLEAN or NUMBER but was ");
                        LIZ2.append(LJJIJIL);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                    }
                    try {
                        if (c65385PlN.LJIJI() == 0) {
                            z = false;
                        }
                        try {
                            return Boolean.valueOf(z);
                        } catch (NumberFormatException e) {
                            e = e;
                            throw new s(e);
                        }
                    } catch (NumberFormatException e2) {
                        e = e2;
                    }
                } else {
                    c65385PlN.LJJIIJ();
                    return null;
                }
            } else {
                return Boolean.valueOf(c65385PlN.LJIILL());
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null) {
                c65403Plf.LJIIJJI();
            } else {
                c65403Plf.LJIJI(bool2);
            }
        }
    };
    public static final TypeAdapter<Integer> LIZIZ = new TypeAdapter<Integer>() { // from class: com.ss.android.ugc.aweme.utils.JsonParseUtils.2
        @Override // com.google.gson.TypeAdapter
        public final Integer read(C65385PlN c65385PlN) {
            EnumC65386PlO LJJIJIL = c65385PlN.LJJIJIL();
            int i = C65399Plb.LIZ[LJJIJIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return Integer.valueOf(Boolean.parseBoolean(c65385PlN.LJJIIZI()) ? 1 : 0);
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Expected BOOLEAN or NUMBER but was ");
                        LIZ2.append(LJJIJIL);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                    }
                    try {
                        try {
                            return Integer.valueOf(c65385PlN.LJIJI());
                        } catch (NumberFormatException e) {
                            e = e;
                            throw new s(e);
                        }
                    } catch (NumberFormatException e2) {
                        e = e2;
                    }
                } else {
                    c65385PlN.LJJIIJ();
                    return null;
                }
            } else {
                return Integer.valueOf(c65385PlN.LJIILL() ? 1 : 0);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C65403Plf c65403Plf, Integer num) {
            Integer num2 = num;
            if (num2 == null) {
                c65403Plf.LJIIJJI();
            } else {
                c65403Plf.LJIJJ(num2);
            }
        }
    };

    public static e LIZ() {
        e eVar = new e();
        TypeAdapter<Boolean> typeAdapter = LIZ;
        eVar.LIZIZ(typeAdapter, Boolean.class);
        eVar.LIZIZ(typeAdapter, Boolean.TYPE);
        TypeAdapter<Integer> typeAdapter2 = LIZIZ;
        eVar.LIZIZ(typeAdapter2, Integer.class);
        eVar.LIZIZ(typeAdapter2, Integer.TYPE);
        eVar.LJIILL = true;
        return eVar;
    }

    public static String LIZLLL(Object obj) {
        return GsonProtectorUtils.toJson(LIZ().LIZ(), obj);
    }

    public static List LIZIZ(Class cls, String str) {
        try {
            return (List) GsonProtectorUtils.fromJson(LIZ().LIZ(), str, new a.b(null, ArrayList.class, cls));
        } catch (NullPointerException unused) {
            return new ArrayList();
        }
    }

    public static Object LIZJ(Class cls, String str) {
        Gson LIZ2 = LIZ().LIZ();
        if (cls == null) {
            return new m();
        }
        return GsonProtectorUtils.fromJson(LIZ2, str, cls);
    }
}
