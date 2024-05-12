package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Fx8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractBinderC40634Fx8 extends Binder implements InterfaceC40638FxC {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC40634Fx8() {
        attachInterface(this, "com.ss.android.ugc.cut_downloader.IDownloadService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        FL7 c40636FxA;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.ss.android.ugc.cut_downloader.IDownloadService");
                    return true;
                }
                parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadService");
                ((FL8) this).LJLJI(parcel.readString());
                return true;
            }
            parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadService");
            ((FL8) this).LLLIL(parcel.readString(), parcel.readString());
            return true;
        }
        parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadService");
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c40636FxA = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.ugc.cut_downloader.IDownloadCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof FL7)) {
                c40636FxA = (FL7) queryLocalInterface;
            } else {
                c40636FxA = new C40636FxA(readStrongBinder);
            }
        }
        ((FL8) this).LJL(c40636FxA);
        return true;
    }
}
