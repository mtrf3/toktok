package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8dT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215798dT implements C33Q {
    public final C43I<C215678dH> LJLIL;
    public final C43I<C215938dh> LJLILLLLZI;
    public final C43I<Boolean> LJLJI;
    public final C43I<C215958dj> LJLJJI;
    public final C43I<C215958dj> LJLJJL;
    public final C43I<C215958dj> LJLJJLL;
    public final C43I<C215958dj> LJLJL;

    public C215798dT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C215798dT)) {
            return false;
        }
        C215798dT c215798dT = (C215798dT) obj;
        return o.LJ(this.LJLIL, c215798dT.LJLIL) && o.LJ(this.LJLILLLLZI, c215798dT.LJLILLLLZI) && o.LJ(this.LJLJI, c215798dT.LJLJI) && o.LJ(this.LJLJJI, c215798dT.LJLJJI) && o.LJ(this.LJLJJL, c215798dT.LJLJJL) && o.LJ(this.LJLJJLL, c215798dT.LJLJJLL) && o.LJ(this.LJLJL, c215798dT.LJLJL);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        C43I<C215678dH> c43i = this.LJLIL;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = hashCode * 31;
        C43I<C215938dh> c43i2 = this.LJLILLLLZI;
        if (c43i2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i2.hashCode();
        }
        int LIZIZ = C40328FsC.LIZIZ(this.LJLJI, (i2 + hashCode2) * 31, 31);
        C43I<C215958dj> c43i3 = this.LJLJJI;
        if (c43i3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i3.hashCode();
        }
        int i3 = (LIZIZ + hashCode3) * 31;
        C43I<C215958dj> c43i4 = this.LJLJJL;
        if (c43i4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c43i4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        C43I<C215958dj> c43i5 = this.LJLJJLL;
        if (c43i5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c43i5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        C43I<C215958dj> c43i6 = this.LJLJL;
        if (c43i6 != null) {
            i = c43i6.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DanmakuState(dataUpdateEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", playEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", onFirstDanmakuReady=");
        LIZ.append(this.LJLJI);
        LIZ.append(", onItemPauseEvent=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", onItemResumeEvent=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", onFakeItemDeleteEvent=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", onFakeItemInsertEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ C215798dT(int i) {
        this(null, null, new C43I(Boolean.FALSE), null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C215798dT(C43I<C215678dH> c43i, C43I<C215938dh> c43i2, C43I<Boolean> onFirstDanmakuReady, C43I<? extends C215958dj> c43i3, C43I<? extends C215958dj> c43i4, C43I<? extends C215958dj> c43i5, C43I<? extends C215958dj> c43i6) {
        o.LJIIIZ(onFirstDanmakuReady, "onFirstDanmakuReady");
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = onFirstDanmakuReady;
        this.LJLJJI = c43i3;
        this.LJLJJL = c43i4;
        this.LJLJJLL = c43i5;
        this.LJLJL = c43i6;
    }

    public static C215798dT LIZ(C215798dT c215798dT, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, C43I c43i7, int i) {
        C43I c43i8 = c43i7;
        C43I c43i9 = c43i2;
        C43I c43i10 = c43i;
        C43I onFirstDanmakuReady = c43i3;
        C43I c43i11 = c43i4;
        C43I c43i12 = c43i5;
        C43I c43i13 = c43i6;
        if ((i & 1) != 0) {
            c43i10 = c215798dT.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i9 = c215798dT.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            onFirstDanmakuReady = c215798dT.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i11 = c215798dT.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i12 = c215798dT.LJLJJL;
        }
        if ((i & 32) != 0) {
            c43i13 = c215798dT.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c43i8 = c215798dT.LJLJL;
        }
        c215798dT.getClass();
        o.LJIIIZ(onFirstDanmakuReady, "onFirstDanmakuReady");
        return new C215798dT(c43i10, c43i9, onFirstDanmakuReady, c43i11, c43i12, c43i13, c43i8);
    }
}
