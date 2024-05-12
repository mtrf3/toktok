package Y;

import X.C36582EXi;
import X.C37179EiV;
import X.C40438Fty;
import X.EFK;
import X.FM9;
import X.InterfaceC65784Pro;
import defpackage.m0;

/* loaded from: classes7.dex */
public class AObjectS23S0000000_6 implements InterfaceC65784Pro {
    public final int $t;

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: Y.AObjectS23S0000000_6.invoke$6(Y.AObjectS23S0000000_6):java.lang.Object
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4807)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:103)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:63)
        	... 1 more
        */
    @Override // X.InterfaceC65784Pro
    public final java.lang.Object invoke() {
        /*
            r1 = this;
            int r0 = r1.$t
            switch(r0) {
                case 0: goto L7;
                case 1: goto Lc;
                case 2: goto L11;
                case 3: goto L16;
                case 4: goto L1b;
                case 5: goto L20;
                case 6: goto L25;
                case 7: goto L2a;
                default: goto L5;
            }
        L5:
            r0 = 0
        L6:
            return r0
        L7:
            java.lang.Object r0 = invoke$0(r1)
            goto L6
        Lc:
            java.lang.Object r0 = invoke$1(r1)
            goto L6
        L11:
            java.lang.Object r0 = invoke$2(r1)
            goto L6
        L16:
            java.lang.Object r0 = invoke$3(r1)
            goto L6
        L1b:
            java.lang.Object r0 = invoke$4(r1)
            goto L6
        L20:
            java.lang.Object r0 = invoke$5(r1)
            goto L6
        L25:
            java.lang.Object r0 = invoke$6(r1)
            goto L6
        L2a:
            java.lang.Object r0 = invoke$7(r1)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS23S0000000_6.invoke():java.lang.Object");
    }

    public AObjectS23S0000000_6(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS23S0000000_6 aObjectS23S0000000_6) {
        C40438Fty.LIZLLL("three_vv");
        return null;
    }

    public static final Object invoke$1(AObjectS23S0000000_6 aObjectS23S0000000_6) {
        return EFK.BACKGROUND;
    }

    public static final Object invoke$2(AObjectS23S0000000_6 aObjectS23S0000000_6) {
        return EFK.BOOT_FINISH;
    }

    public static final Object invoke$3(AObjectS23S0000000_6 aObjectS23S0000000_6) {
        return EFK.IDLE;
    }

    public static final Object invoke$4(AObjectS23S0000000_6 aObjectS23S0000000_6) {
        return m0.LIZIZ(31744, "enable_alog", true, true);
    }

    public static final Object invoke$5(AObjectS23S0000000_6 aObjectS23S0000000_6) {
        FM9.LIZ();
        C37179EiV.LJFF.postDelayed(new ARunnableS13S0000000_6(27), 1000L);
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4807)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:103)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final java.lang.Object invoke$6(Y.AObjectS23S0000000_6 r0) {
        /*
            X.J8K.LIZ()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS23S0000000_6.invoke$6(Y.AObjectS23S0000000_6):java.lang.Object");
    }

    public static final Object invoke$7(AObjectS23S0000000_6 aObjectS23S0000000_6) {
        C36582EXi.LIZ.execute(new ARunnableS13S0000000_6(59));
        return null;
    }
}
