package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.PrivilegeBottomSheetBehavior;

/* renamed from: X.Vhv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80459Vhv implements Parcelable.ClassLoaderCreator<PrivilegeBottomSheetBehavior.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new PrivilegeBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PrivilegeBottomSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final PrivilegeBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new PrivilegeBottomSheetBehavior.SavedState(parcel, classLoader);
    }
}
