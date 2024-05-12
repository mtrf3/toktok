package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.X2j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84189X2j implements InterfaceC84190X2k {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C84189X2j(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.InterfaceC84190X2k
    public final void LLFF(java.util.Map map, java.util.Map map2, java.util.Map map3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
            obtain.writeMap(map);
            obtain.writeMap(map2);
            obtain.writeMap(map3);
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
