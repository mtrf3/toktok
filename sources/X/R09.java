package X;

import android.os.Parcel;

/* loaded from: classes12.dex */
public abstract class R09 extends BinderC68756Qye {
    public R09() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                R04 LLJI = AbstractBinderC68813QzZ.LLJI(parcel.readStrongBinder());
                C68223Qq3.LIZ(parcel);
                ((R0I) this).LJLIL.LJI(new R0A(LLJI));
            } else {
                R04 LLJI2 = AbstractBinderC68813QzZ.LLJI(parcel.readStrongBinder());
                C68223Qq3.LIZ(parcel);
                ((R0I) this).LJLIL.LIZJ(new R0A(LLJI2));
            }
        } else {
            R04 LLJI3 = AbstractBinderC68813QzZ.LLJI(parcel.readStrongBinder());
            C68223Qq3.LIZ(parcel);
            ((R0I) this).LJLIL.LJII(new R0A(LLJI3));
        }
        parcel2.writeNoException();
        return true;
    }
}
