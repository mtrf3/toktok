package com.appsflyer.internal;

import X.C16880lQ;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class aa {
    public final long AFInAppEventParameterName;
    public final boolean AFInAppEventType;
    public final String AFKeystoreWrapper;

    public aa() {
    }

    /* loaded from: classes.dex */
    public static final class b implements IInterface {
        public final IBinder values;

        public final String AFKeystoreWrapper() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.values.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean valueOf() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.values.transact(2, obtain, obtain2, 0);
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

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.values;
        }

        public b(IBinder iBinder) {
            this.values = iBinder;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements ServiceConnection {
        public boolean AFInAppEventParameterName;
        public final LinkedBlockingQueue<IBinder> values;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public e() {
            this.values = new LinkedBlockingQueue<>(1);
            this.AFInAppEventParameterName = false;
        }

        public /* synthetic */ e(byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.values.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final String valueOf;
        public final boolean values;

        public final boolean valueOf() {
            return this.values;
        }

        public d(String str, boolean z) {
            this.valueOf = str;
            this.values = z;
        }
    }

    public final boolean valueOf() {
        return this.AFInAppEventType;
    }

    public static d values(Context context) {
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            C16880lQ.LLLLLLZ(context.getPackageManager(), "com.android.vending", 0);
            e eVar = new e((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (C16880lQ.LLLJL(context, intent, eVar, 1)) {
                    if (!eVar.AFInAppEventParameterName) {
                        eVar.AFInAppEventParameterName = true;
                        IBinder poll = eVar.values.poll(10L, TimeUnit.SECONDS);
                        if (poll != null) {
                            b bVar = new b(poll);
                            return new d(bVar.AFKeystoreWrapper(), bVar.valueOf());
                        }
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                context.unbindService(eVar);
                throw new IOException("Google Play connection failed");
            } finally {
                context.unbindService(eVar);
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    public aa(String str, long j, boolean z) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventParameterName = j;
        this.AFInAppEventType = z;
    }
}
