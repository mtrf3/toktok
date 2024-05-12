package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41261je extends C1IE {
    @Override // X.C1IE, X.C0OA
    public final void LIZJ() {
        synchronized (C0OF.LIZJ) {
            int i = this.LIZLLL;
            if (i >= 0) {
                C0OF.LJIIZILJ(i);
                this.LIZLLL = -1;
            }
        }
    }

    @Override // X.C1IE, X.C0OA
    public final void LJIIJJI() {
        C0OF.LJ(C48181uo.LJLIL);
    }

    @Override // X.C1IE
    public final C0OC LJIJI() {
        "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString();
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // X.C1IE, X.C0OA
    public final void LJIIIZ(C0OA snapshot) {
        o.LJIIIZ(snapshot, "snapshot");
        C0OH.LIZ();
        throw null;
    }

    @Override // X.C1IE, X.C0OA
    public final void LJIIJ(C0OA snapshot) {
        o.LJIIIZ(snapshot, "snapshot");
        C0OH.LIZ();
        throw null;
    }

    @Override // X.C1IE, X.C0OA
    public final C0OA LJIIZILJ(InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns) {
        return (C0OA) C0OF.LJ(new IDqS416S0100000(new IDqS416S0100000(interfaceC88472Yns, LiveTryModeCountDownThresholdSetting.DEFAULT), 121));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C41261je(int r6, X.C1IQ r7) {
        /*
            r5 = this;
            java.lang.String r0 = "invalid"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Object r4 = X.C0OF.LIZJ
            monitor-enter(r4)
            java.util.List<X.Yns<java.lang.Object, X.UCe>> r2 = X.C0OF.LJII     // Catch: java.lang.Throwable -> L3b
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L3b
            r1 = 1
            r0 = r0 ^ 1
            r3 = 0
            if (r0 == 0) goto L35
            java.util.List r2 = X.ORZ.LLJILJILJ(r2)     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L35
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L3b
            if (r0 != r1) goto L33
            r0 = 0
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)     // Catch: java.lang.Throwable -> L3b
        L27:
            X.Yns r1 = (X.InterfaceC88472Yns) r1     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L36
            kotlin.jvm.internal.IDqS416S0100000 r1 = new kotlin.jvm.internal.IDqS416S0100000     // Catch: java.lang.Throwable -> L3b
            r0 = 119(0x77, float:1.67E-43)
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L3b
            goto L36
        L33:
            r1 = r3
            goto L27
        L35:
            r1 = r3
        L36:
            monitor-exit(r4)
            r5.<init>(r6, r7, r3, r1)
            return
        L3b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41261je.<init>(int, X.1IQ):void");
    }

    @Override // X.C1IE
    public final C1IE LJJIFFI(InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2) {
        return (C1IE) ((C0OA) C0OF.LJ(new IDqS416S0100000(new IDqS172S0200000(interfaceC88472Yns, interfaceC88472Yns2, (InterfaceC88472Yns<Object, C76800UCe>) 23), 121)));
    }
}
