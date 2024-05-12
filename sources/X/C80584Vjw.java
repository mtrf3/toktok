package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;

/* renamed from: X.Vjw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80584Vjw implements Parcelable.ClassLoaderCreator<ViewPagerBottomSheetBehavior.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ViewPagerBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ViewPagerBottomSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final ViewPagerBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ViewPagerBottomSheetBehavior.SavedState(parcel, classLoader);
    }
}
