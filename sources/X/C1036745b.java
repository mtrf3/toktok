package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.45b */
/* loaded from: classes2.dex */
public final class C1036745b {
    public final InterfaceC70422pa LIZ;
    public final XKW LIZIZ;
    public InterfaceC1038045o LIZJ;
    public final List<C1036845c> LIZLLL;
    public final C45Z LJ;

    public final void LJIILIIL() {
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            XKX.LIZLLL(this.LIZ, null, null, new C1037045e(this, ((C1036845c) it.next()).LIZ, null), 3);
        }
    }

    public C1036745b(InterfaceC70422pa uiScope) {
        XIC backgroundDispatcher = C78613UtF.LIZ;
        o.LJIIIZ(uiScope, "uiScope");
        o.LJIIIZ(backgroundDispatcher, "backgroundDispatcher");
        this.LIZ = uiScope;
        this.LIZIZ = backgroundDispatcher;
        C45Q[] values = C45Q.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (C45Q c45q : values) {
            arrayList.add(new C1036845c(c45q, this.LIZIZ));
        }
        this.LIZLLL = arrayList;
        this.LJ = new C45Z(this, null);
    }

    public final XKQ LIZJ(C1023940d c1023940d) {
        return XKX.LIZLLL(this.LIZ, null, null, new C1033043q(this, c1023940d, null), 3);
    }

    public final void LIZLLL(C41X templateId) {
        o.LJIIIZ(templateId, "templateId");
        LIZJ(new C1023940d(templateId));
    }

    public final void LJIIJ(InterfaceC88472Yns<? super C1023940d, Boolean> selector) {
        o.LJIIIZ(selector, "selector");
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            C1036845c c1036845c = (C1036845c) it.next();
            C1023940d c1023940d = c1036845c.LIZJ;
            if (c1023940d != null && selector.invoke(c1023940d).booleanValue()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('[');
                LIZ.append(c1036845c.LIZ);
                LIZ.append("] Current task ");
                LIZ.append(c1023940d.LIZ);
                LIZ.append(" to be paused.");
                C1038145p.LIZ(X1D.LIZIZ(LIZ));
                AbstractC1036945d<C1023940d> LIZIZ = c1036845c.LIZIZ(c1023940d.LIZ);
                if (LIZIZ != null) {
                    LIZIZ.pause();
                }
            }
        }
    }

    public final <T extends C1023940d> void LJIIJJI(AbstractC1036945d<T> abstractC1036945d) {
        C1036845c c1036845c = (C1036845c) ListProtector.get(this.LIZLLL, abstractC1036945d.LIZ.getSceneId().ordinal());
        c1036845c.getClass();
        c1036845c.LJFF.put(abstractC1036945d.LIZ, abstractC1036945d);
    }

    public final void LJIIL(InterfaceC88472Yns<? super C1023940d, Boolean> selector) {
        o.LJIIIZ(selector, "selector");
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            C1036845c c1036845c = (C1036845c) it.next();
            C1023940d c1023940d = c1036845c.LIZJ;
            if (c1023940d != null && selector.invoke(c1023940d).booleanValue()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('[');
                LIZ.append(c1036845c.LIZ);
                LIZ.append("] Current task ");
                LIZ.append(c1023940d.LIZ);
                LIZ.append(" to be resumed.");
                C1038145p.LIZ(X1D.LIZIZ(LIZ));
                AbstractC1036945d<C1023940d> LIZIZ = c1036845c.LIZIZ(c1023940d.LIZ);
                if (LIZIZ != null) {
                    LIZIZ.resume();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1037845m
            if (r0 == 0) goto L4e
            r6 = r8
            X.45m r6 = (X.C1037845m) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L12:
            java.lang.Object r5 = r6.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r3 = 1
            if (r0 == 0) goto L41
            if (r0 != r3) goto L57
            java.lang.Object r2 = r6.LJLILLLLZI
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.45b r1 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r2.next()
            X.45c r0 = (X.C1036845c) r0
            X.45Q r0 = r0.LIZ
            r6.LJLIL = r1
            r6.LJLILLLLZI = r2
            r6.LJLJJL = r3
            java.lang.Object r0 = r1.LJIILL(r0, r6)
            if (r0 != r4) goto L26
            return r4
        L41:
            X.C141335gf.LIZJ(r5)
            java.util.List<X.45c> r0 = r7.LIZLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
            r1 = r7
            goto L26
        L4e:
            X.45m r6 = new X.45m
            r6.<init>(r7, r8)
            goto L12
        L54:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036745b.LJIILJJIL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1023940d r11, X.InterfaceC67352kd<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C1037345h
            if (r0 == 0) goto Lc0
            r6 = r12
            X.45h r6 = (X.C1037345h) r6
            int r2 = r6.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc0
            int r2 = r2 - r1
            r6.LJLJL = r2
        L12:
            java.lang.Object r0 = r6.LJLJJL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r6.LJLJL
            r7 = 2
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 == r4) goto L2a
            if (r1 != r7) goto Lc7
            boolean r3 = r6.LJLJJI
            X.C141335gf.LIZJ(r0)
        L25:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L2a:
            X.45c r8 = r6.LJLJI
            X.40d r11 = r6.LJLILLLLZI
            X.45b r2 = r6.LJLIL
            X.C141335gf.LIZJ(r0)
            goto L59
        L34:
            X.C141335gf.LIZJ(r0)
            java.util.List<X.45c> r1 = r10.LIZLLL
            X.41X r0 = r11.LIZ
            X.45Q r0 = r0.getSceneId()
            int r0 = r0.ordinal()
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            X.45c r8 = (X.C1036845c) r8
            r6.LJLIL = r10
            r6.LJLILLLLZI = r11
            r6.LJLJI = r8
            r6.LJLJL = r4
            java.lang.Object r0 = r8.LIZ(r11, r6)
            if (r0 != r5) goto L58
            return r5
        L58:
            r2 = r10
        L59:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r9 = 91
            r1.append(r9)
            X.45Q r0 = r8.LIZ
            r1.append(r0)
            java.lang.String r0 = "] Adding task "
            r1.append(r0)
            X.41X r0 = r11.LIZ
            r1.append(r0)
            java.lang.String r0 = " result: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C1038145p.LIZ(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r9)
            X.45Q r0 = r8.LIZ
            r1.append(r0)
            java.lang.String r0 = "] Task list size: "
            r1.append(r0)
            java.util.List<? extends X.40d> r0 = r8.LJ
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C1038145p.LIZ(r0)
            if (r3 == 0) goto L25
            X.41f r1 = new X.41f
            r0 = 0
            r1.<init>(r11, r0)
            r6.LJLIL = r0
            r6.LJLILLLLZI = r0
            r6.LJLJI = r0
            r6.LJLJJI = r3
            r6.LJLJL = r7
            java.lang.Object r0 = r2.LJIIIIZZ(r4, r1, r6)
            if (r0 != r5) goto L25
            return r5
        Lc0:
            X.45h r6 = new X.45h
            r6.<init>(r10, r12)
            goto L12
        Lc7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036745b.LIZ(X.40d, X.2kd):java.lang.Object");
    }

    public final Object LIZIZ(C41X c41x, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return LIZ(new C1023940d(c41x), interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C1023940d r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1037745l
            if (r0 == 0) goto L47
            r5 = r8
            X.45l r5 = (X.C1037745l) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLJJI
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 == r0) goto L26
            if (r1 != r2) goto L4d
            X.C141335gf.LIZJ(r4)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.45b r1 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
            goto L3b
        L2c:
            X.C141335gf.LIZJ(r4)
            r5.LJLIL = r6
            r5.LJLJJI = r0
            java.lang.Object r0 = r6.LIZ(r7, r5)
            if (r0 != r3) goto L3a
            return r3
        L3a:
            r1 = r6
        L3b:
            r0 = 0
            r5.LJLIL = r0
            r5.LJLJJI = r2
            java.lang.Object r0 = r1.LJIILJJIL(r5)
            if (r0 != r3) goto L23
            return r3
        L47:
            X.45l r5 = new X.45l
            r5.<init>(r6, r8)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036745b.LJ(X.40d, X.2kd):java.lang.Object");
    }

    public final Object LJFF(C41X c41x, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJ = LJ(new C1023940d(c41x), interfaceC67352kd);
        if (LJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJ;
        }
        return C76800UCe.LIZ;
    }

    public final XKQ LJI(boolean z, InterfaceC88471Ynr selector) {
        o.LJIIIZ(selector, "selector");
        return XKX.LIZLLL(this.LIZ, null, null, new AnonymousClass448(this, z, selector, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r4.LIZLLL != false) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0190 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.C45Q r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036745b.LJIILL(X.45Q, X.2kd):java.lang.Object");
    }

    public static /* synthetic */ void LJII(C1036745b c1036745b, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            interfaceC88471Ynr = c1036745b.LJ;
        }
        c1036745b.LJI(z, interfaceC88471Ynr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0089 -> B:10:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(boolean r9, X.InterfaceC88471Ynr<? super X.C1023940d, ? super X.InterfaceC67352kd<? super java.lang.Boolean>, ? extends java.lang.Object> r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1037245g
            if (r0 == 0) goto L98
            r4 = r11
            X.45g r4 = (X.C1037245g) r4
            int r2 = r4.LJLJLJ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r4.LJLJLJ = r2
        L12:
            java.lang.Object r0 = r4.LJLJJLL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJLJ
            r3 = 1
            if (r1 == 0) goto L8c
            if (r1 != r3) goto La2
            boolean r9 = r4.LJLIL
            X.40d r1 = r4.LJLJJL
            X.45c r2 = r4.LJLJJI
            java.lang.Object r6 = r4.LJLJI
            java.util.Iterator r6 = (java.util.Iterator) r6
            X.Ynr r10 = r4.LJLILLLLZI
            X.C141335gf.LIZJ(r0)
        L2c:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L68
            r2.LIZLLL = r9
            java.lang.StringBuilder r7 = X.X1D.LIZ()
            r0 = 91
            r7.append(r0)
            X.45Q r0 = r2.LIZ
            r7.append(r0)
            java.lang.String r0 = "] Current task "
            r7.append(r0)
            X.41X r0 = r1.LIZ
            r7.append(r0)
            java.lang.String r0 = " to be invalidated, shouldContinue="
            r7.append(r0)
            r7.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r7)
            X.C1038145p.LIZ(r0)
            X.41X r0 = r1.LIZ
            X.45d r0 = r2.LIZIZ(r0)
            if (r0 == 0) goto L68
            r0.LIZIZ()
        L68:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r2 = r6.next()
            X.45c r2 = (X.C1036845c) r2
            X.40d r1 = r2.LIZJ
            if (r1 != 0) goto L79
            goto L68
        L79:
            r4.LJLILLLLZI = r10
            r4.LJLJI = r6
            r4.LJLJJI = r2
            r4.LJLJJL = r1
            r4.LJLIL = r9
            r4.LJLJLJ = r3
            java.lang.Object r0 = r10.invoke(r1, r4)
            if (r0 != r5) goto L2c
            return r5
        L8c:
            X.C141335gf.LIZJ(r0)
            java.util.List<X.45c> r0 = r8.LIZLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r6 = r0.iterator()
            goto L68
        L98:
            X.45g r4 = new X.45g
            r4.<init>(r8, r11)
            goto L12
        L9f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036745b.LJIIIIZZ(boolean, X.Ynr, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object LJIIIZ(C1036745b c1036745b, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC67352kd interfaceC67352kd, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            interfaceC88471Ynr = c1036745b.LJ;
        }
        return c1036745b.LJIIIIZZ(z, interfaceC88471Ynr, interfaceC67352kd);
    }
}
