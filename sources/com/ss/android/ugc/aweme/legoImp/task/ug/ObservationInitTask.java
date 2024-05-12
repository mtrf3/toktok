package com.ss.android.ugc.aweme.legoImp.task.ug;

import X.C0RN;
import X.C221108m2;
import X.C62822Ol8;
import X.E4H;
import X.E4I;
import X.E4J;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import defpackage.s1;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ObservationInitTask implements EE1 {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(E4I.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(E4H.LJLIL);

    @Override // X.EEY
    public final String key() {
        return "ObservationInitTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (s1.LIZLLL("isFirstInstallAndFirstLaunch()")) {
            Iterator it = ((List) this.LJLIL.getValue()).iterator();
            while (it.hasNext()) {
                ((E4J) it.next()).run(context);
            }
        }
        Iterator it2 = ((List) this.LJLILLLLZI.getValue()).iterator();
        while (it2.hasNext()) {
            ((E4J) it2.next()).run(context);
        }
    }
}
