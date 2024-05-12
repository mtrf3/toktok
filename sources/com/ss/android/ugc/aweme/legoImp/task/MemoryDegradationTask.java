package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import java.util.List;

/* loaded from: classes12.dex */
public class MemoryDegradationTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "MemoryDegradationTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        return 2;
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

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r1.equals("create") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r3 = X.C84763XOl.LIZLLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r1.equals("resume") == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    @Override // X.EEY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r8) {
        /*
            r7 = this;
            X.T06 r2 = X.C84763XOl.LIZLLL()
            X.Sq2 r3 = X.C67613QgD.LIZLLL
            Y.AfS19S0001000_11 r1 = new Y.AfS19S0001000_11
            r6 = 1
            r0 = 0
            r1.<init>(r6, r0)
            X.3kP r0 = r2.LJJJJZI(r1)
            r3.LIZ(r0)
            X.T06 r2 = X.C84763XOl.LIZIZ()
            Y.AfS19S0001000_11 r1 = new Y.AfS19S0001000_11
            r0 = 1
            r1.<init>(r6, r0)
            X.3kP r0 = r2.LJJJJZI(r1)
            r3.LIZ(r0)
            X.Q9E r0 = X.Q9E.LIZJ
            if (r0 != 0) goto L38
            java.lang.Class<X.Q9E> r1 = X.Q9E.class
            monitor-enter(r1)
            X.Q9E r0 = new X.Q9E     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            X.Q9E.LIZJ = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r0
        L38:
            X.Q9E r5 = X.Q9E.LIZJ
            r5.getClass()
            X.FFL r0 = X.FFL.LJIIIZ()
            java.lang.String r3 = "tiktok_memory_degradation_settings"
            java.lang.Class<com.ss.android.ugc.aweme.experiment.MemoryDegradationSettings> r2 = com.ss.android.ugc.aweme.experiment.MemoryDegradationSettings.class
            r0.getClass()
            r1 = 31744(0x7c00, float:4.4483E-41)
            r0 = 0
            java.lang.Object r4 = X.FFL.LJIJ(r6, r3, r1, r2, r0)
            com.ss.android.ugc.aweme.experiment.MemoryDegradationSettings r4 = (com.ss.android.ugc.aweme.experiment.MemoryDegradationSettings) r4
            if (r4 == 0) goto L76
            boolean r0 = r4.enable
            if (r0 == 0) goto L76
            java.lang.String r1 = r4.activityPhase
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1352294148: goto L77;
                case -934426579: goto L80;
                case 109757538: goto L8e;
                case 1557372922: goto L9c;
                default: goto L63;
            }
        L63:
            X.T06 r3 = X.C84763XOl.LIZIZ()
            X.Sq2 r2 = r5.LIZ
            Y.AfS32S0201000_11 r1 = new Y.AfS32S0201000_11
            r0 = 3
            r1.<init>(r6, r5, r4, r0)
            X.3kP r0 = r3.LJJJJZI(r1)
            r2.LIZ(r0)
        L76:
            return
        L77:
            java.lang.String r0 = "create"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L89
            goto L63
        L80:
            java.lang.String r0 = "resume"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L89
            goto L63
        L89:
            X.T06 r3 = X.C84763XOl.LIZLLL()
            goto La9
        L8e:
            java.lang.String r0 = "start"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L97
            goto L63
        L97:
            X.T06 r3 = X.C84763XOl.LJ()
            goto La9
        L9c:
            java.lang.String r0 = "destroy"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La5
            goto L63
        La5:
            X.T06 r3 = X.C84763XOl.LIZIZ()
        La9:
            if (r3 == 0) goto L63
            X.Sq2 r2 = r5.LIZ
            Y.AfS33S0201000_13 r1 = new Y.AfS33S0201000_13
            r0 = 0
            r1.<init>(r6, r5, r4, r0)
            X.3kP r0 = r3.LJJJJZI(r1)
            r2.LIZ(r0)
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.MemoryDegradationTask.run(android.content.Context):void");
    }
}
