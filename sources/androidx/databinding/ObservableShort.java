package androidx.databinding;

import X.AbstractC40081hk;
import X.InterfaceC024807w;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableShort extends AbstractC40081hk implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new IDCreatorS45S0000000(25);
    public static final long serialVersionUID = 1;
    public short mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableShort() {
    }

    public short get() {
        return this.mValue;
    }

    public ObservableShort(short s) {
        this.mValue = s;
    }

    public void set(short s) {
        if (s != this.mValue) {
            this.mValue = s;
            notifyChange();
        }
    }

    public ObservableShort(InterfaceC024807w... interfaceC024807wArr) {
        super(interfaceC024807wArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
