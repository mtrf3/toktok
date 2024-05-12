package com.google.firebase.analytics;

import X.C48029It7;
import X.C66716QGi;
import X.C67195QYt;
import X.C67637Qgb;
import X.C68074Qne;
import X.C68157Qoz;
import X.C68194Qpa;
import X.InterfaceC68730QyE;
import X.QH7;
import X.QYQ;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes12.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics LIZJ;
    public final C68074Qne LIZ;
    public C48029It7 LIZIZ;

    public String getFirebaseInstanceId() {
        try {
            C67195QYt LIZIZ = C67195QYt.LIZIZ();
            LIZIZ.LIZ();
            return (String) C67637Qgb.LIZIZ(((C66716QGi) LIZIZ.LIZLLL.LIZ(QYQ.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public FirebaseAnalytics(C68074Qne c68074Qne) {
        QH7.LJIIIIZZ(c68074Qne);
        this.LIZ = c68074Qne;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (LIZJ == null) {
            synchronized (FirebaseAnalytics.class) {
                if (LIZJ == null) {
                    LIZJ = new FirebaseAnalytics(C68074Qne.LIZJ(context, null));
                }
            }
        }
        return LIZJ;
    }

    public static InterfaceC68730QyE getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C68074Qne LIZJ2 = C68074Qne.LIZJ(context, bundle);
        if (LIZJ2 == null) {
            return null;
        }
        return new C68194Qpa(LIZJ2);
    }

    public void setCurrentScreen(Activity activity, String str, String str2) {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68157Qoz(c68074Qne, activity, str, str2));
    }
}
