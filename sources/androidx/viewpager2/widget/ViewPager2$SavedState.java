package androidx.viewpager2.widget;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2$SavedState;

/* loaded from: classes.dex */
public class ViewPager2$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<ViewPager2$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<ViewPager2$SavedState>() { // from class: X.0CH
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new ViewPager2$SavedState(parcel, null);
            }
            return new ViewPager2$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ViewPager2$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final ViewPager2$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new ViewPager2$SavedState(parcel, classLoader);
            }
            return new ViewPager2$SavedState(parcel);
        }
    };
    public int LJLIL;
    public int LJLILLLLZI;
    public Parcelable LJLJI;

    public ViewPager2$SavedState(Parcel parcel) {
        super(parcel);
        this.LJLIL = parcel.readInt();
        this.LJLILLLLZI = parcel.readInt();
        this.LJLJI = parcel.readParcelable(null);
    }

    public ViewPager2$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public ViewPager2$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LJLIL = parcel.readInt();
        this.LJLILLLLZI = parcel.readInt();
        this.LJLJI = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LJLIL);
        parcel.writeInt(this.LJLILLLLZI);
        parcel.writeParcelable(this.LJLJI, i);
    }
}
