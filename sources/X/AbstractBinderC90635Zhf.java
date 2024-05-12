package X;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: X.Zhf, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractBinderC90635Zhf extends BinderC90358ZdC {
    public AbstractBinderC90635Zhf() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case 1:
                BinderC68153Qov binderC68153Qov = new BinderC68153Qov(((BinderC90871ZlT) this).LJLIL);
                parcel2.writeNoException();
                C90257ZbZ.LIZJ(parcel2, binderC68153Qov);
                return true;
            case 2:
                ((BinderC90871ZlT) this).LJLIL.LJI((Bundle) C90257ZbZ.LIZ(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                ((BinderC90871ZlT) this).LJLIL.LJFF((Bundle) C90257ZbZ.LIZ(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                if (parcel.readInt() != 0) {
                    z = true;
                }
                ((BinderC90871ZlT) this).LJLIL.LIZ(z);
                parcel2.writeNoException();
                return true;
            case 5:
                long LIZIZ = ((BinderC90871ZlT) this).LJLIL.LIZIZ();
                parcel2.writeNoException();
                parcel2.writeLong(LIZIZ);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 7:
                ((BinderC90871ZlT) this).LJLIL.LJ((Bundle) C90257ZbZ.LIZ(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                ((BinderC90871ZlT) this).LJLIL.LIZLLL((Bundle) C90257ZbZ.LIZ(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                ((BinderC90871ZlT) this).LJLIL.LJII((Bundle) C90257ZbZ.LIZ(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
