package com.ss.android.ugc.aweme.base.widget;

import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes15.dex */
public class CanCancelRadioButton$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<CanCancelRadioButton$SavedState> CREATOR = new IDCreatorS56S0000000_14(6);
    public boolean LJLIL;

    public CanCancelRadioButton$SavedState(Parcel parcel) {
        super(parcel);
        boolean z;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
    }

    public CanCancelRadioButton$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LJLIL ? 1 : 0);
    }
}
