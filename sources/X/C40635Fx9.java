package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Fx9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40635Fx9 implements InterfaceC40638FxC {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C40635Fx9(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.InterfaceC40638FxC
    public final void LJL(FL7 fl7) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.ugc.cut_downloader.IDownloadService");
            if (fl7 == null) {
                iBinder = null;
            } else {
                iBinder = fl7.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.LJLIL.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC40638FxC
    public final void LLLIL(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.ugc.cut_downloader.IDownloadService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.LJLIL.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
