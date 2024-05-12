package com.google.android.material.button;

import X.C80407Vh5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes15.dex */
public class MaterialButton$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<MaterialButton$SavedState> CREATOR = new C80407Vh5();
    public boolean LJLIL;

    public MaterialButton$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public MaterialButton$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            getClass().getClassLoader();
        }
        this.LJLIL = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LJLIL ? 1 : 0);
    }
}
