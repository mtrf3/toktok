package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.FwX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40597FwX extends C40593FwT implements InterfaceC40622Fww {
    public C40597FwX(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // X.InterfaceC40622Fww
    public final void b(Bundle bundle) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LLJI(LJLJI, 4);
    }

    @Override // X.InterfaceC40622Fww
    public final void f(Bundle bundle) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LLJI(LJLJI, 3);
    }

    @Override // X.InterfaceC40622Fww
    public final void LJZ(Bundle bundle, Bundle bundle2) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeInt(1);
        bundle2.writeToParcel(LJLJI, 0);
        LLJI(LJLJI, 2);
    }
}
