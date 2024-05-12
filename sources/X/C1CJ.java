package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.1CJ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1CJ extends Binder implements C0BL {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1CJ() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C0BK c0bk = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                ((BinderC40191hv) this).LJLJI(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            final IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof C0BK)) {
                    c0bk = (C0BK) queryLocalInterface;
                } else {
                    c0bk = new C0BK(readStrongBinder) { // from class: X.1CH
                        public final IBinder LJLIL;

                        @Override // android.os.IInterface
                        public final IBinder asBinder() {
                            return this.LJLIL;
                        }

                        {
                            this.LJLIL = readStrongBinder;
                        }

                        @Override // X.C0BK
                        public final void LLLI(String[] strArr) {
                            Parcel obtain = Parcel.obtain();
                            try {
                                obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                obtain.writeStringArray(strArr);
                                this.LJLIL.transact(1, obtain, null, 1);
                            } finally {
                                obtain.recycle();
                            }
                        }
                    };
                }
            }
            ((BinderC40191hv) this).LLJLLIL(c0bk, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        final IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof C0BK)) {
                c0bk = (C0BK) queryLocalInterface2;
            } else {
                c0bk = new C0BK(readStrongBinder2) { // from class: X.1CH
                    public final IBinder LJLIL;

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LJLIL;
                    }

                    {
                        this.LJLIL = readStrongBinder2;
                    }

                    @Override // X.C0BK
                    public final void LLLI(String[] strArr) {
                        Parcel obtain = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                            obtain.writeStringArray(strArr);
                            this.LJLIL.transact(1, obtain, null, 1);
                        } finally {
                            obtain.recycle();
                        }
                    }
                };
            }
        }
        int LLJI = ((BinderC40191hv) this).LLJI(c0bk, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(LLJI);
        return true;
    }
}
