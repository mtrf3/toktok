package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Qpu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68214Qpu extends C68224Qq4 implements InterfaceC67602Qg2 {
    public C68214Qpu(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // X.InterfaceC67602Qg2
    public final Bundle LJJJZ(Bundle bundle) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, bundle);
        Parcel LLJI = LLJI(LJLJI, 1);
        Bundle bundle2 = (Bundle) C68209Qpp.LIZ(LLJI, Bundle.CREATOR);
        LLJI.recycle();
        return bundle2;
    }
}
