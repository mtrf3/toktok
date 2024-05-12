package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.PHc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64188PHc implements PHW {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C64188PHc(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.PHW
    public final void LJJIZ(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            obtain.writeString(str);
            this.LJLIL.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.PHW
    public final void LJJJJJ(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            obtain.writeString(str);
            this.LJLIL.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.PHW
    public final void LJJLL(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            obtain.writeString(str);
            this.LJLIL.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.PHW
    public final void LJJJLIIL(String str, boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            obtain.writeString(str);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.PHW
    public final void LLJILJILJ(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.LJLIL.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.PHW
    public final void LLJJLIIIJLLLLLLLZ(long j, String str, String str2, String str3, String str4, String str5) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            obtain.writeLong(j);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeString(str5);
            this.LJLIL.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
