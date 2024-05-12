package com.ss.android.ugc.aweme.external;

import X.AbstractC43051Gv1;
import X.C0RN;
import X.C32I;
import X.C43089Gvd;
import X.C76800UCe;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.P8H;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AVCleanStorageTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AVCleanStorageTask";
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

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        if (!C43089Gvd.LIZ.getAndSet(true)) {
            List<AbstractC43051Gv1> LIZ = C43089Gvd.LIZ();
            ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ, 10));
            for (AbstractC43051Gv1 abstractC43051Gv1 : LIZ) {
                P8H.LJIIL(abstractC43051Gv1);
                abstractC43051Gv1.LJI().getClass();
                arrayList.add(C76800UCe.LIZ);
            }
        }
    }
}
