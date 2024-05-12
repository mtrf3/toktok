package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.vision.behavior.SearchBottomSheetBehavior;

/* renamed from: X.Vk5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80593Vk5 implements Parcelable.ClassLoaderCreator<SearchBottomSheetBehavior.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SearchBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SearchBottomSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final SearchBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchBottomSheetBehavior.SavedState(parcel, classLoader);
    }
}
