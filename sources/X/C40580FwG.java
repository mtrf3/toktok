package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.play.core.appupdate.n;
import com.google.android.play.core.appupdate.o;

/* renamed from: X.FwG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40580FwG extends C40593FwT implements InterfaceC40578FwE {
    public C40580FwG(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    @Override // X.InterfaceC40578FwE
    public final void LLLLII(String str, Bundle bundle, n nVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(nVar);
        LLJI(LJLJI, 3);
    }

    @Override // X.InterfaceC40578FwE
    public final void LLLLIIIILLL(String str, Bundle bundle, o oVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(oVar);
        LLJI(LJLJI, 2);
    }
}
