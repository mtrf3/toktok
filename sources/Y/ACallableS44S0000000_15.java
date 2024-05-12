package Y;

import X.AbstractC36908Ee8;
import com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes16.dex */
public class ACallableS44S0000000_15 implements Callable {
    public final int $t;

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: Y.ACallableS44S0000000_15.call$2(Y.ACallableS44S0000000_15):java.lang.Object
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
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        /*
            r1 = this;
            int r0 = r1.$t
            switch(r0) {
                case 0: goto L7;
                case 1: goto Lc;
                case 2: goto L11;
                default: goto L5;
            }
        L5:
            r0 = 0
        L6:
            return r0
        L7:
            java.lang.Object r0 = call$0(r1)
            goto L6
        Lc:
            java.lang.Object r0 = call$1(r1)
            goto L6
        L11:
            java.lang.Object r0 = call$2(r1)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS44S0000000_15.call():java.lang.Object");
    }

    public ACallableS44S0000000_15(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS44S0000000_15 aCallableS44S0000000_15) {
        try {
            return PromoteProgramRequestApiManager.LIZ.confirmPromoteProgram("1").get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static final Object call$1(ACallableS44S0000000_15 aCallableS44S0000000_15) {
        try {
            return PromoteProgramRequestApiManager.LIZ.cancelPromoteProgram().get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static final Object call$2(ACallableS44S0000000_15 aCallableS44S0000000_15) {
        return PushSettingsApiManager.LJFF();
    }
}
