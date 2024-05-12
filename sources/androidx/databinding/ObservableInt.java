package androidx.databinding;

import X.AbstractC40081hk;
import X.InterfaceC024807w;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableInt extends AbstractC40081hk implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new IDCreatorS45S0000000(22);
    public static final long serialVersionUID = 1;
    public int mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableInt() {
    }

    public int get() {
        return this.mValue;
    }

    public ObservableInt(int i) {
        this.mValue = i;
    }

    public void set(int i) {
        if (i != this.mValue) {
            this.mValue = i;
            notifyChange();
        }
    }

    public ObservableInt(InterfaceC024807w... interfaceC024807wArr) {
        super(interfaceC024807wArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
