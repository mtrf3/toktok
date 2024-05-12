package androidx.databinding;

import X.AbstractC40081hk;
import X.InterfaceC024807w;
import Y.IDCreatorS45S0000000;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableChar extends AbstractC40081hk implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new IDCreatorS45S0000000(19);
    public static final long serialVersionUID = 1;
    public char mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableChar() {
    }

    public char get() {
        return this.mValue;
    }

    public ObservableChar(char c) {
        this.mValue = c;
    }

    public void set(char c) {
        if (c != this.mValue) {
            this.mValue = c;
            notifyChange();
        }
    }

    public ObservableChar(InterfaceC024807w... interfaceC024807wArr) {
        super(interfaceC024807wArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
