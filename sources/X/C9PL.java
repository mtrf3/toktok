package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.9PL, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9PL implements InterfaceC198557ql {
    public final C43I<User> LIZ;
    public final C43I<C76800UCe> LIZIZ;
    public final C43I<Boolean> LIZJ;
    public final C43I<OSJ<Integer, Integer, Intent>> LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C43I<Boolean> LJI;
    public final Aweme LJII;
    public final C43I<Boolean> LJIIIIZZ;

    public C9PL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9PL)) {
            return false;
        }
        C9PL c9pl = (C9PL) obj;
        return o.LJ(this.LIZ, c9pl.LIZ) && o.LJ(this.LIZIZ, c9pl.LIZIZ) && o.LJ(this.LIZJ, c9pl.LIZJ) && o.LJ(this.LIZLLL, c9pl.LIZLLL) && this.LJ == c9pl.LJ && this.LJFF == c9pl.LJFF && o.LJ(this.LJI, c9pl.LJI) && o.LJ(this.LJII, c9pl.LJII) && o.LJ(this.LJIIIIZZ, c9pl.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C43I<User> c43i = this.LIZ;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<C76800UCe> c43i2 = this.LIZIZ;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<Boolean> c43i3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<OSJ<Integer, Integer, Intent>> c43i4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode4 + i) * 31) + (this.LJFF ? 1 : 0)) * 31;
        C43I<Boolean> c43i5 = this.LJI;
        int hashCode5 = (i2 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        Aweme aweme = this.LJII;
        int hashCode6 = (hashCode5 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        C43I<Boolean> c43i6 = this.LJIIIIZZ;
        return hashCode6 + (c43i6 != null ? c43i6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MineProfileCommonData(refreshUIEvent=");
        LIZ.append(this.LIZ);
        LIZ.append(", bindCouponEntranceGifEvent=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", onHiddenChangedEvent=");
        LIZ.append(this.LIZJ);
        LIZ.append(", onActivityResultEvent=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", userVisibleHint=");
        LIZ.append(this.LJ);
        LIZ.append(", visibleToUserInFeed=");
        LIZ.append(this.LJFF);
        LIZ.append(", beginObserve=");
        LIZ.append(this.LJI);
        LIZ.append(", aweme=");
        LIZ.append(this.LJII);
        LIZ.append(", userLoaded=");
        return C61845OOz.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public /* synthetic */ C9PL(int i) {
        this(null, null, null, null, true, false, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9PL(C43I<? extends User> c43i, C43I<C76800UCe> c43i2, C43I<Boolean> c43i3, C43I<? extends OSJ<Integer, Integer, ? extends Intent>> c43i4, boolean z, boolean z2, C43I<Boolean> c43i5, Aweme aweme, C43I<Boolean> c43i6) {
        this.LIZ = c43i;
        this.LIZIZ = c43i2;
        this.LIZJ = c43i3;
        this.LIZLLL = c43i4;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = c43i5;
        this.LJII = aweme;
        this.LJIIIIZZ = c43i6;
    }

    public static C9PL LIZ(C9PL c9pl, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, boolean z, boolean z2, C43I c43i5, Aweme aweme, C43I c43i6, int i) {
        C43I c43i7 = c43i6;
        Aweme aweme2 = aweme;
        C43I c43i8 = c43i5;
        C43I c43i9 = c43i2;
        C43I c43i10 = c43i;
        C43I c43i11 = c43i3;
        C43I c43i12 = c43i4;
        boolean z3 = z;
        boolean z4 = z2;
        if ((i & 1) != 0) {
            c43i10 = c9pl.LIZ;
        }
        if ((i & 2) != 0) {
            c43i9 = c9pl.LIZIZ;
        }
        if ((i & 4) != 0) {
            c43i11 = c9pl.LIZJ;
        }
        if ((i & 8) != 0) {
            c43i12 = c9pl.LIZLLL;
        }
        if ((i & 16) != 0) {
            z3 = c9pl.LJ;
        }
        if ((i & 32) != 0) {
            z4 = c9pl.LJFF;
        }
        if ((i & 64) != 0) {
            c43i8 = c9pl.LJI;
        }
        if ((i & 128) != 0) {
            aweme2 = c9pl.LJII;
        }
        if ((i & 256) != 0) {
            c43i7 = c9pl.LJIIIIZZ;
        }
        c9pl.getClass();
        return new C9PL(c43i10, c43i9, c43i11, c43i12, z3, z4, c43i8, aweme2, c43i7);
    }
}
