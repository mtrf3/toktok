package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Qpt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68213Qpt extends C68224Qq4 implements InterfaceC68137Qof {
    @Override // X.InterfaceC68137Qof
    public final int LIZLLL() {
        Parcel LLJI = LLJI(LJLJI(), 2);
        int readInt = LLJI.readInt();
        LLJI.recycle();
        return readInt;
    }

    public C68213Qpt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // X.InterfaceC68137Qof
    public final void LLILZ(long j, String str, String str2, Bundle bundle) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        C68209Qpp.LIZJ(LJLJI, bundle);
        LJLJI.writeLong(j);
        LLJJIII(LJLJI, 1);
    }
}
