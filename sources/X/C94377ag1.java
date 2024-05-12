package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.spotify.sdk.android.auth.AuthorizationRequest;

/* renamed from: X.ag1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94377ag1 implements InterfaceC93555aSl {
    public C94000aZw LIZ;

    @Override // X.InterfaceC93555aSl
    public final void LIZ(C94128ac0 c94128ac0) {
    }

    @Override // X.InterfaceC93555aSl
    public final void stop() {
        C94000aZw c94000aZw = this.LIZ;
        if (c94000aZw != null) {
            c94000aZw.LIZ.finishActivity(1138);
        }
    }

    @Override // X.InterfaceC93555aSl
    public final boolean LIZIZ(Activity activity, AuthorizationRequest authorizationRequest) {
        boolean LIZ;
        C93999aZv c93999aZv = new C93999aZv();
        C94000aZw c94000aZw = new C94000aZw(activity, authorizationRequest, c93999aZv);
        this.LIZ = c94000aZw;
        for (String str : C94000aZw.LIZJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("com.spotify.music");
            LIZ2.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            Intent intent = new Intent("com.spotify.sso.action.START_AUTH_FLOW");
            intent.setPackage(LIZIZ);
            ComponentName resolveActivity = intent.resolveActivity(activity.getPackageManager());
            if (resolveActivity != null) {
                String packageName = resolveActivity.getPackageName();
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(activity.getPackageManager(), packageName, 134217728);
                        SigningInfo signingInfo = LLLLLLZ.signingInfo;
                        if (signingInfo != null) {
                            if (signingInfo.hasMultipleSigners()) {
                                LIZ = C94000aZw.LIZ(c93999aZv, LLLLLLZ.signingInfo.getApkContentsSigners());
                            } else {
                                LIZ = C94000aZw.LIZ(c93999aZv, LLLLLLZ.signingInfo.getSigningCertificateHistory());
                            }
                        }
                    } else {
                        LIZ = C94000aZw.LIZ(c93999aZv, C16880lQ.LLLLLLZ(activity.getPackageManager(), packageName, 64).signatures);
                    }
                    if (LIZ) {
                        intent.putExtra("VERSION", 1);
                        intent.putExtra("CLIENT_ID", c94000aZw.LIZIZ.mClientId);
                        intent.putExtra("REDIRECT_URI", c94000aZw.LIZIZ.mRedirectUri);
                        intent.putExtra("RESPONSE_TYPE", c94000aZw.LIZIZ.mResponseType);
                        intent.putExtra("SCOPES", c94000aZw.LIZIZ.mScopes);
                        intent.putExtra("STATE", c94000aZw.LIZIZ.mState);
                        try {
                            C16880lQ.LJFF(c94000aZw.LIZ, 1138, intent);
                            return true;
                        } catch (ActivityNotFoundException unused) {
                            return false;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    continue;
                }
            }
        }
        return false;
    }
}
