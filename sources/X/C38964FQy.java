package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.FQy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38964FQy implements C10O {
    public boolean LIZ;
    public boolean LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    @Override // X.C10O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r8 = this;
            java.lang.String r1 = X.EF7.LJIILIIL
            java.lang.String r0 = "local_test"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            java.lang.String r4 = "SafeView"
            if (r0 != 0) goto Lbb
        Lc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            java.lang.String r2 = X.PKW.LIZJ(r0)
            java.lang.String r0 = "getExceptionStack(RuntimeException(\"SafeView\"))"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r7 = 0
            if (r0 == 0) goto L6b
        L21:
            java.lang.String r5 = ""
        L23:
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r0 = "SafeView:----->"
            java.lang.String r0 = r0.concat(r5)
            r1.println(r0)
            java.lang.String r3 = X.C38987FRv.LIZIZ()
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r0 = "report"
            r2.<init>(r4, r0, r4, r7)
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "EnsureNotNull"
            X.PJi r1 = X.C64246PJi.LJJI(r2, r5, r4, r1, r0)
            java.lang.String r0 = "activity"
            r1.LIZIZ(r0, r3)
            X.C64241PJd.LIZIZ(r1)
            java.lang.Throwable r5 = new java.lang.Throwable
            java.lang.String r0 = "need run in main thread!!!"
            r5.<init>(r0)
            java.lang.StackTraceElement[] r3 = r5.getStackTrace()
            int r2 = r3.length
            r1 = 3
            if (r2 <= r1) goto L67
            int r2 = r2 - r1
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r2]
            java.lang.System.arraycopy(r3, r1, r0, r7, r2)
            r5.setStackTrace(r0)
        L67:
            X.C78983UzD.LJIJ(r5, r4)
            return
        L6b:
            java.lang.String r0 = "\n"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r1 = ujb.s.LJLJJL(r2, r1, r7, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L7d
            goto L21
        L7d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Iterator r5 = r1.iterator()
            r3 = 0
        L87:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            r0 = 1
            if (r0 > r3) goto L9c
            r0 = 4
            if (r3 >= r0) goto L9c
        L99:
            int r3 = r3 + 1
            goto L87
        L9c:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r2)
            r0 = 10
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r6.append(r0)
            goto L99
        Lb0:
            java.lang.String r5 = r6.toString()
            java.lang.String r0 = "stringBuilder.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            goto L23
        Lbb:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            r3.<init>(r0)
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r0 = "AsyncOperatorViewChecker:need run in main thread"
            r1.<init>(r0)
            java.lang.String r0 = "AsyncOperatorViewLancet"
            X.PJZ.LJ(r0, r0, r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            java.lang.String r0 = X.PKW.LIZJ(r0)
            r1.<init>(r0)
            Y.ARunnableS42S0100000_6 r2 = new Y.ARunnableS42S0100000_6
            r0 = 4
            r2.<init>(r1, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38964FQy.LIZ(java.util.Map):void");
    }

    @Override // X.C10O
    public final void LIZIZ(View view, boolean z) {
        o.LJIIIZ(view, "view");
        if (!this.LIZ) {
            if (z) {
                FAJ.LJFF("cold_boot_feed_fragment_onresume_to_layout", true);
                FAJ.LIZ("cold_boot_main_layout_duration", true);
                return;
            }
            FAJ.LJFF("cold_boot_main_layout_duration", true);
            FAJ.LIZ("cold_boot_main_layout_to_draw", true);
            C56662Kg.LIZ().LIZJ("cold_boot_main_layout_to_measure", false);
            C56662Kg.LIZ().LIZJ("cold_boot_main_layout_to_focus", false);
            C56662Kg.LIZ().LIZJ("cold_boot_main_layout_to_feed", false);
            this.LIZ = true;
        }
    }

    @Override // X.C10O
    public final void LIZJ(View view, boolean z) {
        o.LJIIIZ(view, "view");
        if (!this.LIZIZ) {
            if (z) {
                FAJ.LJFF("cold_boot_main_layout_to_draw", true);
                FAJ.LIZ("cold_boot_main_draw_duration", true);
            } else {
                FAJ.LJFF("cold_boot_main_draw_duration", true);
                FAJ.LIZ("cold_boot_main_draw_tail", true);
                C56662Kg.LIZ().LIZJ("cold_boot_main_draw_to_focus", false);
                this.LIZIZ = true;
            }
        }
    }
}
