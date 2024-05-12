package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;

/* renamed from: X.Vmo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80762Vmo implements Parcelable.ClassLoaderCreator<BottomSheetBehavior.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new BottomSheetBehavior.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BottomSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final BottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomSheetBehavior.SavedState(parcel);
    }
}
