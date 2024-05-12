package X;

import android.os.Looper;
import defpackage.i0;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EFX implements EEA {
    public static boolean LIZLLL;
    public final InterfaceC36106EFa<EFY> LIZ;
    public final java.util.Map<String, Long> LIZIZ = new LinkedHashMap();
    public final EFZ LIZJ = new EFZ();

    public EFX(EHU ehu) {
        this.LIZ = ehu;
    }

    @Override // X.EEA
    public final void LIZ(EEY component) {
        long j;
        HashSet<String> LIZ;
        o.LJIIIZ(component, "component");
        EFY efy = this.LIZJ.get();
        o.LJI(efy);
        EFY efy2 = efy;
        InterfaceC36106EFa<EFY> interfaceC36106EFa = this.LIZ;
        if (interfaceC36106EFa != null) {
            interfaceC36106EFa.LIZIZ(efy2);
        }
        if (LIZLLL && (LIZ = C234369Hs.LIZ()) != null && LIZ.contains(efy2.LIZJ)) {
            String blood = efy2.LIZJ;
            o.LJIIIZ(blood, "blood");
            if (C36211EJb.LJIIIZ.get()) {
                C36211EJb.LIZ.remove(C16880lQ.LLLLIIIILLL().getName());
            }
        }
        if (C35810E3q.LJIIIIZZ() && (component instanceof EE1) && ((EE1) component).type() == EFK.BOOT_FINISH && this.LIZIZ.containsKey(component.key())) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(component.key());
            LIZ2.append(": ");
            long currentTimeMillis = System.currentTimeMillis();
            Long l = (Long) ((LinkedHashMap) this.LIZIZ).get(component.key());
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            LIZ2.append(currentTimeMillis - j);
            X1D.LIZIZ(LIZ2);
        }
    }

    @Override // X.EEA
    public final void LIZIZ(EEY component) {
        String LJFF;
        HashSet<String> LIZ;
        o.LJIIIZ(component, "component");
        EFY efy = this.LIZJ.get();
        o.LJI(efy);
        EFY efy2 = efy;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(component.prefix());
        LIZ2.append(component.key());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            LJFF = i0.LJFF("main_", LIZIZ);
        } else {
            LJFF = i0.LJFF("bg_", LIZIZ);
        }
        o.LJIIIZ(LJFF, "<set-?>");
        efy2.LIZJ = LJFF;
        if (component instanceof EE1) {
            EE1 ee12 = (EE1) component;
            efy2.LIZ = ee12.type();
            if (ee12.type() == EFK.BOOT_FINISH) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("boot_finish_");
                LIZ3.append(LIZIZ);
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                o.LJIIIZ(LIZIZ2, "<set-?>");
                efy2.LIZJ = LIZIZ2;
                if (C35810E3q.LJIIIIZZ()) {
                    java.util.Map<String, Long> map = this.LIZIZ;
                    String key = component.key();
                    o.LJIIIIZZ(key, "component.key()");
                    map.put(key, Long.valueOf(System.currentTimeMillis()));
                }
            }
            if (ee12.type() == EFK.IDLE) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("idle_");
                LIZ4.append(LIZIZ);
                String LIZIZ3 = X1D.LIZIZ(LIZ4);
                o.LJIIIZ(LIZIZ3, "<set-?>");
                efy2.LIZJ = LIZIZ3;
            }
            if (LIZLLL && (LIZ = C234369Hs.LIZ()) != null && LIZ.contains(efy2.LIZJ)) {
                C36211EJb.LIZ(efy2.LIZJ);
            }
        }
        InterfaceC36106EFa<EFY> interfaceC36106EFa = this.LIZ;
        if (interfaceC36106EFa != null) {
            interfaceC36106EFa.LIZ(efy2);
        }
    }
}
