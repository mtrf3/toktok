package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: X.007, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass007 implements ServiceConnection {
    public Context mApplicationContext;

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AnonymousClass003 anonymousClass003);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
        final InterfaceC10090aT interfaceC10090aT;
        if (this.mApplicationContext != null) {
            if (iBinder == null) {
                interfaceC10090aT = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC10090aT)) {
                    interfaceC10090aT = (InterfaceC10090aT) queryLocalInterface;
                } else {
                    interfaceC10090aT = new InterfaceC10090aT(iBinder) { // from class: X.1Pb
                        public final IBinder LJLIL;

                        @Override // android.os.IInterface
                        public final IBinder asBinder() {
                            return this.LJLIL;
                        }

                        {
                            this.LJLIL = iBinder;
                        }

                        @Override // X.InterfaceC10090aT
                        public final boolean LLLLLJLJLL(BinderC39601gy binderC39601gy) {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            try {
                                obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                                obtain.writeStrongBinder(binderC39601gy);
                                boolean z = false;
                                this.LJLIL.transact(3, obtain, obtain2, 0);
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

                        @Override // X.InterfaceC10090aT
                        public final boolean LLZLLIL(long j) {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            try {
                                obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                                obtain.writeLong(j);
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

                        @Override // X.InterfaceC10090aT
                        public final boolean LLIIIL(InterfaceC10080aS interfaceC10080aS, android.net.Uri uri, Bundle bundle, List<Bundle> list) {
                            IBinder iBinder2;
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            try {
                                obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                                if (interfaceC10080aS == null) {
                                    iBinder2 = null;
                                } else {
                                    iBinder2 = interfaceC10080aS.asBinder();
                                }
                                obtain.writeStrongBinder(iBinder2);
                                boolean z = true;
                                if (uri != null) {
                                    obtain.writeInt(1);
                                    uri.writeToParcel(obtain, 0);
                                } else {
                                    obtain.writeInt(0);
                                }
                                if (bundle != null) {
                                    obtain.writeInt(1);
                                    bundle.writeToParcel(obtain, 0);
                                } else {
                                    obtain.writeInt(0);
                                }
                                obtain.writeTypedList(list);
                                this.LJLIL.transact(4, obtain, obtain2, 0);
                                obtain2.readException();
                                if (obtain2.readInt() == 0) {
                                    z = false;
                                }
                                return z;
                            } finally {
                                obtain2.recycle();
                                obtain.recycle();
                            }
                        }
                    };
                }
            }
            onCustomTabsServiceConnected(componentName, new AnonymousClass003(interfaceC10090aT, componentName) { // from class: X.17L
            });
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
