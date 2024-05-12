package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC22370uH;
import X.C16880lQ;
import X.C22410uL;
import X.C35041Zc;
import X.C67671Qh9;
import X.C68735QyJ;
import X.C68864R0y;
import X.QH7;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class BeginSignInControllerUtility {
    public static final Companion Companion = new Companion();
    public static final String TAG = BeginSignInControllerUtility.class.getName();

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean needsBackwardsCompatibleRequest(long j) {
            return j < 231815000;
        }

        public Companion() {
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(C68735QyJ c68735QyJ) {
            C67671Qh9 c67671Qh9 = new C67671Qh9();
            c67671Qh9.LIZLLL = c68735QyJ.LJI;
            c67671Qh9.LIZJ = c68735QyJ.LJFF;
            c67671Qh9.LJI = c68735QyJ.LJIIIZ;
            String str = c68735QyJ.LJ;
            QH7.LJI(str);
            c67671Qh9.LIZIZ = str;
            c67671Qh9.LIZ = true;
            String str2 = c68735QyJ.LJII;
            if (str2 != null) {
                List list = c68735QyJ.LJIIIIZZ;
                c67671Qh9.LJ = str2;
                c67671Qh9.LJFF = list;
            }
            return c67671Qh9.LIZ();
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            o.LJIIIIZZ(context.getPackageManager(), "context.packageManager");
            return C16880lQ.LLLLLLZ(r2, "com.google.android.gms", 0).versionCode;
        }

        public final BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(C22410uL request, Context context) {
            o.LJIIIZ(request, "request");
            o.LJIIIZ(context, "context");
            C68864R0y c68864R0y = new C68864R0y();
            boolean z = false;
            boolean z2 = false;
            for (AbstractC22370uH abstractC22370uH : request.LIZ) {
                if ((abstractC22370uH instanceof C35041Zc) && !z2) {
                    if (needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context))) {
                        BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest = PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyRequest((C35041Zc) abstractC22370uH);
                        QH7.LJIIIIZZ(convertToPlayAuthPasskeyRequest);
                        c68864R0y.LIZJ = convertToPlayAuthPasskeyRequest;
                    } else {
                        BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest = PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyJsonRequest((C35041Zc) abstractC22370uH);
                        QH7.LJIIIIZZ(convertToPlayAuthPasskeyJsonRequest);
                        c68864R0y.LIZLLL = convertToPlayAuthPasskeyJsonRequest;
                    }
                    z2 = true;
                } else if (abstractC22370uH instanceof C68735QyJ) {
                    C68735QyJ c68735QyJ = (C68735QyJ) abstractC22370uH;
                    BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption = convertToGoogleIdTokenOption(c68735QyJ);
                    QH7.LJIIIIZZ(convertToGoogleIdTokenOption);
                    c68864R0y.LIZIZ = convertToGoogleIdTokenOption;
                    if (z || c68735QyJ.LJIIJ) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            c68864R0y.LJFF = z;
            return c68864R0y.LIZ();
        }
    }
}
