package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.ZhQ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90620ZhQ extends C90232ZbA implements ZYY {
    @Override // X.ZYY
    public final InterfaceC68163Qp5 LJ() {
        Parcel LLJI = LLJI(LJLJI(), 5);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LLJI.readStrongBinder());
        LLJI.recycle();
        return LLJI2;
    }

    public C90620ZhQ(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }
}
