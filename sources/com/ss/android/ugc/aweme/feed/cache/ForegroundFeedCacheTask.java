package com.ss.android.ugc.aweme.feed.cache;

import X.C0RN;
import X.C10K;
import X.C47242IgQ;
import X.C48236IwS;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FRQ;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ForegroundFeedCacheTask implements EE1 {
    public final EFK LJLIL;

    @Override // X.EEY
    public final String key() {
        return "ForegroundFeedCacheTask";
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
        return this.LJLIL;
    }

    public ForegroundFeedCacheTask(EFK workType) {
        o.LJIIIZ(workType, "workType");
        this.LJLIL = workType;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (C47242IgQ.LIZ() == null || !C47242IgQ.LIZ().supportPreloadObservable()) {
            return;
        }
        EFK efk = this.LJLIL;
        if (efk == EFK.IDLE) {
            C48236IwS.LJIJJLI(false);
        } else {
            if (efk != EFK.BOOT_FINISH) {
                return;
            }
            C10K.LJII(180000L).LJ(FRQ.LIZ, C10K.LJIIIIZZ, null);
        }
    }
}
