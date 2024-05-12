package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: X.QzR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68805QzR extends C68811QzX implements InterfaceC68804QzQ {
    @Override // X.InterfaceC68804QzQ
    public final VisibleRegion LJJIJL() {
        VisibleRegion createFromParcel;
        Parcel LJLJI = LJLJI(LLJI(), 3);
        Parcelable.Creator<VisibleRegion> creator = VisibleRegion.CREATOR;
        if (LJLJI.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(LJLJI);
        }
        VisibleRegion visibleRegion = createFromParcel;
        LJLJI.recycle();
        return visibleRegion;
    }

    public C68805QzR(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // X.InterfaceC68804QzQ
    public final InterfaceC68163Qp5 LLIIL(LatLng latLng) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, latLng);
        Parcel LJLJI = LJLJI(LLJI, 2);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }
}
