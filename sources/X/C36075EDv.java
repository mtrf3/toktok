package X;

import Y.ARunnableS10S0400000_6;
import android.os.Handler;
import android.os.Message;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.EDv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36075EDv extends AbstractC36078EDy implements Handler.Callback {
    public boolean LJLILLLLZI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public long LJLJLLL;
    public int LJLJI = 1;
    public final int LJLJLJ = 4;
    public final EFV LJLIL = new EFV(this);

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
        this.LJLILLLLZI = false;
        C35945E8v.LJ.set(false);
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
        long LIZ;
        if (C36839Ed1.LIZIZ(EF7.LIZIZ()) && !this.LJLJJI) {
            this.LJLJJLL = System.currentTimeMillis();
            if (((Number) DNV.LJ.getValue()).floatValue() > 0.0f) {
                C35945E8v.LIZ = ((Number) DNV.LIZLLL.getValue()).longValue();
                AtomicBoolean atomicBoolean = C35945E8v.LJ;
                if (atomicBoolean.compareAndSet(false, true) && atomicBoolean.get()) {
                    C37179EiV.LJFF.postDelayed(RunnableC35944E8u.LJLIL, C35945E8v.LIZ);
                }
            }
            this.LJLJJI = true;
        }
        this.LJLILLLLZI = true;
        if (!C34195DbT.LIZ()) {
            if (((Boolean) C34195DbT.LJI.getValue()).booleanValue() && this.LJLIL.hasMessages(1201)) {
                return;
            }
            this.LJLIL.LIZIZ(1201, C34343Ddr.LIZ());
            return;
        }
        if (this.LJLIL.hasMessages(1201)) {
            return;
        }
        C36093EEn.LIZ.getClass();
        if (C36093EEn.LIZIZ.LJI()) {
            this.LJLJI = 2;
            LIZ = 1000;
        } else {
            this.LJLJI = 1;
            LIZ = C34343Ddr.LIZ();
        }
        this.LJLIL.LIZIZ(1201, LIZ);
    }

    @Override // X.AbstractC36078EDy
    public final EFK LJFF() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.AbstractC36078EDy, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
        if (EEZ.LIZIZ != EEU.COLD_BOOT_BEGIN) {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZIZ.LJI();
            if (!this.LJLIL.hasMessages(1201)) {
                this.LJLIL.LIZIZ(1201, 0L);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        EE1 ee12;
        boolean serialExecute;
        ExecutorService executorService;
        ExecutorService LIZLLL;
        boolean serialExecute2;
        int i;
        int i2;
        o.LJIIIZ(msg, "msg");
        if (this.LJLILLLLZI) {
            AtomicBoolean atomicBoolean = C35945E8v.LJ;
            if (atomicBoolean.get() && C35945E8v.LIZLLL > ((Number) DNV.LJ.getValue()).floatValue() && (i = this.LJLJL) < (i2 = this.LJLJLJ)) {
                int i3 = i + 1;
                this.LJLJL = i3;
                if (i3 == i2) {
                    this.LJLJL = 0;
                } else {
                    this.LJLIL.LIZIZ(1201, ((Number) DNV.LIZLLL.getValue()).longValue());
                    return true;
                }
            }
            this.LJLJL = 0;
            C36093EEn.LIZ.getClass();
            EE9 ee9 = C36093EEn.LIZIZ;
            EFK efk = EFK.BOOT_FINISH;
            EE1 LIZLLL2 = ee9.LIZLLL(efk);
            synchronized (ee9.LIZIZ) {
                Object obj = ((ConcurrentHashMap) ee9.LIZIZ).get(efk);
                o.LJI(obj);
                if (!((List) obj).isEmpty()) {
                    Object obj2 = ((ConcurrentHashMap) ee9.LIZIZ).get(efk);
                    o.LJI(obj2);
                    ee12 = (EE1) ((EEY) ((List) obj2).get(0));
                } else {
                    ee12 = null;
                }
            }
            C34K c34k = new C34K();
            if (C34195DbT.LIZ() && this.LJLJI == 2) {
                if (ee12 instanceof InterfaceC36076EDw) {
                    if (((InterfaceC36076EDw) ee12).priority() <= 1) {
                        c34k.element = true;
                        this.LJLJI = 1;
                    }
                } else {
                    c34k.element = true;
                    this.LJLJI = 1;
                }
            }
            if (LIZLLL2 != null) {
                C72242sW c72242sW = new C72242sW();
                if (LIZLLL2 instanceof InterfaceC36076EDw) {
                    EE4 threadType = ((InterfaceC36076EDw) LIZLLL2).threadType();
                    if (threadType != null) {
                        int i4 = EE3.LIZ[threadType.ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                if (((Boolean) DMY.LIZJ.getValue()).booleanValue()) {
                                    if (DMW.LIZ() || LIZLLL2.serialExecute()) {
                                        LIZLLL = C37179EiV.LIZJ;
                                    } else {
                                        Object value = C37179EiV.LIZIZ.getValue();
                                        o.LJIIIIZZ(value, "<get-singleExecutorWork>(...)");
                                        LIZLLL = (ExecutorService) value;
                                    }
                                } else {
                                    if (DMW.LIZ()) {
                                        serialExecute2 = true;
                                    } else {
                                        serialExecute2 = LIZLLL2.serialExecute();
                                    }
                                    LIZLLL = C37179EiV.LIZJ(serialExecute2);
                                }
                            }
                        } else {
                            LIZLLL = C38995FSd.LIZLLL();
                            o.LJIIIIZZ(LIZLLL, "getIOExecutor()");
                        }
                        LIZLLL.execute(new ARunnableS10S0400000_6(LIZLLL2, c72242sW, this, c34k, 5));
                    }
                    throw new C162476Zf();
                }
                if (((Boolean) DMY.LIZJ.getValue()).booleanValue()) {
                    if (DMW.LIZ() || LIZLLL2.serialExecute()) {
                        executorService = C37179EiV.LIZJ;
                    } else {
                        Object value2 = C37179EiV.LIZIZ.getValue();
                        o.LJIIIIZZ(value2, "<get-singleExecutorWork>(...)");
                        executorService = (ExecutorService) value2;
                    }
                    executorService.execute(new ARunnableS10S0400000_6(LIZLLL2, c72242sW, this, c34k, 6));
                } else {
                    if (DMW.LIZ()) {
                        serialExecute = true;
                    } else {
                        serialExecute = LIZLLL2.serialExecute();
                    }
                    C37179EiV.LIZJ(serialExecute).execute(new ARunnableS10S0400000_6(LIZLLL2, c72242sW, this, c34k, 7));
                }
                LIZLLL2.key();
            } else {
                LJI(DNV.LIZ() / 2, c34k.element);
            }
            boolean z = c34k.element;
            if (DNV.LIZ() <= 0 && ee9.LIZIZ(efk)) {
                long longValue = ((Number) DNV.LIZIZ.getValue()).longValue();
                if (z) {
                    longValue += C34343Ddr.LIZ();
                }
                this.LJLIL.LIZIZ(1201, longValue);
            } else if (!this.LJLJJL && !ee9.LIZIZ(efk) && C36839Ed1.LIZIZ(EF7.LIZIZ())) {
                long currentTimeMillis = System.currentTimeMillis() - this.LJLJJLL;
                this.LJLJJL = true;
                atomicBoolean.set(false);
                C2NW.LIZ().LIZLLL(currentTimeMillis);
            }
        }
        return true;
    }

    public final void LJI(long j, boolean z) {
        if (DNV.LIZ() > 0) {
            C36093EEn.LIZ.getClass();
            if (C36093EEn.LIZIZ.LIZIZ(EFK.BOOT_FINISH)) {
                long j2 = this.LJLJLLL;
                if (j2 <= 0) {
                    long j3 = 2;
                    long j4 = j * j3;
                    long LIZ = DNV.LIZ();
                    j2 = ((Number) DNV.LIZIZ.getValue()).longValue() * j3;
                    if (j4 > LIZ) {
                        if (j4 < j2) {
                            j2 = j4;
                        }
                    } else {
                        j2 = LIZ;
                    }
                    if (z) {
                        j2 += C34343Ddr.LIZ();
                    }
                }
                this.LJLIL.LIZIZ(1201, j2);
            }
        }
    }
}
