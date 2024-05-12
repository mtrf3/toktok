package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Wfn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractBinderC82875Wfn extends Binder implements FL7 {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC82875Wfn() {
        attachInterface(this, "com.ss.android.ugc.cut_downloader.IDownloadCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.ss.android.ugc.cut_downloader.IDownloadCallback");
                    return true;
                }
                parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadCallback");
                String readString = parcel.readString();
                BinderC82874Wfm binderC82874Wfm = (BinderC82874Wfm) this;
                if (readString != null) {
                    binderC82874Wfm.LJLILLLLZI.LJ.remove(readString);
                    C82876Wfo c82876Wfo = binderC82874Wfm.LJLILLLLZI.LJI;
                    if (c82876Wfo != null) {
                        List list = (List) ((LinkedHashMap) c82876Wfo.LJLJI).get(readString);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC82877Wfp) it.next()).notifyError(-1, "download cancel");
                            }
                        }
                        c82876Wfo.LJLJI.remove(readString);
                    }
                }
                return true;
            }
            parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadCallback");
            BinderC82874Wfm binderC82874Wfm2 = (BinderC82874Wfm) this;
            binderC82874Wfm2.onError(parcel.readInt(), parcel.readString());
            return true;
        }
        parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadCallback");
        ((BinderC82874Wfm) this).LJFF(parcel.readString(), parcel.readString());
        return true;
    }
}
