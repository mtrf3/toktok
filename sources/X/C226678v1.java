package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8v1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226678v1 extends C57438MgU {
    public final User LIZJ;
    public final boolean LIZLLL;
    public final EnumC112694bZ LJ;
    public final EnumC57853MnB LJFF;
    public final boolean LJI;
    public final java.util.Map<String, String> LJII;
    public final java.util.Map<EnumC57435MgR, C112704ba> LJIIIIZZ;
    public final java.util.Map<EnumC57435MgR, Integer> LJIIIZ;
    public final java.util.Map<EnumC57435MgR, Boolean> LJIIJ;
    public final boolean LJIIJJI;
    public final LifecycleOwner LJIIL;
    public final ViewModelStoreOwner LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final EnumC112664bW LJIILLIIL;
    public final boolean LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        User user = this.LIZJ;
        int i = 0;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        int i2 = hashCode * 31;
        boolean z = this.LIZLLL;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int hashCode7 = (this.LJFF.hashCode() + ((this.LJ.hashCode() + ((i2 + i4) * 31)) * 31)) * 31;
        boolean z2 = this.LJI;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode7 + i5) * 31;
        java.util.Map<String, String> map = this.LJII;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        java.util.Map<EnumC57435MgR, C112704ba> map2 = this.LJIIIIZZ;
        if (map2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map2.hashCode();
        }
        int i8 = (i7 + hashCode3) * 31;
        java.util.Map<EnumC57435MgR, Integer> map3 = this.LJIIIZ;
        if (map3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = map3.hashCode();
        }
        int i9 = (i8 + hashCode4) * 31;
        java.util.Map<EnumC57435MgR, Boolean> map4 = this.LJIIJ;
        if (map4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = map4.hashCode();
        }
        int i10 = (i9 + hashCode5) * 31;
        boolean z3 = this.LJIIJJI;
        int i11 = z3;
        if (z3 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        LifecycleOwner lifecycleOwner = this.LJIIL;
        if (lifecycleOwner == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = lifecycleOwner.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        ViewModelStoreOwner viewModelStoreOwner = this.LJIILIIL;
        if (viewModelStoreOwner != null) {
            i = viewModelStoreOwner.hashCode();
        }
        int i14 = (i13 + i) * 31;
        boolean z4 = this.LJIILJJIL;
        int i15 = z4;
        if (z4 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z5 = this.LJIILL;
        int i17 = z5;
        if (z5 != 0) {
            i17 = 1;
        }
        int hashCode8 = (this.LJIILLIIL.hashCode() + ((i16 + i17) * 31)) * 31;
        if (!this.LJIIZILJ) {
            i3 = 0;
        }
        return hashCode8 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationButtonConfig(user=");
        sb.append(this.LIZJ);
        sb.append(", enterChat=");
        sb.append(this.LIZLLL);
        sb.append(", mutualFollowText=");
        sb.append(this.LJ);
        sb.append(", scene=");
        sb.append(this.LJFF);
        sb.append(", unfollowAlert=");
        sb.append(this.LJI);
        sb.append(", requestParams=");
        sb.append(this.LJII);
        sb.append(", stateToTxtAndClickMap=");
        sb.append(this.LJIIIIZZ);
        sb.append(", stateToStartIconDrawableIdMap=");
        sb.append(this.LJIIIZ);
        sb.append(", clearIconTintColorMap=");
        sb.append(this.LJIIJ);
        sb.append(", isFromRecommendScene=");
        sb.append(this.LJIIJJI);
        sb.append(", lifecycleOwner=");
        sb.append(this.LJIIL);
        sb.append(", viewModelStoreOwner=");
        sb.append(this.LJIILIIL);
        sb.append(", needReportFollowBackBtnShow=");
        sb.append(this.LJIILJJIL);
        sb.append(", lazyUpdateUI=");
        sb.append(this.LJIILL);
        sb.append(", nudgeScenario=");
        sb.append(this.LJIILLIIL);
        sb.append(", forceDarkMode=");
        return C08880Wm.LIZJ(sb, this.LJIIZILJ, ')');
    }

    @Override // X.C57438MgU
    public final LifecycleOwner LIZ() {
        return this.LJIIL;
    }

    @Override // X.C57438MgU
    public final User LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.C57438MgU
    public final ViewModelStoreOwner LIZJ() {
        return this.LJIILIIL;
    }

    @Override // X.C57438MgU
    public final boolean LIZLLL() {
        return this.LJIIJJI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C226678v1)) {
            return false;
        }
        C226678v1 c226678v1 = (C226678v1) obj;
        if (o.LJ(this.LIZJ, c226678v1.LIZJ) && this.LIZLLL == c226678v1.LIZLLL && this.LJ == c226678v1.LJ && this.LJFF == c226678v1.LJFF && this.LJI == c226678v1.LJI && o.LJ(this.LJII, c226678v1.LJII) && o.LJ(this.LJIIIIZZ, c226678v1.LJIIIIZZ) && o.LJ(this.LJIIIZ, c226678v1.LJIIIZ) && o.LJ(this.LJIIJ, c226678v1.LJIIJ) && this.LJIIJJI == c226678v1.LJIIJJI && o.LJ(this.LJIIL, c226678v1.LJIIL) && o.LJ(this.LJIILIIL, c226678v1.LJIILIIL) && this.LJIILJJIL == c226678v1.LJIILJJIL && this.LJIILL == c226678v1.LJIILL && this.LJIILLIIL == c226678v1.LJIILLIIL && this.LJIIZILJ == c226678v1.LJIIZILJ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C226678v1(User user, boolean z, EnumC112694bZ mutualFollowText, EnumC57853MnB scene, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, boolean z2, LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner, boolean z3, boolean z4, EnumC112664bW nudgeScenario, boolean z5) {
        super(user, z2, lifecycleOwner, viewModelStoreOwner);
        o.LJIIIZ(mutualFollowText, "mutualFollowText");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(nudgeScenario, "nudgeScenario");
        this.LIZJ = user;
        this.LIZLLL = z;
        this.LJ = mutualFollowText;
        this.LJFF = scene;
        this.LJI = false;
        this.LJII = map;
        this.LJIIIIZZ = map2;
        this.LJIIIZ = map3;
        this.LJIIJ = map4;
        this.LJIIJJI = z2;
        this.LJIIL = lifecycleOwner;
        this.LJIILIIL = viewModelStoreOwner;
        this.LJIILJJIL = z3;
        this.LJIILL = z4;
        this.LJIILLIIL = nudgeScenario;
        this.LJIIZILJ = z5;
    }
}
