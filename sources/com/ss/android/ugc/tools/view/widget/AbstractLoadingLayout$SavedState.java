package com.ss.android.ugc.tools.view.widget;

import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes15.dex */
public class AbstractLoadingLayout$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<AbstractLoadingLayout$SavedState> CREATOR = new IDCreatorS56S0000000_14(14);
    public int LJLIL;

    public AbstractLoadingLayout$SavedState(Parcel parcel) {
        super(parcel);
        this.LJLIL = parcel.readInt();
    }

    public AbstractLoadingLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LJLIL);
    }
}
