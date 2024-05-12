package X;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.QzW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68810QzW extends C68811QzX implements InterfaceC68819Qzf {
    public C68810QzW(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // X.InterfaceC68819Qzf
    public final InterfaceC68163Qp5 LJJZ(Bitmap bitmap) {
        Parcel LLJI = LLJI();
        C68223Qq3.LIZIZ(LLJI, bitmap);
        Parcel LJLJI = LJLJI(LLJI, 6);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }
}
