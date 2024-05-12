package com.ss.android.ugc.aweme.shortvideo.jsb.comment;

import X.C44194HWc;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBinderWrapper implements Parcelable {
    public static final C44194HWc CREATOR = new C44194HWc();
    public final IBinder iBinder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IBinderWrapper(IBinder iBinder) {
        o.LJIIIZ(iBinder, "iBinder");
        this.iBinder = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeStrongBinder(this.iBinder);
    }
}
