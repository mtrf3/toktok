package androidx.databinding;

import X.AbstractC40081hk;
import X.InterfaceC024807w;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableBoolean extends AbstractC40081hk implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new IDCreatorS45S0000000(17);
    public static final long serialVersionUID = 1;
    public boolean mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableBoolean() {
    }

    public boolean get() {
        return this.mValue;
    }

    public ObservableBoolean(boolean z) {
        this.mValue = z;
    }

    public void set(boolean z) {
        if (z != this.mValue) {
            this.mValue = z;
            notifyChange();
        }
    }

    public ObservableBoolean(InterfaceC024807w... interfaceC024807wArr) {
        super(interfaceC024807wArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue ? 1 : 0);
    }
}
