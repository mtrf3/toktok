package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Qzm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68826Qzm extends C68811QzX implements InterfaceC68835Qzv {
    @Override // X.InterfaceC68835Qzv
    public final void B() {
        Parcel LLJI = LLJI();
        LLJI.writeInt(0);
        LLJJIII(LLJI, 2);
    }

    @Override // X.InterfaceC68835Qzv
    public final void LJJLIIIJ() {
        Parcel LLJI = LLJI();
        LLJI.writeInt(0);
        LLJJIII(LLJI, 3);
    }

    @Override // X.InterfaceC68835Qzv
    public final void LLIIIZ() {
        Parcel LLJI = LLJI();
        LLJI.writeInt(0);
        LLJJIII(LLJI, 18);
    }

    public C68826Qzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }
}
