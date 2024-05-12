package androidx.core.widget;

import X.C08380Uo;
import X.X1D;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public class NestedScrollView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<NestedScrollView$SavedState> CREATOR = new IDCreatorS45S0000000(16);
    public int scrollPosition;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HorizontalScrollView.SavedState{");
        LIZ.append(Integer.toHexString(System.identityHashCode(this)));
        LIZ.append(" scrollPosition=");
        return C08380Uo.LIZ(LIZ, this.scrollPosition, "}", LIZ);
    }

    public NestedScrollView$SavedState(Parcel parcel) {
        super(parcel);
        this.scrollPosition = parcel.readInt();
    }

    public NestedScrollView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.scrollPosition);
    }
}
