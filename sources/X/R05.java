package X;

import android.os.Parcel;

/* loaded from: classes12.dex */
public abstract class R05 extends BinderC68756Qye {
    public R05() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // X.BinderC68756Qye
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            R04 LLJI = AbstractBinderC68813QzZ.LLJI(parcel.readStrongBinder());
            C68223Qq3.LIZ(parcel);
            ((R0L) this).LJLIL.LJ(new R0A(LLJI));
            BinderC68153Qov binderC68153Qov = new BinderC68153Qov(null);
            parcel2.writeNoException();
            C68223Qq3.LIZJ(parcel2, binderC68153Qov);
        } else {
            R04 LLJI2 = AbstractBinderC68813QzZ.LLJI(parcel.readStrongBinder());
            C68223Qq3.LIZ(parcel);
            ((R0L) this).LJLIL.LJFF(new R0A(LLJI2));
            BinderC68153Qov binderC68153Qov2 = new BinderC68153Qov(null);
            parcel2.writeNoException();
            C68223Qq3.LIZJ(parcel2, binderC68153Qov2);
        }
        return true;
    }
}
