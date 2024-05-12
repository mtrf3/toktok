package dmt.viewpager;

import X.C10690bR;
import X.C80767Vmt;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class DmtRtlViewPager$SavedState implements Parcelable {
    public static final Parcelable.Creator<DmtRtlViewPager$SavedState> CREATOR = new C10690bR(new C80767Vmt());
    public final int mLayoutDirection;
    public final Parcelable mViewPagerSavedState;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DmtRtlViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        this.mViewPagerSavedState = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
        this.mLayoutDirection = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mViewPagerSavedState, i);
        parcel.writeInt(this.mLayoutDirection);
    }

    public DmtRtlViewPager$SavedState(DmtViewPager$SavedState dmtViewPager$SavedState, int i) {
        this.mViewPagerSavedState = dmtViewPager$SavedState;
        this.mLayoutDirection = i;
    }
}
