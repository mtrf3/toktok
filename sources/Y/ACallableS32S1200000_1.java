package Y;

import X.AbstractC73638SvC;
import X.C114724eq;
import X.C85999Xp5;
import com.bytedance.im.core.proto.Request;
import com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACallableS32S1200000_1 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$0(ACallableS32S1200000_1 aCallableS32S1200000_1) {
        PlatformApi platformApi = (PlatformApi) aCallableS32S1200000_1.l1;
        String str = ((C114724eq) aCallableS32S1200000_1.l2).LIZ;
        String str2 = aCallableS32S1200000_1.s0;
        String LIZIZ = C85999Xp5.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getAppLocale()");
        C114724eq c114724eq = (C114724eq) aCallableS32S1200000_1.l2;
        return AbstractC73638SvC.LJIIZILJ(platformApi.postSDK(str, str2, LIZIZ, (Request) c114724eq.LIZLLL, c114724eq.LJ));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS32S1200000_1 r10) {
        /*
            java.lang.Object r0 = r10.l1
            java.util.List r0 = (java.util.List) r0
            java.util.List r5 = X.C49825Jgz.LJIJJLI(r0)
            java.lang.String r0 = "awemeList"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            java.lang.String r4 = r10.s0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r3 = r5.iterator()
            r9 = 0
        L16:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.lang.String r0 = r2.getAid()
            boolean r1 = X.C78685UuP.LJJJZ(r0)
            java.lang.String r0 = r2.getAid()
            boolean r0 = r0.equals(r4)
            r0 = r0 & r1
            if (r0 == 0) goto L84
            if (r9 >= 0) goto L3a
        L37:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3a:
            java.lang.Object r1 = r10.l2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8 = 0
            if (r1 == 0) goto L82
            r1.intValue()
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = X.C49603JdP.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L82
            java.lang.String r7 = r0.toString()
        L54:
            java.util.Iterator r6 = r5.iterator()
            r5 = 0
        L59:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r4 = r6.next()
            int r3 = r5 + 1
            if (r5 < 0) goto L87
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            if (r7 != 0) goto L80
            java.lang.String r2 = ""
        L6d:
            if (r5 != r9) goto L7a
            r1 = 0
        L70:
            int r5 = r5 - r9
            int r0 = java.lang.Math.abs(r5)
            X.C49603JdP.LJ(r1, r0, r4, r2)
            r5 = r3
            goto L59
        L7a:
            if (r5 >= r9) goto L7e
            r1 = 2
            goto L70
        L7e:
            r1 = 1
            goto L70
        L80:
            r2 = r7
            goto L6d
        L82:
            r7 = r8
            goto L54
        L84:
            int r9 = r9 + 1
            goto L16
        L87:
            X.C47261Igj.LJJJJJ()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS32S1200000_1.call$1(Y.ACallableS32S1200000_1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS32S1200000_1(Object obj, PlatformApi platformApi, C114724eq<Request> c114724eq, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = platformApi;
        this.s0 = c114724eq;
    }
}
