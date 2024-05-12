package X;

import android.os.Parcel;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.Zhe, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractBinderC90634Zhe extends BinderC90358ZdC {
    public AbstractBinderC90634Zhe() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        ZYU<T> zyu;
        ZYU<T> zyu2;
        ZYU<T> zyu3;
        ZYU<T> zyu4;
        ZYU<T> zyu5;
        ZYU<T> zyu6;
        ZYU<T> zyu7;
        ZYU<T> zyu8;
        ZYU<T> zyu9;
        boolean z = false;
        switch (i) {
            case 1:
                BinderC68153Qov binderC68153Qov = new BinderC68153Qov(((BinderC90869ZlR) this).LJLIL);
                parcel2.writeNoException();
                C90257ZbZ.LIZJ(parcel2, binderC68153Qov);
                return true;
            case 2:
                BinderC90869ZlR binderC90869ZlR = (BinderC90869ZlR) this;
                Object LLJJIII = BinderC68153Qov.LLJJIII(AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder()));
                if (binderC90869ZlR.LJLILLLLZI.isInstance(LLJJIII) && (zyu = binderC90869ZlR.LJLIL) != 0) {
                    zyu.LIZJ((ZYQ) binderC90869ZlR.LJLILLLLZI.cast(LLJJIII));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC68163Qp5 LLJI = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                String readString = parcel.readString();
                BinderC90869ZlR binderC90869ZlR2 = (BinderC90869ZlR) this;
                Object LLJJIII2 = BinderC68153Qov.LLJJIII(LLJI);
                if (binderC90869ZlR2.LJLILLLLZI.isInstance(LLJJIII2) && (zyu2 = binderC90869ZlR2.LJLIL) != 0) {
                    zyu2.LJIILIIL((ZYQ) binderC90869ZlR2.LJLILLLLZI.cast(LLJJIII2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                BinderC90869ZlR binderC90869ZlR3 = (BinderC90869ZlR) this;
                Object LLJJIII3 = BinderC68153Qov.LLJJIII(LLJI2);
                if (binderC90869ZlR3.LJLILLLLZI.isInstance(LLJJIII3) && (zyu3 = binderC90869ZlR3.LJLIL) != 0) {
                    zyu3.LIZ((ZYQ) binderC90869ZlR3.LJLILLLLZI.cast(LLJJIII3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                BinderC90869ZlR binderC90869ZlR4 = (BinderC90869ZlR) this;
                Object LLJJIII4 = BinderC68153Qov.LLJJIII(AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder()));
                if (binderC90869ZlR4.LJLILLLLZI.isInstance(LLJJIII4) && (zyu4 = binderC90869ZlR4.LJLIL) != 0) {
                    zyu4.LJFF((ZYQ) binderC90869ZlR4.LJLILLLLZI.cast(LLJJIII4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC68163Qp5 LLJI3 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                BinderC90869ZlR binderC90869ZlR5 = (BinderC90869ZlR) this;
                Object LLJJIII5 = BinderC68153Qov.LLJJIII(LLJI3);
                if (binderC90869ZlR5.LJLILLLLZI.isInstance(LLJJIII5) && (zyu5 = binderC90869ZlR5.LJLIL) != 0) {
                    zyu5.LJII((ZYQ) binderC90869ZlR5.LJLILLLLZI.cast(LLJJIII5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC68163Qp5 LLJI4 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                BinderC90869ZlR binderC90869ZlR6 = (BinderC90869ZlR) this;
                Object LLJJIII6 = BinderC68153Qov.LLJJIII(LLJI4);
                if (binderC90869ZlR6.LJLILLLLZI.isInstance(LLJJIII6) && (zyu6 = binderC90869ZlR6.LJLIL) != 0) {
                    zyu6.LJIIIZ((ZYQ) binderC90869ZlR6.LJLILLLLZI.cast(LLJJIII6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC68163Qp5 LLJI5 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                BinderC90869ZlR binderC90869ZlR7 = (BinderC90869ZlR) this;
                Object LLJJIII7 = BinderC68153Qov.LLJJIII(LLJI5);
                if (binderC90869ZlR7.LJLILLLLZI.isInstance(LLJJIII7) && (zyu7 = binderC90869ZlR7.LJLIL) != 0) {
                    zyu7.LJIIL((ZYQ) binderC90869ZlR7.LJLILLLLZI.cast(LLJJIII7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC68163Qp5 LLJI6 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                BinderC90869ZlR binderC90869ZlR8 = (BinderC90869ZlR) this;
                Object LLJJIII8 = BinderC68153Qov.LLJJIII(LLJI6);
                if (binderC90869ZlR8.LJLILLLLZI.isInstance(LLJJIII8) && (zyu8 = binderC90869ZlR8.LJLIL) != 0) {
                    zyu8.LJIIIIZZ((ZYQ) binderC90869ZlR8.LJLILLLLZI.cast(LLJJIII8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC68163Qp5 LLJI7 = AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                BinderC90869ZlR binderC90869ZlR9 = (BinderC90869ZlR) this;
                Object LLJJIII9 = BinderC68153Qov.LLJJIII(LLJI7);
                if (binderC90869ZlR9.LJLILLLLZI.isInstance(LLJJIII9) && (zyu9 = binderC90869ZlR9.LJLIL) != 0) {
                    zyu9.LJIILJJIL((ZYQ) binderC90869ZlR9.LJLILLLLZI.cast(LLJJIII9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
