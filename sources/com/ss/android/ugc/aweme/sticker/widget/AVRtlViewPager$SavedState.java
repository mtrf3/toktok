package com.ss.android.ugc.aweme.sticker.widget;

import X.C10690bR;
import X.C80307VfT;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class AVRtlViewPager$SavedState implements Parcelable {
    public static final Parcelable.Creator<AVRtlViewPager$SavedState> CREATOR = new C10690bR(new C80307VfT());
    public final int mLayoutDirection;
    public final Parcelable mViewPagerSavedState;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AVRtlViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        this.mViewPagerSavedState = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
        this.mLayoutDirection = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mViewPagerSavedState, i);
        parcel.writeInt(this.mLayoutDirection);
    }

    public AVRtlViewPager$SavedState(Parcelable parcelable, int i) {
        this.mViewPagerSavedState = parcelable;
        this.mLayoutDirection = i;
    }
}
