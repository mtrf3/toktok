package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.45c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1036845c {
    public static final /* synthetic */ int LJII = 0;
    public final C45Q LIZ;
    public final XKW LIZIZ;
    public C1023940d LIZJ;
    public boolean LIZLLL;
    public List<? extends C1023940d> LJ;
    public final java.util.Map<C41X, AbstractC1036945d<C1023940d>> LJFF;
    public boolean LJI;

    public final AbstractC1036945d<C1023940d> LIZIZ(C41X templateId) {
        o.LJIIIZ(templateId, "templateId");
        return (AbstractC1036945d) ((LinkedHashMap) this.LJFF).get(templateId);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005c -> B:10:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C1037545j
            if (r0 == 0) goto L6f
            r9 = r12
            X.45j r9 = (X.C1037545j) r9
            int r2 = r9.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r9.LJLJL = r2
        L12:
            java.lang.Object r1 = r9.LJLJJL
            X.NAu r10 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJL
            r8 = 1
            if (r0 == 0) goto L5f
            if (r0 != r8) goto L84
            java.lang.Object r7 = r9.LJLJJI
            java.lang.Object r6 = r9.LJLJI
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r9.LJLILLLLZI
            java.util.Collection r5 = (java.util.Collection) r5
            X.45c r4 = r9.LJLIL
            X.C141335gf.LIZJ(r1)
        L2c:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            r0 = r0 ^ 1
            if (r0 == 0) goto L39
            r5.add(r7)
        L39:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r7 = r6.next()
            r3 = r7
            X.40d r3 = (X.C1023940d) r3
            r9.LJLIL = r4
            r9.LJLILLLLZI = r5
            r9.LJLJI = r6
            r9.LJLJJI = r7
            r9.LJLJL = r8
            X.XKW r2 = r4.LIZIZ
            X.45a r1 = new X.45a
            r0 = 0
            r1.<init>(r4, r3, r0)
            java.lang.Object r1 = X.XKX.LJI(r2, r1, r9)
            if (r1 != r10) goto L2c
            return r10
        L5f:
            X.C141335gf.LIZJ(r1)
            java.util.List<? extends X.40d> r0 = r11.LJ
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r0.iterator()
            r4 = r11
            goto L39
        L6f:
            X.45j r9 = new X.45j
            r9.<init>(r11, r12)
            goto L12
        L75:
            java.util.List<? extends X.40d> r1 = r4.LJ
            java.util.Set r0 = X.ORZ.LLJJ(r5)
            java.util.List r0 = X.ORZ.LLIIIILZ(r1, r0)
            r4.LJ = r0
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036845c.LIZJ(X.2kd):java.lang.Object");
    }

    public C1036845c(C45Q sceneId, XKW backgroundDispatcher) {
        o.LJIIIZ(sceneId, "sceneId");
        o.LJIIIZ(backgroundDispatcher, "backgroundDispatcher");
        this.LIZ = sceneId;
        this.LIZIZ = backgroundDispatcher;
        this.LIZLLL = true;
        this.LJ = C61878OQg.INSTANCE;
        this.LJFF = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1023940d r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1037445i
            if (r0 == 0) goto L60
            r5 = r8
            X.45i r5 = (X.C1037445i) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r2 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L69
            X.40d r7 = r5.LJLILLLLZI
            X.45c r1 = r5.LJLIL
            X.C141335gf.LIZJ(r2)
        L24:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L66
            java.util.List<? extends X.40d> r0 = r1.LJ
            java.util.List r0 = X.ORZ.LLIIJI(r7, r0)
            r1.LJ = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L37:
            X.C141335gf.LIZJ(r2)
            X.41X r1 = r7.LIZ
            X.40d r0 = r6.LIZJ
            r2 = 0
            if (r0 == 0) goto L48
            X.41X r0 = r0.LIZ
        L43:
            if (r1 != r0) goto L4a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L48:
            r0 = r2
            goto L43
        L4a:
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJJL = r3
            X.XKW r1 = r6.LIZIZ
            X.45a r0 = new X.45a
            r0.<init>(r6, r7, r2)
            java.lang.Object r2 = X.XKX.LJI(r1, r0, r5)
            if (r2 != r4) goto L5e
            return r4
        L5e:
            r1 = r6
            goto L24
        L60:
            X.45i r5 = new X.45i
            r5.<init>(r6, r8)
            goto L12
        L66:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036845c.LIZ(X.40d, X.2kd):java.lang.Object");
    }
}
