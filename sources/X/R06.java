package X;

import android.os.Parcel;

/* loaded from: classes12.dex */
public abstract class R06 extends BinderC68756Qye {
    public R06() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            R04 LLJI = AbstractBinderC68813QzZ.LLJI(parcel.readStrongBinder());
            C68223Qq3.LIZ(parcel);
            boolean LIZIZ = ((R0H) this).LJLIL.LIZIZ(new R0A(LLJI));
            parcel2.writeNoException();
            parcel2.writeInt(LIZIZ ? 1 : 0);
            return true;
        }
        return false;
    }
}
