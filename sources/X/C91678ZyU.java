package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntryState;
import kotlin.jvm.internal.o;

/* renamed from: X.ZyU, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91678ZyU implements Parcelable.Creator<NavBackStackEntryState> {
    @Override // android.os.Parcelable.Creator
    public final NavBackStackEntryState createFromParcel(Parcel inParcel) {
        o.LJIIIZ(inParcel, "inParcel");
        return new NavBackStackEntryState(inParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final NavBackStackEntryState[] newArray(int i) {
        return new NavBackStackEntryState[i];
    }
}
