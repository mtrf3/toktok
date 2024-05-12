package androidx.databinding;

import X.AbstractC40081hk;
import X.InterfaceC024807w;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableFloat extends AbstractC40081hk implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new IDCreatorS45S0000000(21);
    public static final long serialVersionUID = 1;
    public float mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableFloat() {
    }

    public float get() {
        return this.mValue;
    }

    public ObservableFloat(float f) {
        this.mValue = f;
    }

    public void set(float f) {
        if (f != this.mValue) {
            this.mValue = f;
            notifyChange();
        }
    }

    public ObservableFloat(InterfaceC024807w... interfaceC024807wArr) {
        super(interfaceC024807wArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mValue);
    }
}
