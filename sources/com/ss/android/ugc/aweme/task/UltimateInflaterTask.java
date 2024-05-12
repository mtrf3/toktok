package com.ss.android.ugc.aweme.task;

import X.C0RN;
import X.C141335gf;
import X.C16880lQ;
import X.C37123Ehb;
import X.C38608FDg;
import X.C38612FDk;
import X.C38619FDr;
import X.C38891fp;
import X.C38995FSd;
import X.C3C5;
import X.C65352Pkq;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FDY;
import X.FOR;
import X.X1D;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UltimateInflaterTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "UltimateInflaterTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        Object LIZ;
        Integer LJJIJIL;
        if (context == null) {
            return;
        }
        C38608FDg c38608FDg = new C38608FDg(context);
        c38608FDg.LIZ = R.style.ul;
        TimeUnit unit = TimeUnit.SECONDS;
        o.LJIIJ(unit, "unit");
        long millis = unit.toMillis(60L);
        if (millis >= 0) {
            c38608FDg.LIZLLL = millis;
            long millis2 = unit.toMillis(60L);
            if (millis2 >= 0) {
                c38608FDg.LJ = millis2;
                try {
                    LIZ = FOR.LJFF.LIZIZ();
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                    LIZ = C38995FSd.LIZLLL();
                }
                o.LJIIIIZZ(LIZ, "runCatching { NitaExecut…lHelper.getIOExecutor() }");
                c38608FDg.LIZIZ = (Executor) LIZ;
                c38608FDg.LIZJ = new C37123Ehb();
                Context LLLLL = C16880lQ.LLLLL(c38608FDg.LJFF);
                if (LLLLL != null) {
                    int i = c38608FDg.LIZ;
                    Executor executor = c38608FDg.LIZIZ;
                    if (executor == null) {
                        executor = (Executor) C38608FDg.LJI.getValue();
                    }
                    C38612FDk c38612FDk = new C38612FDk(LLLLL, i, executor, c38608FDg.LIZJ, c38608FDg.LIZLLL, c38608FDg.LJ);
                    AtomicBoolean atomicBoolean = C38619FDr.LIZ;
                    if (!atomicBoolean.get()) {
                        synchronized (C65352Pkq.LIZ(C38619FDr.class)) {
                            if (!atomicBoolean.get()) {
                                C38619FDr.LIZIZ = c38612FDk;
                                atomicBoolean.set(true);
                            }
                        }
                    }
                    if (((Boolean) FDY.LIZJ.getValue()).booleanValue() && FDY.LJFF.compareAndSet(false, true) && (LJJIJIL = C38891fp.LJJIJIL("common_feed_item_feed")) != null) {
                        int intValue = LJJIJIL.intValue();
                        C38619FDr.LIZLLL.getClass();
                        C38619FDr.LJ(null, intValue, "common_feed_item_feed");
                        return;
                    }
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Cannot get application context from context : ");
                LIZ2.append(c38608FDg.LJFF);
                throw new IllegalStateException(X1D.LIZIZ(LIZ2));
            }
            throw new IllegalStateException("readyCacheKeepAliveTime < 0.");
        }
        throw new IllegalStateException("pendingCacheKeepAliveTime < 0.");
    }
}
