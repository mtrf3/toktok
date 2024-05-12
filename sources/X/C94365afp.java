package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: X.afp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94365afp extends C93973aZV implements InterfaceC93986aZi {
    public C94365afp(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
    }

    @Override // X.InterfaceC93986aZi
    public final void LLLIIII(String str, Bundle bundle, BinderC94433agv binderC94433agv) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.LJLILLLLZI);
        obtain.writeString(str);
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        C93975aZX.LIZ(obtain, binderC94433agv);
        try {
            this.LJLIL.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC93986aZi
    public final void LLILZLL(String str, List list, Bundle bundle, BinderC94432agu binderC94432agu) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.LJLILLLLZI);
        obtain.writeString(str);
        obtain.writeTypedList(list);
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        C93975aZX.LIZ(obtain, binderC94432agu);
        try {
            this.LJLIL.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
