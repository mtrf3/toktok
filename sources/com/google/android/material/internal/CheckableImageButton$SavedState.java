package com.google.android.material.internal;

import X.C80365VgP;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes15.dex */
public class CheckableImageButton$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<CheckableImageButton$SavedState> CREATOR = new C80365VgP();
    public boolean LJLIL;

    public CheckableImageButton$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public CheckableImageButton$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LJLIL = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LJLIL ? 1 : 0);
    }
}
