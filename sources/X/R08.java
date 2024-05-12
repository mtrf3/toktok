package X;

import android.os.Parcel;

/* loaded from: classes12.dex */
public abstract class R08 extends BinderC68756Qye {
    public R08() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            R04 LLJI = AbstractBinderC68813QzZ.LLJI(parcel.readStrongBinder());
            C68223Qq3.LIZ(parcel);
            ((R0K) this).LJLIL.LIZ(new R0A(LLJI));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
