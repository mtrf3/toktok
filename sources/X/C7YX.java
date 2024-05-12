package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7YX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YX extends C57438MgU {
    public final User LIZJ;
    public final EnumC57119MbL LIZLLL;
    public final boolean LJ;
    public final java.util.Map<Boolean, Integer> LJFF;
    public final boolean LJI;
    public final LifecycleOwner LJII;
    public final ViewModelStoreOwner LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        User user = this.LIZJ;
        int i = 0;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        int i2 = hashCode * 31;
        EnumC57119MbL enumC57119MbL = this.LIZLLL;
        if (enumC57119MbL == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = enumC57119MbL.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        boolean z = this.LJ;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        java.util.Map<Boolean, Integer> map = this.LJFF;
        if (map == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (!this.LJI) {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        LifecycleOwner lifecycleOwner = this.LJII;
        if (lifecycleOwner == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = lifecycleOwner.hashCode();
        }
        int i9 = (i8 + hashCode4) * 31;
        ViewModelStoreOwner viewModelStoreOwner = this.LJIIIIZZ;
        if (viewModelStoreOwner != null) {
            i = viewModelStoreOwner.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationTextConfig(user=");
        LIZ.append(this.LIZJ);
        LIZ.append(", prefixStyle=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", allowToUnfollow=");
        LIZ.append(this.LJ);
        LIZ.append(", stateToFont=");
        LIZ.append(this.LJFF);
        LIZ.append(", isFromRecommendScene=");
        LIZ.append(this.LJI);
        LIZ.append(", lifecycleOwner=");
        LIZ.append(this.LJII);
        LIZ.append(", viewModelStoreOwner=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C57438MgU
    public final LifecycleOwner LIZ() {
        return this.LJII;
    }

    @Override // X.C57438MgU
    public final User LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.C57438MgU
    public final ViewModelStoreOwner LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C57438MgU
    public final boolean LIZLLL() {
        return this.LJI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7YX)) {
            return false;
        }
        C7YX c7yx = (C7YX) obj;
        if (o.LJ(this.LIZJ, c7yx.LIZJ) && this.LIZLLL == c7yx.LIZLLL && this.LJ == c7yx.LJ && o.LJ(this.LJFF, c7yx.LJFF) && this.LJI == c7yx.LJI && o.LJ(this.LJII, c7yx.LJII) && o.LJ(this.LJIIIIZZ, c7yx.LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public C7YX(User user, EnumC57119MbL enumC57119MbL, boolean z, java.util.Map map, boolean z2, LifecycleOwner lifecycleOwner) {
        super(user, z2, lifecycleOwner, null);
        this.LIZJ = user;
        this.LIZLLL = enumC57119MbL;
        this.LJ = z;
        this.LJFF = map;
        this.LJI = z2;
        this.LJII = lifecycleOwner;
        this.LJIIIIZZ = null;
    }
}
