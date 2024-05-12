package X;

import android.os.Parcel;

/* loaded from: classes12.dex */
public abstract class R0T extends BinderC68756Qye {
    public R0T() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ((R0U) this).LJLIL.LIZ();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
