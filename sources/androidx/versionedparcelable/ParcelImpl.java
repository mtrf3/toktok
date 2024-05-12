package androidx.versionedparcelable;

import X.C1HZ;
import X.InterfaceC06180Mc;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new IDCreatorS45S0000000(33);
    public final InterfaceC06180Mc mParcel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelImpl(Parcel parcel) {
        this.mParcel = new C1HZ(parcel).LJIILIIL();
    }

    public ParcelImpl(InterfaceC06180Mc interfaceC06180Mc) {
        this.mParcel = interfaceC06180Mc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C1HZ(parcel).LJIL(this.mParcel);
    }
}
