package com.ss.android.ugc.aweme.common.widget;

import X.C08380Uo;
import X.C10690bR;
import X.C80834Vny;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes15.dex */
public class VerticalViewPager$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<VerticalViewPager$SavedState> CREATOR = new C10690bR(new C80834Vny());
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

    public VerticalViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public VerticalViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.LJLIL = parcel.readInt();
        this.LJLILLLLZI = parcel.readParcelable(classLoader);
        this.LJLJI = classLoader;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LJLIL);
        parcel.writeParcelable(this.LJLILLLLZI, i);
    }
}
