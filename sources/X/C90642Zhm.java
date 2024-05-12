package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Zhm, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90642Zhm extends C90232ZbA implements ZZ1 {
    @Override // X.ZZ1
    public final InterfaceC68163Qp5 LIZJ() {
        Parcel LLJI = LLJI(LJLJI(), 2);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LLJI.readStrongBinder());
        LLJI.recycle();
        return LLJI2;
    }

    public C90642Zhm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }
}
