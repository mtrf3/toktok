package com.ss.android.ugc.aweme.tools.beauty.views;

import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes15.dex */
public class SwitchButton$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SwitchButton$SavedState> CREATOR = new IDCreatorS56S0000000_14(12);
    public CharSequence LJLIL;
    public CharSequence LJLILLLLZI;

    public SwitchButton$SavedState(Parcel parcel) {
        super(parcel);
        this.LJLIL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LJLILLLLZI = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public SwitchButton$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.LJLIL, parcel, i);
        TextUtils.writeToParcel(this.LJLILLLLZI, parcel, i);
    }
}
