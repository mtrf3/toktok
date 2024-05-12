package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.QzS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68806QzS extends C68811QzX implements InterfaceC68803QzP {
    public C68806QzS(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // X.InterfaceC68803QzP
    public final InterfaceC68163Qp5 LLIL(LatLngBounds latLngBounds) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, latLngBounds);
        LLJI.writeInt(0);
        Parcel LJLJI = LJLJI(LLJI, 10);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }

    @Override // X.InterfaceC68803QzP
    public final InterfaceC68163Qp5 J(LatLng latLng, float f) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, latLng);
        LLJI.writeFloat(f);
        Parcel LJLJI = LJLJI(LLJI, 9);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }

    @Override // X.InterfaceC68803QzP
    public final InterfaceC68163Qp5 LLJILJIL(LatLngBounds latLngBounds, int i, int i2) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, latLngBounds);
        LLJI.writeInt(i);
        LLJI.writeInt(i2);
        LLJI.writeInt(0);
        Parcel LJLJI = LJLJI(LLJI, 11);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }
}
