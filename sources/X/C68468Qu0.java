package X;

import com.ss.android.ugc.localnotify.work.DoNotifyWork;
import com.ss.android.ugc.localnotify.work.NonLoginNotifyWork;
import com.ss.android.ugc.localnotify.work.PreWakeWork;
import com.ss.android.ugc.localnotify.work.SilentWakeWork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Qu0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68468Qu0 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C68469Qu1.LJLIL);
    public static int LIZIZ = 4;

    public static void LIZ(int i) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cancelWorkManagerTasksByTag(");
        LIZ2.append(i);
        LIZ2.append(')');
        C47629Imf.LIZ("WMPublishCenter", X1D.LIZIZ(LIZ2));
        AbstractC08530Vd abstractC08530Vd = (AbstractC08530Vd) LIZ.getValue();
        if (abstractC08530Vd != null) {
            abstractC08530Vd.LIZIZ(String.valueOf(i));
        }
    }

    public static void LIZIZ(List list) {
        ArrayList arrayList = new ArrayList();
        if ((!((ArrayList) list).isEmpty()) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(LIZJ((C68476Qu8) it.next()));
            }
        }
    }

    public static String LIZJ(C68476Qu8 c68476Qu8) {
        String LJFF;
        Class cls;
        C50591yh LIZ2;
        boolean z;
        String str;
        long j = c68476Qu8.LJLJL;
        long currentTimeMillis = System.currentTimeMillis();
        if (j > currentTimeMillis) {
            String LIZLLL = C67257QaT.LIZLLL(j);
            C0CX c0cx = new C0CX();
            ((HashMap) c0cx.LIZ).put("notification_id", c68476Qu8.LJLIL);
            ((HashMap) c0cx.LIZ).put("scheduled_time_string", LIZLLL);
            ((HashMap) c0cx.LIZ).put("scheduled_timestamp", Long.valueOf(j));
            C0CY LIZ3 = c0cx.LIZ();
            long j2 = j - currentTimeMillis;
            if (!c68476Qu8.LJLL) {
                String taskId = c68476Qu8.LJLIL;
                int i = c68476Qu8.LJLJI;
                if (i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                o.LJIIIZ(taskId, "taskId");
                OSZ[] oszArr = new OSZ[3];
                oszArr[0] = new OSZ("task_id", taskId);
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                str = "non_login";
                            }
                        } else {
                            str = "do_notify";
                        }
                    } else {
                        str = "pre_wake";
                    }
                    oszArr[1] = new OSZ("task_type", str);
                    oszArr[2] = new OSZ("setting_timestamp", String.valueOf(j));
                    FMX.LJIILIIL("work_manager_setting", C113554cx.LJJL(oszArr), z);
                }
                str = "silent";
                oszArr[1] = new OSZ("task_type", str);
                oszArr[2] = new OSZ("setting_timestamp", String.valueOf(j));
                FMX.LJIILIIL("work_manager_setting", C113554cx.LJJL(oszArr), z);
            }
            String str2 = c68476Qu8.LJLIL;
            if (C52260KfA.LIZ && ujb.o.LJJJJ(str2, "_0", false)) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append('_');
                int i2 = LIZIZ;
                LIZIZ = i2 + 1;
                LIZ4.append(i2);
                str2 = ujb.o.LJJJJZ(str2, "_0", X1D.LIZIZ(LIZ4), false);
            }
            int i3 = c68476Qu8.LJLJI;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        cls = SilentWakeWork.class;
                    } else {
                        cls = NonLoginNotifyWork.class;
                    }
                } else {
                    cls = DoNotifyWork.class;
                }
            } else {
                cls = PreWakeWork.class;
            }
            C1NK c1nk = new C1NK(cls);
            c1nk.LIZIZ.LJI = TimeUnit.MILLISECONDS.toMillis(j2);
            if (Long.MAX_VALUE - System.currentTimeMillis() > c1nk.LIZIZ.LJI) {
                ((HashSet) c1nk.LIZJ).add(String.valueOf(i3));
                c1nk.LIZIZ.LJ = LIZ3;
                C1NL LIZ5 = c1nk.LIZ();
                AbstractC08530Vd abstractC08530Vd = (AbstractC08530Vd) LIZ.getValue();
                if (abstractC08530Vd != null && (LIZ2 = abstractC08530Vd.LIZ(str2, C0VS.REPLACE, Collections.singletonList(LIZ5))) != null) {
                    LIZ2.LLLLZ();
                }
                LJFF = C0ON.LIZJ("WM(", str2, "): ", LIZLLL);
            } else {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
        } else {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("WM(");
            LJFF = JBR.LJFF(LIZ6, c68476Qu8.LJLIL, "): Incorrect Date and Time!", LIZ6);
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("Set ");
        LIZ7.append(LJFF);
        C47629Imf.LIZ("WMPublishCenter", X1D.LIZIZ(LIZ7));
        return LJFF;
    }
}
