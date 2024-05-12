package com.ss.android.ugc.aweme.task;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import java.util.List;

/* loaded from: classes7.dex */
public class AppStartLogTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AppStartLogTask";
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
        return 15728639;
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r1.isEmpty() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        r5 = r1.toCharArray();
        r4 = 0;
        r3 = false;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        if (r6 >= r5.length) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        r1 = r5[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        if (r1 != ' ') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        if (r4 != 20) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r3 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        r4 = r4 + 1;
        r2 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(new java.lang.String(r5, r2, r6 - r2)) * (1000 / android.system.Os.sysconf(android.system.OsConstants._SC_CLK_TCK));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        X.FKB.LIZ = r0;
        r4 = X.FKB.LJFF - X.FKB.LIZ;
        r2 = X.FKB.LJI - X.FKB.LJ;
        X.C56672Kh.LIZ().LJIIIIZZ(X.FKB.LIZLLL, "app_main_thread_time");
        X.C56672Kh.LIZ().LJIIIIZZ(r4, "app_launch_to_app_init");
        X.C35810E3q.LJII = r4;
        X.C56662Kg.LIZ().LIZLLL(X.FKB.LIZLLL, "app_main_thread_time");
        X.C56672Kh.LIZ().LJIIIIZZ(r2, "app_init_to_app_attach");
        X.C56662Kg.LIZ().LIZLLL(r4, "app_launch_to_app_init");
        X.C56662Kg.LIZ().LIZLLL(r2, "app_init_to_app_attach");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (r1 != ')') goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x005c, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        if (r5 == null) goto L29;
     */
    @Override // X.EEY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.task.AppStartLogTask.run(android.content.Context):void");
    }
}
