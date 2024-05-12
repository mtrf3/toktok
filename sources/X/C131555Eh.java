package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5Eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131555Eh {
    public final long LIZ;
    public final long LIZIZ;
    public final C52X LIZJ;
    public final C08630Vn<C52V> LIZLLL;
    public final C08630Vn<java.util.Map<C52V, Integer>> LJ;
    public final C08630Vn<OSJ<C52V, Boolean, Boolean>> LJFF;
    public final C08630Vn<OSZ<C52V, Float>> LJI;

    public C131555Eh() {
        this(null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C131555Eh)) {
            return false;
        }
        C131555Eh c131555Eh = (C131555Eh) obj;
        return this.LIZ == c131555Eh.LIZ && this.LIZIZ == c131555Eh.LIZIZ && this.LIZJ == c131555Eh.LIZJ && o.LJ(this.LIZLLL, c131555Eh.LIZLLL) && o.LJ(this.LJ, c131555Eh.LJ) && o.LJ(this.LJFF, c131555Eh.LJFF) && o.LJ(this.LJI, c131555Eh.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConsoleBarStates(currentPlayTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", totalPlayTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", playState=");
        LIZ.append(this.LIZJ);
        LIZ.append(", consoleBarEvent=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", viewVisibilityState=");
        LIZ.append(this.LJ);
        LIZ.append(", viewEnableState=");
        LIZ.append(this.LJFF);
        LIZ.append(", viewAlpha=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.LIZJ.hashCode() + JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31)) * 31;
        C08630Vn<C52V> c08630Vn = this.LIZLLL;
        int i = 0;
        if (c08630Vn == null) {
            hashCode = 0;
        } else {
            hashCode = c08630Vn.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        C08630Vn<java.util.Map<C52V, Integer>> c08630Vn2 = this.LJ;
        if (c08630Vn2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c08630Vn2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C08630Vn<OSJ<C52V, Boolean, Boolean>> c08630Vn3 = this.LJFF;
        if (c08630Vn3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c08630Vn3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C08630Vn<OSZ<C52V, Float>> c08630Vn4 = this.LJI;
        if (c08630Vn4 != null) {
            i = c08630Vn4.hashCode();
        }
        return i4 + i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C131555Eh(X.C08630Vn r12, int r13) {
        /*
            r11 = this;
            r8 = r12
            r2 = 0
            r0 = r13 & 4
            r1 = 0
            if (r0 == 0) goto L18
            X.52X r6 = X.C52X.PAUSE
        La:
            r0 = r13 & 16
            if (r0 == 0) goto Lf
            r8 = r1
        Lf:
            r7 = 0
            r1 = r11
            r4 = r2
            r9 = r7
            r10 = r7
            r1.<init>(r2, r4, r6, r7, r8, r9, r10)
            return
        L18:
            r6 = r1
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131555Eh.<init>(X.0Vn, int):void");
    }

    public C131555Eh(long j, long j2, C52X playState, C08630Vn<C52V> c08630Vn, C08630Vn<java.util.Map<C52V, Integer>> c08630Vn2, C08630Vn<OSJ<C52V, Boolean, Boolean>> c08630Vn3, C08630Vn<OSZ<C52V, Float>> c08630Vn4) {
        o.LJIIIZ(playState, "playState");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = playState;
        this.LIZLLL = c08630Vn;
        this.LJ = c08630Vn2;
        this.LJFF = c08630Vn3;
        this.LJI = c08630Vn4;
    }

    public static C131555Eh LIZ(C131555Eh c131555Eh, long j, long j2, C52X c52x, C08630Vn c08630Vn, C08630Vn c08630Vn2, C08630Vn c08630Vn3, C08630Vn c08630Vn4, int i) {
        C08630Vn c08630Vn5 = c08630Vn4;
        long j3 = j2;
        long j4 = j;
        C08630Vn c08630Vn6 = c08630Vn3;
        C52X playState = c52x;
        C08630Vn c08630Vn7 = c08630Vn;
        C08630Vn c08630Vn8 = c08630Vn2;
        if ((i & 1) != 0) {
            j4 = c131555Eh.LIZ;
        }
        if ((i & 2) != 0) {
            j3 = c131555Eh.LIZIZ;
        }
        if ((i & 4) != 0) {
            playState = c131555Eh.LIZJ;
        }
        if ((i & 8) != 0) {
            c08630Vn7 = c131555Eh.LIZLLL;
        }
        if ((i & 16) != 0) {
            c08630Vn8 = c131555Eh.LJ;
        }
        if ((i & 32) != 0) {
            c08630Vn6 = c131555Eh.LJFF;
        }
        if ((i & 64) != 0) {
            c08630Vn5 = c131555Eh.LJI;
        }
        c131555Eh.getClass();
        o.LJIIIZ(playState, "playState");
        return new C131555Eh(j4, j3, playState, c08630Vn7, c08630Vn8, c08630Vn6, c08630Vn5);
    }
}
