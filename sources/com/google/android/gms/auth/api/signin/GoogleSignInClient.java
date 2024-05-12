package com.google.android.gms.auth.api.signin;

import X.AbstractC67791Qj5;
import X.C67717Qht;
import X.C75806Tp4;
import X.InterfaceC68018Qmk;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes12.dex */
public class GoogleSignInClient extends AbstractC67791Qj5<GoogleSignInOptions> {
    public static int LJIIJ = 1;

    public final synchronized int LJ() {
        int i;
        i = LJIIJ;
        if (i == 1) {
            Context context = this.LIZ;
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context, 12451000);
            if (isGooglePlayServicesAvailable == 0) {
                i = 4;
                LJIIJ = 4;
            } else if (googleApiAvailability.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null) == null && DynamiteModule.LIZIZ(context, "com.google.android.gms.auth.api.fallback") != 0) {
                i = 3;
                LJIIJ = 3;
            } else {
                i = 2;
                LJIIJ = 2;
            }
        }
        return i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleSignInClient(android.content.Context r4, com.google.android.gms.auth.api.signin.GoogleSignInOptions r5) {
        /*
            r3 = this;
            X.Qhu<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r2 = X.C67717Qht.LIZIZ
            X.Qj8 r1 = new X.Qj8
            r1.<init>()
            X.Tp4 r0 = new X.Tp4
            r0.<init>()
            r1.LIZ = r0
            X.Qj9 r0 = r1.LIZ()
            r3.<init>(r4, r2, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInClient.<init>(android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    public GoogleSignInClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C67717Qht.LIZIZ, googleSignInOptions, (InterfaceC68018Qmk) new C75806Tp4());
    }
}
