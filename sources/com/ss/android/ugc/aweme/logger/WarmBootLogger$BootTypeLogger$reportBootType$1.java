package com.ss.android.ugc.aweme.logger;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import java.util.List;

/* loaded from: classes10.dex */
public final class WarmBootLogger$BootTypeLogger$reportBootType$1 implements EE1 {
    public final /* synthetic */ int LJLIL;

    @Override // X.EEY
    public final String key() {
        return "WarmBootLogger$BootTypeLogger$reportBootType$1";
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

    public WarmBootLogger$BootTypeLogger$reportBootType$1(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #0 {Exception -> 0x0047, blocks: (B:3:0x000c, B:14:0x0030, B:15:0x0033, B:20:0x0042, B:23:0x0026, B:24:0x0029, B:25:0x002c), top: B:2:0x000c }] */
    @Override // X.EEY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            int r3 = r4.LJLIL
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "type"
            r1.put(r0, r3)     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = "main_boot_type"
            com.ss.android.common.lib.AppLogNewUtils.onEventV3(r0, r1)     // Catch: java.lang.Exception -> L47
            r2 = 1
            if (r3 == r2) goto L2c
            r1 = 2
            if (r3 == r1) goto L29
            r0 = 3
            if (r3 == r0) goto L26
            r0 = 4
            if (r3 == r0) goto L29
            r0 = 5
            if (r3 == r0) goto L2c
            goto L30
        L26:
            X.C46538IOg.LIZJ = r1     // Catch: java.lang.Exception -> L47
            goto L33
        L29:
            X.C46538IOg.LIZJ = r2     // Catch: java.lang.Exception -> L47
            goto L33
        L2c:
            r0 = 0
            X.C46538IOg.LIZJ = r0     // Catch: java.lang.Exception -> L47
            goto L33
        L30:
            r0 = -1
            X.C46538IOg.LIZJ = r0     // Catch: java.lang.Exception -> L47
        L33:
            com.ss.android.ugc.quota.BDNetworkTagManager r2 = com.ss.android.ugc.quota.BDNetworkTagManager.LIZIZ()     // Catch: java.lang.Exception -> L47
            int r1 = X.C46538IOg.LIZJ     // Catch: java.lang.Exception -> L47
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.LIZIZ     // Catch: java.lang.Exception -> L47
            boolean r0 = r0.get()     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L42
            goto L47
        L42:
            X.M2Y r0 = r2.LIZ     // Catch: java.lang.Exception -> L47
            r0.LIZ(r1)     // Catch: java.lang.Exception -> L47
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.logger.WarmBootLogger$BootTypeLogger$reportBootType$1.run(android.content.Context):void");
    }
}
