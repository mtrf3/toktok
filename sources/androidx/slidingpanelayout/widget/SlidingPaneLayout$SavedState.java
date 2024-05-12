package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState;

/* loaded from: classes.dex */
public class SlidingPaneLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SlidingPaneLayout$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SlidingPaneLayout$SavedState>() { // from class: X.0Bc
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new SlidingPaneLayout$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlidingPaneLayout$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final SlidingPaneLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SlidingPaneLayout$SavedState(parcel);
        }
    };
    public final boolean LJLIL;
    public final int LJLILLLLZI;

    public SlidingPaneLayout$SavedState(Parcel parcel) {
        super(parcel, null);
        boolean z;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
        this.LJLILLLLZI = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LJLIL ? 1 : 0);
        parcel.writeInt(this.LJLILLLLZI);
    }
}
