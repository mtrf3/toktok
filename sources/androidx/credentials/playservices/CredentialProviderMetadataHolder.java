package androidx.credentials.playservices;

import X.C35532Dx2;
import X.C38413F5t;
import X.C39427Fdf;
import X.C66163Pxv;
import X.C84763XOl;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.i0;

/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public void androidx_credentials_playservices_CredentialProviderMetadataHolder__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        androidx_credentials_playservices_CredentialProviderMetadataHolder_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    public static void androidx_credentials_playservices_CredentialProviderMetadataHolder_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(CredentialProviderMetadataHolder credentialProviderMetadataHolder, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        credentialProviderMetadataHolder.androidx_credentials_playservices_CredentialProviderMetadataHolder__attachBaseContext$___twin___(context);
    }
}
