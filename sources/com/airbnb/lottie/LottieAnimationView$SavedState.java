package com.airbnb.lottie;

import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public class LottieAnimationView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<LottieAnimationView$SavedState> CREATOR = new IDCreatorS45S0000000(36);
    public String LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public boolean LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public int LJLJL;

    public LottieAnimationView$SavedState(Parcel parcel) {
        super(parcel);
        this.LJLIL = parcel.readString();
        this.LJLJI = parcel.readFloat();
        this.LJLJJI = parcel.readInt() == 1;
        this.LJLJJL = parcel.readString();
        this.LJLJJLL = parcel.readInt();
        this.LJLJL = parcel.readInt();
    }

    public LottieAnimationView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.LJLIL);
        parcel.writeFloat(this.LJLJI);
        parcel.writeInt(this.LJLJJI ? 1 : 0);
        parcel.writeString(this.LJLJJL);
        parcel.writeInt(this.LJLJJLL);
        parcel.writeInt(this.LJLJL);
    }
}
