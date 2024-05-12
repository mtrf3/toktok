package X;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.QmH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class BinderC67989QmH extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC67989QmH() {
        attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status createFromParcel;
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        AbstractBinderC68013Qmf abstractBinderC68013Qmf = (AbstractBinderC68013Qmf) this;
        if (i == 1) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            Parcelable parcelable = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(parcel);
            }
            Status status = createFromParcel;
            Parcelable.Creator creator2 = PendingIntent.CREATOR;
            if (parcel.readInt() != 0) {
                parcelable = (Parcelable) creator2.createFromParcel(parcel);
            }
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                C78923UyF.LJIIZILJ(status, parcelable, ((BinderC68010Qmc) abstractBinderC68013Qmf).LJLIL);
                return true;
            }
            throw new BadParcelableException(KMP.LJ("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        return false;
    }
}
