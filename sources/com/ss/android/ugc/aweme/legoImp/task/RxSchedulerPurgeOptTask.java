package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C36839Ed1;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FNE;
import Y.AfS58S0100000_6;
import android.content.Context;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RxSchedulerPurgeOptTask implements EE1 {
    public static AtomicReference<ScheduledThreadPoolExecutor> LJLILLLLZI;
    public boolean LJLIL;

    @Override // X.EEY
    public final String key() {
        return "RxSchedulerPurgeOptTask";
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
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public static void LIZLLL() {
        try {
            Field declaredField = SchedulerPoolFactory.class.getDeclaredField("PURGE_ENABLED");
            declaredField.setAccessible(true);
            Boolean bool = Boolean.FALSE;
            declaredField.set(SchedulerPoolFactory.class, bool);
            if (o.LJ(declaredField.get(SchedulerPoolFactory.class), bool)) {
                SchedulerPoolFactory.shutdown();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
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
        int intValue = ((Number) FNE.LIZ.getValue()).intValue();
        if (C36839Ed1.LIZIZ(context)) {
            if ((intValue & 1) != 0) {
                C84763XOl.LJI().LJJJJZI(new AfS58S0100000_6(this, 12));
                return;
            } else {
                if ((intValue & 2) == 0) {
                    return;
                }
                LIZLLL();
                return;
            }
        }
        if ((intValue & 4) == 0) {
            return;
        }
        LIZLLL();
    }
}
