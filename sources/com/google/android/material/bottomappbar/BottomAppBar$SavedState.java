package com.google.android.material.bottomappbar;

import X.C80467Vi3;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar$SavedState;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes15.dex */
public class BottomAppBar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<BottomAppBar$SavedState> CREATOR = new C80467Vi3();
    public int LJLIL;
    public boolean LJLILLLLZI;

    public BottomAppBar$SavedState(Toolbar$SavedState toolbar$SavedState) {
        super(toolbar$SavedState);
    }

    public BottomAppBar$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z;
        this.LJLIL = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LJLIL);
        parcel.writeInt(this.LJLILLLLZI ? 1 : 0);
    }
}
