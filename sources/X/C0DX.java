package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.0DX, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0DX extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C0DX() {
        attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface queryLocalInterface;
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return true;
        }
        parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        final IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0DW)) {
                queryLocalInterface = new C0DW(readStrongBinder) { // from class: X.1De
                    public final IBinder LJLIL;

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LJLIL;
                    }

                    {
                        this.LJLIL = readStrongBinder;
                    }
                };
            }
        }
        BinderC28541Ac binderC28541Ac = (BinderC28541Ac) this;
        if (queryLocalInterface != null) {
            binderC28541Ac.LJLIL.LIZ();
        }
        return true;
    }
}
