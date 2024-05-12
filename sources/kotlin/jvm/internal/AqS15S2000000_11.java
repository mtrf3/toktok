package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C141335gf;
import X.C37715Er9;
import X.C3C5;
import X.C66225Pyv;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC66330Q1m;
import X.InterfaceC66337Q1t;
import X.Q1A;
import X.Q1E;
import X.Q1I;
import X.Q1R;
import X.Q1T;
import X.Q1Y;
import X.Q1Z;
import X.X1D;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class AqS15S2000000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;
    public String s1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS15S2000000_11 aqS15S2000000_11) {
        Q1I q1i = Q1I.LIZJ;
        Q1Z<String, List<String>> q1z = q1i.LIZ(aqS15S2000000_11.s0).LIZ;
        q1z.LIZIZ = true;
        q1z.evictAll();
        q1z.LIZIZ = false;
        Q1Y LIZ = q1i.LIZ(aqS15S2000000_11.s0);
        C66225Pyv c66225Pyv = Q1A.LJII;
        if (c66225Pyv != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ.LIZIZ);
            LIZ2.append("_data");
            try {
                Map<String, ?> all = c66225Pyv.LIZ(X1D.LIZIZ(LIZ2)).LIZ.getAll();
                if (all != null) {
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        try {
                            Object value = entry.getValue();
                            if (value != null) {
                                try {
                                    Map LIZIZ = C37715Er9.LIZIZ(String.valueOf(entry.getValue()));
                                    if (((HashMap) LIZIZ).isEmpty()) {
                                        C66225Pyv c66225Pyv2 = Q1A.LJII;
                                        if (c66225Pyv2 != null) {
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append(LIZ.LIZIZ);
                                            LIZ3.append("_data");
                                            c66225Pyv2.LIZ(X1D.LIZIZ(LIZ3)).LIZIZ(entry.getKey());
                                        }
                                        C66225Pyv c66225Pyv3 = Q1A.LJII;
                                        if (c66225Pyv3 == null) {
                                            break;
                                        }
                                        c66225Pyv3.LIZ(LIZ.LIZIZ).LIZIZ(entry.getKey());
                                        break;
                                    }
                                    C3C5.m7constructorimpl(Q1E.LIZ(LIZ.LIZIZ, LIZIZ, C113554cx.LJJJLIIL(), true));
                                } catch (Throwable th) {
                                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                }
                            } else {
                                value = null;
                            }
                            C3C5.m7constructorimpl(value);
                        } catch (Throwable th2) {
                            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                        }
                    }
                }
            } catch (Throwable th3) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th3));
            }
        }
        InterfaceC66337Q1t interfaceC66337Q1t = Q1I.LIZIZ;
        if (interfaceC66337Q1t != null) {
            String str = aqS15S2000000_11.s0;
            String rulesMd5 = aqS15S2000000_11.s1;
            o.LJFF(rulesMd5, "rulesMd5");
            interfaceC66337Q1t.LIZ(str, rulesMd5);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS15S2000000_11 aqS15S2000000_11) {
        Q1R q1r = (Q1R) ((LinkedHashMap) Q1T.LIZ).get(aqS15S2000000_11.s0);
        if (q1r != null) {
            String rulesName = aqS15S2000000_11.s1;
            o.LJIIJ(rulesName, "rulesName");
            InterfaceC66330Q1m interfaceC66330Q1m = q1r.LJI;
            if (interfaceC66330Q1m != null) {
                return interfaceC66330Q1m.LIZ(rulesName);
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S2000000_11(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
