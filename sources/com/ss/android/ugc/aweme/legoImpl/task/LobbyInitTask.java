package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C16880lQ;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F6W;
import X.QB6;
import X.QB7;
import X.QCH;
import android.content.Context;
import com.bytedance.lobby.internal.LobbyCore;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LobbyInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "LobbyInitTask";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        QCH qch = new QCH();
        QB7 qb7 = new QB7();
        qb7.LIZ = C16880lQ.LLLLL(context);
        qb7.LIZIZ = false;
        qb7.LIZJ = qch;
        qb7.LIZLLL = new F6W();
        LobbyCore.initialize(new QB6(qb7));
    }
}
