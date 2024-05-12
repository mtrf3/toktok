package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C141335gf;
import X.C3C5;
import X.C66225Pyv;
import X.C68710Qxu;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.Q1A;
import X.Q1I;
import X.Q1R;
import X.Q1T;
import X.Q1Y;
import X.Q1Z;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ujb.s;

/* loaded from: classes12.dex */
public class AqS49S1000000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return this.s0;
            default:
                return null;
        }
    }

    public final void invoke$0() {
        C68710Qxu c68710Qxu = C68710Qxu.LIZ;
        String userId = this.s0;
        o.LJIIIIZZ(userId, "userId");
        synchronized (c68710Qxu) {
            Set<String> set = C68710Qxu.LIZJ;
            set.remove(userId);
            ((Keva) C68710Qxu.LIZIZ.getValue()).storeStringSet("refresh_key", set);
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS49S1000000_11 aqS49S1000000_11) {
        aqS49S1000000_11.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS49S1000000_11 aqS49S1000000_11) {
        List<String> arrayList;
        Q1Y LIZ = Q1I.LIZJ.LIZ(aqS49S1000000_11.s0);
        C66225Pyv c66225Pyv = Q1A.LJII;
        if (c66225Pyv != null) {
            try {
                Map<String, ?> all = c66225Pyv.LIZ(LIZ.LIZIZ).LIZ.getAll();
                if (all != null) {
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        try {
                            Object value = entry.getValue();
                            if (value != null) {
                                try {
                                    Q1Z<String, List<String>> q1z = LIZ.LIZ;
                                    String key = entry.getKey();
                                    String obj = value.toString();
                                    if (obj != null && obj.length() > 0) {
                                        arrayList = s.LJLJJL(obj, new String[]{", "}, 0, 6);
                                    } else {
                                        arrayList = new ArrayList<>();
                                    }
                                    C3C5.m7constructorimpl(q1z.put(key, arrayList));
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
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS49S1000000_11 aqS49S1000000_11) {
        Q1R q1r = (Q1R) ((LinkedHashMap) Q1T.LIZ).get(aqS49S1000000_11.s0);
        if (q1r != null) {
            return q1r.LIZ;
        }
        return null;
    }

    public static final Object invoke$3(AqS49S1000000_11 aqS49S1000000_11) {
        return ((LinkedHashMap) Q1T.LIZ).get(aqS49S1000000_11.s0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S1000000_11(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
