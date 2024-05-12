package com.ss.android.legoimpl;

import X.C0RN;
import X.C10K;
import X.C22690un;
import X.C22730ur;
import X.C36922EeM;
import X.C38995FSd;
import X.C65304Pk4;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import X.FLD;
import Y.ARunnableS42S0100000_6;
import Y.IDCallableS414S0100000;
import android.content.Context;
import com.aweme.storage.CacheStrategy;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StorageTask implements EE1 {
    public boolean LJLIL;

    @Override // X.EEY
    public final String key() {
        return "StorageTask";
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
        return 1;
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
        return EFK.BOOT_FINISH;
    }

    public final void LIZLLL(Context context) {
        CacheStrategy cacheStrategy;
        o.LJIIIZ(context, "context");
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        C36922EeM.LJ("StorageTask");
        C22730ur c22730ur = new C22730ur();
        c22730ur.LIZIZ = new C65304Pk4();
        c22730ur.LIZ = new FLD(context);
        try {
            FFL.LJIIIZ().getClass();
            cacheStrategy = (CacheStrategy) FFL.LJIILLIIL(CacheStrategy.class, "storage_clean", true);
        } catch (Throwable unused) {
            cacheStrategy = null;
        }
        c22730ur.LIZJ = cacheStrategy;
        if (C22690un.LIZJ) {
            return;
        }
        C22690un.LIZJ = true;
        C22690un.LIZLLL = c22730ur;
        C10K.LIZIZ(new IDCallableS414S0100000(context, 5), C38995FSd.LIZLLL(), null);
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        if (this.LJLIL) {
            return;
        }
        try {
            LIZLLL(context);
        } catch (Throwable unused) {
        }
        ScheduledExecutorService LJ = C38995FSd.LJ();
        ARunnableS42S0100000_6 aRunnableS42S0100000_6 = new ARunnableS42S0100000_6(context, 122);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LJ.schedule(aRunnableS42S0100000_6, 3L, timeUnit);
        C38995FSd.LJ().schedule(new ARunnableS42S0100000_6(context, 59), 3L, timeUnit);
    }
}
