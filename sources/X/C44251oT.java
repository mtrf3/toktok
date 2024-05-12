package X;

import fjb.a;
import kotlin.jvm.internal.o;

/* renamed from: X.1oT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44251oT<R> implements InterfaceC37471dX, InterfaceC23370vt, InterfaceC67352kd<R> {
    public final InterfaceC67352kd<R> LJLIL;
    public final /* synthetic */ C533427m LJLILLLLZI;
    public XJL<? super C11H> LJLJI;
    public C11I LJLJJI = C11I.Main;
    public final MBB LJLJJL = MBB.INSTANCE;
    public final /* synthetic */ C533427m LJLJJLL;

    @Override // X.InterfaceC23370vt
    public final long LJIJ(long j) {
        return this.LJLILLLLZI.LJIJ(j);
    }

    @Override // X.InterfaceC23370vt
    public final int LJJIJ(float f) {
        return this.LJLILLLLZI.LJJIJ(f);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJIJL(long j) {
        return this.LJLILLLLZI.LJJIJL(j);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJI() {
        return this.LJLILLLLZI.LJJJJI();
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJIZL(float f) {
        return this.LJLILLLLZI.LJJJJIZL(f);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLL(int i) {
        return this.LJLILLLLZI.LJJJLL(i);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLZIJ(float f) {
        return this.LJLILLLLZI.LJJJLZIJ(f);
    }

    @Override // X.InterfaceC23370vt
    public final long LJJLI(long j) {
        return this.LJLILLLLZI.LJJLI(j);
    }

    @Override // X.InterfaceC23370vt
    public final float getDensity() {
        return this.LJLILLLLZI.getDensity();
    }

    @Override // X.InterfaceC37471dX
    public final long LIZ() {
        return this.LJLJJLL.LJLJLJ;
    }

    @Override // X.InterfaceC37471dX
    public final C11H LJJJ() {
        return this.LJLJJLL.LJLJJI;
    }

    @Override // X.InterfaceC37471dX
    public final long LJJLIIIJL() {
        C533427m c533427m = this.LJLJJLL;
        long LJJLI = c533427m.LJJLI(c533427m.LJLILLLLZI.LJ());
        long LIZ = c533427m.LIZ();
        return C1DF.LIZIZ(Math.max(0.0f, C10430b1.LIZLLL(LJJLI) - ((int) (LIZ >> 32))) / 2.0f, Math.max(0.0f, C10430b1.LIZIZ(LJJLI) - C23490w5.LIZIZ(LIZ)) / 2.0f);
    }

    @Override // X.InterfaceC37471dX
    public final InterfaceC015404g getViewConfiguration() {
        return this.LJLJJLL.LJLILLLLZI;
    }

    @Override // X.InterfaceC67352kd
    public final MBA getContext() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC67352kd
    public final void resumeWith(Object obj) {
        C533427m c533427m = this.LJLJJLL;
        synchronized (c533427m.LJLJJL) {
            c533427m.LJLJJL.LJIIL(this);
        }
        this.LJLIL.resumeWith(obj);
    }

    public C44251oT(C533427m c533427m, XKS xks) {
        this.LJLJJLL = c533427m;
        this.LJLIL = xks;
        this.LJLILLLLZI = c533427m;
    }

    public final void LJI(C11H c11h, C11I pass) {
        XJL<? super C11H> xjl;
        o.LJIIIZ(pass, "pass");
        if (pass == this.LJLJJI && (xjl = this.LJLJI) != null) {
            this.LJLJI = null;
            C3C5.m7constructorimpl(c11h);
            xjl.resumeWith(c11h);
        }
    }

    @Override // X.InterfaceC37471dX
    public final Object LJJIFFI(C11I c11i, a aVar) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(aVar));
        xks.LJIIL();
        this.LJLJJI = c11i;
        this.LJLJI = xks;
        return xks.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.InterfaceC37471dX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJ(long r6, X.C54742Cw r8, X.InterfaceC67352kd r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C533527n
            if (r0 == 0) goto L1e
            r4 = r9
            X.27n r4 = (X.C533527n) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJI
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L28
            goto L24
        L1e:
            X.27n r4 = new X.27n
            r4.<init>(r5, r9)
            goto L12
        L24:
            X.C141335gf.LIZJ(r3)     // Catch: X.C11J -> L3c
            goto L3d
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r3)
            r4.LJLJI = r0     // Catch: X.C11J -> L3c
            java.lang.Object r3 = r5.LJJLIIJ(r6, r8, r4)     // Catch: X.C11J -> L3c
            if (r3 != r2) goto L3d
            return r2
        L3c:
            r3 = 0
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44251oT.LJJIIJ(long, X.2Cw, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.JobSupport] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.JobSupport] */
    @Override // X.InterfaceC37471dX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LJJLIIJ(long r8, X.InterfaceC88471Ynr<? super X.InterfaceC37471dX, ? super X.InterfaceC67352kd<? super T>, ? extends java.lang.Object> r10, X.InterfaceC67352kd<? super T> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C533327l
            if (r0 == 0) goto L21
            r5 = r11
            X.27l r5 = (X.C533327l) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r2 = r5.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2b
            X.XKQ r1 = r5.LJLIL
            goto L27
        L21:
            X.27l r5 = new X.27l
            r5.<init>(r7, r11)
            goto L12
        L27:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L6c
            goto L68
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C141335gf.LIZJ(r2)
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L4f
            X.XJL<? super X.11H> r1 = r7.LJLJI
            if (r1 == 0) goto L4f
            X.11J r0 = new X.11J
            r0.<init>(r8)
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
            r1.resumeWith(r0)
        L4f:
            X.27m r0 = r7.LJLJJLL
            X.2pa r2 = r0.LJLJLLL
            X.2Gq r1 = new X.2Gq
            r1.<init>(r8, r7, r4)
            r0 = 3
            X.XKQ r1 = X.XKX.LIZLLL(r2, r4, r4, r1, r0)
            r5.LJLIL = r1     // Catch: java.lang.Throwable -> L6c
            r5.LJLJJI = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r2 = r10.invoke(r7, r5)     // Catch: java.lang.Throwable -> L6c
            if (r2 != r6) goto L68
            return r6
        L68:
            r1.LIZIZ(r4)
            return r2
        L6c:
            r0 = move-exception
            r1.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44251oT.LJJLIIJ(long, X.Ynr, X.2kd):java.lang.Object");
    }
}
