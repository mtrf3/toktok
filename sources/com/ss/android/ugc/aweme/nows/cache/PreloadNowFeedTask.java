package com.ss.android.ugc.aweme.nows.cache;

import X.C0RN;
import X.C47243IgR;
import X.C84339X8d;
import X.C84340X8e;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC84349X8n;
import android.content.Context;
import com.ss.android.ugc.aweme.nows.api.NowFeedPreload;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PreloadNowFeedTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PreloadNowFeedTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        NowFeedPreload.Companion.getClass();
        if (NowFeedPreload.preloadAbort) {
            return;
        }
        final C47243IgR c47243IgR = new C47243IgR();
        InterfaceC84349X8n interfaceC84349X8n = new InterfaceC84349X8n() { // from class: X.8Mx
            @Override // X.InterfaceC84349X8n
            public final void LIZ(X8W trigger) {
                o.LJIIIZ(trigger, "trigger");
                trigger.LIZIZ(null, NowFeedPreload.class, C47243IgR.this);
            }
        };
        C84339X8d.LIZJ.getClass();
        C84340X8e.LIZIZ(interfaceC84349X8n);
    }
}
