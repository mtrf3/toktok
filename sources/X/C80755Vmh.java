package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;

/* renamed from: X.Vmh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80755Vmh implements Parcelable.ClassLoaderCreator<AdPopUpWebBottomSheetBehavior.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new AdPopUpWebBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AdPopUpWebBottomSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final AdPopUpWebBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AdPopUpWebBottomSheetBehavior.SavedState(parcel, classLoader);
    }
}
