package X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class QY8 {
    public final C67195QYt LIZ;
    public final QY5 LIZIZ;
    public final QY9 LIZJ;
    public final C6Y7<QYS> LIZLLL;
    public final C6Y7<QYR> LJ;
    public final QYQ LJFF;

    public final AbstractC67638Qgc<String> LIZ(AbstractC67638Qgc<Bundle> abstractC67638Qgc) {
        return abstractC67638Qgc.LJI(new Executor() { // from class: X.QYO
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new C41778GaU(this));
    }

    public final void LIZIZ(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        QYD LIZ;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C67195QYt c67195QYt = this.LIZ;
        c67195QYt.LIZ();
        bundle.putString("gmp_app_id", c67195QYt.LIZJ.LIZIZ);
        QY5 qy5 = this.LIZIZ;
        synchronized (qy5) {
            if (qy5.LIZLLL == 0) {
                try {
                    PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(qy5.LIZ.getPackageManager(), "com.google.android.gms", 0);
                    if (LLLLLLZ != null) {
                        qy5.LIZLLL = LLLLLLZ.versionCode;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            i = qy5.LIZLLL;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.LIZIZ.LIZ());
        bundle.putString("app_ver_name", this.LIZIZ.LIZIZ());
        C67195QYt c67195QYt2 = this.LIZ;
        c67195QYt2.LIZ();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(c67195QYt2.LIZIZ.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused2) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String LIZ2 = ((AbstractC66729QGv) C67637Qgb.LIZ(this.LJFF.getToken())).LIZ();
            if (!TextUtils.isEmpty(LIZ2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", LIZ2);
            }
        } catch (InterruptedException | ExecutionException unused3) {
        }
        bundle.putString("appid", (String) C67637Qgb.LIZ(this.LJFF.getId()));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("fcm-");
        LIZ3.append("23.0.7");
        bundle.putString("cliv", X1D.LIZIZ(LIZ3));
        QYR qyr = this.LJ.get();
        QYS qys = this.LIZLLL.get();
        if (qyr != null && qys != null && (LIZ = qyr.LIZ()) != QYD.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(LIZ.getCode()));
            bundle.putString("Firebase-Client", qys.getUserAgent());
        }
    }

    public final AbstractC67638Qgc<Bundle> LIZJ(String str, String str2, final Bundle bundle) {
        int i;
        try {
            LIZIZ(str, str2, bundle);
            final QY9 qy9 = this.LIZJ;
            QY7 qy7 = qy9.LIZJ;
            synchronized (qy7) {
                if (qy7.LIZIZ == 0) {
                    try {
                        PackageInfo LIZIZ = QCX.LIZ(qy7.LIZ).LIZIZ(0, "com.google.android.gms");
                        if (LIZIZ != null) {
                            qy7.LIZIZ = LIZIZ.versionCode;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        new StringBuilder(String.valueOf(e).length() + 23);
                    }
                }
                i = qy7.LIZIZ;
            }
            if (i < 12000000) {
                if (qy9.LIZJ.LIZ() != 0) {
                    return qy9.LIZ(bundle).LJII(QY9.LJIIIZ, new InterfaceC67660Qgy() { // from class: X.QYB
                        @Override // X.InterfaceC67660Qgy
                        public final Object LIZJ(AbstractC67638Qgc abstractC67638Qgc) {
                            BaseBundle baseBundle;
                            QY9 qy92 = QY9.this;
                            Bundle bundle2 = bundle;
                            qy92.getClass();
                            if (!abstractC67638Qgc.LJIILIIL() || (baseBundle = (BaseBundle) abstractC67638Qgc.LJIIIZ()) == null || !baseBundle.containsKey("google.messenger")) {
                                return abstractC67638Qgc;
                            }
                            return qy92.LIZ(bundle2).LJIILL(QY9.LJIIIZ, new InterfaceC67643Qgh() { // from class: X.QYJ
                                @Override // X.InterfaceC67643Qgh
                                public final C67646Qgk LIZ(Object obj) {
                                    BaseBundle baseBundle2 = (BaseBundle) obj;
                                    if (baseBundle2 != null && baseBundle2.containsKey("google.messenger")) {
                                        return C67637Qgb.LJ(null);
                                    }
                                    return C67637Qgb.LJ(baseBundle2);
                                }
                            });
                        }
                    });
                }
                return C67637Qgb.LIZLLL(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            QYT LIZ = QYT.LIZ(qy9.LIZIZ);
            LIZ.getClass();
            return LIZ.LIZJ(new C67179QYd(LIZ.LIZIZ(), bundle)).LJI(QY9.LJIIIZ, new InterfaceC67660Qgy() { // from class: X.QYC
                @Override // X.InterfaceC67660Qgy
                public final Object LIZJ(AbstractC67638Qgc abstractC67638Qgc) {
                    if (abstractC67638Qgc.LJIILIIL()) {
                        return abstractC67638Qgc.LJIIIZ();
                    }
                    if (android.util.Log.isLoggable("Rpc", 3)) {
                        new StringBuilder(String.valueOf(abstractC67638Qgc.LJIIIIZZ()).length() + 22);
                    }
                    throw new IOException("SERVICE_NOT_AVAILABLE", abstractC67638Qgc.LJIIIIZZ());
                }
            });
        } catch (InterruptedException | ExecutionException e2) {
            return C67637Qgb.LIZLLL(e2);
        }
    }

    public QY8(C67195QYt c67195QYt, QY5 qy5, C6Y7<QYS> c6y7, C6Y7<QYR> c6y72, QYQ qyq) {
        c67195QYt.LIZ();
        QY9 qy9 = new QY9(c67195QYt.LIZ);
        this.LIZ = c67195QYt;
        this.LIZIZ = qy5;
        this.LIZJ = qy9;
        this.LIZLLL = c6y7;
        this.LJ = c6y72;
        this.LJFF = qyq;
    }
}
