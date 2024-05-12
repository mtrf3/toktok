package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;

/* renamed from: X.QtV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68437QtV extends C67884Qka implements InterfaceC68436QtU {
    @Override // X.InterfaceC68436QtU
    public final boolean LIZJ() {
        boolean z;
        Parcel LJLJI = LJLJI(LLJI(), 7);
        if (LJLJI.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        LJLJI.recycle();
        return z;
    }

    public C68437QtV(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // X.InterfaceC68436QtU
    public final zzq LJLL(zzn zznVar) {
        Parcel LLJI = LLJI();
        LLJI.writeInt(1);
        zznVar.writeToParcel(LLJI, 0);
        Parcel LJLJI = LJLJI(LLJI, 6);
        zzq zzqVar = (zzq) C67609Qg9.LIZ(LJLJI, zzq.CREATOR);
        LJLJI.recycle();
        return zzqVar;
    }

    @Override // X.InterfaceC68436QtU
    public final boolean LLJZ(zzs zzsVar, BinderC68153Qov binderC68153Qov) {
        Parcel LLJI = LLJI();
        boolean z = true;
        LLJI.writeInt(1);
        zzsVar.writeToParcel(LLJI, 0);
        C67609Qg9.LIZIZ(LLJI, binderC68153Qov);
        Parcel LJLJI = LJLJI(LLJI, 5);
        if (LJLJI.readInt() == 0) {
            z = false;
        }
        LJLJI.recycle();
        return z;
    }
}
