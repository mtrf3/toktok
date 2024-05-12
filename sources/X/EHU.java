package X;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EHU implements InterfaceC36106EFa<EFY> {
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        if (r7 == false) goto L39;
     */
    @Override // X.InterfaceC36106EFa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.EFY r9) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EHU.LIZ(X.EFY):void");
    }

    @Override // X.InterfaceC36106EFa
    public final void LIZIZ(EFY efy) {
        C56662Kg.LIZ().LJFF(efy.LIZJ, false);
        EFK efk = efy.LIZ;
        if (efk != EFK.BOOT_FINISH && efk != EFK.IDLE) {
            FAK LIZ = C56672Kh.LIZ();
            String name = efy.LIZJ;
            LIZ.getClass();
            o.LJIIIZ(name, "name");
            if (!LIZ.LJJIFFI && ((ConcurrentHashMap) LIZ.LIZIZ).containsKey(name)) {
                Long l = (Long) ((ConcurrentHashMap) LIZ.LIZIZ).get(name);
                if (l == null) {
                    ((ConcurrentHashMap) LIZ.LJII).put(name, 0L);
                } else if (((ConcurrentHashMap) LIZ.LJII).get(name) == null) {
                    long uptimeMillis = SystemClock.uptimeMillis() - l.longValue();
                    ((ConcurrentHashMap) LIZ.LJII).put(name, Long.valueOf(uptimeMillis));
                    if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                        Long l2 = (Long) ((ConcurrentHashMap) LIZ.LJII).get("main_task_total_duration");
                        if (l2 == null) {
                            ((ConcurrentHashMap) LIZ.LJII).put("main_task_total_duration", Long.valueOf(uptimeMillis));
                        } else {
                            ((ConcurrentHashMap) LIZ.LJII).put("main_task_total_duration", Long.valueOf(l2.longValue() + uptimeMillis));
                        }
                        Long l3 = (Long) ((ConcurrentHashMap) LIZ.LJII).get("main_task_stage_total_duration_temp");
                        if (l3 == null) {
                            Long valueOf = Long.valueOf(uptimeMillis);
                            java.util.Map<String, Long> map = LIZ.LJII;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(LIZ.LJJIIJ.getValue());
                            LIZ2.append(":main_task_duration");
                            ((ConcurrentHashMap) map).put(X1D.LIZIZ(LIZ2), valueOf);
                            ((ConcurrentHashMap) LIZ.LJII).put("main_task_stage_total_duration_temp", Long.valueOf(uptimeMillis));
                        } else {
                            java.util.Map<String, Long> map2 = LIZ.LJII;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(LIZ.LJJIIJ.getValue());
                            LIZ3.append(":main_task_duration");
                            ((ConcurrentHashMap) map2).put(X1D.LIZIZ(LIZ3), Long.valueOf(l3.longValue() + uptimeMillis));
                            ((ConcurrentHashMap) LIZ.LJII).put("main_task_stage_total_duration_temp", Long.valueOf(l3.longValue() + uptimeMillis));
                        }
                    } else {
                        Long l4 = (Long) ((ConcurrentHashMap) LIZ.LJII).get("bg_task_total_duration");
                        if (l4 == null) {
                            ((ConcurrentHashMap) LIZ.LJII).put("bg_task_total_duration", Long.valueOf(uptimeMillis));
                        } else {
                            ((ConcurrentHashMap) LIZ.LJII).put("bg_task_total_duration", Long.valueOf(l4.longValue() + uptimeMillis));
                        }
                    }
                }
            }
        }
        if (!s.LJJJLZIJ(efy.LIZJ, "_request_", false)) {
            FAK LIZ4 = C56672Kh.LIZ();
            String name2 = efy.LIZJ;
            LIZ4.getClass();
            o.LJIIIZ(name2, "name");
            if (!LIZ4.LJJIFFI || !((ConcurrentHashMap) LIZ4.LIZJ).containsKey(name2)) {
                return;
            }
            Long l5 = (Long) ((ConcurrentHashMap) LIZ4.LIZJ).get(name2);
            if (l5 == null) {
                ((ConcurrentHashMap) LIZ4.LJIIIIZZ).put(name2, 0L);
            } else {
                if (((ConcurrentHashMap) LIZ4.LJIIIIZZ).get(name2) != null) {
                    return;
                }
                ((ConcurrentHashMap) LIZ4.LJIIIIZZ).put(name2, C0EM.LIZIZ(l5, SystemClock.uptimeMillis()));
            }
        }
    }
}
