package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Zi3, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90659Zi3 extends C90232ZbA implements InterfaceC90240ZbI {
    public C90659Zi3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // X.InterfaceC90240ZbI
    public final void LJLLJ(Bundle bundle, String str) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        C90257ZbZ.LIZIZ(LJLJI, bundle);
        LLJJIII(LJLJI, 1);
    }

    @Override // X.InterfaceC90240ZbI
    public final void LJZI(Bundle bundle, String str) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        C90257ZbZ.LIZIZ(LJLJI, bundle);
        LLJJIII(LJLJI, 2);
    }

    @Override // X.InterfaceC90240ZbI
    public final void LLD(Bundle bundle, String str) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        C90257ZbZ.LIZIZ(LJLJI, bundle);
        LLJJIII(LJLJI, 3);
    }

    @Override // X.InterfaceC90240ZbI
    public final void LLII(Bundle bundle, String str) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        C90257ZbZ.LIZIZ(LJLJI, bundle);
        LLJJIII(LJLJI, 4);
    }

    @Override // X.InterfaceC90240ZbI
    public final void LJZL(int i, String str, Bundle bundle) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        C90257ZbZ.LIZIZ(LJLJI, bundle);
        LJLJI.writeInt(i);
        LLJJIII(LJLJI, 6);
    }
}
