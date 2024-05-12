package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ime, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47628Ime {
    public final java.util.Map<Integer, Integer> LIZ = new ConcurrentHashMap();
    public final java.util.Map<Integer, Long> LIZIZ = new ConcurrentHashMap();
    public final java.util.Map<Integer, Float> LIZJ = new ConcurrentHashMap();
    public final java.util.Map<Integer, String> LIZLLL = new ConcurrentHashMap();

    public final void LIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        if (interfaceC47775Ip1 == null) {
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                interfaceC47775Ip1.LJ(((Integer) entry.getKey()).intValue(), ((Integer) entry.getValue()).intValue());
            }
            for (Map.Entry entry2 : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                interfaceC47775Ip1.LJFF(((Integer) entry2.getKey()).intValue(), ((Long) entry2.getValue()).longValue());
            }
            for (Map.Entry entry3 : ((ConcurrentHashMap) this.LIZJ).entrySet()) {
                interfaceC47775Ip1.LIZJ(((Float) entry3.getValue()).floatValue(), ((Integer) entry3.getKey()).intValue());
            }
            for (Map.Entry entry4 : ((ConcurrentHashMap) this.LIZLLL).entrySet()) {
                interfaceC47775Ip1.LIZLLL(((Integer) entry4.getKey()).intValue(), (String) entry4.getValue());
            }
        } catch (Exception e) {
            C78253UnR.LIZLLL("OptionHolder", e.getMessage());
        }
    }

    public final int LIZIZ(int i, int i2) {
        if (((ConcurrentHashMap) this.LIZ).containsKey(Integer.valueOf(i))) {
            Integer num = (Integer) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        }
        return i2;
    }

    public final void LIZJ(int i, int i2) {
        ((ConcurrentHashMap) this.LIZ).put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
