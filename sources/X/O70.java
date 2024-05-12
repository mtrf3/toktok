package X;

import android.telephony.TelephonyManager;

/* loaded from: classes11.dex */
public final class O70 extends QXX {
    public final /* synthetic */ TelephonyManager LJLIL;

    @Override // X.QXX
    public final String LLIFFJFJJ() {
        return String.valueOf(EF7.LJIIIZ);
    }

    @Override // X.QXX
    public final String LLIIIILZ() {
        TelephonyManager telephonyManager = this.LJLIL;
        if (telephonyManager == null) {
            return "";
        }
        C39405FdJ.LJFF.getClass();
        return C39571Ffz.LJIIIIZZ(telephonyManager);
    }

    @Override // X.QXX
    public final String LLILLIZIL() {
        TelephonyManager telephonyManager = this.LJLIL;
        if (telephonyManager == null) {
            return "";
        }
        C39405FdJ.LJFF.getClass();
        return C39571Ffz.LJI(telephonyManager);
    }

    @Override // X.QXX
    public final String LLFII() {
        return EF7.LIZLLL();
    }

    @Override // X.QXX
    public final String LLII() {
        return EF7.LIZ();
    }

    @Override // X.QXX
    public final String LLIIJI() {
        return NW6.LIZ().getDeviceId();
    }

    @Override // X.QXX
    public final String LLILII() {
        return NW6.LIZ().LIZJ();
    }

    @Override // X.QXX
    public final String LLILL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EF7.LJI());
        LIZ.append("");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.QXX
    public final String LLILLJJLI() {
        return NW6.LIZ().getOpenUdid();
    }

    @Override // X.QXX
    public final String LLJJIII() {
        return String.valueOf(EF7.LJFF());
    }

    @Override // X.QXX
    public final String LLJJIJIL() {
        return EF7.LIZLLL();
    }

    @Override // X.QXX
    public final String LLIIIZ() {
        return EF7.LJIILIIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O70(TelephonyManager telephonyManager) {
        super((Object) null);
        this.LJLIL = telephonyManager;
    }
}
