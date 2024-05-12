package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.Zhc, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90632Zhc extends C90232ZbA implements InterfaceC90112ZYe {
    @Override // X.InterfaceC90112ZYe
    public final void LLIIII() {
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZIZ(LJLJI, null);
        LLJJIII(LJLJI, 1);
    }

    public C90632Zhc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // X.InterfaceC90112ZYe
    public final void LJIILL(int i) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(i);
        LLJJIII(LJLJI, 5);
    }

    @Override // X.InterfaceC90112ZYe
    public final void LJJ(int i) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(i);
        LLJJIII(LJLJI, 2);
    }

    @Override // X.InterfaceC90112ZYe
    public final void LJJLJLI(boolean z) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(z ? 1 : 0);
        LJLJI.writeInt(0);
        LLJJIII(LJLJI, 6);
    }

    @Override // X.InterfaceC90112ZYe
    public final void LLJJJJ(ConnectionResult connectionResult) {
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZIZ(LJLJI, connectionResult);
        LLJJIII(LJLJI, 3);
    }

    @Override // X.InterfaceC90112ZYe
    public final void v0(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZIZ(LJLJI, applicationMetadata);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeInt(z ? 1 : 0);
        LLJJIII(LJLJI, 4);
    }
}
