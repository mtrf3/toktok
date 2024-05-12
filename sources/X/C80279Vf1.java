package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter;

/* renamed from: X.Vf1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80279Vf1 implements Parcelable.Creator<BottomNavigationPresenter.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final BottomNavigationPresenter.SavedState createFromParcel(Parcel parcel) {
        return new BottomNavigationPresenter.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final BottomNavigationPresenter.SavedState[] newArray(int i) {
        return new BottomNavigationPresenter.SavedState[i];
    }
}
