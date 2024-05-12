package X;

import android.os.Handler;
import android.util.ArrayMap;
import com.ss.android.ugc.aweme.legoImpl.task.degrade.DegradeLegoTask;
import defpackage.i0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.FKv */
/* loaded from: classes7.dex */
public final class C38805FKv {
    public static final C38805FKv LIZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static Handler LIZLLL;
    public static final ArrayMap<Integer, Executor> LJ;
    public static InterfaceC38802FKs LJFF;
    public static final java.util.Map<String, FL5> LJI;
    public static final C212608Wa LJII;
    public static final AtomicBoolean LJIIIIZZ;

    static {
        TBV tbv = new TBV(C38805FKv.class, "initTime", "getInitTime$pscheduler_release()J", 0);
        C65352Pkq.LIZ.getClass();
        LIZIZ = new InterfaceC74236TBo[]{tbv};
        LIZ = new C38805FKv();
        LIZJ = C221108m2.LIZIZ(C36424ERg.LJLIL);
        LJ = (ArrayMap) C221108m2.LIZIZ(C38807FKx.LJLIL).getValue();
        LJI = new LinkedHashMap();
        LJII = new C212608Wa();
        LJIIIIZZ = new AtomicBoolean(false);
    }

    public static Handler LIZLLL() {
        Handler handler = LIZLLL;
        if (handler != null) {
            return handler;
        }
        o.LJIJI("mhandler");
        throw null;
    }

    public final long LIZJ() {
        return ((Number) LJII.LIZ(this, LIZIZ[0])).longValue();
    }

    public final <T> T LIZ(C35666DzC c35666DzC, InterfaceC65784Pro<? extends T> interfaceC65784Pro, InterfaceC65784Pro<? extends T> interfaceC65784Pro2) {
        InterfaceC38802FKs interfaceC38802FKs;
        InterfaceC38802FKs interfaceC38802FKs2;
        FL4 fl4;
        int intValue;
        int intValue2;
        T t = null;
        LJ(null, null, null);
        if (c35666DzC.LIZIZ) {
            switch (E3G.LIZ[c35666DzC.LIZJ.ordinal()]) {
                case 1:
                    Integer num = c35666DzC.LIZLLL;
                    if (num == null || ((intValue = num.intValue()) <= 19 && intValue >= -20)) {
                        fl4 = C38804FKu.LIZ;
                        break;
                    } else {
                        throw new Exception("AsyncPriorityScheduler can't excute! schedulerRegister.extra must <= 19 && >= -20");
                    }
                case 2:
                    fl4 = FL0.LIZ;
                    break;
                case 3:
                    if (!C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
                        Integer num2 = c35666DzC.LIZLLL;
                        if (num2 == null || num2.intValue() >= 0) {
                            fl4 = C38808FKy.LIZ;
                            break;
                        } else {
                            throw new Exception("SleepScheduler can't excute! schedulerRegister.extra must >= 0");
                        }
                    } else {
                        throw new Exception("SleepScheduler can't excute! can't sleep mainthread");
                    }
                    break;
                case 4:
                    Integer num3 = c35666DzC.LIZLLL;
                    if (num3 == null || num3.intValue() < LJ.size()) {
                        fl4 = FL1.LIZ;
                        break;
                    } else {
                        throw new Exception("AsyncScheduler can't excute! schedulerRegister.extra number > excutorMap size");
                    }
                    break;
                case 5:
                    Integer num4 = c35666DzC.LIZLLL;
                    if (num4 == null || num4.intValue() >= 0) {
                        fl4 = FL2.LIZ;
                        break;
                    } else {
                        throw new Exception("DelayScheduler can't excute! schedulerRegister.extra must >= 0");
                    }
                case 6:
                    if (interfaceC65784Pro2 != null && interfaceC65784Pro != null) {
                        fl4 = C38806FKw.LIZ;
                        break;
                    } else {
                        throw new Exception("ReplaceScheduler can't excute! originalAction and schedulerRegister.targetAction must be not-null");
                    }
                case 7:
                    Integer num5 = c35666DzC.LIZLLL;
                    if (num5 == null || ((intValue2 = num5.intValue()) <= 19 && intValue2 >= -20)) {
                        fl4 = C38803FKt.LIZ;
                        break;
                    } else {
                        throw new Exception("PriorityScheduler can't excute! schedulerRegister.extra must <= 19 && >= -20");
                    }
                    break;
                case 8:
                    fl4 = C38809FKz.LIZ;
                    break;
                default:
                    throw new C162476Zf();
            }
            T t2 = (T) fl4.LIZ(c35666DzC.LIZLLL, c35666DzC.LIZ, interfaceC65784Pro2, interfaceC65784Pro);
            if (t2 == null) {
                return null;
            }
            return t2;
        }
        System.currentTimeMillis();
        String str = c35666DzC.LIZ;
        if (str != null && (interfaceC38802FKs2 = LJFF) != null) {
            String LJFF2 = i0.LJFF(str, "origin");
            LIZ.LIZJ();
            interfaceC38802FKs2.LIZIZ(LJFF2);
        }
        if (interfaceC65784Pro2 != null) {
            t = interfaceC65784Pro2.invoke();
        }
        String str2 = c35666DzC.LIZ;
        if (str2 != null && (interfaceC38802FKs = LJFF) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str2);
            LIZ2.append("origin");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            System.currentTimeMillis();
            interfaceC38802FKs.LIZ(LIZIZ2);
        }
        return t;
    }

    public final void LJ(Handler handler, InterfaceC38802FKs interfaceC38802FKs, E3L e3l) {
        AtomicBoolean atomicBoolean = LJIIIIZZ;
        if (!atomicBoolean.get()) {
            synchronized (this) {
                if (atomicBoolean.get()) {
                    return;
                }
                C38805FKv c38805FKv = LIZ;
                c38805FKv.getClass();
                if (LIZLLL == null) {
                    if (handler == null) {
                        handler = (Handler) LIZJ.getValue();
                    }
                    o.LJIIIZ(handler, "<set-?>");
                    LIZLLL = handler;
                }
                LJFF = interfaceC38802FKs;
                LJII.LIZIZ(LIZIZ[0], c38805FKv, Long.valueOf(System.currentTimeMillis()));
                ((HashMap) C123144sQ.LIZ).put("Lego", new DegradeLegoTask());
                atomicBoolean.set(true);
            }
        }
    }

    public static /* synthetic */ void LIZIZ(C38805FKv c38805FKv, C35666DzC c35666DzC, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i) {
        if ((i & 2) != 0) {
            interfaceC65784Pro = null;
        }
        if ((i & 4) != 0) {
            interfaceC65784Pro2 = null;
        }
        c38805FKv.LIZ(c35666DzC, interfaceC65784Pro, interfaceC65784Pro2);
    }
}
