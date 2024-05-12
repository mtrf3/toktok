package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.QzV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68809QzV extends C68811QzX implements R03 {
    @Override // X.R03
    public final void onDestroy() {
        LLJJIII(LLJI(), 8);
    }

    @Override // X.R03
    public final void onDestroyView() {
        LLJJIII(LLJI(), 7);
    }

    @Override // X.R03
    public final void onLowMemory() {
        LLJJIII(LLJI(), 9);
    }

    @Override // X.R03
    public final void onPause() {
        LLJJIII(LLJI(), 6);
    }

    @Override // X.R03
    public final void onResume() {
        LLJJIII(LLJI(), 5);
    }

    @Override // X.R03
    public final void onStart() {
        LLJJIII(LLJI(), 13);
    }

    @Override // X.R03
    public final void onStop() {
        LLJJIII(LLJI(), 14);
    }

    public C68809QzV(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    @Override // X.R03
    public final void onCreate(Bundle bundle) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, bundle);
        LLJJIII(LLJI, 3);
    }

    @Override // X.R03
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, bundle);
        Parcel LJLJI = LJLJI(LLJI, 10);
        if (LJLJI.readInt() != 0) {
            bundle.readFromParcel(LJLJI);
        }
        LJLJI.recycle();
    }

    @Override // X.R03
    public final void w0(BinderC68829Qzp binderC68829Qzp) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, binderC68829Qzp);
        LLJJIII(LLJI, 12);
    }

    @Override // X.R03
    public final void LLLIIIL(BinderC68153Qov binderC68153Qov, Bundle bundle) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, binderC68153Qov);
        C68223Qq3.LIZIZ(LLJI, null);
        C68223Qq3.LIZIZ(LLJI, bundle);
        LLJJIII(LLJI, 2);
    }

    @Override // X.R03
    public final InterfaceC68163Qp5 LJJLIIIJILLIZJL(BinderC68153Qov binderC68153Qov, BinderC68153Qov binderC68153Qov2, Bundle bundle) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, binderC68153Qov);
        C68223Qq3.LIZJ(LLJI, binderC68153Qov2);
        C68223Qq3.LIZIZ(LLJI, bundle);
        Parcel LJLJI = LJLJI(LLJI, 4);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }
}
