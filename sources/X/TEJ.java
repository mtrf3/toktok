package X;

import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TEJ {
    public final TE1 LIZ;
    public final InterfaceC74265TCr LIZIZ;
    public final C5NP LIZJ;
    public final T44 LIZLLL;
    public LiveData<THZ> LJ;
    public Integer LJFF;
    public AbstractC73672Svk<OSZ<Integer, Integer>> LJI;
    public final boolean LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public TEJ() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TEJ)) {
            return false;
        }
        TEJ tej = (TEJ) obj;
        return o.LJ(this.LIZ, tej.LIZ) && o.LJ(this.LIZIZ, tej.LIZIZ) && o.LJ(this.LIZJ, tej.LIZJ) && o.LJ(this.LIZLLL, tej.LIZLLL) && o.LJ(this.LJ, tej.LJ) && o.LJ(this.LJFF, tej.LJFF) && o.LJ(this.LJI, tej.LJI) && this.LJII == tej.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        TE1 te1 = this.LIZ;
        int hashCode = (te1 != null ? te1.hashCode() : 0) * 31;
        InterfaceC74265TCr interfaceC74265TCr = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC74265TCr != null ? interfaceC74265TCr.hashCode() : 0)) * 31;
        C5NP c5np = this.LIZJ;
        int hashCode3 = (hashCode2 + (c5np != null ? c5np.hashCode() : 0)) * 31;
        T44 t44 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (t44 != null ? t44.hashCode() : 0)) * 31;
        LiveData<THZ> liveData = this.LJ;
        int hashCode5 = (hashCode4 + (liveData != null ? liveData.hashCode() : 0)) * 31;
        Integer num = this.LJFF;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        AbstractC73672Svk<OSZ<Integer, Integer>> abstractC73672Svk = this.LJI;
        int hashCode7 = (hashCode6 + (abstractC73672Svk != null ? abstractC73672Svk.hashCode() : 0)) * 31;
        boolean z = this.LJII;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Optional(viewMob=");
        LIZ.append(this.LIZ);
        LIZ.append(", lockStickerProcessor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", logger=");
        LIZ.append(this.LIZJ);
        LIZ.append(", autoUseStickerMatcherController=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", stickerViewStateLiveData=");
        LIZ.append(this.LJ);
        LIZ.append(", curSelectedPagerPosition=");
        LIZ.append(this.LJFF);
        LIZ.append(", stickerCategoryFragmentSelectedObserver=");
        LIZ.append(this.LJI);
        LIZ.append(", loadStickersOnCategoryVisible=");
        return C19U.LIZ(LIZ, this.LJII, ")", LIZ);
    }

    public /* synthetic */ TEJ(TE1 te1, InterfaceC74265TCr interfaceC74265TCr, C5NP c5np, boolean z, int i) {
        this((i & 1) != 0 ? null : te1, (i & 2) != 0 ? null : interfaceC74265TCr, (i & 4) != 0 ? null : c5np, null, null, null, null, (i & 128) != 0 ? false : z);
    }

    public TEJ(TE1 te1, InterfaceC74265TCr interfaceC74265TCr, C5NP c5np, T44 t44, LiveData<THZ> liveData, Integer num, AbstractC73672Svk<OSZ<Integer, Integer>> abstractC73672Svk, boolean z) {
        this.LIZ = te1;
        this.LIZIZ = interfaceC74265TCr;
        this.LIZJ = c5np;
        this.LIZLLL = t44;
        this.LJ = liveData;
        this.LJFF = num;
        this.LJI = abstractC73672Svk;
        this.LJII = z;
    }
}
