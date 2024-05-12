package Y;

import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C35387Duh;
import X.C36791EcF;
import X.C38449F7d;
import X.C56662Kg;
import X.FFL;
import X.FH1;
import X.FH8;
import X.FHC;
import com.google.gson.m;

/* loaded from: classes7.dex */
public class AgS45S0000000_6 implements C10I {
    public final int $t;

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: Y.AgS45S0000000_6.then$2(Y.AgS45S0000000_6, X.10K):java.lang.Object
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
    @Override // X.C10I
    public final java.lang.Object then(X.C10K r2) {
        /*
            r1 = this;
            int r0 = r1.$t
            switch(r0) {
                case 0: goto L7;
                case 1: goto Lf;
                case 2: goto L17;
                case 3: goto L1f;
                default: goto L5;
            }
        L5:
            r0 = 0
        L6:
            return r0
        L7:
            r0 = r1
            Y.AgS45S0000000_6 r0 = (Y.AgS45S0000000_6) r0
            java.lang.Object r0 = then$0(r0, r2)
            goto L6
        Lf:
            r0 = r1
            Y.AgS45S0000000_6 r0 = (Y.AgS45S0000000_6) r0
            java.lang.Object r0 = then$1(r0, r2)
            goto L6
        L17:
            r0 = r1
            Y.AgS45S0000000_6 r0 = (Y.AgS45S0000000_6) r0
            java.lang.Object r0 = then$2(r0, r2)
            goto L6
        L1f:
            r0 = r1
            Y.AgS45S0000000_6 r0 = (Y.AgS45S0000000_6) r0
            java.lang.Object r0 = then$3(r0, r2)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS45S0000000_6.then(X.10K):java.lang.Object");
    }

    public AgS45S0000000_6(int i) {
        this.$t = i;
    }

    public static final Object then$0(AgS45S0000000_6 agS45S0000000_6, C10K c10k) {
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return Boolean.FALSE;
        } catch (IncompatibleClassChangeError unused) {
        }
        if (c10k.LJIIL()) {
            return Boolean.FALSE;
        }
        if (c10k.LJIILJJIL()) {
            return Boolean.FALSE;
        }
        C36791EcF.LIZ((m) c10k.LJIIJJI());
        m LJJIJIL = ((m) c10k.LJIIJJI()).LJIIZILJ().LJJIJIL("data");
        if (LJJIJIL != null) {
            C56662Kg.LIZ().LIZJ("method_save_abtest_keva", false);
            FFL.LJIIIZ().getClass();
            FHC.LIZIZ().LIZ();
            FH8.LJIIIIZZ(LJJIJIL);
            C56662Kg.LIZ().LJFF("method_save_abtest_keva", false);
            C35387Duh.LIZIZ.LIZ();
        }
        return Boolean.TRUE;
    }

    public static final Object then$1(AgS45S0000000_6 agS45S0000000_6, C10K c10k) {
        C38449F7d.LJFF().LIZLLL(((Boolean) c10k.LJIIJJI()).booleanValue());
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
    public static final java.lang.Object then$2(Y.AgS45S0000000_6 r0, X.C10K r1) {
        /*
            X.C68542QvC.LIZJ()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS45S0000000_6.then$2(Y.AgS45S0000000_6, X.10K):java.lang.Object");
    }

    public static final Object then$3(AgS45S0000000_6 agS45S0000000_6, C10K c10k) {
        FH1.LJI.getClass();
        FH1.LIZLLL();
        return null;
    }
}
