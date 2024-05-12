package com.google.android.material.textfield;

import X.C80333Vft;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes15.dex */
public class TextInputLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<TextInputLayout$SavedState> CREATOR = new C80333Vft();
    public CharSequence LJLIL;
    public boolean LJLILLLLZI;
    public CharSequence LJLJI;
    public CharSequence LJLJJI;
    public CharSequence LJLJJL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextInputLayout.SavedState{");
        LIZ.append(Integer.toHexString(System.identityHashCode(this)));
        LIZ.append(" error=");
        LIZ.append((Object) this.LJLIL);
        LIZ.append(" hint=");
        LIZ.append((Object) this.LJLJI);
        LIZ.append(" helperText=");
        LIZ.append((Object) this.LJLJJI);
        LIZ.append(" placeholderText=");
        LIZ.append((Object) this.LJLJJL);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public TextInputLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public TextInputLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LJLIL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LJLILLLLZI = parcel.readInt() == 1;
        this.LJLJI = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LJLJJI = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LJLJJL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.LJLIL, parcel, i);
        parcel.writeInt(this.LJLILLLLZI ? 1 : 0);
        TextUtils.writeToParcel(this.LJLJI, parcel, i);
        TextUtils.writeToParcel(this.LJLJJI, parcel, i);
        TextUtils.writeToParcel(this.LJLJJL, parcel, i);
    }
}
