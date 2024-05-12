package com.ss.android.ugc.aweme.lego.wrapper;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InitServiceGroupTask implements EE1 {
    public final ArrayList<Runnable> LJLIL;
    public final int LJLILLLLZI;
    public final EFK LJLJI;

    @Override // X.EEY
    public final String key() {
        return "InitServiceGroupTask";
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

    @Override // X.EEY
    public final int targetProcess() {
        return this.LJLILLLLZI;
    }

    @Override // X.EE1
    public final EFK type() {
        return this.LJLJI;
    }

    public InitServiceGroupTask(Runnable[] runnableArr) {
        EFK type = EFK.MAIN;
        o.LJIIIZ(type, "type");
        this.LJLIL = new ArrayList<>();
        this.LJLILLLLZI = 1;
        this.LJLJI = type;
        for (Runnable runnable : runnableArr) {
            this.LJLIL.add(runnable);
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        Iterator<Runnable> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            Runnable next = it.next();
            if (next != null) {
                next.run();
            }
        }
    }
}
