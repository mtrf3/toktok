package X;

import android.os.Parcel;

/* loaded from: classes12.dex */
public abstract class R0S extends BinderC68756Qye {
    public R0S() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ((R0V) this).LJLIL.LIZ();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
