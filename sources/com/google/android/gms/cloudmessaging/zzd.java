package com.google.android.gms.cloudmessaging;

import X.C67176QYa;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C67176QYa();
    public final Messenger LJLIL;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        Messenger messenger = this.LJLIL;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    public zzd(IBinder iBinder) {
        this.LJLIL = new Messenger(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.LJLIL;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((zzd) obj).LJLIL;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.LJLIL;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
