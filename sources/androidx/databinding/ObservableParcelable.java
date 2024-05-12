package androidx.databinding;

import X.C45641qi;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ObservableParcelable<T extends Parcelable> extends C45641qi<T> implements Parcelable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new IDCreatorS45S0000000(24);
    public static final long serialVersionUID = 1;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableParcelable() {
    }

    public ObservableParcelable(T t) {
        super(t);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) get(), 0);
    }
}
