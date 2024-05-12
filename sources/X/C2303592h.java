package X;

import kotlin.jvm.internal.o;

/* renamed from: X.92h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2303592h implements C33Q {
    public final C43I<C2VN> LJLIL;

    public C2303592h() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2303592h) && o.LJ(this.LJLIL, ((C2303592h) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<C2VN> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreationIntentionMusicShootState(musicTitleClickEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C2303592h(C43I<C2VN> c43i) {
        this.LJLIL = c43i;
    }
}
