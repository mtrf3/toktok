package X;

import Y.ACallableS24S0001000_6;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EL2 implements E3Q {
    public static final EL2 LIZ = new EL2();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(EL3.LJLIL);

    public static Keva LIZIZ() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r11 == 1) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r11) {
        /*
            long r5 = java.lang.System.currentTimeMillis()
            com.bytedance.keva.Keva r2 = LIZIZ()
            r0 = 1
            long r0 = r0 + r5
            java.lang.String r10 = "last_main_session_time"
            long r7 = r2.getLong(r10, r0)
            long r3 = r5 - r7
            com.bytedance.keva.Keva r2 = LIZIZ()
            java.lang.String r9 = "last_push_receive_time"
            long r7 = r2.getLong(r9, r0)
            long r1 = r5 - r7
            r7 = 1
            if (r11 == r7) goto L4d
            r0 = 2
            if (r11 == r0) goto L45
            if (r11 != r7) goto L28
        L27:
            r7 = 0
        L28:
            java.lang.String r0 = "last_main_session_interval"
            org.json.JSONObject r3 = X.Q7K.LIZLLL(r0, r3)
            java.lang.String r0 = "last_push_receive_interval"
            r3.put(r0, r1)
            java.lang.String r0 = "push_process"
            r3.put(r0, r7)
            boolean r1 = X.C84763XOl.LJIIJJI
            java.lang.String r0 = "in_background"
            r3.put(r0, r1)
            java.lang.String r0 = "activate_main_session"
            X.FMX.LJIILJJIL(r0, r3)
            return
        L45:
            com.bytedance.keva.Keva r0 = LIZIZ()
            r0.storeLong(r9, r5)
            goto L28
        L4d:
            com.bytedance.keva.Keva r0 = LIZIZ()
            r0.storeLong(r10, r5)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EL2.LIZJ(int):void");
    }

    @Override // X.E3Q
    public final void LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C10K.LIZJ(new ACallableS24S0001000_6(i, 0));
            return;
        }
        LIZJ(i);
    }
}
