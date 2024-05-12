package com.bytedance.android.livesdk.widget;

import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes15.dex */
public class LivePagerSlidingTabStrip$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<LivePagerSlidingTabStrip$SavedState> CREATOR = new IDCreatorS56S0000000_14(0);
    public int LJLIL;

    public LivePagerSlidingTabStrip$SavedState(Parcel parcel) {
        super(parcel);
        this.LJLIL = parcel.readInt();
    }

    public LivePagerSlidingTabStrip$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LJLIL);
    }
}
