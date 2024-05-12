package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.FxA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40636FxA implements FL7 {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C40636FxA(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.FL7
    public final void LJFF(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.ugc.cut_downloader.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.LJLIL.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // X.FL7
    public final void onError(int i, String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.ugc.cut_downloader.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.LJLIL.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
