package X;

import android.os.Parcel;

/* loaded from: classes12.dex */
public abstract class R0P extends BinderC68756Qye {
    public R0P() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ((R0Q) this).LJLIL.LIZJ();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
