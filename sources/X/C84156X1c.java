package X;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: X.X1c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84156X1c implements X17 {
    public final IBinder LJLIL;

    @Override // X.X17
    public final boolean LJJLIIIJL() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
            boolean z = false;
            this.LJLIL.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C84156X1c(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.X17
    public final void LJJJJZI(List<String> list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
            obtain.writeStringList(list);
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
