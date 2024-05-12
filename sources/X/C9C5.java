package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9C5, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9C5 implements C33Q {
    public final C43I<Boolean> LJLIL;
    public final boolean LJLILLLLZI;
    public final C43I<Integer> LJLJI;

    public C9C5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9C5)) {
            return false;
        }
        C9C5 c9c5 = (C9C5) obj;
        return o.LJ(this.LJLIL, c9c5.LJLIL) && this.LJLILLLLZI == c9c5.LJLILLLLZI && o.LJ(this.LJLJI, c9c5.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C43I<Boolean> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        C43I<Integer> c43i2 = this.LJLJI;
        return i2 + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ArtistMusicAwemeListNavBarState(isLoadingEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", saveSuccess=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", toastMessageId=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C9C5(int i) {
        this(null, null, false);
    }

    public C9C5(C43I c43i, C43I c43i2, boolean z) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = z;
        this.LJLJI = c43i2;
    }

    public static C9C5 LIZ(C9C5 c9c5, C43I c43i, boolean z, C43I c43i2, int i) {
        if ((i & 1) != 0) {
            c43i = c9c5.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c9c5.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i2 = c9c5.LJLJI;
        }
        c9c5.getClass();
        return new C9C5(c43i, c43i2, z);
    }
}
