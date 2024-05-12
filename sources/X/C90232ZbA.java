package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.ZbA, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90232ZbA implements IInterface {
    public final IBinder LJLIL;
    public final String LJLILLLLZI;

    public C90232ZbA(IBinder iBinder, String str) {
        this.LJLIL = iBinder;
        this.LJLILLLLZI = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public final Parcel LJLJI() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.LJLILLLLZI);
        return obtain;
    }

    public final Parcel LLJI(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.LJLIL.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void LLJJIII(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.LJLIL.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void LLZZJLIL(Parcel parcel, int i) {
        try {
            this.LJLIL.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
