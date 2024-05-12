package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C35478DwA;
import X.C88024Yge;
import X.DPI;
import X.DS1;
import X.E3F;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FGI;
import X.FGJ;
import android.content.Context;
import com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class DeeplinkPrefetchTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "DeeplinkPrefetchTask";
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

    @Override // X.EE1
    public final EFK type() {
        boolean booleanValue;
        if (DPI.LIZ()) {
            if (C35478DwA.LIZIZ() && DS1.LIZ()) {
                booleanValue = true;
            } else {
                booleanValue = false;
            }
        } else {
            booleanValue = ((Boolean) C88024Yge.LJ.getValue()).booleanValue();
        }
        Object LIZJ = E3F.LIZJ("DeeplinkPrefetch_bootfinish", FGI.LJLIL, FGJ.LJLIL, booleanValue);
        if (LIZJ != null) {
            return (EFK) LIZJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        DeeplinkPrefetchImpl.LIZLLL().LIZJ(context);
    }
}
