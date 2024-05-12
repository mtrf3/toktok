package androidx.appcompat.widget;

import X.C19U;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView$SavedState;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes.dex */
public class SearchView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SearchView$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SearchView$SavedState>() { // from class: X.02j
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new SearchView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchView$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final SearchView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SearchView$SavedState(parcel, classLoader);
        }
    };
    public boolean LJLIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchView.SavedState{");
        LIZ.append(Integer.toHexString(System.identityHashCode(this)));
        LIZ.append(" isIconified=");
        return C19U.LIZ(LIZ, this.LJLIL, "}", LIZ);
    }

    public SearchView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public SearchView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LJLIL = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.LJLIL));
    }
}
