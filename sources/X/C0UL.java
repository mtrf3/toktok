package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* renamed from: X.0UL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UL {
    public final C0UT LIZ;
    public final boolean LIZIZ;
    public final InterfaceC24760y8<C25730zh> LIZJ;
    public final C0UK LIZLLL;
    public final C0UP LJ;
    public final C0SP LJFF;
    public final ParcelableSnapshotMutableState LJI;

    public final long LIZLLL(long j) {
        if (this.LIZLLL.LIZ()) {
            return C10370av.LIZIZ;
        }
        C0UK c0uk = this.LIZLLL;
        float LJ = LJ(j);
        if (this.LIZIZ) {
            LJ *= -1;
        }
        float LIZJ = c0uk.LIZJ(LJ);
        if (this.LIZIZ) {
            LIZJ *= -1;
        }
        return LJFF(LIZJ);
    }

    public final float LJ(long j) {
        if (this.LIZ == C0UT.Horizontal) {
            return C10370av.LIZLLL(j);
        }
        return C10370av.LJ(j);
    }

    public final long LJFF(float f) {
        if (f == 0.0f) {
            return C10370av.LIZIZ;
        }
        if (this.LIZ == C0UT.Horizontal) {
            return C78923UyF.LIZ(f, 0.0f);
        }
        return C78923UyF.LIZ(0.0f, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(long r12, X.InterfaceC67352kd<? super X.C23560wC> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C49571x3
            r6 = r11
            if (r0 == 0) goto L49
            r4 = r14
            X.1x3 r4 = (X.C49571x3) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L13:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L4f
            X.2sW r7 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L23:
            long r1 = r7.element
            X.0wC r0 = new X.0wC
            r0.<init>(r1)
            return r0
        L2b:
            X.C141335gf.LIZJ(r3)
            X.2sW r7 = new X.2sW
            r7.<init>()
            r8 = r12
            r7.element = r8
            X.0UK r0 = r6.LIZLLL
            X.2Cr r5 = new X.2Cr
            r10 = 0
            r5.<init>(r6, r7, r8, r10)
            r4.LJLIL = r7
            r4.LJLJJI = r1
            java.lang.Object r0 = X.C74221TAz.LJ(r0, r5, r4)
            if (r0 != r2) goto L23
            return r2
        L49:
            X.1x3 r4 = new X.1x3
            r4.<init>(r6, r14)
            goto L13
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UL.LIZIZ(long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r17, X.InterfaceC67352kd<? super X.C76800UCe> r19) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UL.LIZJ(long, X.2kd):java.lang.Object");
    }

    public final long LIZ(C0UY dispatchScroll, long j, int i) {
        int i2;
        long j2;
        long j3;
        long j4;
        o.LJIIIZ(dispatchScroll, "$this$dispatchScroll");
        if (this.LIZ == C0UT.Horizontal) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        long LIZ = C10370av.LIZ(j, i2);
        C0SP c0sp = this.LJFF;
        if (c0sp != null && c0sp.isEnabled()) {
            j2 = this.LJFF.LJFF(LIZ);
        } else {
            j2 = C10370av.LIZIZ;
        }
        long LJFF = C10370av.LJFF(LIZ, j2);
        C25730zh value = this.LIZJ.getValue();
        C27C c27c = value.LIZJ;
        if (c27c != null) {
            j3 = c27c.LIZIZ(i, LJFF);
        } else {
            j3 = C10370av.LIZIZ;
        }
        long LJFF2 = C10370av.LJFF(LJFF, j3);
        if (this.LIZIZ) {
            j4 = C10370av.LJII(-1.0f, LJFF2);
        } else {
            j4 = LJFF2;
        }
        long LJFF3 = LJFF(dispatchScroll.LIZ(LJ(j4)));
        if (this.LIZIZ) {
            LJFF3 = C10370av.LJII(-1.0f, LJFF3);
        }
        long LJFF4 = C10370av.LJFF(LJFF2, LJFF3);
        long LIZIZ = value.LIZIZ(i, LJFF3, LJFF4);
        long LJFF5 = C10370av.LJFF(LJFF4, LIZIZ);
        C0SP c0sp2 = this.LJFF;
        if (c0sp2 != null && c0sp2.isEnabled()) {
            this.LJFF.LJ(i, LJFF2, LJFF5);
        }
        return C10370av.LJFF(LJFF4, LIZIZ);
    }

    public C0UL(C0UT orientation, boolean z, InterfaceC35811ar nestedScrollDispatcher, C0UK scrollableState, C0UP flingBehavior, C0SP c0sp) {
        o.LJIIIZ(orientation, "orientation");
        o.LJIIIZ(nestedScrollDispatcher, "nestedScrollDispatcher");
        o.LJIIIZ(scrollableState, "scrollableState");
        o.LJIIIZ(flingBehavior, "flingBehavior");
        this.LIZ = orientation;
        this.LIZIZ = z;
        this.LIZJ = nestedScrollDispatcher;
        this.LIZLLL = scrollableState;
        this.LJ = flingBehavior;
        this.LJFF = c0sp;
        this.LJI = C78966Uyw.LJJJIL(Boolean.FALSE);
    }
}
