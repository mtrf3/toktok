package com.ss.android.ugc.cut_ui;

import X.C84281X5x;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class IBinderWrapper implements Parcelable {
    public static final C84281X5x CREATOR = new C84281X5x();
    public final IBinder iBinder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IBinderWrapper(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        IBinder readStrongBinder = parcel.readStrongBinder();
        o.LJIIIIZZ(readStrongBinder, "parcel.readStrongBinder()");
        this.iBinder = readStrongBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeStrongBinder(this.iBinder);
    }
}
