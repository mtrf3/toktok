package X;

import androidx.compose.ui.platform.g1;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08250Ub {
    public static final C1N7 LIZ = new C0UY() { // from class: X.1N7
        @Override // X.C0UY
        public final float LIZ(float f) {
            return f;
        }
    };
    public static final C17R<Boolean> LIZIZ = UC0.LJJJI(C49811xR.LJLIL);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0036 -> B:10:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.InterfaceC37471dX r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C49831xT
            if (r0 == 0) goto L39
            r5 = r7
            X.1xT r5 = (X.C49831xT) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L3f
            X.1dX r6 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            X.11H r4 = (X.C11H) r4
            int r1 = r4.LIZJ
            r0 = 6
            if (r1 != r0) goto L2e
            r3 = r4
        L2a:
            return r3
        L2b:
            X.C141335gf.LIZJ(r4)
        L2e:
            r5.LJLIL = r6
            r5.LJLJI = r2
            java.lang.Object r4 = X.SC5.LIZ(r6, r5)
            if (r4 != r3) goto L22
            goto L2a
        L39:
            X.1xT r5 = new X.1xT
            r5.<init>(r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08250Ub.LIZ(X.1dX, X.2kd):java.lang.Object");
    }

    public static final InterfaceC07790Sh LIZIZ(InterfaceC07790Sh interfaceC07790Sh, C0UK state, C0UT c0ut, C0SP c0sp, boolean z, boolean z2, C0UP c0up, C1OH c1oh) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(state, "state");
        return C07770Sf.LIZ(interfaceC07790Sh, g1.LIZ, new C49821xS(c0ut, state, c0sp, z2, z, c0up, c1oh));
    }
}
