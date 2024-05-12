package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Qkq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class BinderC67900Qkq extends Binder implements IInterface {
    public BinderC67900Qkq() {
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        Status createFromParcel;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        AbstractBinderC67970Qly abstractBinderC67970Qly = (AbstractBinderC67970Qly) this;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(parcel);
        }
        C78923UyF.LJIIZILJ(createFromParcel, null, ((BinderC67956Qlk) abstractBinderC67970Qly).LJLIL.LIZLLL);
        return true;
    }
}
