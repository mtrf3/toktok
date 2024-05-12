package p83;

import X.C16880lQ;
import X.C39353FcT;
import X.C67258QaU;
import X.P7Y;
import X.PNT;
import X.PSV;
import X.PSW;
import X.PSX;
import X.QCV;
import X.QH7;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class a {
    public PSV LIZ;
    public PSX LIZIZ;
    public boolean LIZJ;
    public final Object LIZLLL = new Object();
    public C39353FcT LJ;
    public final Context LJFF;
    public final boolean LJI;
    public final long LJII;

    /* renamed from: p83.a$a, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0043a {
        public final String LIZ;
        public final boolean LIZIZ;

        public C0043a(String str, boolean z) {
            this.LIZ = str;
            this.LIZIZ = z;
        }

        public final String toString() {
            String str = this.LIZ;
            boolean z = this.LIZIZ;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public a(boolean z, Context context, boolean z2) {
        Context LLLLL;
        QH7.LJIIIIZZ(context);
        if (z && (LLLLL = C16880lQ.LLLLL(context)) != null) {
            context = LLLLL;
        }
        this.LJFF = context;
        this.LIZJ = false;
        this.LJII = -1L;
        this.LJI = z2;
    }

    public static PSV LIZLLL(Context context, boolean z) {
        try {
            C16880lQ.LLLLLLZ(context.getPackageManager(), "com.android.vending", 0);
            int isGooglePlayServicesAvailable = C67258QaU.getInstance().isGooglePlayServicesAvailable(context, 12451000);
            if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            PSV psv = new PSV();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (QCV.LIZIZ().LIZ(context, intent, psv, 1)) {
                    return psv;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new PSW(9);
        }
    }

    public static void LJI(C0043a c0043a, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        if (c0043a != null) {
            hashMap.put("limit_ad_tracking", c0043a.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
            String str2 = c0043a.LIZ;
            if (str2 != null) {
                hashMap.put("ad_id_size", Integer.toString(str2.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new P7Y(hashMap).start();
    }

    public final void LIZ() {
        QH7.LJII("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.LJFF == null || this.LIZ == null) {
                return;
            }
            try {
                if (this.LIZJ) {
                    QCV.LIZIZ().LIZJ(this.LJFF, this.LIZ);
                }
            } catch (Throwable unused) {
            }
            this.LIZJ = false;
            this.LIZIZ = null;
            this.LIZ = null;
        }
    }

    public final C0043a LIZJ() {
        C0043a c0043a;
        QH7.LJII("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.LIZJ) {
                synchronized (this.LIZLLL) {
                    C39353FcT c39353FcT = this.LJ;
                    if (c39353FcT == null || !c39353FcT.LJLJJI) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    LJFF();
                    if (!this.LIZJ) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            QH7.LJIIIIZZ(this.LIZ);
            QH7.LJIIIIZZ(this.LIZIZ);
            try {
                c0043a = new C0043a(this.LIZIZ.getId(), this.LIZIZ.LIZ());
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        LJII();
        return c0043a;
    }

    public final void LJFF() {
        QH7.LJII("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.LIZJ) {
                LIZ();
            }
            PSV LIZLLL = LIZLLL(this.LJFF, this.LJI);
            this.LIZ = LIZLLL;
            this.LIZIZ = LJ(LIZLLL);
            this.LIZJ = true;
        }
    }

    public final void LJII() {
        synchronized (this.LIZLLL) {
            C39353FcT c39353FcT = this.LJ;
            if (c39353FcT != null) {
                c39353FcT.LJLJI.countDown();
                try {
                    this.LJ.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.LJII > 0) {
                this.LJ = new C39353FcT(this, this.LJII);
            }
        }
    }

    public final void finalize() {
        LIZ();
        super.finalize();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #4 {all -> 0x004e, blocks: (B:20:0x0040, B:39:0x0048), top: B:19:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0038 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #5 {all -> 0x003e, blocks: (B:15:0x0030, B:42:0x0038), top: B:14:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0024 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #3 {all -> 0x002b, blocks: (B:9:0x001c, B:45:0x0024), top: B:8:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p83.a.C0043a LIZIZ(android.content.Context r11) {
        /*
            X.M8w r5 = new X.M8w
            r0 = 1
            r5.<init>(r11, r0)
            java.lang.String r2 = "gads:ad_id_app_context:enabled"
            r4 = 0
            java.lang.Object r1 = r5.LIZ     // Catch: java.lang.Throwable -> L18
            r0 = r1
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L11
            goto L18
        L11:
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch: java.lang.Throwable -> L18
            boolean r6 = r1.getBoolean(r2, r4)     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r6 = 0
        L19:
            java.lang.String r3 = "gads:ad_id_app_context:ping_ratio"
            r2 = 0
            java.lang.Object r1 = r5.LIZ     // Catch: java.lang.Throwable -> L2b
            r0 = r1
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L24
            goto L2b
        L24:
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch: java.lang.Throwable -> L2b
            float r7 = r1.getFloat(r3, r2)     // Catch: java.lang.Throwable -> L2b
            goto L2c
        L2b:
            r7 = 0
        L2c:
            java.lang.String r2 = "gads:ad_id_use_shared_preference:experiment_id"
            java.lang.String r10 = ""
            java.lang.Object r1 = r5.LIZ     // Catch: java.lang.Throwable -> L3e
            r0 = r1
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L38
            goto L3e
        L38:
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.String r10 = r1.getString(r2, r10)     // Catch: java.lang.Throwable -> L3e
        L3e:
            java.lang.String r2 = "gads:ad_id_use_persistent_service:enabled"
            java.lang.Object r1 = r5.LIZ     // Catch: java.lang.Throwable -> L4e
            r0 = r1
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L48
            goto L4e
        L48:
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r1.getBoolean(r2, r4)     // Catch: java.lang.Throwable -> L4e
        L4e:
            p83.a r2 = new p83.a
            r2.<init>(r6, r11, r4)
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6b
            r2.LJFF()     // Catch: java.lang.Throwable -> L6b
            p83.a$a r5 = r2.LIZJ()     // Catch: java.lang.Throwable -> L6b
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6b
            long r8 = r8 - r0
            r11 = 0
            LJI(r5, r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L6b
            r2.LIZ()
            return r5
        L6b:
            r11 = move-exception
            r5 = 0
            r8 = -1
            LJI(r5, r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L73
        L73:
            r0 = move-exception
            r2.LIZ()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p83.a.LIZIZ(android.content.Context):p83.a$a");
    }

    public static PSX LJ(PSV psv) {
        try {
            IBinder LIZ = psv.LIZ(TimeUnit.MILLISECONDS);
            IInterface queryLocalInterface = LIZ.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            if (queryLocalInterface instanceof PSX) {
                return (PSX) queryLocalInterface;
            }
            return new PNT(LIZ);
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
