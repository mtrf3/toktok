package X;

import android.os.Parcel;

/* loaded from: classes12.dex */
public abstract class R0B extends BinderC68756Qye {
    public R0B() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            C68223Qq3.LIZ(parcel);
            ((R0M) this).LJLIL.LIZ(readInt);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
