package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes12.dex */
public class QY6 {
    public final QYK LIZ;
    public boolean LIZIZ;
    public Boolean LIZJ;
    public final /* synthetic */ FirebaseMessaging LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.QYE] */
    public final synchronized void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        Boolean LIZIZ = LIZIZ();
        this.LIZJ = LIZIZ;
        if (LIZIZ == null) {
            this.LIZ.LIZ(C62819Ol5.class, new InterfaceC67182QYg() { // from class: X.QYE
                @Override // X.InterfaceC67182QYg
                public final void LIZ(C2311095e c2311095e) {
                    boolean LJI;
                    QY6 qy6 = QY6.this;
                    synchronized (qy6) {
                        qy6.LIZ();
                        Boolean bool = qy6.LIZJ;
                        if (bool != null) {
                            LJI = bool.booleanValue();
                        } else {
                            LJI = qy6.LIZLLL.LIZ.LJI();
                        }
                    }
                    if (LJI) {
                        qy6.LIZLLL.LJII();
                    }
                }
            });
        }
        this.LIZIZ = true;
    }

    public final Boolean LIZIZ() {
        ApplicationInfo LLLLLLLLL;
        Bundle bundle;
        C67195QYt c67195QYt = this.LIZLLL.LIZ;
        c67195QYt.LIZ();
        Context context = c67195QYt.LIZ;
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "com.google.firebase.messaging");
        if (LIZIZ.contains("auto_init")) {
            return Boolean.valueOf(LIZIZ.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (LLLLLLLLL = C16880lQ.LLLLLLLLL(packageManager, context.getPackageName(), 128)) != null && (bundle = LLLLLLLLL.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(LLLLLLLLL.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public QY6(FirebaseMessaging firebaseMessaging, QYK qyk) {
        this.LIZLLL = firebaseMessaging;
        this.LIZ = qyk;
    }
}
