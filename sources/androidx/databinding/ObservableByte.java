package androidx.databinding;

import X.AbstractC40081hk;
import X.InterfaceC024807w;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableByte extends AbstractC40081hk implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new IDCreatorS45S0000000(18);
    public static final long serialVersionUID = 1;
    public byte mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableByte() {
    }

    public byte get() {
        return this.mValue;
    }

    public ObservableByte(byte b) {
        this.mValue = b;
    }

    public void set(byte b) {
        if (b != this.mValue) {
            this.mValue = b;
            notifyChange();
        }
    }

    public ObservableByte(InterfaceC024807w... interfaceC024807wArr) {
        super(interfaceC024807wArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mValue);
    }
}
