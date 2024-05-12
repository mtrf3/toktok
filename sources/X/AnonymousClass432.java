package X;

import kotlin.jvm.internal.o;

/* renamed from: X.432, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass432 implements C33Q {
    public final boolean LJLIL;
    public final C43I<C41X> LJLILLLLZI;
    public final C43I<C45Q> LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass432)) {
            return false;
        }
        AnonymousClass432 anonymousClass432 = (AnonymousClass432) obj;
        return this.LJLIL == anonymousClass432.LJLIL && o.LJ(this.LJLILLLLZI, anonymousClass432.LJLILLLLZI) && o.LJ(this.LJLJI, anonymousClass432.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        C43I<C41X> c43i = this.LJLILLLLZI;
        int hashCode = (i + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<C45Q> c43i2 = this.LJLJI;
        return hashCode + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonChatNoticeVmState(isLightThemeOn=");
        LIZ.append(this.LJLIL);
        LIZ.append(", templatePrepareEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", sceneEndEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public AnonymousClass432(C43I c43i, C43I c43i2, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = c43i;
        this.LJLJI = c43i2;
    }

    public static AnonymousClass432 LIZ(AnonymousClass432 anonymousClass432, boolean z, C43I c43i, C43I c43i2, int i) {
        if ((i & 1) != 0) {
            z = anonymousClass432.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i = anonymousClass432.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i2 = anonymousClass432.LJLJI;
        }
        anonymousClass432.getClass();
        return new AnonymousClass432(c43i, c43i2, z);
    }
}
