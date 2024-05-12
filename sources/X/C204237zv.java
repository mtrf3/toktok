package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7zv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204237zv implements C33Q {
    public final boolean LJLIL;
    public final C204277zz LJLILLLLZI;
    public final AnonymousClass800 LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final OSZ<Integer, Integer> LJLJJL;
    public final AnonymousClass801 LJLJJLL;
    public final C43I<OSZ<C80H, Object>> LJLJL;

    public C204237zv() {
        this(null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C204237zv)) {
            return false;
        }
        C204237zv c204237zv = (C204237zv) obj;
        return this.LJLIL == c204237zv.LJLIL && o.LJ(this.LJLILLLLZI, c204237zv.LJLILLLLZI) && o.LJ(this.LJLJI, c204237zv.LJLJI) && o.LJ(this.LJLJJI, c204237zv.LJLJJI) && o.LJ(this.LJLJJL, c204237zv.LJLJJL) && o.LJ(this.LJLJJLL, c204237zv.LJLJJLL) && o.LJ(this.LJLJL, c204237zv.LJLJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        C204277zz c204277zz = this.LJLILLLLZI;
        int hashCode = (i + (c204277zz == null ? 0 : c204277zz.hashCode())) * 31;
        AnonymousClass800 anonymousClass800 = this.LJLJI;
        int hashCode2 = (hashCode + (anonymousClass800 == null ? 0 : anonymousClass800.hashCode())) * 31;
        C43I<Boolean> c43i = this.LJLJJI;
        int hashCode3 = (hashCode2 + (c43i == null ? 0 : c43i.hashCode())) * 31;
        OSZ<Integer, Integer> osz = this.LJLJJL;
        int hashCode4 = (hashCode3 + (osz == null ? 0 : osz.hashCode())) * 31;
        AnonymousClass801 anonymousClass801 = this.LJLJJLL;
        int hashCode5 = (hashCode4 + (anonymousClass801 == null ? 0 : anonymousClass801.hashCode())) * 31;
        C43I<OSZ<C80H, Object>> c43i2 = this.LJLJL;
        return hashCode5 + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoShareState(shareVisibility=");
        LIZ.append(this.LJLIL);
        LIZ.append(", shareCountState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", shareIconState=");
        LIZ.append(this.LJLJI);
        LIZ.append(", containerAnimation=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", containerScale=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", shareContainerState=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", animationEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ C204237zv(AnonymousClass801 anonymousClass801, int i) {
        this(false, null, null, null, null, (i & 32) != 0 ? null : anonymousClass801, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C204237zv(boolean z, C204277zz c204277zz, AnonymousClass800 anonymousClass800, C43I<Boolean> c43i, OSZ<Integer, Integer> osz, AnonymousClass801 anonymousClass801, C43I<? extends OSZ<? extends C80H, ? extends Object>> c43i2) {
        this.LJLIL = z;
        this.LJLILLLLZI = c204277zz;
        this.LJLJI = anonymousClass800;
        this.LJLJJI = c43i;
        this.LJLJJL = osz;
        this.LJLJJLL = anonymousClass801;
        this.LJLJL = c43i2;
    }

    public static C204237zv LIZ(C204237zv c204237zv, C204277zz c204277zz, AnonymousClass800 anonymousClass800, C43I c43i, OSZ osz, AnonymousClass801 anonymousClass801, C43I c43i2, int i) {
        boolean z;
        C43I c43i3 = c43i2;
        AnonymousClass801 anonymousClass8012 = anonymousClass801;
        OSZ osz2 = osz;
        C43I c43i4 = c43i;
        C204277zz c204277zz2 = c204277zz;
        AnonymousClass800 anonymousClass8002 = anonymousClass800;
        if ((i & 1) != 0) {
            z = c204237zv.LJLIL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            c204277zz2 = c204237zv.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            anonymousClass8002 = c204237zv.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i4 = c204237zv.LJLJJI;
        }
        if ((i & 16) != 0) {
            osz2 = c204237zv.LJLJJL;
        }
        if ((i & 32) != 0) {
            anonymousClass8012 = c204237zv.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c43i3 = c204237zv.LJLJL;
        }
        c204237zv.getClass();
        return new C204237zv(z, c204277zz2, anonymousClass8002, c43i4, osz2, anonymousClass8012, c43i3);
    }
}
