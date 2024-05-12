package com.bytedance.ies.nle.ui_base;

import X.C84280X5w;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class IBinderWrapper implements Parcelable {
    public static final C84280X5w CREATOR = new C84280X5w();
    public final IBinder iBinder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IBinderWrapper(Parcel parcel) {
        o.LJIIJ(parcel, "parcel");
        IBinder readStrongBinder = parcel.readStrongBinder();
        o.LJFF(readStrongBinder, "parcel.readStrongBinder()");
        this.iBinder = readStrongBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIJ(parcel, "parcel");
        parcel.writeStrongBinder(this.iBinder);
    }
}
