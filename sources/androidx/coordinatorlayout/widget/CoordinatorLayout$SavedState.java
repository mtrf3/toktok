package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes.dex */
public class CoordinatorLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<CoordinatorLayout$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<CoordinatorLayout$SavedState>() { // from class: X.06A
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new CoordinatorLayout$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoordinatorLayout$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final CoordinatorLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new CoordinatorLayout$SavedState(parcel, classLoader);
        }
    };
    public SparseArray<Parcelable> LJLIL;

    public CoordinatorLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public CoordinatorLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.LJLIL = new SparseArray<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.LJLIL.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        super.writeToParcel(parcel, i);
        SparseArray<Parcelable> sparseArray = this.LJLIL;
        if (sparseArray != null) {
            i2 = sparseArray.size();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        int[] iArr = new int[i2];
        Parcelable[] parcelableArr = new Parcelable[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = this.LJLIL.keyAt(i3);
            parcelableArr[i3] = this.LJLIL.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
