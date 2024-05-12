package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: X.QzU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68808QzU extends C68811QzX implements R02 {
    @Override // X.R02
    public final void onDestroy() {
        LLJJIII(LLJI(), 8);
    }

    @Override // X.R02
    public final void onDestroyView() {
        LLJJIII(LLJI(), 7);
    }

    @Override // X.R02
    public final void onLowMemory() {
        LLJJIII(LLJI(), 9);
    }

    @Override // X.R02
    public final void onPause() {
        LLJJIII(LLJI(), 6);
    }

    @Override // X.R02
    public final void onResume() {
        LLJJIII(LLJI(), 5);
    }

    @Override // X.R02
    public final void onStart() {
        LLJJIII(LLJI(), 15);
    }

    @Override // X.R02
    public final void onStop() {
        LLJJIII(LLJI(), 16);
    }

    public C68808QzU(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // X.R02
    public final void a0(BinderC68820Qzg binderC68820Qzg) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, binderC68820Qzg);
        LLJJIII(LLJI, 12);
    }

    @Override // X.R02
    public final void onCreate(Bundle bundle) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, bundle);
        LLJJIII(LLJI, 3);
    }

    @Override // X.R02
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, bundle);
        Parcel LJLJI = LJLJI(LLJI, 10);
        if (LJLJI.readInt() != 0) {
            bundle.readFromParcel(LJLJI);
        }
        LJLJI.recycle();
    }

    @Override // X.R02
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

    @Override // X.R02
    public final void l0(BinderC68153Qov binderC68153Qov, GoogleMapOptions googleMapOptions, Bundle bundle) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, binderC68153Qov);
        C68223Qq3.LIZIZ(LLJI, googleMapOptions);
        C68223Qq3.LIZIZ(LLJI, bundle);
        LLJJIII(LLJI, 2);
    }
}
