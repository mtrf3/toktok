package dmt.viewpager;

import X.C08380Uo;
import X.C80754Vmg;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes15.dex */
public class DmtViewPager$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<DmtViewPager$SavedState> CREATOR = new C80754Vmg();
    public int LJLIL;
    public Parcelable LJLILLLLZI;
    public final ClassLoader LJLJI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FragmentPager.SavedState{");
        LIZ.append(Integer.toHexString(System.identityHashCode(this)));
        LIZ.append(" position=");
        return C08380Uo.LIZ(LIZ, this.LJLIL, "}", LIZ);
    }

    public DmtViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public DmtViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.LJLIL = parcel.readInt();
        this.LJLILLLLZI = parcel.readParcelable(classLoader);
        this.LJLJI = classLoader;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LJLIL);
        parcel.writeParcelable(this.LJLILLLLZI, i);
    }
}
