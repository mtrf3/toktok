package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: X.FwH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40581FwH extends C40593FwT implements InterfaceC40576FwC {
    public C40581FwH(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    @Override // X.InterfaceC40576FwC
    public final void f0(String str, List list, Bundle bundle, BinderC40584FwK binderC40584FwK) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeTypedList(list);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(binderC40584FwK);
        LLJI(LJLJI, 2);
    }

    @Override // X.InterfaceC40576FwC
    public final void p(String str, int i, Bundle bundle, BinderC40587FwN binderC40587FwN) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeInt(i);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeStrongBinder(binderC40587FwN);
        LLJI(LJLJI, 4);
    }
}
