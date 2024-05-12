package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0bR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10690bR<T> implements Parcelable.ClassLoaderCreator<T> {
    public final InterfaceC10700bS<T> LIZ;

    public C10690bR(InterfaceC10700bS<T> interfaceC10700bS) {
        this.LIZ = interfaceC10700bS;
    }

    @Override // android.os.Parcelable.Creator
    public final T createFromParcel(Parcel parcel) {
        return this.LIZ.createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final T[] newArray(int i) {
        return this.LIZ.newArray(i);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.LIZ.createFromParcel(parcel, classLoader);
    }
}
