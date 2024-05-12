package com.facebook.login;

import X.ActivityC45651qj;
import X.C66373Q3d;
import X.C66445Q5x;
import X.EnumC66385Q3p;
import X.Q5E;
import X.Q5I;
import X.Q5O;
import X.Q5X;
import X.Q5Y;
import Y.IDCreatorS54S0000000_11;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.WebDialog;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public String e2e;
    public WebDialog loginDialog;
    public final String nameForLogging;
    public final EnumC66385Q3p tokenSource;
    public static final C66445Q5x Companion = new C66445Q5x();
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new IDCreatorS54S0000000_11(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void LIZIZ() {
        WebDialog webDialog = this.loginDialog;
        if (webDialog != null) {
            webDialog.cancel();
            this.loginDialog = null;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LJI() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public final EnumC66385Q3p LJIILJJIL() {
        return this.tokenSource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel source) {
        super(source);
        o.LJIIIZ(source, "source");
        this.nameForLogging = "web_view";
        this.tokenSource = EnumC66385Q3p.WEB_VIEW;
        this.e2e = source.readString();
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int LJIIL(LoginClient.Request request) {
        String str;
        Bundle LJIILIIL = LJIILIIL(request);
        Q5Y q5y = new Q5Y(this, request);
        LoginClient.Companion.getClass();
        String LIZ = Q5X.LIZ();
        this.e2e = LIZ;
        LIZ(LIZ, "e2e");
        ActivityC45651qj LJII = LJ().LJII();
        if (LJII == null) {
            return 0;
        }
        boolean LJIJI = C66373Q3d.LJIJI(LJII);
        Q5E q5e = new Q5E(this, LJII, request.applicationId, LJIILIIL);
        String str2 = this.e2e;
        if (str2 != null) {
            q5e.LJIIJJI = str2;
            if (LJIJI) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            q5e.LJI = str;
            String authType = request.authType;
            o.LJIIIZ(authType, "authType");
            q5e.LJIIL = authType;
            Q5O loginBehavior = request.loginBehavior;
            o.LJIIIZ(loginBehavior, "loginBehavior");
            q5e.LJII = loginBehavior;
            Q5I targetApp = request.loginTargetApp;
            o.LJIIIZ(targetApp, "targetApp");
            q5e.LJIIIIZZ = targetApp;
            q5e.LJIIIZ = request.isFamilyLogin;
            q5e.LJIIJ = request.shouldSkipAccountDeduplication;
            q5e.LIZLLL = q5y;
            this.loginDialog = q5e.LIZ();
            FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
            facebookDialogFragment.setRetainInstance(true);
            facebookDialogFragment.LJLIL = this.loginDialog;
            facebookDialogFragment.show(LJII.getSupportFragmentManager(), "FacebookDialogFragment");
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "web_view";
        this.tokenSource = EnumC66385Q3p.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        super.writeToParcel(dest, i);
        dest.writeString(this.e2e);
    }
}
