package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Jkz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50073Jkz {
    public final ActivityC45651qj LIZ;
    public final DynamicPatch LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final View LJ;
    public final Fragment LJFF;
    public final SearchStateViewModel LJI;
    public final C49730JfS LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50073Jkz)) {
            return false;
        }
        C50073Jkz c50073Jkz = (C50073Jkz) obj;
        return o.LJ(this.LIZ, c50073Jkz.LIZ) && o.LJ(this.LIZIZ, c50073Jkz.LIZIZ) && o.LJ(this.LIZJ, c50073Jkz.LIZJ) && this.LIZLLL == c50073Jkz.LIZLLL && o.LJ(this.LJ, c50073Jkz.LJ) && o.LJ(this.LJFF, c50073Jkz.LJFF) && o.LJ(this.LJI, c50073Jkz.LJI) && o.LJ(this.LJII, c50073Jkz.LJII);
    }

    public final int hashCode() {
        ActivityC45651qj activityC45651qj = this.LIZ;
        int hashCode = (activityC45651qj == null ? 0 : activityC45651qj.hashCode()) * 31;
        DynamicPatch dynamicPatch = this.LIZIZ;
        int hashCode2 = (hashCode + (dynamicPatch == null ? 0 : dynamicPatch.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL) * 31;
        View view = this.LJ;
        int hashCode4 = (this.LJFF.hashCode() + ((hashCode3 + (view == null ? 0 : view.hashCode())) * 31)) * 31;
        SearchStateViewModel searchStateViewModel = this.LJI;
        int hashCode5 = (hashCode4 + (searchStateViewModel == null ? 0 : searchStateViewModel.hashCode())) * 31;
        C49730JfS c49730JfS = this.LJII;
        return hashCode5 + (c49730JfS != null ? c49730JfS.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicMaskData(activity=");
        LIZ.append(this.LIZ);
        LIZ.append(", patch=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", scenario=");
        LIZ.append(this.LIZJ);
        LIZ.append(", pageIndex=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", rootView=");
        LIZ.append(this.LJ);
        LIZ.append(", curFragment=");
        LIZ.append(this.LJFF);
        LIZ.append(", viewState=");
        LIZ.append(this.LJI);
        LIZ.append(", tnsMaskState=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C50073Jkz(ActivityC45651qj activityC45651qj, DynamicPatch dynamicPatch, String str, int i, View view, Fragment curFragment, SearchStateViewModel searchStateViewModel, C49730JfS c49730JfS) {
        o.LJIIIZ(curFragment, "curFragment");
        this.LIZ = activityC45651qj;
        this.LIZIZ = dynamicPatch;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = view;
        this.LJFF = curFragment;
        this.LJI = searchStateViewModel;
        this.LJII = c49730JfS;
    }
}
