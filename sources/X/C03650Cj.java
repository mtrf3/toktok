package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ServiceManager;
import android.util.Slog;

/* renamed from: X.0Cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03650Cj {
    public static InterfaceC03620Cg LIZLLL;
    public static C03650Cj LJ;
    public static int LJFF;
    public IBinder LIZ;
    public final C03630Ch LIZIZ = new IBinder.DeathRecipient() { // from class: X.0Ch
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C03650Cj.LIZLLL = null;
        }
    };
    public final C1DE LIZJ = new C1DE(this);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Ch] */
    public C03650Cj() {
        LIZIZ();
    }

    public static C03650Cj LIZLLL() {
        if (LIZLLL == null) {
            synchronized (C03650Cj.class) {
                if (LIZLLL == null) {
                    LJ = new C03650Cj();
                }
            }
        }
        return LJ;
    }

    public final boolean LIZ(int i, int i2, int i3) {
        if (LIZLLL == null && !LIZIZ()) {
            return false;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("{\"actionType\":");
            LIZ.append(i);
            LIZ.append(",\"actionTime\":");
            LIZ.append(i2);
            LIZ.append(",\"extra\":");
            LIZ.append(i3);
            LIZ.append("}");
            LIZLLL.h0(X1D.LIZIZ(LIZ));
            return true;
        } catch (Exception e) {
            LIZLLL = null;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("actionType:");
            LIZ2.append(i);
            LIZ2.append(" generalSingal error:");
            LIZ2.append(e);
            Slog.d("OppoManager", X1D.LIZIZ(LIZ2));
            return false;
        }
    }

    public final boolean LIZIZ() {
        InterfaceC03620Cg interfaceC03620Cg;
        if (LJFF > 10) {
            return false;
        }
        final IBinder checkService = ServiceManager.checkService("oiface");
        this.LIZ = checkService;
        if (checkService == null) {
            interfaceC03620Cg = null;
        } else {
            IInterface queryLocalInterface = checkService.queryLocalInterface("com.oppo.oiface.IOIfaceService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC03620Cg)) {
                interfaceC03620Cg = (InterfaceC03620Cg) queryLocalInterface;
            } else {
                interfaceC03620Cg = new InterfaceC03620Cg(checkService) { // from class: X.1DB
                    public final IBinder LJLIL;

                    {
                        this.LJLIL = checkService;
                    }

                    @Override // X.InterfaceC03620Cg
                    public final boolean LJLJLJ(AbstractBinderC03610Cf abstractBinderC03610Cf, String str) {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                            obtain.writeStrongBinder(abstractBinderC03610Cf);
                            obtain.writeString(str);
                            this.LJLIL.transact(101, obtain, obtain2, 0);
                            int readInt = obtain2.readInt();
                            obtain2.recycle();
                            obtain.recycle();
                            return readInt == 1;
                        } catch (Throwable th) {
                            obtain2.recycle();
                            obtain.recycle();
                            throw th;
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LJLIL;
                    }

                    @Override // X.InterfaceC03620Cg
                    public final void b0(String str) {
                        Parcel obtain = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                            obtain.writeString(str);
                            this.LJLIL.transact(102, obtain, null, 1);
                        } finally {
                            obtain.recycle();
                        }
                    }

                    @Override // X.InterfaceC03620Cg
                    public final void h0(String str) {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceService");
                            obtain.writeString(str);
                            this.LJLIL.transact(110, obtain, obtain2, 1);
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }
                };
            }
        }
        LIZLLL = interfaceC03620Cg;
        if (interfaceC03620Cg != null) {
            try {
                this.LIZ.linkToDeath(this.LIZIZ, 0);
                LJFF = 0;
                return true;
            } catch (Exception unused) {
                Slog.d("OppoManager", "connectOifaceService error");
                LIZLLL = null;
            }
        } else {
            LJFF++;
        }
        return false;
    }

    public final boolean LIZJ(String str) {
        if (LIZLLL == null && !LIZIZ()) {
            return false;
        }
        try {
            LIZLLL.b0(str);
            return true;
        } catch (Exception e) {
            LIZLLL = null;
            Slog.d("OppoManager", C1DD.LJ("updateGameInfo error:", e));
            return false;
        }
    }
}
