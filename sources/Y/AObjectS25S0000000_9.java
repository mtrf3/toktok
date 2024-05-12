package Y;

import X.BLD;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.main.MainActivity;

/* loaded from: classes10.dex */
public class AObjectS25S0000000_9 implements InterfaceC65784Pro {
    public final int $t;

    public static final Object invoke$2(AObjectS25S0000000_9 aObjectS25S0000000_9) {
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: Y.AObjectS25S0000000_9.invoke$0(Y.AObjectS25S0000000_9):java.lang.Object
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
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS25S0000000_9.invoke():java.lang.Object");
    }

    public AObjectS25S0000000_9(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS25S0000000_9 aObjectS25S0000000_9) {
        return MainActivity.lambda$onCreate$3();
    }

    public static final Object invoke$1(AObjectS25S0000000_9 aObjectS25S0000000_9) {
        return new BLD(0);
    }

    public static final Object invoke$3(AObjectS25S0000000_9 aObjectS25S0000000_9) {
        return MainActivity.lambda$onCreate$4();
    }

    public static final Object invoke$4(AObjectS25S0000000_9 aObjectS25S0000000_9) {
        return MainActivity.lambda$onCreate$5();
    }
}
