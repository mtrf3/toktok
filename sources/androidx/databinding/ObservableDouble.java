package androidx.databinding;

import X.AbstractC40081hk;
import X.InterfaceC024807w;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableDouble extends AbstractC40081hk implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new IDCreatorS45S0000000(20);
    public static final long serialVersionUID = 1;
    public double mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableDouble() {
    }

    public double get() {
        return this.mValue;
    }

    public ObservableDouble(double d) {
        this.mValue = d;
    }

    public void set(double d) {
        if (d != this.mValue) {
            this.mValue = d;
            notifyChange();
        }
    }

    public ObservableDouble(InterfaceC024807w... interfaceC024807wArr) {
        super(interfaceC024807wArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mValue);
    }
}
