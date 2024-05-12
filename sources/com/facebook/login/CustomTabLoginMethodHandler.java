package com.facebook.login;

import X.ActivityC45651qj;
import X.AnonymousClass003;
import X.AnonymousClass008;
import X.C16880lQ;
import X.C66396Q4a;
import X.C66441Q5t;
import X.EnumC65839Psh;
import X.EnumC66385Q3p;
import X.Q4Z;
import X.Q5G;
import X.Q5I;
import X.Q5N;
import X.Q5X;
import Y.IDCreatorS54S0000000_11;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.login.LoginClient;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static boolean calledThroughLoggedOutAppSwitch;
    public String currentPackage;
    public String expectedChallenge;
    public final String nameForLogging;
    public final EnumC66385Q3p tokenSource;
    public String validRedirectURI;
    public static final C66441Q5t Companion = new C66441Q5t();
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new IDCreatorS54S0000000_11(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LJI() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String LJII() {
        return this.validRedirectURI;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public final EnumC66385Q3p LJIILJJIL() {
        return this.tokenSource;
    }

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.nameForLogging = "custom_tab";
        this.tokenSource = EnumC66385Q3p.CHROME_CUSTOM_TAB;
        String bigInteger = new BigInteger(100, new Random()).toString(32);
        o.LJIIIIZZ(bigInteger, "BigInteger(length * 5, r).toString(32)");
        this.expectedChallenge = bigInteger;
        calledThroughLoggedOutAppSwitch = false;
        this.validRedirectURI = Q5G.LIZIZ(super.LJII());
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void LJIIJJI(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.expectedChallenge);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int LJIIL(LoginClient.Request request) {
        boolean z;
        String name;
        String str;
        AnonymousClass003 anonymousClass003;
        AnonymousClass003 anonymousClass0032;
        LoginClient LJ = LJ();
        if (this.validRedirectURI.length() == 0) {
            return 0;
        }
        Bundle LJIILIIL = LJIILIIL(request);
        LJIILIIL.putString("redirect_uri", this.validRedirectURI);
        Q5I q5i = request.loginTargetApp;
        Q5I q5i2 = Q5I.INSTAGRAM;
        if (q5i == q5i2) {
            LJIILIIL.putString("app_id", request.applicationId);
        } else {
            LJIILIIL.putString("client_id", request.applicationId);
        }
        LoginClient.Companion.getClass();
        LJIILIIL.putString("e2e", Q5X.LIZ());
        if (request.loginTargetApp == q5i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIILIIL.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.permissions.contains("openid")) {
                LJIILIIL.putString("nonce", request.nonce);
            }
            LJIILIIL.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        LJIILIIL.putString("code_challenge", request.codeChallenge);
        EnumC65839Psh enumC65839Psh = request.codeChallengeMethod;
        if (enumC65839Psh == null) {
            name = null;
        } else {
            name = enumC65839Psh.name();
        }
        LJIILIIL.putString("code_challenge_method", name);
        LJIILIIL.putString("return_scopes", "true");
        LJIILIIL.putString("auth_type", request.authType);
        LJIILIIL.putString("login_behavior", request.loginBehavior.name());
        C16880lQ.LLILII();
        LJIILIIL.putString("sdk", o.LJIILLIIL("13.1.0", "android-"));
        LJIILIIL.putString("sso", "chrome_custom_tab");
        boolean z2 = u.LJIIJJI;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJIILIIL.putString("cct_prefetching", str);
        if (request.isFamilyLogin) {
            LJIILIIL.putString("fx_app", request.loginTargetApp.toString());
        }
        if (request.shouldSkipAccountDeduplication) {
            LJIILIIL.putString("skip_dedupe", "true");
        }
        String str3 = request.messengerPageId;
        if (str3 != null) {
            LJIILIIL.putString("messenger_page_id", str3);
            if (request.resetMessengerState) {
                str2 = "1";
            }
            LJIILIIL.putString("reset_messenger_state", str2);
        }
        if (calledThroughLoggedOutAppSwitch) {
            LJIILIIL.putString("cct_over_app_switch", "1");
        }
        if (u.LJIIJJI) {
            if (request.loginTargetApp == q5i2) {
                Uri LIZ = Q4Z.LIZ(LJIILIIL, "oauth");
                ReentrantLock reentrantLock = Q5N.LJLJI;
                reentrantLock.lock();
                if (Q5N.LJLILLLLZI == null && (anonymousClass0032 = Q5N.LJLIL) != null) {
                    Q5N.LJLILLLLZI = anonymousClass0032.LIZIZ(null);
                }
                reentrantLock.unlock();
                reentrantLock.lock();
                AnonymousClass008 anonymousClass008 = Q5N.LJLILLLLZI;
                if (anonymousClass008 != null) {
                    anonymousClass008.LIZ(LIZ, null);
                }
                reentrantLock.unlock();
            } else {
                Uri LIZ2 = C66396Q4a.LIZ(LJIILIIL, "oauth");
                ReentrantLock reentrantLock2 = Q5N.LJLJI;
                reentrantLock2.lock();
                if (Q5N.LJLILLLLZI == null && (anonymousClass003 = Q5N.LJLIL) != null) {
                    Q5N.LJLILLLLZI = anonymousClass003.LIZIZ(null);
                }
                reentrantLock2.unlock();
                reentrantLock2.lock();
                AnonymousClass008 anonymousClass0082 = Q5N.LJLILLLLZI;
                if (anonymousClass0082 != null) {
                    anonymousClass0082.LIZ(LIZ2, null);
                }
                reentrantLock2.unlock();
            }
        }
        ActivityC45651qj LJII = LJ.LJII();
        if (LJII == null) {
            return 0;
        }
        Intent intent = new Intent(LJII, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.LJLJI, "oauth");
        intent.putExtra(CustomTabMainActivity.LJLJJI, LJIILIIL);
        String str4 = CustomTabMainActivity.LJLJJL;
        String str5 = this.currentPackage;
        if (str5 == null) {
            str5 = Q5G.LIZ();
            this.currentPackage = str5;
        }
        intent.putExtra(str4, str5);
        intent.putExtra(CustomTabMainActivity.LJLJL, request.loginTargetApp.toString());
        Fragment fragment = LJ.fragment;
        if (fragment != null) {
            C16880lQ.LJII(fragment, intent, 1);
        }
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel source) {
        super(source);
        o.LJIIIZ(source, "source");
        this.nameForLogging = "custom_tab";
        this.tokenSource = EnumC66385Q3p.CHROME_CUSTOM_TAB;
        this.expectedChallenge = source.readString();
        this.validRedirectURI = Q5G.LIZIZ(super.LJII());
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        super.writeToParcel(dest, i);
        dest.writeString(this.expectedChallenge);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.LJIIIZ(int, int, android.content.Intent):boolean");
    }
}
