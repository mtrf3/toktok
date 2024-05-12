package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.play.core.assetpacks.l;
import com.google.android.play.core.assetpacks.m;
import com.google.android.play.core.assetpacks.n;
import com.google.android.play.core.assetpacks.o;
import com.google.android.play.core.assetpacks.p;
import java.util.List;

/* renamed from: X.Fwq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40616Fwq extends C40593FwT implements InterfaceC40617Fwr {
    public C40616Fwq(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // X.InterfaceC40617Fwr
    public final void LLJZIJLIL(String str, Bundle bundle, n nVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(nVar);
        LLJI(LJLJI, 5);
    }

    @Override // X.InterfaceC40617Fwr
    public final void n0(String str, Bundle bundle, o oVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(oVar);
        LLJI(LJLJI, 10);
    }

    @Override // X.InterfaceC40617Fwr
    public final void LJLJL(String str, List list, Bundle bundle, l lVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeTypedList(list);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(lVar);
        LLJI(LJLJI, 14);
    }

    @Override // X.InterfaceC40617Fwr
    public final void LLZZZZ(String str, Bundle bundle, Bundle bundle2, m mVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeInt(1);
        bundle2.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(mVar);
        LLJI(LJLJI, 11);
    }

    @Override // X.InterfaceC40617Fwr
    public final void a(String str, Bundle bundle, Bundle bundle2, p pVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeInt(1);
        bundle2.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(pVar);
        LLJI(LJLJI, 7);
    }

    @Override // X.InterfaceC40617Fwr
    public final void i(String str, Bundle bundle, Bundle bundle2, l lVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeInt(1);
        bundle2.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(lVar);
        LLJI(LJLJI, 9);
    }

    @Override // X.InterfaceC40617Fwr
    public final void s(String str, Bundle bundle, Bundle bundle2, l lVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeInt(1);
        bundle2.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(lVar);
        LLJI(LJLJI, 6);
    }
}
