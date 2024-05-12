package androidx.databinding;

import X.AbstractC40081hk;
import X.InterfaceC024807w;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableLong extends AbstractC40081hk implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new IDCreatorS45S0000000(23);
    public static final long serialVersionUID = 1;
    public long mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableLong() {
    }

    public long get() {
        return this.mValue;
    }

    public ObservableLong(long j) {
        this.mValue = j;
    }

    public void set(long j) {
        if (j != this.mValue) {
            this.mValue = j;
            notifyChange();
        }
    }

    public ObservableLong(InterfaceC024807w... interfaceC024807wArr) {
        super(interfaceC024807wArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mValue);
    }
}
