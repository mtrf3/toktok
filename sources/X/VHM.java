package X;

import java.lang.reflect.Type;

/* loaded from: classes15.dex */
public final class VHM implements InterfaceC46993IcP {
    public final VH1 LIZ = new VH1();
    public final VHL LIZIZ = new VHL();
    public final VHJ LIZJ = new VHJ();

    @Override // X.InterfaceC46993IcP
    public final <T> T LIZ(final VHN vhn, final Type type) {
        return (T) C79415VEt.LIZ("pick total cost", new InterfaceC79416VEu() { // from class: X.VHK
            /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
            
                r7 = X.C36901Ee1.LIZ(r0, r6);
             */
            @Override // X.InterfaceC79416VEu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object execute() {
                /*
                    r8 = this;
                    X.VHM r5 = X.VHM.this
                    X.VHN r2 = r2
                    java.lang.reflect.Type r6 = r3
                    monitor-enter(r5)
                    X.VH1 r0 = r5.LIZ     // Catch: java.lang.Throwable -> L68
                    r0.LIZJ(r2)     // Catch: java.lang.Throwable -> L68
                    X.VHL r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L68
                    r0.LIZIZ(r2)     // Catch: java.lang.Throwable -> L68
                    X.VHJ r1 = r5.LIZJ     // Catch: java.lang.Throwable -> L68
                    r1.LIZ = r2     // Catch: java.lang.Throwable -> L68
                    java.util.List<java.util.List<com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig>> r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L68
                    if (r0 != 0) goto L1f
                    java.util.List r0 = r1.LIZ()     // Catch: java.lang.Throwable -> L68
                    r1.LIZIZ = r0     // Catch: java.lang.Throwable -> L68
                L1f:
                    java.util.List<java.util.List<com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig>> r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L68
                    r7 = 0
                    if (r0 != 0) goto L26
                    monitor-exit(r5)
                    goto L67
                L26:
                    java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L68
                    java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L68
                L2c:
                    boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L68
                    if (r0 == 0) goto L64
                    java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L68
                    java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L68
                    X.VH1 r0 = r5.LIZ     // Catch: java.lang.Throwable -> L68
                    java.util.List r3 = r0.LIZIZ(r1)     // Catch: java.lang.Throwable -> L68
                    r0 = r3
                    java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L68
                    int r2 = r0.size()     // Catch: java.lang.Throwable -> L68
                    r1 = 1
                    if (r2 != r1) goto L52
                    r0 = 0
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r0)     // Catch: java.lang.Throwable -> L68
                    com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig r0 = (com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig) r0     // Catch: java.lang.Throwable -> L68
                    com.google.gson.j r0 = r0.configContent     // Catch: java.lang.Throwable -> L68
                    goto L53
                L52:
                    r0 = r7
                L53:
                    if (r2 <= r1) goto L5d
                    X.VHL r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L68
                    com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig r0 = r0.LIZ(r3)     // Catch: java.lang.Throwable -> L68
                    com.google.gson.j r0 = r0.configContent     // Catch: java.lang.Throwable -> L68
                L5d:
                    if (r0 == 0) goto L2c
                    java.lang.Object r7 = X.C36901Ee1.LIZ(r0, r6)     // Catch: java.lang.Throwable -> L68
                    goto L66
                L64:
                    monitor-exit(r5)
                    goto L67
                L66:
                    monitor-exit(r5)
                L67:
                    return r7
                L68:
                    r0 = move-exception
                    monitor-exit(r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.VHK.execute():java.lang.Object");
            }
        });
    }
}
