package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FMW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            LIZLLL("executeMethodSafely", "ExceptionHelper", "executeMethodSafely", "", e);
        }
    }

    public static void LIZJ(InterfaceC65784Pro interfaceC65784Pro) {
        try {
            interfaceC65784Pro.invoke();
        } catch (Exception e) {
            LIZLLL("executeMethodSafely", "ExceptionHelper", "executeMethodSafely", "", e);
        }
    }

    public static void LIZIZ(String className, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(className, "className");
        if (interfaceC65784Pro != null) {
            try {
                interfaceC65784Pro.invoke();
            } catch (Exception e) {
                LIZLLL("executeMethodSafely", className, "executeMethodSafely", "", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Throwable r13) {
        /*
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "className"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "methodName"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            java.lang.String r6 = X.C38987FRv.LIZIZ()
            java.lang.StackTraceElement r5 = new java.lang.StackTraceElement
            r4 = 0
            r5.<init>(r10, r11, r12, r4)
            java.lang.String r2 = X.V0N.LJJIJL(r13)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r8 = 5
            if (r0 == 0) goto L54
        L29:
            java.lang.String r2 = ""
        L2b:
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "EnsureNotReachHere"
            X.PJi r1 = X.C64246PJi.LJJI(r5, r2, r9, r1, r0)
            java.lang.String r0 = "activity"
            r1.LIZIZ(r0, r6)
            X.C64241PJd.LIZIZ(r1)
            java.lang.StackTraceElement[] r1 = r13.getStackTrace()
            int r0 = r1.length
            if (r0 <= r8) goto L50
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r8]
            java.lang.System.arraycopy(r1, r4, r0, r4, r8)
            r13.setStackTrace(r0)
        L50:
            X.C78983UzD.LJIJ(r13, r9)
            return
        L54:
            java.lang.String r0 = "\n"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r1 = ujb.s.LJLJJL(r2, r1, r4, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L66
            goto L29
        L66:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.Iterator r3 = r1.iterator()
            r2 = 0
        L70:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r2 != r8) goto L88
        L7e:
            java.lang.String r2 = r7.toString()
            java.lang.String r0 = "stringBuilder.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L2b
        L88:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r0)
            r0 = 10
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r7.append(r0)
            int r2 = r2 + 1
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FMW.LIZLLL(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }
}
