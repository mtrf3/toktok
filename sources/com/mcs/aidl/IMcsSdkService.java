package com.mcs.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes28.dex */
public interface IMcsSdkService extends IInterface {

    /* loaded from: classes28.dex */
    public static class Default implements IMcsSdkService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.mcs.aidl.IMcsSdkService
        public void process(Bundle bundle) {
        }
    }

    /* loaded from: classes28.dex */
    public static abstract class Stub extends Binder implements IMcsSdkService {

        /* loaded from: classes28.dex */
        public static class Proxy implements IMcsSdkService {
            public static IMcsSdkService sDefaultImpl;
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.mcs.aidl.IMcsSdkService";
            }

            @Override // com.mcs.aidl.IMcsSdkService
            public void process(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.mcs.aidl.IMcsSdkService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().process(bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.mcs.aidl.IMcsSdkService");
        }

        public static IMcsSdkService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.mcs.aidl.IMcsSdkService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMcsSdkService)) ? new Proxy(iBinder) : (IMcsSdkService) queryLocalInterface;
        }

        public static IMcsSdkService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMcsSdkService iMcsSdkService) {
            if (Proxy.sDefaultImpl != null || iMcsSdkService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMcsSdkService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.mcs.aidl.IMcsSdkService");
                return true;
            }
            parcel.enforceInterface("com.mcs.aidl.IMcsSdkService");
            process(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void process(Bundle bundle);
}
